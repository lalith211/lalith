package net.javaguides.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	
	//http://localhost:8080/hello

	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world!!";
		
	}
	

}
