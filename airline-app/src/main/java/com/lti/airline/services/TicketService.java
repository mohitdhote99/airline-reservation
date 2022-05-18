package com.lti.airline.services;

import java.util.List;

import com.lti.airline.beans.Ticket;
import com.lti.airline.exp.TicketExp;

public interface TicketService {
	public List<Ticket> listAllTickets(int userid);
	public void bookticket(Ticket t) throws TicketExp;

}
