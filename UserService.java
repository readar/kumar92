package com.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.dao.UserDAO;
import com.base.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDAO	userDAO;
	
	public boolean isValidUser(String user,String pass,boolean isAdmin)
	 {
		 return userDAO.isValidUser(user, pass, isAdmin);
		 
	 }
	
	public User get(String username)
	{
		return userDAO.get(username);
		
	}
	public void saveOrUpdate(User user)
	{
		userDAO.saveOrUpdate(user);	
	}
	public List<User> list()
	{
		List<User> list=userDAO.list();
		return list;
	}
	public void delete(String username)
	{
		userDAO.delete(username);
	}


}
