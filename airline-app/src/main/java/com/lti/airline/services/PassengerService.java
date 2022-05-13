package com.lti.airline.services;

import com.lti.airline.beans.Passenger;

public interface PassengerService {
	public void addPassenger(Passenger p);
	public Passenger searchpassangerById(int id);
}
