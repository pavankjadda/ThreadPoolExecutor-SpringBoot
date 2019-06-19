package com.pj.springdatademo.web;

import com.pj.springdatademo.repo.DbFileRepository;
import org.apache.commons.io.FileCleaningTracker;
import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.ProgressListener;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@RestController
public class FileController
{
    private Logger logger= LoggerFactory.getLogger(FileController.class);
    private final DbFileRepository dbFileRepository;

    public FileController(DbFileRepository dbFileRepository)
    {
        this.dbFileRepository = dbFileRepository;
    }

    @PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(HttpServletRequest request)
    {
        boolean isMultiPart= ServletFileUpload.isMultipartContent(request);
        if(isMultiPart)
        {
            try
            {
                DiskFileItemFactory diskFileItemFactory=new DiskFileItemFactory();
                String filePath="/Users/pjadda/Downloads/test";
                diskFileItemFactory.setRepository(new File(filePath));


                ServletFileUpload servletFileUpload=new ServletFileUpload(diskFileItemFactory);
                FileItemIterator items=servletFileUpload.getItemIterator(request);


                while (items.hasNext())
                {
                    FileItemStream item = items.next();

                    if (!item.isFormField())
                    {
                        InputStream uploadedStream = item.openStream();
                        OutputStream out = new FileOutputStream(filePath+"/"+item.getName());
                        try
                        {
                            IOUtils.copy(uploadedStream, out);

                            FileCleaningTracker fileCleaningTracker=new FileCleaningTracker();
                            fileCleaningTracker.track(filePath+"/"+item.getName(),null);
                            fileCleaningTracker.exitWhenFinished();
                        }
                        catch (Exception e)
                        {
                            logger.error("Exception occurred while uploading. Error message: {}",e.getMessage());
                        }
                    }
                }
                //Create a progress listener
                ProgressListener progressListener = (pBytesRead, pContentLength, pItems) ->
                {
                    System.out.println("We are currently reading item " + pItems);
                    if (pContentLength == -1)
                    {
                        System.out.println("So far, " + pBytesRead + " bytes have been read.");
                    }
                    else
                    {
                        System.out.println("So far, " + pBytesRead + " of " + pContentLength + " bytes have been read.");
                    }
                };
                servletFileUpload.setProgressListener(progressListener);
            }
            catch (Exception e)
            {
                logger.error("Exception occurred while uploading. Error message: {}",e.getMessage());
            }
        }

        return null;
    }


    /*@PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file)
    {
        try
        {
            DBFile dbFile = new DBFile(file.getOriginalFilename(), file.getContentType(), file.getBytes());
            dbFile = dbFileRepository.saveAndFlush(dbFile);

            String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                    .path("/downloadFile/")
                    .path(dbFile.getId()+"")
                    .toUriString();

            return new UploadFileResponse(dbFile.getFileName(), fileDownloadUri,
                    file.getContentType(), file.getSize());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }*/

}
