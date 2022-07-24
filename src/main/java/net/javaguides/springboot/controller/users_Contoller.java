package net.javaguides.springboot.controller;

import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javagiudes.springboot.dto.Dto;
import net.javaguides.springboot.entity.Address;
import net.javaguides.springboot.entity.Users;
import net.javaguides.springboot.repository.Address_repository;
import net.javaguides.springboot.repository.Geo_repository;
import net.javaguides.springboot.repository.User_repository;

@RestController
public class users_Contoller implements CommandLineRunner{
	
	@Autowired
	private User_repository repo;
	
	@Autowired
	private Address_repository adpo;
	
	@Autowired
	private Geo_repository geopo;
	
	@PostMapping("/add")
	public Users saveuser(@RequestBody Dto request) {
		return repo.save(request.getUsers());
	}
	/*@PostMapping("/add")
	public Users saveuser(@RequestBody Users users) {
	return	repo.save(users);
	}*/
	
	
	@GetMapping("/getall")
	public java.util.List<Users> all() {
		return repo.findAll();
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
		
		
	}



