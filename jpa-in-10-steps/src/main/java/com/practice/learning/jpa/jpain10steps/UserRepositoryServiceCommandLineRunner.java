package com.practice.learning.jpa.jpain10steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.learning.jpa.jpain10steps.entity.User;
import com.practice.learning.jpa.jpain10steps.service.UserDAOService;

@Component
public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log=LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;

	@Override
	public void run(String... args) throws Exception {
		User user=new User("Jack","Admin");
		long insert=userDaoService.insert(user);
		log.info("New user is created: "+user);
		
	}

}
