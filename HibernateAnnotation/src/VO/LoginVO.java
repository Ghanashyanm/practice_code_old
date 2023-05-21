package VO;

import javax.persistence.*;


@Entity
@Table(name="login_anno")

public class LoginVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="login_id")
	private int loginId;
	
	@Column(name="user_name")
	private String un;
	
	@Column(name="password")
	private String pwd;

	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
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
