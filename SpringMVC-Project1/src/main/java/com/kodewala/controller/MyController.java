package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("login-page")
	public ModelAndView viewPage() {
		System.out.println("MyController.viewPage()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
}
