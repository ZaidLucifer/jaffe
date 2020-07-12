package com.sunbeam.controller;


import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="utility")
public class UtilityController
{
	@RequestMapping(value="/session",method=RequestMethod.GET)
	public String checkSession(HttpSession session )
	{
		return (String) session.getAttribute("user");
	}

}
