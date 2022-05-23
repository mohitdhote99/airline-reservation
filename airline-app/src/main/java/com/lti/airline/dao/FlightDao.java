package com.lti.airline.dao;

import java.util.List;

import com.lti.airline.beans.Flight;
import com.lti.airline.exp.FlightExp;

public interface FlightDao {
	public void addFlight(Flight f) throws FlightExp;;
	public Flight searchflightById(String id) throws FlightExp;;
	public List<Flight> listAllFlight() throws FlightExp;;
	public List<Flight> searchflightBysource(String flightSour, String flightDest) throws FlightExp;;
}
	
