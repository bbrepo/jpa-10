package com.practice.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.practice.learning.jpa.jpain10steps.entity.User;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		//Open Transaction
		entityManager.persist(user);
		//Close Transaction
		return user.getId();
	}

}

// Spring data JPA

/*public class SomeEntityDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(SomeEntity entity) {
		//Open Transaction
		entityManager.persist(user);
		//Close Transaction
		return user.getId();
	}

}*/