package web.test.servlet;

import java.sql.Timestamp;

public class Member {
	private Integer id;
	private String acciunt;
	private String password;
	private Boolean pass;
	private Timestamp lastUpdateDate;
	
	
	public Member(Integer id, String acciunt, String password, Boolean pass, Timestamp lastUpdateDate) {
		super();
		this.id = id;
		this.acciunt = acciunt;
		this.password = password;
		this.pass = pass;
		this.lastUpdateDate = lastUpdateDate;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAcciunt() {
		return acciunt;
	}


	public void setAcciunt(String acciunt) {
		this.acciunt = acciunt;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getPass() {
		return pass;
	}


	public void setPass(Boolean pass) {
		this.pass = pass;
	}


	public Timestamp getLastUpdateDate() {
		return lastUpdateDate;
	}


	public void setLastUpdateDate(Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	
	
	

}
