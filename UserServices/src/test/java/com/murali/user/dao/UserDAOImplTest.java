package com.murali.user.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.murali.user.dao.UserDAO;
import com.murali.user.dao.UserDAOImpl;
import com.murali.user.dto.User;

public class UserDAOImplTest {

	@Test
	public void createShouldCreateAUser() {
		UserDAO dao = new UserDAOImpl();
		User user = new User();
		user.setId(1);
		user.setName("Murali");
		user.setEmail("murali0051985@gmail.com");
		
		
		dao.create(user);
		User result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Murali",result.getName());
		
	}

}
