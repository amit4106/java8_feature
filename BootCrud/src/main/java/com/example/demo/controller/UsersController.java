package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repo.UsersRepo;

@RestController("/user")
public class UsersController {
		@Autowired
		UsersRepo repo;
		
		@GetMapping("/getuser")
	public List<Users> getAll() {
		return repo.findAll();
	}
	
}
