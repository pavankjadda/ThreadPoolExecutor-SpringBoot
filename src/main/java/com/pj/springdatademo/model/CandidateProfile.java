package com.pj.springdatademo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class CandidateProfile extends UserProfile implements Serializable
{
    private static final long serialVersionUID = -5481697743705747753L;

    @Column(name = "candidate_location", nullable = false)
    private String candidateLocation;
}
