package com.lti.airline.services;
import java.util.List;

import com.lti.airline.beans.Flight;
import com.lti.airline.exp.FlightExp;
import com.lti.airline.exp.TicketExp;

public interface FlightService {
	
	public void addFlight(Flight f) throws FlightExp;
	public Flight getFlightById(String flightId) throws FlightExp;
	public List<Flight> listAllFlight() throws FlightExp;
	public List<Flight> searchflightBysource(String flightSour, String flightDest) throws FlightExp;
}