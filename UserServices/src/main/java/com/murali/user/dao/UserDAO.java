package com.murali.user.dao;

import com.murali.user.dto.User;

public interface UserDAO {
	
	void create(User user);
	
	User read(int id);

}
