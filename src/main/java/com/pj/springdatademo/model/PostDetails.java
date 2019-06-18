package com.pj.springdatademo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "PostDetails")
@Table(name = "post_details")
@Data
public class PostDetails
{
    @Id
    private Long id;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "created_by")
    private String createdBy;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "id")
    @JsonIgnore
    private Post post;

    public PostDetails()
    {
    }

    public PostDetails(String createdBy)
    {
        this.createdOn = new Date();
        this.createdBy = createdBy;
    }

    //Getters and setters omitted for brevity
}
