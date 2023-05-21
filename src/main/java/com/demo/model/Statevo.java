package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="State")
public class Statevo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="state_id")
	private int id;
	
	@Column(name="state_name")
	private String state;
	
	@ManyToOne
	@JoinColumn(name="countryId")
	private Countryvo countryvo;
	
	@Column(name="status")
	private boolean status = true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Countryvo getCountryvo() {
		return countryvo;
	}

	public void setCountryvo(Countryvo countryvo) {
		this.countryvo = countryvo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
