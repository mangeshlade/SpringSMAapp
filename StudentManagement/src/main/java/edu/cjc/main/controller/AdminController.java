package edu.cjc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	@RequestMapping("/")
	public String prelogin() 
	{
		return "login";
	}
	@RequestMapping("/login")
	public String onlogin(@RequestParam String username,@RequestParam String password,Model m)
	{
		if(username.equals("Admin")&& password.equals("Admin123"))
				{	
		return "Adminscreen";
		
				}
		else {
			m.addAttribute("login_fail","Enter valid login details.");
			return "login";
		}
	}

}
