package com.wesource.we_source_api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ws_seeker") 
public class Seeker {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer	apl_seeker_id;
	
	private String apl_seeker_name;
	
	private String apl_seeker_email;
	
	private Integer apl_seeker_mobile;
	
	private char apl_seeker_gender;
	
	private String apl_seeker_addr1;
	private String apl_seeker_addr2;
	private String apl_seeker_addr3;	
	private String apl_seeker_addr4;
	
	private String apl_seeker_city;
	
	@OneToOne
	@JoinColumn(name = "apl_seeker_state", referencedColumnName = "ws_state_id")
	private State apl_seeker_state;
	
	@OneToOne
	@JoinColumn(name = "apl_seeker_country", referencedColumnName = "ws_country_id")
	private Country apl_seeker_country;
	
	private Integer apl_seeker_postcode;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date apl_seeker_dob;
	
	private int apl_seeker_created_by;
	
	private Date apl_seeker_created_date;
	
	private int apl_seeker_last_updated_by;
	
	private Date apl_seeker_last_updated_date;

	public Integer getApl_seeker_id() {
		return apl_seeker_id;
	}

	public void setApl_seeker_id(Integer apl_seeker_id) {
		this.apl_seeker_id = apl_seeker_id;
	}

	public String getApl_seeker_name() {
		return apl_seeker_name;
	}

	public void setApl_seeker_name(String apl_seeker_name) {
		this.apl_seeker_name = apl_seeker_name;
	}

	public String getApl_seeker_email() {
		return apl_seeker_email;
	}

	public void setApl_seeker_email(String apl_seeker_email) {
		this.apl_seeker_email = apl_seeker_email;
	}

	public Integer getApl_seeker_mobile() {
		return apl_seeker_mobile;
	}

	public void setApl_seeker_mobile(Integer apl_seeker_mobile) {
		this.apl_seeker_mobile = apl_seeker_mobile;
	}

	public char getApl_seeker_gender() {
		return apl_seeker_gender;
	}

	public void setApl_seeker_gender(char apl_seeker_gender) {
		this.apl_seeker_gender = apl_seeker_gender;
	}

	public String getApl_seeker_addr1() {
		return apl_seeker_addr1;
	}

	public void setApl_seeker_addr1(String apl_seeker_addr1) {
		this.apl_seeker_addr1 = apl_seeker_addr1;
	}

	public String getApl_seeker_addr2() {
		return apl_seeker_addr2;
	}

	public void setApl_seeker_addr2(String apl_seeker_addr2) {
		this.apl_seeker_addr2 = apl_seeker_addr2;
	}

	public String getApl_seeker_addr3() {
		return apl_seeker_addr3;
	}

	public void setApl_seeker_addr3(String apl_seeker_addr3) {
		this.apl_seeker_addr3 = apl_seeker_addr3;
	}

	public String getApl_seeker_addr4() {
		return apl_seeker_addr4;
	}

	public void setApl_seeker_addr4(String apl_seeker_addr4) {
		this.apl_seeker_addr4 = apl_seeker_addr4;
	}

	public String getApl_seeker_city() {
		return apl_seeker_city;
	}

	public void setApl_seeker_city(String apl_seeker_city) {
		this.apl_seeker_city = apl_seeker_city;
	}

	public State getApl_seeker_state() {
		return apl_seeker_state;
	}

	public void setApl_seeker_state(State apl_seeker_state) {
		this.apl_seeker_state = apl_seeker_state;
	}

	public Country getApl_seeker_country() {
		return apl_seeker_country;
	}

	public void setApl_seeker_country(Country apl_seeker_country) {
		this.apl_seeker_country = apl_seeker_country;
	}

	public Integer getApl_seeker_postcode() {
		return apl_seeker_postcode;
	}

	public void setApl_seeker_postcode(Integer apl_seeker_postcode) {
		this.apl_seeker_postcode = apl_seeker_postcode;
	}

	public Date getApl_seeker_dob() {
		return apl_seeker_dob;
	}

	public void setApl_seeker_dob(Date apl_seeker_dob) {
		this.apl_seeker_dob = apl_seeker_dob;
	}

	public int getApl_seeker_created_by() {
		return apl_seeker_created_by;
	}

	public void setApl_seeker_created_by(int apl_seeker_created_by) {
		this.apl_seeker_created_by = apl_seeker_created_by;
	}

	public Date getApl_seeker_created_date() {
		return apl_seeker_created_date;
	}

	public void setApl_seeker_created_date(Date apl_seeker_created_date) {
		this.apl_seeker_created_date = apl_seeker_created_date;
	}

	public int getApl_seeker_last_updated_by() {
		return apl_seeker_last_updated_by;
	}

	public void setApl_seeker_last_updated_by(int apl_seeker_last_updated_by) {
		this.apl_seeker_last_updated_by = apl_seeker_last_updated_by;
	}

	public Date getApl_seeker_last_updated_date() {
		return apl_seeker_last_updated_date;
	}

	public void setApl_seeker_last_updated_date(Date apl_seeker_last_updated_date) {
		this.apl_seeker_last_updated_date = apl_seeker_last_updated_date;
	}
	
}
