package com.wesource.we_source_api.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesource.we_source_api.model.Job;
import com.wesource.we_source_api.model.Publisher;
import com.wesource.we_source_api.repository.JobRepository;
import com.wesource.we_source_api.repository.PublisherRepository;
import com.wesource.we_source_api.util.WeSourceErrors;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	public Job createNewJob(Job newJob) {
		newJob.setWs_job_created_date(new Date());
		newJob.setWs_job_last_updated_date(new Date());
		return	jobRepository.save(newJob);
	}
	
	public List<String> validateJob(Job job) {
		
		Publisher publisher = publisherRepository.findById(job.getWs_job_created_by()).get();
		List<String> errorsInJobCreation = new ArrayList<String>();
		
		if (Optional.of(publisher).isEmpty()) {
			errorsInJobCreation.add(WeSourceErrors.WE_SOURCE_ERROR_NOT_PUBLISHER);
		}
		if (Optional.of(job.getWs_job_status()).isPresent()) {
			errorsInJobCreation.add(WeSourceErrors.WE_SOURCE_ERROR_NO_STATUS_ALLOWED);
		}
		
		return errorsInJobCreation;
	}
}
