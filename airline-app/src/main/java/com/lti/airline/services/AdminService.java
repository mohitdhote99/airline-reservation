package com.lti.airline.services;

import com.lti.airline.beans.Admin;

public interface AdminService {
	public void addAdmin(Admin adm);
	public boolean loginAdmin(Admin uobj);
}
