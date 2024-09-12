package com.wesource.we_source_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wesource.we_source_api.model.JobStatus;
import com.wesource.we_source_api.repository.JobStatusRepository;

@Controller
@RequestMapping(value = "/ref-data")
public class ReferenceDataController {
	
	//TODO need to inject via service and eliminate REPO use in Ctrlr
	@Autowired
	private JobStatusRepository jobStatusRepository;
	
	@RequestMapping(value = "/job-status", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<JobStatus>> getAllRefereceJobStatus() {
		List<JobStatus> jobStatus = jobStatusRepository.findAll();
		return ResponseEntity.ok().body(jobStatus);
	}

}
