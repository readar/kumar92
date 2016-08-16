package com.base.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.base.model.User;
import com.base.service.UserService;

@Controller
public class LogiController {
	
	@Autowired
	UserService us;
		
	@RequestMapping("/RegisterPage")
	public ModelAndView displayReg(){
		ModelAndView r1=new ModelAndView("RegisterPage");
		System.out.println("reg page is from logicontroller");
		return r1;
	}
	

	@RequestMapping("/Log")
	public ModelAndView Logicontroller()
	{
		ModelAndView mv= new ModelAndView("Log");
		System.out.println("Registration control called");
		
		
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView register(
			@ModelAttribute User user,
			@RequestParam(value = "firstname") String fname,
			@RequestParam(value = "middlename") String mname,
			@RequestParam(value = "lastname") String lname,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password,
			@RequestParam(value = "hb")String hb1,	
			@RequestParam(value = "hbb")String hb2	
			 ) {
		user.setFirstname(fname);
		user.setMiddlename(mname);
		user.setLastname(lname);
		user.setEmail(email);
		user.setUsername(username);	
		user.setPassword(password);
		user.setEnabled(true);
		user.setRole("ROLE_USER");

		System.out.println("in register controller");
		us.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("Log");
		return mv;
	}
	
	@RequestMapping("/UserCheck")
	public ModelAndView usercheck(Principal principal){
		System.out.println("it is of usercheck");
		return new ModelAndView("Novels");
	}
	@RequestMapping("/AdminCheck")
	public ModelAndView admincheck(Principal principal){
		System.out.println("it is of admincheck");
		return new ModelAndView("Admin");
	}
	
    
}
