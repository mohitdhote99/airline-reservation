package com.lti.airline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.beans.Passenger;
import com.lti.airline.dao.PassengerDao;

@Service("passService")
public class PassengerServiceImpl implements PassengerService{
	
	@Autowired
	PassengerDao dao;
	
	public PassengerDao getDao() {
		return dao;
	}

	public void setDao(PassengerDao dao) {
		this.dao = dao;
	}

	@Override
	public void addPassenger(Passenger p) {
		
	}

	@Override
	public Passenger searchpassangerById(int id) {
		return dao.searchpassangerById(id);
	}

}
