package com.lti.airline.services;
import java.util.List;

import com.lti.airline.beans.Flight;

public interface FlightService {
	
	public void addFlight(Flight f);
	public Flight getFlightById(String flightId);
	public List<Flight> listAllFlight();
	public List<Flight> searchflightBysource(String flightSour, String flightDest);
}