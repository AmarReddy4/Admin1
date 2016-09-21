package com.ecbe.dao;

import java.util.List;

import com.ecbe.model.Category;

public interface CategoryDAO {
	
	public boolean save(Category category);
	public boolean update(Category category);
	public boolean delete(Category categoty);
	
	public Category get(String id);
	
	public List<Category> list();
}