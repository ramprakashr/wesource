package com.wesource.we_source_api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesource.we_source_api.model.Job;

@RestController
@RequestMapping(value = "/job")
public class JobController {
	
	public void createNewJob(@RequestBody Job job) {
		
	}

}
