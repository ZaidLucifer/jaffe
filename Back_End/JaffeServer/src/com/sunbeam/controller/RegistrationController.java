package com.sunbeam.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sunbeam.pojo.Login;
import com.sunbeam.pojo.NGO;
import com.sunbeam.pojo.Police;
import com.sunbeam.service.LoginService;
import com.sunbeam.utility.CryptoUtility;

@CrossOrigin
@RestController
@RequestMapping("user")
public class RegistrationController
{	
	@Autowired
	private LoginService service;

	@PostMapping("/login")
	public Object checkLogin(@RequestBody Login user,HttpSession session ) throws NoSuchAlgorithmException, UnsupportedEncodingException
	{	
		System.out.println(user.toString());
		return service.authenticateUser(user.getMailId(),user.getPassword());
	}
		
	//true or false redirect according to that
	@PostMapping("/registerUser")
	public boolean registerUser(@RequestBody Object user )
	{
		System.out.println("Object is : " + user.getClass());
		return service.registerUser(user);
	}
	
	@PostMapping("/registerNGO")
	public boolean registerNGO(@RequestBody Object ngo )
	{
		return service.registerNGO(ngo);
	}
	
	@PostMapping("/registerPolice")
	public boolean registerPolice(@RequestBody Object police )
	{
		return service.registerPolice(police);
	}
}
