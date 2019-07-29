package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.User;


public interface UserService {
	
	User findById(int id);
	
	User findBySSO(String usu);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserBySSO(String usu);

	List<User> findAllUsers(); 
	
	boolean isUserSSOUnique(Integer id, String usu);

}