package com.lti.airline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.airline.beans.User;
import com.lti.airline.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao dao;
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void addUser(User p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User searchUserById(int id) {
		// TODO Auto-generated method stub
		return dao.searchUserById(id);
	}

	@Override
	public List<User> listAllUser() {
		List<User> ul = dao.listAllUser();
		return ul;
	}

}
