package com.lti.airline.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name= "FLIGHTS")
public class Flight {
	@Id
	@Column(name = "FLI_ID")
	private String flightId;
	
	@Column(name = "FLI_NAME")
	private String flightName;

	@Column(name = "FLI_ARRIVAL")
	@JsonFormat(pattern="YYYY-MM-dd HH:mm:ss")
	private Date flightArrival;
	
	@Column(name = "FLI_DEPARTURE")
	@JsonFormat(pattern="YYYY-MM-dd HH:mm:ss")
	private Date flightDeparture;
	
	@Column(name = "FLI_SOURCE")
	private String flightSour;
	
	@Column(name = "FLI_DESTINATION")
	private String flightDest;

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Date getFlightArrival() {
		return flightArrival;
	}

	public void setFlightArrival(Date flightArrival) {
		this.flightArrival = flightArrival;
	}

	public Date getFlightDeparture() {
		return flightDeparture;
	}

	public void setFlightDeparture(Date flightDeparture) {
		this.flightDeparture = flightDeparture;
	}

	public String getFlightSour() {
		return flightSour;
	}

	public void setFlightSour(String flightSour) {
		this.flightSour = flightSour;
	}

	public String getFlightDest() {
		return flightDest;
	}

	public void setFlightDest(String flightDest) {
		this.flightDest = flightDest;
	}

	public Flight(String flightId, String flightName, Date flightArrival, Date flightDeparture,
			String flightSour, String flightDest) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.flightArrival = flightArrival;
		this.flightDeparture = flightDeparture;
		this.flightSour = flightSour;
		this.flightDest = flightDest;
	}

	public Flight() {
		super();
	}

	@Override
	public String toString() {
		return "\n Flight [flightId=" + flightId + ", flightName=" + flightName + ", flightArrival=" + flightArrival
				+ ", flightDeparture=" + flightDeparture + ", flightSour=" + flightSour
				+ ", flightDest=" + flightDest + "]";
	}


}

