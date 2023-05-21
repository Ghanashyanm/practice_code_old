package com.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="spring_table")
public class RegVO {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="FirstName")
	private String fn;

	@Column(name="LastName")
	private String ln;

	@Column(name="UserName")
	private String un;

	@Column(name="Password")
	private String pwd;
	
	@ManyToOne
	@JoinColumn(name="login_table")
	private LoginVO loginId;

	public LoginVO getLoginId() {
		return loginId;
	}

	public void setLoginId(LoginVO loginId) {
		this.loginId = loginId;
	}

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

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
