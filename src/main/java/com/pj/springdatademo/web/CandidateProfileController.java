package com.pj.springdatademo.web;

import com.pj.springdatademo.model.CandidateProfile;
import com.pj.springdatademo.repo.CandidateProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/candidate_profile")
public class CandidateProfileController
{
    private final CandidateProfileRepository candidateProfileRepository;

    public CandidateProfileController(CandidateProfileRepository candidateProfileRepository)
    {
        this.candidateProfileRepository = candidateProfileRepository;
    }

    @GetMapping(path = "/list")
    public List<CandidateProfile> getAllCandidateProfiles()
    {
        return candidateProfileRepository.findAll();
    }

    @GetMapping(path = "/create")
    public List<CandidateProfile> createAndGetAllCandidateProfiles()
    {
        CandidateProfile candidateProfile=new CandidateProfile();
        candidateProfile.setFirstName("John");
        candidateProfile.setLastName("Doe");
        candidateProfile.setPhone("151111");
        candidateProfile.setEmail("John.Doe@example.com");
        candidateProfile.setCandidateLocation("DC");
        candidateProfile.setId(1L);
        candidateProfileRepository.saveAndFlush(candidateProfile);

        return candidateProfileRepository.findAll();
    }
}
