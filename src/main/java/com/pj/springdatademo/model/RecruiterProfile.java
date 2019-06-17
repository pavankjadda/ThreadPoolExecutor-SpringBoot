package com.pj.springdatademo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(value = "RECRUITER")
@Data
public class RecruiterProfile extends UserProfile implements Serializable
{
    private static final long serialVersionUID = -5486697743705747753L;

    @Column(name = "recruiter_location", nullable = false)
    private String recruiterLocation;

    @Column(name = "recruiter_company", nullable = false)
    private String recruiterCompany;
}
