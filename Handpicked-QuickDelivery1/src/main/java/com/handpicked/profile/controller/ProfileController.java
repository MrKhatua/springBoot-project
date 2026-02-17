package com.handpicked.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.handpicked.profile.entity.Profile;
import com.handpicked.profile.request.ProfileRequest;
import com.handpicked.profile.service.ProfileService;

@Controller
public class ProfileController {
    @Autowired
	private ProfileService service;
	
	@GetMapping("createAccount")
	public String viewProfilePage()
	{
		System.out.println("ProfileController.viewProfilePage():::::::::::");
		return "profile";
	}
	@PostMapping("register")
	public String doRegister(@ModelAttribute ProfileRequest profilereq,Model model)
	{
	     String msg=service.registerUser(profilereq);
	     System.out.println(msg);
	     model.addAttribute("user", profilereq);
	   return "confirmation-page";
	}
	@GetMapping("/allUser")
	public  String showAllUser(Model model)
	{
		List<Profile> listUsers=service.findAllUser();
		model.addAttribute("users", listUsers);
		return "showUser";
	}
    @GetMapping("/editUser")
	public String editUser(@RequestParam("id") Integer id,Model model)
	{
	     Profile user=service.editUser(id);
	     model.addAttribute("user", user);
	     return "editUser";
	}
    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute ProfileRequest request)
    {    String result=service.updateUser(request);
          System.out.println(result);    	 
    	return "redirect:allUser";
    }
    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Integer id)
    {
    	String msg=service.deleteUser(id);
    	System.out.println(msg);
    	
    	return "redirect:allUser";
    }
	
	
}
