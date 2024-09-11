package com.wesource.we_source_api.model;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table; 

@Entity 
@Table(name = "ws_job_status") 
public class JobStatus {
	
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
