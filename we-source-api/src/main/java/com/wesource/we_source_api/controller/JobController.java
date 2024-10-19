package com.wesource.we_source_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wesource.we_source_api.model.Job;
import com.wesource.we_source_api.service.JobService;

@RestController
@RequestMapping(value = "/job")
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public ResponseEntity<List<String>> createNewJob(@RequestBody Job job) {
		
		//Cannot deserialize value of type `java.lang.Integer` from Object value (token `JsonToken.START_OBJECT`)
		List<String> jobCreationResponse =  jobService.validateJob(job);
		
		if(jobCreationResponse.isEmpty()) {
			 jobService.createNewJob(job);
			 jobCreationResponse.add("Job created successfully");
			 return ResponseEntity.ok(jobCreationResponse);
		} else {
			ResponseEntity.badRequest();
			return (ResponseEntity<List<String>>) jobCreationResponse;
		}
		
	}

}
