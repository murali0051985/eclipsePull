package com.murali.user.dao;

import java.util.HashMap;
import java.util.Map;

import com.murali.user.dto.User;

public class UserDAOImpl implements UserDAO {

Map<Integer,User> users = new HashMap<>();
	
	@Override
	public void create(User user) {
		System.out.println("calling the put from map m/d for "+user);
		users.put(user.getId(),user);
		System.out.println("the created value is stored as "+users.get(user.getId()));

	}

	@Override
	public User read(int id) {
		System.out.println("calling the read from map m/d for " + id);
		System.out.println("the fetched user details are as follows:" + users.get(id));
		return users.get(id);
	}



}
