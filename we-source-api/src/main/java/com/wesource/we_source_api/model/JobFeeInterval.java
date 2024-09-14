package com.wesource.we_source_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ws_job_fee_interval") 
public class JobFeeInterval {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ws_job_fee_interval_id;
	
	private String ws_job_fee_interval_title;
	
	private String ws_job_fee_interval_description;

	public int getWs_job_fee_interval_id() {
		return ws_job_fee_interval_id;
	}

	public void setWs_job_fee_interval_id(int ws_job_fee_interval_id) {
		this.ws_job_fee_interval_id = ws_job_fee_interval_id;
	}

	public String getWs_job_fee_interval_title() {
		return ws_job_fee_interval_title;
	}

	public void setWs_job_fee_interval_title(String ws_job_fee_interval_title) {
		this.ws_job_fee_interval_title = ws_job_fee_interval_title;
	}

	public String getWs_job_fee_interval_description() {
		return ws_job_fee_interval_description;
	}

	public void setWs_job_fee_interval_description(String ws_job_fee_interval_description) {
		this.ws_job_fee_interval_description = ws_job_fee_interval_description;
	}
	
}
