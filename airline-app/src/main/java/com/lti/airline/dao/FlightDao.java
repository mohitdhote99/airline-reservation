package com.lti.airline.dao;

import java.util.List;

import com.lti.airline.beans.Flight;

public interface FlightDao {
	public void addFlight(Flight f);
	public Flight searchflightById(String id);
	public List<Flight> listAllFlight();
	public List<Flight> searchflightBysource(String flightSour, String flightDest);
}
	
