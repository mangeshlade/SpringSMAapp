package edu.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.main.model.Student;
import edu.cjc.main.service.StudentService;

@Controller
public class AdminController {
	@Autowired
	private StudentService ss;
	
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
	@RequestMapping("Enroll_student")
	
	public String SaveStudent(@ModelAttribute Student student) {
		ss.saveStudentDetails(student);
		
		return "Adminscreen";
	}

}
