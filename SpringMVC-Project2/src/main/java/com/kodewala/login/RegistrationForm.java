package com.kodewala.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationForm {
	@RequestMapping("myntraLogin")
	public ModelAndView viewPage() {
		System.out.println("RegistrationForm.viewPage()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login-page");
		return mv;
	}
}
