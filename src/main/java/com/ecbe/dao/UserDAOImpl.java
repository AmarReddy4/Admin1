package com.ecbe.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecbe.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	/*@Autowired
	private User user;*/
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory) 
	{
		this.sessionFactory  = sessionFactory;
	}

	public boolean save(User user)
	{ 
	try
	    {
		    sessionFactory.getCurrentSession().save(user);
	    }
	catch(Exception e)
	    {
		    e.printStackTrace();
			return false;
	    }
		    return true;
	}

	public boolean update(User user) {
		try
	    {
		    sessionFactory.getCurrentSession().update(user);
	    }
	catch(Exception e)
	    {
		    e.printStackTrace();
			return false;
	    }
		    return true;
	}

	public boolean delete(User user) {
		try
	    {
		    sessionFactory.getCurrentSession().delete(user);
	    }
	catch(Exception e)
	    {
		    e.printStackTrace();
			return false;
	    }
		    return true;
	}

	public User get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}
}