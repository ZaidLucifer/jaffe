package com.sunbeam.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.dao.LoginDb;
import com.sunbeam.pojo.Login;


@Service
public class LoginService
{
	@Autowired
	private LoginDb loginDao;
	
	@Transactional
	public Login checkLogin(String email,String password)
	{
		return loginDao.checkLogin(email,password);
	}

	@Transactional
	public boolean registerUser(Login user)
	{
		return loginDao.registerUser(user);
	}

}
