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
@Table(name = "ws_publisher") 
public class Publisher {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer adm_publisher_id;
	
	private String adm_publisher_name;
	
	private String adm_publisher_email;
	
	private int adm_publisher_mobile;
	
	private char adm_publisher_gender;
	
	private String adm_publisher_addr1;
	
	private String adm_publisher_addr2;
	
	private String adm_publisher_addr3;
	
	private String adm_publisher_addr4;
	
	private String adm_publisher_city;
	
	@OneToOne
	@JoinColumn(name = "adm_publisher_state", referencedColumnName = "ws_state_id")
	private State adm_publisher_state;
	
	@OneToOne
	@JoinColumn(name = "adm_publisher_country", referencedColumnName = "ws_country_id")
	private Country adm_publisher_country;
	
	private int adm_publisher_postcode;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date adm_publisher_dob;
	
	private int adm_publisher_created_by;
	
	private Date adm_publisher_created_date;
	
	private int adm_publisher_last_updated_by;
	
	private Date adm_publisher_last_updated_date;

	public int getAdm_publisher_id() {
		return adm_publisher_id;
	}

	public void setAdm_publisher_id(int adm_publisher_id) {
		this.adm_publisher_id = adm_publisher_id;
	}

	public String getAdm_publisher_name() {
		return adm_publisher_name;
	}

	public void setAdm_publisher_name(String adm_publisher_name) {
		this.adm_publisher_name = adm_publisher_name;
	}

	public String getAdm_publisher_email() {
		return adm_publisher_email;
	}

	public void setAdm_publisher_email(String adm_publisher_email) {
		this.adm_publisher_email = adm_publisher_email;
	}

	public int getAdm_publisher_mobile() {
		return adm_publisher_mobile;
	}

	public void setAdm_publisher_mobile(int adm_publisher_mobile) {
		this.adm_publisher_mobile = adm_publisher_mobile;
	}

	public char getAdm_publisher_gender() {
		return adm_publisher_gender;
	}

	public void setAdm_publisher_gender(char adm_publisher_gender) {
		this.adm_publisher_gender = adm_publisher_gender;
	}

	public String getAdm_publisher_addr1() {
		return adm_publisher_addr1;
	}

	public void setAdm_publisher_addr1(String adm_publisher_addr1) {
		this.adm_publisher_addr1 = adm_publisher_addr1;
	}

	public String getAdm_publisher_addr2() {
		return adm_publisher_addr2;
	}

	public void setAdm_publisher_addr2(String adm_publisher_addr2) {
		this.adm_publisher_addr2 = adm_publisher_addr2;
	}

	public String getAdm_publisher_addr3() {
		return adm_publisher_addr3;
	}

	public void setAdm_publisher_addr3(String adm_publisher_addr3) {
		this.adm_publisher_addr3 = adm_publisher_addr3;
	}

	public String getAdm_publisher_addr4() {
		return adm_publisher_addr4;
	}

	public void setAdm_publisher_addr4(String adm_publisher_addr4) {
		this.adm_publisher_addr4 = adm_publisher_addr4;
	}

	public String getAdm_publisher_city() {
		return adm_publisher_city;
	}

	public void setAdm_publisher_city(String adm_publisher_city) {
		this.adm_publisher_city = adm_publisher_city;
	}

	public State getAdm_publisher_state() {
		return adm_publisher_state;
	}

	public void setAdm_publisher_state(State adm_publisher_state) {
		this.adm_publisher_state = adm_publisher_state;
	}

	public Country getAdm_publisher_country() {
		return adm_publisher_country;
	}

	public void setAdm_publisher_country(Country adm_publisher_country) {
		this.adm_publisher_country = adm_publisher_country;
	}

	public int getAdm_publisher_postcode() {
		return adm_publisher_postcode;
	}

	public void setAdm_publisher_postcode(int adm_publisher_postcode) {
		this.adm_publisher_postcode = adm_publisher_postcode;
	}

	public Date getAdm_publisher_dob() {
		return adm_publisher_dob;
	}

	public void setAdm_publisher_dob(Date adm_publisher_dob) {
		this.adm_publisher_dob = adm_publisher_dob;
	}

	public int getAdm_publisher_created_by() {
		return adm_publisher_created_by;
	}

	public void setAdm_publisher_created_by(int adm_publisher_created_by) {
		this.adm_publisher_created_by = adm_publisher_created_by;
	}

	public Date getAdm_publisher_created_date() {
		return adm_publisher_created_date;
	}

	public void setAdm_publisher_created_date(Date adm_publisher_created_date) {
		this.adm_publisher_created_date = adm_publisher_created_date;
	}

	public int getAdm_publisher_last_updated_by() {
		return adm_publisher_last_updated_by;
	}

	public void setAdm_publisher_last_updated_by(int adm_publisher_last_updated_by) {
		this.adm_publisher_last_updated_by = adm_publisher_last_updated_by;
	}

	public Date getAdm_publisher_last_updated_date() {
		return adm_publisher_last_updated_date;
	}

	public void setAdm_publisher_last_updated_date(Date adm_publisher_last_updated_date) {
		this.adm_publisher_last_updated_date = adm_publisher_last_updated_date;
	}

}
