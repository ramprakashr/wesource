package com.wesource.we_source_api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ws_state")
public class State {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ws_state_id;
	
	private String ws_state_name;
	
	private String ws_state_short_name;

	public int getWs_state_id() {
		return ws_state_id;
	}

	public void setWs_state_id(int ws_state_id) {
		this.ws_state_id = ws_state_id;
	}

	public String getWs_state_name() {
		return ws_state_name;
	}

	public void setWs_state_name(String ws_state_name) {
		this.ws_state_name = ws_state_name;
	}

	public String getWs_state_short_name() {
		return ws_state_short_name;
	}

	public void setWs_state_short_name(String ws_state_short_name) {
		this.ws_state_short_name = ws_state_short_name;
	}
	
}
