package com.lti.airline.dao;


import com.lti.airline.beans.Flight;
import com.lti.airline.beans.Ticket;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl implements TicketDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void bookticket(Ticket t) {
		System.out.println(t.toString());
		entityManager.merge(t);
	}

	@Override
	public List<Ticket> listAllTickets(int userid) {
		Query qry = entityManager.createQuery("Select e from Ticket e where e.user='"+userid+"'");
		List<Ticket> ticketList = qry.getResultList();
		System.out.println(ticketList.toString());
		return ticketList;
	}

	

}
