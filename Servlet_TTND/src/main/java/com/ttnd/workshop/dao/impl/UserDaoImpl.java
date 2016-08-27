package com.ttnd.workshop.dao.impl;

import java.util.List;

import com.ttnd.workshop.dao.UserDao;
import com.ttnd.workshop.entities.User;

public class UserDaoImpl implements UserDao {

	User user=new User();
	public Integer save(User e) {
		System.out.println("Successfully created " + user.toString());
		user=e;
		return e.getUserId();

	}

	public List<User> get() {
		return null;
	}

	public void update(User e) {
		System.out.println("Successfully updated " + user.toString());

	}

	public void delete(Integer id) {
		System.out.println("Successfully deleted " + user.toString());

	}

	public User findByID(Integer id) {
		return user;
	}
	
	public User findByUserNameAndPass(String userName, String password){
		if((userName.equals(user.getUserName()))&& (password.equals(user.getPassword())))
		return user;
		else
			return null;
	}

}
