package com.lti.airline.dao;

import java.util.List;

import com.lti.airline.beans.User;

public interface UserDao {
	public void addUser(User p);
	public User searchUserById(int id);
	public List<User> listAllUser();
	
}
