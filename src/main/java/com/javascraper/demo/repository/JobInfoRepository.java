package com.javascraper.demo.repository;

import com.javascraper.demo.model.JobsInfo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JobInfoRepository extends JpaRepository<JobsInfo, Integer> {

}
