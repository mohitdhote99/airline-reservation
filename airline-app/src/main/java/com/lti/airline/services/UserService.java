package com.lti.airline.services;

import java.util.List;

import com.lti.airline.beans.User;

public interface UserService {
	public void addUser(User p);
	public User searchUserById(int id);
	public List<User> listAllUser();
}
