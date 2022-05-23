package com.lti.airline.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.beans.Flight;
import com.lti.airline.dao.FlightDao;
import com.lti.airline.exp.FlightExp;
import com.lti.airline.exp.TicketExp;
@Service("flightservice")
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightDao dao;
	
	
	public FlightDao getDao() {
		return dao;
	}


	public void setDao(FlightDao dao) {
		this.dao = dao;
	}


	@Override
	public Flight getFlightById(String flightId) throws FlightExp {
		return dao.searchflightById(flightId) ;
	}


	@Override
	public void addFlight(Flight f) throws FlightExp {
		dao.addFlight(f);
	}


	@Override
	public List<Flight> listAllFlight() throws FlightExp {
		return dao.listAllFlight();
	}


	public List<Flight> searchflightBysource(String flightSour, String flightDest) throws FlightExp {
		return dao.searchflightBysource(flightSour, flightDest);
	}


}