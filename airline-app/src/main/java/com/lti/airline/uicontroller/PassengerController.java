package com.lti.airline.uicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.beans.Passenger;
import com.lti.airline.services.PassengerServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	PassengerServiceImpl passService;
	
	//http://localhost:8282/passenger/serchUser/1001
	@GetMapping(path="/serchUser/{id}",produces="application/json")
	public Passenger getuserById(@PathVariable(value="id") int id) {
		return passService.searchpassangerById(id);
	}
}
