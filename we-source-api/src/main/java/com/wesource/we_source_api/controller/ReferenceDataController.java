package com.wesource.we_source_api.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wesource.we_source_api.model.JobStatus;

@Controller
@RequestMapping(value = "/ref-data")
public class ReferenceDataController {
	
	@RequestMapping(value = "/job-status", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JobStatus> getAllRefereceJobStatus() {
		return null;
	}

}
