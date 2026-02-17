package com.mvc.mkproduction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MksignUp {
	@RequestMapping("signup-view")
	public ModelAndView displaySignupPage() {
		System.out.println("MksignUp.displaySignupPage()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup-page");
		return mv;
	}
	
	@PostMapping("signup")
	public ModelAndView doSignUp(@RequestParam ("mobile") String _mobile, @RequestParam("email") String _email, @RequestParam("name")String _name) {
		System.out.println("MksignUp.doSignUp()");
		System.out.println("Received data form client/browser when submission : "+"Mobile - "+_mobile+" ,email - "+_email+" ,name - "+_name);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("confirmation");
		return mv;
	}
}
