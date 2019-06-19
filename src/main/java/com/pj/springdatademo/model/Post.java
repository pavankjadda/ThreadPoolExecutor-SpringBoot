package com.pj.springdatademo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Post")
@Table(name = "post")
@Data
public class Post implements Serializable
{
    private static final long serialVersionUID = -6698422774799518217L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private PostDetails details;

    //Getters and setters omitted for brevity
    public void setDetails(PostDetails details)
    {
        if (details == null)
        {
            if (this.details != null)
            {
                this.details.setPost(null);
            }
        }
        else
        {
            details.setPost(this);
        }
        this.details = details;
    }
}
