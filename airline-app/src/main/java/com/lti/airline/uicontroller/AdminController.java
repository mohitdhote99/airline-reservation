package com.lti.airline.uicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.airline.beans.Admin;
import com.lti.airline.services.AdminServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
		@Autowired
		AdminServiceImpl adminservice;
		
		@PostMapping(path="/addadmin", produces="application/json",consumes="application/json")
		public void createAdminNew(@RequestBody Admin e) 
		{
			 adminservice.addAdmin(e);
		}
		
		//http://localhost:8282/admin/login_admin
		@PostMapping(path="/login_admin",produces="application/json")
		public boolean loginAdmin(@RequestBody Admin uobj) {
			return adminservice.loginAdmin(uobj);
		}
	
}
