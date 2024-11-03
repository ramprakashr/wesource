package com.wesource.we_source_api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ws_job")
public class Job {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer ws_job_id;
	
	private String ws_job_title;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date ws_job_from_date;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date ws_job_to_date;
	
	@OneToOne
	@JoinColumn(name = "ws_job_period", referencedColumnName = "ws_job_period_id")
	private JobPeriod ws_job_period;
	
	@OneToOne
	@JoinColumn(name = "ws_job_category", referencedColumnName = "ws_job_category_id")
	private JobCategory ws_job_category;
	
	@OneToOne
	@JoinColumn(name = "ws_job_status", referencedColumnName = "ws_job_status_id")
	private JobStatus ws_job_status;
	
	private Float ws_job_proposed_fees;
	
	private Float ws_job_final_fees;
	
	@OneToOne
	@JoinColumn(name = "ws_job_fee_interval", referencedColumnName = "ws_job_fee_interval_id")
	private JobFeeInterval ws_job_fee_interval;
	
	private String ws_job_description;
	
	private int ws_job_is_wfh;
	
	private Integer ws_job_created_by;
	
	@JsonFormat(pattern="dd/MM/yyyy@HH:mm:ss")
	private Date ws_job_created_date;
	
	private Integer ws_job_last_updated_by;
	
	private Date ws_job_last_updated_date;
	
	public Integer getWs_job_id() {
		return ws_job_id;
	}
	public void setWs_job_id(Integer ws_job_id) {
		this.ws_job_id = ws_job_id;
	}
	public String getWs_job_title() {
		return ws_job_title;
	}
	public void setWs_job_title(String ws_job_title) {
		this.ws_job_title = ws_job_title;
	}
	public Date getWs_job_from_date() {
		return ws_job_from_date;
	}
	public void setWs_job_from_date(Date ws_job_from_date) {
		this.ws_job_from_date = ws_job_from_date;
	}
	public Date getWs_job_to_date() {
		return ws_job_to_date;
	}
	public void setWs_job_to_date(Date ws_job_to_date) {
		this.ws_job_to_date = ws_job_to_date;
	}
	public JobPeriod getWs_job_period() {
		return ws_job_period;
	}
	public void setWs_job_period(JobPeriod ws_job_period) {
		this.ws_job_period = ws_job_period;
	}
	public JobCategory getWs_job_category() {
		return ws_job_category;
	}
	public void setWs_job_category(JobCategory ws_job_category) {
		this.ws_job_category = ws_job_category;
	}
	public JobStatus getWs_job_status() {
		return ws_job_status;
	}
	public void setWs_job_status(JobStatus ws_job_status) {
		this.ws_job_status = ws_job_status;
	}
	public Float getWs_job_proposed_fees() {
		return ws_job_proposed_fees;
	}
	public void setWs_job_proposed_fees(Float ws_job_proposed_fees) {
		this.ws_job_proposed_fees = ws_job_proposed_fees;
	}
	public Float getWs_job_final_fees() {
		return ws_job_final_fees;
	}
	public void setWs_job_final_fees(Float ws_job_final_fees) {
		this.ws_job_final_fees = ws_job_final_fees;
	}
	public JobFeeInterval getWs_job_fee_interval() {
		return ws_job_fee_interval;
	}
	public void setWs_job_fee_interval(JobFeeInterval ws_job_fee_interval) {
		this.ws_job_fee_interval = ws_job_fee_interval;
	}
	public String getWs_job_description() {
		return ws_job_description;
	}
	public void setWs_job_description(String ws_job_description) {
		this.ws_job_description = ws_job_description;
	}
	public int getWs_job_is_wfh() {
		return ws_job_is_wfh;
	}
	public void setWs_job_is_wfh(int ws_job_is_wfh) {
		this.ws_job_is_wfh = ws_job_is_wfh;
	}
	public Integer getWs_job_created_by() {
		return ws_job_created_by;
	}
	public void setWs_job_created_by(Integer ws_job_created_by) {
		this.ws_job_created_by = ws_job_created_by;
	}
	public Date getWs_job_created_date() {
		return ws_job_created_date;
	}
	public void setWs_job_created_date(Date ws_job_created_date) {
		this.ws_job_created_date = ws_job_created_date;
	}
	public Integer getWs_job_last_updated_by() {
		return ws_job_last_updated_by;
	}
	public void setWs_job_last_updated_by(Integer ws_job_last_updated_by) {
		this.ws_job_last_updated_by = ws_job_last_updated_by;
	}
	public Date getWs_job_last_updated_date() {
		return ws_job_last_updated_date;
	}
	public void setWs_job_last_updated_date(Date ws_job_last_updated_date) {
		this.ws_job_last_updated_date = ws_job_last_updated_date;
	}
	
}
