package com.amit.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}
}
