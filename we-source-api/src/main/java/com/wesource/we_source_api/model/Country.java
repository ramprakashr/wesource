package com.wesource.we_source_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ws_country") 
public class Country {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int ws_country_id;
	
	private String ws_country_name;
	
	private String ws_country_phonecode;

	public int getWs_country_id() {
		return ws_country_id;
	}

	public void setWs_country_id(int ws_country_id) {
		this.ws_country_id = ws_country_id;
	}

	public String getWs_country_name() {
		return ws_country_name;
	}

	public void setWs_country_name(String ws_country_name) {
		this.ws_country_name = ws_country_name;
	}

	public String getWs_country_phonecode() {
		return ws_country_phonecode;
	}

	public void setWs_country_phonecode(String ws_country_phonecode) {
		this.ws_country_phonecode = ws_country_phonecode;
	}

}
