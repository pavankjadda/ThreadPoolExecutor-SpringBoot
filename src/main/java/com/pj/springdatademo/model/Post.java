package com.pj.springdatademo.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Post")
@Table(name = "post")
@Data
public class Post
{

    @Id
    @GeneratedValue
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
