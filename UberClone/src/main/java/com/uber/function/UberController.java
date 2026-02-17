package com.uber.function;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uber.request.BookingRequest;

@Controller
public class UberController {
	@RequestMapping("uberaction")
	public String doUberFuntion() {
		System.out.println("UberController.doUberFuntion()");
		return "locationTake";
	}
	@PostMapping("successpage")
	public String succesPageMethod(@ModelAttribute BookingRequest bookingRequest, Model model) {
		System.out.println("UberController.succesPageMethod()");
		String from = bookingRequest.getFrom();
		String destination = bookingRequest.getDestination();
		String type = bookingRequest.getType();
		
		System.out.println("Customer Details are : From - "+from+", Destination - "+destination+", Type - "+type);
		
		String bookingCode = UUID.randomUUID().toString().replace("-", "").substring(0, 6).toUpperCase();
		System.out.println(" You booking code is " + bookingCode);
		model.addAttribute("transbookingcode", bookingCode);
		return "successpage";
	}
}
