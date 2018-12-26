package com.earth.world.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class State {
	
	@Id
	@Column(name="state_code")
	private int stateCode;
	
	@Column(name="state_name")
	private String stateName;
	
	@Column(name="state_country_code")
	private int stateContryCode;

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getStateContryCode() {
		return stateContryCode;
	}

	public void setStateContryCode(int stateContryCode) {
		this.stateContryCode = stateContryCode;
	}
	
	

}
