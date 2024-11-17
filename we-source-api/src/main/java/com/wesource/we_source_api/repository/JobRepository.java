package com.wesource.we_source_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wesource.we_source_api.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {
	
	@Query(value = "SELECT * FROM ws_job WHERE ws_job_created_by = ?1", nativeQuery = true)
	List<Job> findJobByCreatedById(Integer createdById);

	//@Query(value = "SELECT * FROM ws_job WHERE (?1 is null or ws_job_status = ?1) and (?2 is null or ws_job_period = ?2) and (?3 is null or ws_job_category = ?3) and (?4 is null or ws_job_fee_interval = ?4) and (?5 is null or ws_job_is_wfh = ?5) ", nativeQuery = true)
	@Query(value = "SELECT * FROM ws_job WHERE ws_job_status = ?1 and ws_job_period = ?2", nativeQuery = true)
	List<Job> fetchJobForSeeker(Integer jobStatusId, Integer jobPeriodId, Integer jobCategoryId, Integer jobIntervalId, Integer jobWFH);
}
