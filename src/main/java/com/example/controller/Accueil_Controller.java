package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Accueil_Controller {

	
	
	@GetMapping("/")
	public String home(){
	    return "index";

	}
}
