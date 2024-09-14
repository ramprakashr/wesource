package com.wesource.we_source_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ws_job_period")
public class JobPeriod {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ws_job_period_id;
	
	private String ws_job_period_title;
	
	private String ws_job_period_description;

	public int getWs_job_period_id() {
		return ws_job_period_id;
	}

	public void setWs_job_period_id(int ws_job_period_id) {
		this.ws_job_period_id = ws_job_period_id;
	}

	public String getWs_job_period_title() {
		return ws_job_period_title;
	}

	public void setWs_job_period_title(String ws_job_period_title) {
		this.ws_job_period_title = ws_job_period_title;
	}

	public String getWs_job_period_description() {
		return ws_job_period_description;
	}

	public void setWs_job_period_description(String ws_job_period_description) {
		this.ws_job_period_description = ws_job_period_description;
	}
	
}
