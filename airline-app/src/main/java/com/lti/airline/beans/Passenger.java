package com.lti.airline.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PASSENGERS")
public class Passenger {
	
	@Id
	@Column(name = "PASS_ID")
	private int passId;
	
	@Column(name = "PASS_NAME")
	private String passName;
	
	@Column(name = "PASS_EMAIL")
	private String passEmail;
	
	@Column(name = "PASS_GENDER")
	private String passGender;
	
	@Column(name = "PASS_CITY")
	private String passCity;
	
	@Column(name = "PASS_COUNTRY")
	private String passCountry;
	
	@Column(name = "PASS_PASSWORD")
	private String passPassword;
	
	@Column(name = "PASS_CONTACT")
	private String passContact;

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public String getPassName() {
		return passName;
	}

	public void setPassName(String passName) {
		this.passName = passName;
	}

	public String getPassEmail() {
		return passEmail;
	}

	public void setPassEmail(String passEmail) {
		this.passEmail = passEmail;
	}

	public String getPassGender() {
		return passGender;
	}

	public void setPassGender(String passGender) {
		this.passGender = passGender;
	}

	public String getPassCity() {
		return passCity;
	}

	public void setPassCity(String passCity) {
		this.passCity = passCity;
	}

	public String getPassCountry() {
		return passCountry;
	}

	public void setPassCountry(String passCountry) {
		this.passCountry = passCountry;
	}

	public String getPassPassword() {
		return passPassword;
	}

	public void setPassPassword(String passPassword) {
		this.passPassword = passPassword;
	}

	public String getPassContact() {
		return passContact;
	}

	public void setPassContact(String passContact) {
		this.passContact = passContact;
	}

	public Passenger(int passId, String passName, String passEmail, String passGender, String passCity,
			String passCountry, String passPassword, String passContact) {
		super();
		this.passId = passId;
		this.passName = passName;
		this.passEmail = passEmail;
		this.passGender = passGender;
		this.passCity = passCity;
		this.passCountry = passCountry;
		this.passPassword = passPassword;
		this.passContact = passContact;
	}

	public Passenger() {
		super();
	}

	@Override
	public String toString() {
		return "\n Passenger [passId=" + passId + ", passName=" + passName + ", passEmail=" + passEmail
				+ ", passGender=" + passGender + ", passCity=" + passCity + ", passCountry=" + passCountry
				+ ", passPassword=" + passPassword + ", passContact=" + passContact + "]";
	}

}
