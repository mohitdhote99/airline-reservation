package com.lti.airline.dao;

import com.lti.airline.beans.Admin;

public interface AdminDao {
	public void addAdmin(Admin adm);
	public boolean loginAdmin(Admin uobj);
}
