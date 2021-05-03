package com.javascraper.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

import com.javascraper.demo.model.NavInfo;

public interface NavInfoRepository extends JpaRepository<NavInfo, Integer> {

}
