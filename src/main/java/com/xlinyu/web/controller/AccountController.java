package com.xlinyu.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xlinyu.constant.SystemConstant;
import com.xlinyu.web.model.User;

@Controller
@RequestMapping("/account")
public class AccountController {

	private static final Logger logger = Logger.getLogger(AccountController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(){
		
		return "account/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user, HttpServletRequest request){
		
		if("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())){
			request.getSession().setAttribute(SystemConstant.CURRENT_USER, user.getUsername());
			return "redirect:/layout/layout";
		}
		return "account/login";
		
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session){
		
		session.invalidate();
		
		logger.info("logout.....");
		return "redirect:/account/login";
	}
	
}
