package com.javascraper.demo.repository;

import com.javascraper.demo.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JobRepository extends JpaRepository<Jobs, Integer> {

}
