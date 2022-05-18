package com.lti.airline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.beans.Admin;
import com.lti.airline.dao.AdminDao;

@Service("admService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao dao;
	
	
	public AdminDao getDao() {
		return dao;
	}


	public void setDao(AdminDao dao) {
		this.dao = dao;
	}


	@Override
	public void addAdmin(Admin adm) {
		dao.addAdmin(adm);
	}

	@Override
	public boolean loginAdmin(Admin uobj) {
		return dao.loginAdmin(uobj);
	}

}
