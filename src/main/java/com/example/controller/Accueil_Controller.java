package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Accueil_Controller {

	
	@GetMapping({"/","/index"})
	public String home(){
	    return "index";

	}


	
	@RequestMapping("/welcome")
	public String welcom(){
	    return "welcompage";
	}
	
	
	@GetMapping("/home")
	public String home1(){
	    return "home";

	}
	
	@GetMapping("/pages/home")
	public String topPage(){
	    return "/pages/home";
	}
	
}
