package com.sunbeam.dao;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sunbeam.pojo.Login;


@Repository
public class LoginDb
{
	@Autowired
	private SessionFactory factory;
	
	public Login checkLogin(String email,String password)
	{
		String hql = "select u from Login u where u.email= '"+email+"' and u.password='"+password+"' and u.status='y'";
		Session session = factory.getCurrentSession();
		Query q = session.createQuery(hql);
		Login login = (Login) q.getSingleResult();
		Login user = new Login();
		user.setName(login.getName());
		user.setApplication_id(login.getApplication_id());
		user.setEmail(user.getEmail());
		user.setStatus(login.getStatus());
		user.setVisa_service(login.getVisa_service());
		return user;
	}

	public boolean registerUser(Login user)
	{
		user.setRegistration_date(LocalDate.now());
		Session session = factory.getCurrentSession();
		session.save(user);
		return true;
	}

}
