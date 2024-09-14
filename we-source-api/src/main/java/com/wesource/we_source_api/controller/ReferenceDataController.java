package com.wesource.we_source_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wesource.we_source_api.model.Country;
import com.wesource.we_source_api.model.JobCategory;
import com.wesource.we_source_api.model.JobFeeInterval;
import com.wesource.we_source_api.model.JobPeriod;
import com.wesource.we_source_api.model.JobStatus;
import com.wesource.we_source_api.model.State;
import com.wesource.we_source_api.repository.CountryRepository;
import com.wesource.we_source_api.repository.JobCategoryRepository;
import com.wesource.we_source_api.repository.JobFeeIntervalRepository;
import com.wesource.we_source_api.repository.JobPeriodRepository;
import com.wesource.we_source_api.repository.JobStatusRepository;
import com.wesource.we_source_api.repository.StateRepository;

@Controller
@RequestMapping(value = "/ref-data")
public class ReferenceDataController {
	
	//TODO need to inject via service and eliminate REPO use in Ctrlr
	@Autowired
	private JobStatusRepository jobStatusRepository;
	
	@Autowired
	private JobCategoryRepository jobCategoryRepository;
	
	@Autowired
	private JobFeeIntervalRepository jobFeeIntervalRepository;
	
	@Autowired
	private JobPeriodRepository jobPeriodRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@RequestMapping(value = "/job-status", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<JobStatus>> getAllRefereceJobStatus() {
		List<JobStatus> jobStatus = jobStatusRepository.findAll();
		return ResponseEntity.ok().body(jobStatus);
	}
	
	@RequestMapping(value = "/job-category", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<JobCategory>> getAllRefereceJobCategory() {
		List<JobCategory> CategoryStatus = jobCategoryRepository.findAll();
		return ResponseEntity.ok().body(CategoryStatus);
	}
	
	@RequestMapping(value = "/job-fee-interval", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<JobFeeInterval>> getAllRefereceJobFeeInterval() {
		List<JobFeeInterval> jobFeeInterval = jobFeeIntervalRepository.findAll();
		return ResponseEntity.ok().body(jobFeeInterval);
	}
	
	@RequestMapping(value = "/job-period", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<JobPeriod>> getAllRefereceJobPeriod() {
		List<JobPeriod> jobPeriod = jobPeriodRepository.findAll();
		return ResponseEntity.ok().body(jobPeriod);
	}
	
	@RequestMapping(value = "/country", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Country>> getAllRefereceCountry() {
		List<Country> country = countryRepository.findAll();
		return ResponseEntity.ok().body(country);
	}
	
	@RequestMapping(value = "/state", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<State>> getAllRefereceState() {
		List<State> state = stateRepository.findAll();
		return ResponseEntity.ok().body(state);
	}

}
