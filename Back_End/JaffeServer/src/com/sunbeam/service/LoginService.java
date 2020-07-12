package com.sunbeam.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.dao.LoginDb;
import com.sunbeam.pojo.Login;
import com.sunbeam.pojo.NGO;
import com.sunbeam.pojo.Police;
import com.sunbeam.pojo.Users;


@Service
public class LoginService
{
	@Autowired
	private LoginDb loginDao;
	
	/*@Transactional
	public Login checkLogin(String email,String password)
	{
		return loginDao.checkLogin(email,password);
	}*/
	
	@Transactional
	public Object authenticateUser(String email, String password)
	{
		return loginDao.authenticateUser(email, password);
	}

	@Transactional
	public boolean registerUser(Object user)
	{
		return loginDao.registerUser(user);
	}
	
	@Transactional
	public boolean registerNGO(Object ngo){
		
		return loginDao.registerNGO(ngo);
	}
	
	@Transactional
	public boolean registerPolice(Object police){
		
		return loginDao.registerPolice(police);
	}

}
