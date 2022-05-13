package com.lti.airline.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.airline.beans.Passenger;
@Repository
public class PassengerDaoImpl implements PassengerDao{
	
	@PersistenceContext
	private EntityManager entityManager; 

	@Override
	public void addPassenger(Passenger p) {
		
	}

	@Override
	public Passenger searchpassangerById(int id) {
		Passenger result = entityManager.find(Passenger.class,id);
		return result;
	}

}
