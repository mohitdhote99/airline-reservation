package com.lti.airline.uicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.beans.Flight;
import com.lti.airline.beans.User;
import com.lti.airline.services.FlightService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Flight")
public class FlightController {

	@Autowired
	private FlightService flightservice; 
	
	//http://localhost:8282/Flight/searchflight/f101
		@GetMapping(path="/searchflight/{id}",produces="application/json")
		public Flight getflightwithId(@PathVariable(value="id") String id) {
			return flightservice.getFlightById(id);
		}
	
		//http://localhost:8595/Flight/addFlight
		@PostMapping("/addFlight")
		public void addflights(@RequestBody Flight u) {
			flightservice.addFlight(u);
		}
		
		//http://localhost:8282/Flight/flightlist
		@GetMapping("/flightlist")
		public List<Flight> listAllFlight(){
			return flightservice.listAllFlight();
		}
		
		//http://localhost:8282/Flight/flightBySourceDest
		@PostMapping(path="/flightBySourceDest",produces="application/json")
		public List<Flight>  searchflightBysource(@RequestBody Flight fobj) {
			return flightservice.searchflightBysource(fobj.getFlightSour(),fobj.getFlightDest());
		}
		
}