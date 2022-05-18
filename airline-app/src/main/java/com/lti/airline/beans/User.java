package com.lti.airline.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userId_generator")
	@SequenceGenerator(name="userId_generator", sequenceName = "userId_generator",initialValue=100,allocationSize=1)
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_EMAIL",unique=true)
	private String userEmail;
	
	@Column(name = "USER_GENDER")
	private String userGender;
	
	@Column(name = "USER_CITY")
	private String userCity;
	
	@Column(name = "USER_COUNTRY")
	private String userCountry;
	
	@Column(name = "USER_PASSWORD")
	private String userPassword;
	
	@Column(name = "USER_CONTACT")
	private long userContact;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public long getUserContact() {
		return userContact;
	}

	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}

	public User(int userId, String userName, String userEmail, String userGender, String userCity, String userCountry,
			String userPassword, long userContact) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userGender = userGender;
		this.userCity = userCity;
		this.userCountry = userCountry;
		this.userPassword = userPassword;
		this.userContact = userContact;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "\n User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userGender="
				+ userGender + ", userCity=" + userCity + ", userCountry=" + userCountry + ", userPassword="
				+ userPassword + ", userContact=" + userContact + "]";
	}

	
}
