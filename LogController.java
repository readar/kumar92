package com.base.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.base.model.User;
import com.base.service.UserService;

@Controller
public class LogController {
	
	@Autowired
	UserService us;
	User user;
	
	/*@RequestMapping(value= "/user/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user){		
			userDAO.saveOrUpdate(user);			
			return "redirect:";			
	}*/
	
	@RequestMapping("/NewRegister")
	public ModelAndView register(){
		return new ModelAndView("/NewRegister");
	}
	
	@RequestMapping("/register")
	public ModelAndView register(
			@ModelAttribute User user,
			@RequestParam(value = "firstname") String fname,
			@RequestParam(value = "middlename") String mname,
			@RequestParam(value = "lastname") String lname,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String pwd,
			@RequestParam(value = "hb")String hb1,	
			@RequestParam(value = "hbb")String hb2	
			 ) {
		user.setFirstname(fname);
		user.setMiddlename(mname);
		user.setLastname(lname);
		user.setEmail(email);
		user.setUsername(username);	
		user.setPassword(pwd);
		boolean b1 = Boolean.parseBoolean(hb1);
		boolean b2 = Boolean.parseBoolean(hb2);
		user.setIsAdmin(b1);
		user.setUser(b2);
		System.out.println("in register controller");
		us.saveOrUpdate(user);
		ModelAndView mv = new ModelAndView("Sign In");
		return mv;
	}
	
    
    @RequestMapping("/isValidUser")
	public ModelAndView isValidUser(@RequestParam(value = "username") String name,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");

		String message;
		ModelAndView mv ;
		if (us.isValidUser(name, password,true)) 
		{
			message = "Valid credentials for Admin";
			 mv = new ModelAndView("Admin");
		} 
		else if(us.isValidUser(name, password, false))
		{
			System.out.println("Page for user");
			message = "Valid credentials for User";
			 mv = new ModelAndView("User");
		}
		else
		{
			message = "Invalid credentials";
			 mv = new ModelAndView("Sign In");
		}

		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	

}
