package com.pj.springdatademo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "PostDetails")
@Table(name = "post_details")
@Data
public class PostDetails  implements Serializable
{
    private static final long serialVersionUID = -6699482774799518217L;

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

}
