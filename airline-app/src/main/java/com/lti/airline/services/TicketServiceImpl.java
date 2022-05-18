package com.lti.airline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.beans.Ticket;
import com.lti.airline.dao.TicketDao;
import com.lti.airline.exp.TicketExp;

@Service("ticketservice")
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketDao dao;

	public TicketDao getDao() {
		return dao;
	}

	public void setDao(TicketDao dao) {
		this.dao = dao;
	}

	@Override
	public void bookticket(Ticket t) throws TicketExp{
		dao.bookticket(t);
	}

	@Override
	public List<Ticket> listAllTickets(int userid) {
		return dao.listAllTickets(userid);
	}

}
