package com.lti.airline.uicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.beans.User;
import com.lti.airline.services.UserServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	//http://localhost:8282/User/userlist
	
	@GetMapping("/userlist")
	public List<User> listAllUser(){
		return userService.listAllUser();
	}
	
}
