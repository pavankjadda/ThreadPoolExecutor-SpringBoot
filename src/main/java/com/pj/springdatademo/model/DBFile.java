package com.pj.springdatademo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "db_file")
@Data
public class DBFile
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String fileType;

    @Lob
    private byte[] data;

    public DBFile(String fileName, String fileType, byte[] data)
    {
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }
}
