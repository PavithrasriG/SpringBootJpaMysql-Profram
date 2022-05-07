package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AlianRepo;
import com.example.demo.modal.Alian;

@Controller
public class HelloController {
  
	@Autowired
	AlianRepo repo;// database operation
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	
	@RequestMapping("/addAlian")// home.jsp action 
	public String addAlian(Alian alian) {
		
		repo.save(alian); // add automatically
		return "home.jsp";
		
	}
	
}
