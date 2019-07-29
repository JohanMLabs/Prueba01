package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.User;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String usu);
	
	void save(User user);
	
	void deleteBySSO(String usu);
	
	List<User> findAllUsers();

}

