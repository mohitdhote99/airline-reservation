package com.lti.airline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.airline.beans.Flight;

@Repository
public class FlightDaoImpl implements FlightDao {

	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void addFlight(Flight f) {
		entityManager.persist(f);
	}

	@Override
	public Flight searchflightById(String id) {
		return entityManager.find(Flight.class,id);
	}

	@Override
	public List<Flight> listAllFlight() {
		Query qry = entityManager.createQuery("Select f from Flight f");
		List<Flight> flightList = qry.getResultList();
		System.out.println(flightList.toString());
		return flightList;
	}
	
	
	@Override
	public List<Flight> searchflightBysource(String flightSour, String flightDest) {
		// TODO Auto-generated method stub
		/*TypedQuery<Flight> qry = entityManager.createQuery(
		"Select e from Flight e where e.flightSour='" + flightSour + "' and e.flightDest='" + flightDest + "'",Flight.class);*/
		Query qry = entityManager.createQuery("Select f from Flight f");
		List<Flight> cc = qry.getResultList();
		System.out.println(cc);
		return cc;	
	}
	
	

}