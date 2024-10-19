package com.wesource.we_source_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesource.we_source_api.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}
