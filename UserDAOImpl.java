package com.base.dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.base.model.User;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl()
	{
		System.out.println("UserDAOImpl --One");
	}
	
    public UserDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
		System.out.println("Inside UserDAOImpl");
	}

    @Transactional
	public List<User> list() {
    	@SuppressWarnings("unchecked")
		List<User> list = (List<User>) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		System.out.println("Get the list of users");
		return list;
	}
    @Transactional
	public void saveOrUpdate(User user) {
    	String str1 = user.getUsername();
		System.out.println(str1);
		sessionFactory.getCurrentSession().saveOrUpdate(user);		
		System.out.println("Saving and updating the user");
		
	}

    @Transactional
	public void delete(String username) {
    	User user = new User();
		user.setUsername(username);
		sessionFactory.getCurrentSession().delete(user);
		System.out.println("Deleting the User");
		
	}
    
    @Transactional
	public User get(String username) {
		String hql = "from User where username=" + "'"+ username+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("username",username);
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		System.out.println("Get the user by ID");
		return (User)query.uniqueResult();
		//return null;
	}

    @Transactional
	public boolean isValidUser(String username, String password, boolean isAdmin) {
    	String hql = "from User where username= '" + username + "' and " + " password ='" + password+"' and admin='"+isAdmin+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return true;
		}
		
		return false;
	}
    
}
