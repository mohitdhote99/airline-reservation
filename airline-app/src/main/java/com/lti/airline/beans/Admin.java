package com.lti.airline.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMINS")
public class Admin {
	
	@Id
	@Column(name="ADM_USERNAME")
	private String admUsername;
	
	
	@Column(name="ADM_PASSWORD")
	private String admPassword;


	public String getAdmUsername() {
		return admUsername;
	}


	public void setAdmUsername(String admUsername) {
		this.admUsername = admUsername;
	}


	public String getAdmPassword() {
		return admPassword;
	}


	public void setAdmPassword(String admPassword) {
		this.admPassword = admPassword;
	}


	public Admin(String admUsername, String admPassword) {
		super();
		this.admUsername = admUsername;
		this.admPassword = admPassword;
	}


	public Admin() {
		super();
	}


	@Override
	public String toString() {
		return "\n Admin [admUsername=" + admUsername + ", admPassword=" + admPassword + "]";
	}
	
	
	
	
}
