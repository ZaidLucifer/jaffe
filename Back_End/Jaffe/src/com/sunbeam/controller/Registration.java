package com.sunbeam.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sunbeam.pojo.Login;
import com.sunbeam.service.LoginService;
import com.sunbeam.utility.CryptoUtility;

@RestController
public class Registration
{	
	@Autowired
	private LoginService service;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Login checkLogin(@RequestBody Login user,HttpSession session ) throws NoSuchAlgorithmException, UnsupportedEncodingException
	{		
		Login loggedUser  = service.checkLogin(user.getEmail(),CryptoUtility.Sha256(user.getPassword()));
		session.setAttribute("user", loggedUser.getName());
		session.setAttribute("id", loggedUser.getApplication_id());
		session.setAttribute("status", loggedUser.getStatus());
		session.setAttribute("email", loggedUser.getEmail());
		return loggedUser;
	}
		
	//true or false redirect according to that
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public boolean registerUser(@RequestBody Login user ) throws NoSuchAlgorithmException, UnsupportedEncodingException
	{
		user.setPassword(CryptoUtility.Sha256(user.getPassword()));
		return service.registerUser(user);
	}
	

}
