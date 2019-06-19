package com.pj.springdatademo.web;


import com.pj.springdatademo.model.RecruiterProfile;
import com.pj.springdatademo.repo.RecruiterProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recruiter_profile")
public class RecruiterProfileController
{
    private RecruiterProfileRepository recruiterProfileRepository;

    public RecruiterProfileController(RecruiterProfileRepository recruiterProfileRepository)
    {
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    @GetMapping(path = "/list")
    public List<RecruiterProfile> getAllCandidateProfiles()
    {
        return recruiterProfileRepository.findAll();
    }
}
