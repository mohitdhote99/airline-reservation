package com.lti.airline.uicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	//http://localhost:8282/User/add_user
	@PostMapping("/add_user")
	public User addUser(@RequestBody User userobj){
		return userService.addUser(userobj);
	}
	
	
	//http://localhost:8282/User/update_User/1001
	@PutMapping("/update_User/{id}")
	public boolean updateUser(@PathVariable(value="id") int id,@RequestBody User uobj) {
		return userService.updateUser(id, uobj);
	}
	
	
	//http://localhost:8282/User/getUser/mohit@gmail.com
	@GetMapping(path="/getUser/{email}",produces="application/json")
	public User serachUserByemail(@PathVariable(value="email") String id) {
			return userService.serachUserByemail(id);
	}
	
	//http://localhost:8282/User/secrchUser/1001
	@GetMapping(path="/secrchUser/{id}",produces="application/json")
	public User serachUserById(@PathVariable(value="id") int id) {
			return userService.searchUserById(id);
	}
	
	//http://localhost:8282/User/loginuser
	@PostMapping(path="/loginuser",produces="application/json")
	public boolean loginuser(@RequestBody User uobj){
		return userService.loginUser(uobj);
	}
	
	
}
