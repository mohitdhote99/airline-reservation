package com.lti.airline.dao;

import java.util.List;

import com.lti.airline.beans.User;

public interface UserDao {
	public User addUser(User p);
	public User searchUserById(int id);
	public User serachUserByemail(String email);
	public List<User> listAllUser();
	public boolean updateUser(int i,User uobj);
	public boolean loginUser(User uobj);
}
