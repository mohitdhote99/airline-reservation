package com.lti.airline.services;

import java.util.List;

import com.lti.airline.beans.User;

public interface UserService {
	public User addUser(User u);
	public User searchUserById(int id);
	public List<User> listAllUser();
	public boolean updateUser(int i,User uobj);
	public User serachUserByemail(String email);
	public boolean loginUser(User uobj);
}
