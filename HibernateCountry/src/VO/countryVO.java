package VO;

public class countryVO {
	private int countryId;
	private  String countryName;
	private stateVO stateVO;
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	public stateVO getStateVO() {
		return stateVO;
	}
	public void setStateVO(stateVO stateVO) {
		this.stateVO = stateVO;
	}
	
	

}
