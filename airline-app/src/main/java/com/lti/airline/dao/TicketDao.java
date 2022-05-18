package com.lti.airline.dao;

import java.util.List;

import com.lti.airline.beans.Flight;
import com.lti.airline.beans.Ticket;
import com.lti.airline.exp.TicketExp;

public interface TicketDao {
	public List<Ticket> listAllTickets(int userid);
	public void bookticket(Ticket t) throws TicketExp;
}
