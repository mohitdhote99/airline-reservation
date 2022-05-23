package com.lti.airline.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TICKETS")
public class Ticket {
	
	@Id
	@Column(name = "TICKET_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticketId_generator")
	@SequenceGenerator(name="ticketId_generator", sequenceName = "ticketId_generator",initialValue=1000,allocationSize=1)
	private long tickId;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="FLI_ID")
	private Flight flights;
	
	@Column(name="SEAT_NO",unique=true)
	private String seatNo;
	
	@Column(name="CATEGEORY")
	private String categeory;

	public long getTickId() {
		return tickId;
	}

	public void setTickId(long tickId) {
		this.tickId = tickId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Flight getFlights() {
		return flights;
	}

	public void setFlights(Flight flights) {
		this.flights = flights;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}


	public String getCategeory() {
		return categeory;
	}

	public void setCategeory(String categeory) {
		this.categeory = categeory;
	}

	public Ticket(long tickId, User user, Flight flights, String seatNo, String categeory) {
		super();
		this.tickId = tickId;
		this.user = user;
		this.flights = flights;
		this.seatNo = seatNo;
		this.categeory = categeory;
	}

	public Ticket() {
		super();
	}

	@Override
	public String toString() {
		return "Ticket [tickId=" + tickId + ", user=" + user + ", flights=" + flights + ", seatNo=" + seatNo
				+ ", categeory=" + categeory + "]";
	}
	
	

	
}
