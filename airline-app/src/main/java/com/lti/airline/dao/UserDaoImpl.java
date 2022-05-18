package com.lti.airline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.airline.beans.User;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public User addUser(User p) {
		entityManager.persist(p);
		return p;
	}

	@Override
	public User searchUserById(int id) {
		User result = entityManager.find(User.class, id);
		return result;
	}

	@Override
	public List<User> listAllUser() {
		Query qry = entityManager.createQuery("Select e from User e");
		List<User> userList = qry.getResultList();
		System.out.println(userList);
		return userList;
	}

	@Transactional
	public boolean updateUser(int i, User uobj) {
		User temp = entityManager.find(User.class, i);
		if (temp != null) {
			entityManager.merge(uobj);
			return true;
		} else {
			return false;
		}
	}

	public boolean loginUser(User userObj) {
		String uemail = userObj.getUserEmail();
		String upass = userObj.getUserPassword();
		TypedQuery<User> qry = entityManager.createQuery(
				"Select e from User e where e.userEmail='" + uemail + "' and e.userPassword='" + upass + "'",
				User.class);
		System.out.println("login result " + qry.getResultList());
		if (!qry.getResultList().isEmpty()) {
			System.out.println("login successfull");
			return true;
		}
		System.out.println("login denied ! invalid credential");
		return false;
	}

	@Override
	public User serachUserByemail(String email) {
		TypedQuery<User> qry = entityManager.createQuery("Select e from User e where e.userEmail='"+email+"'",User.class);
		if(qry.getSingleResult() != null) {
			return qry.getSingleResult();
		}
		return null;
	}

}
