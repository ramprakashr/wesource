package com.wesource.we_source_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wesource.we_source_api.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {
	
	@Query(value = "SELECT * FROM ws_job WHERE ws_job_created_by = ?1", nativeQuery = true)
	List<Job> findJobByCreatedById(Integer createdById);

}
