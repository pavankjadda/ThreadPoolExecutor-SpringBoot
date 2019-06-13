package com.pj.springdatademo.web;

import com.pj.springdatademo.model.DBFile;
import com.pj.springdatademo.repo.DbFileRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;

@RestController
public class FileController
{

    private final DbFileRepository dbFileRepository;

    public FileController(DbFileRepository dbFileRepository)
    {
        this.dbFileRepository = dbFileRepository;
    }

    @PostMapping("/uploadFile")
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
    }

}
