package com.ecbe.dao;

import java.util.List;

import com.ecbe.model.User;

public interface UserDAO {
	
	public boolean save(User user);
	public boolean update(User user);
	public boolean delete(User user);
	
	public User get(String id);
	
	public List<User> list();
}