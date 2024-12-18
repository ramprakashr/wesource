package com.wesource.we_source_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		List<String> jobCreationResponse =  jobService.validateNewJob(job);
		
		if(jobCreationResponse.isEmpty()) {
			 jobService.createNewJob(job);
			 jobCreationResponse.add("Job created successfully");
			 return ResponseEntity.ok(jobCreationResponse);
		} else {
			return ResponseEntity.badRequest().body(jobCreationResponse);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/publisher/{publisherId}")
	public ResponseEntity<List<Job>> getJobByPublisherId(@PathVariable Integer publisherId) {
		
		List<Job> job = jobService.getJobByCreatedByPublisher(publisherId);
		return ResponseEntity.ok(job);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{jobId}/publish/{publisherId}")
	public ResponseEntity<List<String>> publishJob(@PathVariable Integer jobId, @PathVariable Integer publisherId) {
		
		Job job = jobService.getJobBuJobId(jobId);
		
		List<String> jobPublishResponse =  jobService.validateJobPublish(job, publisherId);
		
		if(jobPublishResponse.isEmpty()) {
			 jobService.publishJob(job);
			 jobPublishResponse.add("Job published successfully");
			 return ResponseEntity.ok(jobPublishResponse);
		} else {
			ResponseEntity.badRequest();
			return ResponseEntity.badRequest().body(jobPublishResponse);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/new")
	public ResponseEntity<List<Job>> getPublishedJobForSeeker(
			@RequestParam(required = false, name = "jobPeriod") Integer jobPeriod,
			@RequestParam(required = false, name = "jobCategory") Integer jobCategory,
			@RequestParam(required = false, name = "jobFeeInterval") Integer jobFeeInterval,
			@RequestParam(required = false, name = "isWorkFromHome") String isWorkFromHome) {
		List<Job> jobsForSeeker =  jobService.getNewJobForSeeker(jobPeriod, jobCategory, jobFeeInterval, isWorkFromHome);
		return ResponseEntity.ok(jobsForSeeker);
	}

}
