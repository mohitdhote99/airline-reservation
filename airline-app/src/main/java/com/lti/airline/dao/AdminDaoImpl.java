package com.lti.airline.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.airline.beans.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void addAdmin(Admin u) {
		entityManager.persist(u);
	}

	
	public boolean loginAdmin(Admin admObj) {
		String aemail = admObj.getAdmUsername();
		String apass = admObj.getAdmPassword();
		TypedQuery<Admin> qry = entityManager.createQuery(
				"Select a from Admin a where a.admUsername='" + aemail + "' and a.admPassword='" + apass + "'",
				Admin.class);
		if (!qry.getResultList().isEmpty()) {
			System.out.println("login successfull");
			return true;
		}
		System.out.println("login denied ! invalid credential");
		return false;

	}

}
