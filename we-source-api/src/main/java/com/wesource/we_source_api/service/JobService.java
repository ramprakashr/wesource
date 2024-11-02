package com.wesource.we_source_api.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wesource.we_source_api.model.Job;
import com.wesource.we_source_api.model.JobStatus;
import com.wesource.we_source_api.model.Publisher;
import com.wesource.we_source_api.repository.JobRepository;
import com.wesource.we_source_api.repository.PublisherRepository;
import com.wesource.we_source_api.type.JobType;
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
		newJob.setWs_job_is_wfh('Y');
		//New Job will always be a DRAFT
		//newJob.setWs_job_status(new JobStatus(JobType.DRAFT.ordinal()));
		return	jobRepository.save(newJob);
	}
	
	public List<Job> getJobByCreatedByPublisher(Integer publisherId) {
		return jobRepository.findJobByCreatedById(publisherId);
	}
	
	public Job getJobBuJobId(Integer jobId) {
		return jobRepository.findById(jobId).get();
	}
	
	public void publishJob(Job publishJob) {
		publishJob.setWs_job_status(new JobStatus(JobType.NEW.getValue()));
		this.updateJob(publishJob);
	}
	
	public void updateJob(Job job) {
		jobRepository.save(job);
	}
	
	public List<String> validateNewJob(Job newJob) {
		
		Publisher publisher = this.getPublisherById(newJob.getWs_job_created_by());
		List<String> errorsInJobCreation = new ArrayList<String>();
		
		if (Optional.of(publisher).isEmpty()) {
			errorsInJobCreation.add(WeSourceErrors.WE_SOURCE_ERROR_NOT_PUBLISHER);
		} else {
			newJob.setWs_job_created_by(publisher.getAdm_publisher_id());
		}
		if (newJob.getWs_job_status().getWs_job_status_id() != JobType.DRAFT.getValue()) {
			errorsInJobCreation.add(WeSourceErrors.WE_SOURCE_ERROR_NO_STATUS_ALLOWED);
		}
		//TODO Check If all the mandatory fields are passed while new saving.
		
		return errorsInJobCreation;
	}

	public List<String> validateJobPublish(Job job, Integer publisherId) {
		
		Publisher publisher = this.getPublisherById(publisherId);
		List<String> errorsInJobPublish = new ArrayList<String>();
		
		if (Optional.of(publisher).isEmpty()) {
			errorsInJobPublish.add(WeSourceErrors.WE_SOURCE_ERROR_NOT_PUBLISHER);
		}
		
		
		if (!job.getWs_job_status().getWs_job_status_title().equalsIgnoreCase(JobType.DRAFT.name())) {
			errorsInJobPublish.add(WeSourceErrors.WE_SOURCE_ERROR_JOB_PUBLISH_AS_DRAFT);
		}
		//TODO Check if all the necessary fields of the job are fully covered or filled ?? 
		
		return errorsInJobPublish;
	}
	
	private Publisher getPublisherById(Integer publisherId) {
		return publisherRepository.findById(publisherId).get();
	}

}
