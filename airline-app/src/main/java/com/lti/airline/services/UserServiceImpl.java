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
	public User addUser(User u) {
		return dao.addUser(u);
	}

	@Override
	public User searchUserById(int id) {
		return dao.searchUserById(id);
	}

	@Override
	public List<User> listAllUser() {
		List<User> ul = dao.listAllUser();
		return ul;
	}
	

	@Override
	public boolean updateUser(int i, User uobj) {
		return dao.updateUser(i, uobj);
	}

	@Override
	public boolean loginUser(User uobj) {
		return dao.loginUser(uobj);
	}

	@Override
	public User serachUserByemail(String email) {
		return dao.serachUserByemail(email);
	}


}
