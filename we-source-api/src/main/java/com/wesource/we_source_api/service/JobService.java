package com.wesource.we_source_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesource.we_source_api.model.Job;
import com.wesource.we_source_api.model.Publisher;
import com.wesource.we_source_api.repository.JobRepository;
import com.wesource.we_source_api.repository.PublisherRepository;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	public Job createNewJob(Job job, Integer publisherId) {
		
		validateJob(job, publisherRepository.findById(publisherId).get());
		
		return jobRepository.save(job);
	}
	
	private List<String> validateJob(Job job, Publisher publisher) {
		List<String> errorsInJobCreation = new ArrayList<String>();
		return errorsInJobCreation;
	}
}
