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
@Table(name="Register")
public class Regvo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String fn;
	
	@Column(name="last_name")
	private String ln;
	
	@Column(name="status")
	private boolean status = true;
	
	

	@ManyToOne
	@JoinColumn(name="login_id")
	private Loginvo loginvo;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Loginvo getLoginvo() {
		return loginvo;
	}

	public void setLoginvo(Loginvo loginvo) {
		this.loginvo = loginvo;
	}
	
	
	
}
