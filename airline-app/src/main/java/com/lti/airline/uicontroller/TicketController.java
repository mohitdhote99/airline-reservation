package com.lti.airline.uicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.beans.Flight;
import com.lti.airline.beans.Ticket;
import com.lti.airline.exp.TicketExp;
import com.lti.airline.services.TicketService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketservice; 
	
	//http://localhost:8282/Ticket/ticketBook
	@PostMapping("/ticketBook")
	public Ticket bookticket(@RequestBody Ticket t) {
		try {
			ticketservice.bookticket(t);
			return t;
		} catch (Exception e) {
			System.out.println("my message "+e.getMessage());
			return null;
		}
	}
	
//	//http://localhost:8282/Flight/flightlist
//	@GetMapping("/flightlist/{user}",produces="application/json")
//	public List<Flight> listAllFlight(){
//		return flightservice.listAllFlight();
//	}
	
}
