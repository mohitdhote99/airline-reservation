package com.lti.airline.dao;

import com.lti.airline.beans.Passenger;

public interface PassengerDao {
	public void addPassenger(Passenger p);
	public Passenger searchpassangerById(int id);
	
}
