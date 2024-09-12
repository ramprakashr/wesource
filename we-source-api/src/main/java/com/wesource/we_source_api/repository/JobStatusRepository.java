package com.wesource.we_source_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wesource.we_source_api.model.JobStatus;

@Repository
public interface JobStatusRepository extends JpaRepository<JobStatus, Integer> {

}
