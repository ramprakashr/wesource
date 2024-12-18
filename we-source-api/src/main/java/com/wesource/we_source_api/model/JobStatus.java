package com.wesource.we_source_api.model;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 

@Entity 
@Table(name = "ws_job_status") 
public class JobStatus {
	
	//Default constructor for JPA to resolve the object
	public JobStatus() {
		super();
	}

	public JobStatus(int ws_job_status_id) {
		this.ws_job_status_id = ws_job_status_id;
	}
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int ws_job_status_id;
	
	private String ws_job_status_title;
	
	private String ws_job_status_description;

	public int getWs_job_status_id() {
		return ws_job_status_id;
	}

	public void setWs_job_status_id(int ws_job_status_id) {
		this.ws_job_status_id = ws_job_status_id;
	}

	public String getWs_job_status_title() {
		return ws_job_status_title;
	}

	public void setWs_job_status_title(String ws_job_status_title) {
		this.ws_job_status_title = ws_job_status_title;
	}

	public String getWs_job_status_description() {
		return ws_job_status_description;
	}

	public void setWs_job_status_description(String ws_job_status_description) {
		this.ws_job_status_description = ws_job_status_description;
	}
	

}
