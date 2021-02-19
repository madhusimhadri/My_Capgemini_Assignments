package com.madhu.springMVC4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.madhu.springMVC4.dao.UserDao;
import com.madhu.springMVC4.model.User;

@Controller
public class UserLoginController 
{

	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView userRegistration(@RequestParam("username") String username,
										@RequestParam("password") String password,
										@RequestParam("email") String email)
	{
		
		ModelAndView mv=new ModelAndView();
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		
	String name= userDao.loginUser(user);
	if(name!=null) {
		mv.addObject("msg","Welcome" +name+ "Login Successful" );
		mv.setViewName("welcome");
	}
	else
	{
		mv.addObject("msg", "Invalid User Id or Password");
		mv.setViewName("login");
	}
	return mv;
}
}
