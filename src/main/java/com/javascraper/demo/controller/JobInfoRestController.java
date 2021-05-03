package com.javascraper.demo.controller;

import java.util.List;

import com.javascraper.demo.model.Jobs;
import com.javascraper.demo.model.JobsInfo;
import com.javascraper.demo.repository.JobInfoRepository;
import com.javascraper.demo.repository.JobRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin(value = "*")
public class JobInfoRestController {

    @Autowired
    JobInfoRepository jobInfoRepository;

    @GetMapping("/jobinfo")
    public List<JobsInfo> findAllJobs() {
        return jobInfoRepository.findAll();
    }
}