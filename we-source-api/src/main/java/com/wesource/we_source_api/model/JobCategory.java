package com.wesource.we_source_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ws_job_category") 
public class JobCategory {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int ws_job_category_id;
	
	private String ws_job_category_title;
	
	private String ws_job_category_description;

	public int getWs_job_category_id() {
		return ws_job_category_id;
	}

	public void setWs_job_category_id(int ws_job_category_id) {
		this.ws_job_category_id = ws_job_category_id;
	}

	public String getWs_job_category_title() {
		return ws_job_category_title;
	}

	public void setWs_job_category_title(String ws_job_category_title) {
		this.ws_job_category_title = ws_job_category_title;
	}

	public String getWs_job_category_description() {
		return ws_job_category_description;
	}

	public void setWs_job_category_description(String ws_job_category_description) {
		this.ws_job_category_description = ws_job_category_description;
	}

}
