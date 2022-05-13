package com.lti.airline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.airline.beans.User;
@Repository
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager entityManager; 


	@Override
	public void addUser(User p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User searchUserById(int id) {
		User result = entityManager.find(User.class,id);
		return result;
	}

	@Override
	public List<User> listAllUser() {
		 Query qry = entityManager.createQuery("Select e from User e");
		 List<User> userList=qry.getResultList();
		 System.out.println(userList);
		return userList;
	}

}
