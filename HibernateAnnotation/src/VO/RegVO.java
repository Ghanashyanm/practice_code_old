package VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="reg_anno")
public class RegVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reg_id")
	private int regId;
	
	@Column(name="first_name")
	private String fn;
	
	@Column(name="last_name")
	private String ln;
	
	@ManyToOne
	@JoinColumn(name="loginId")
	private LoginVO loginVO;
	
	
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
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
	public LoginVO getLoginVO() {
		return loginVO;
	}
	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}


}
