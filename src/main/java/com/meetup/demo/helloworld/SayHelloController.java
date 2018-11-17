package com.meetup.demo.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
	
	@GetMapping("/world")
	public ResponseEntity<String> sayNewHello() {
		return new ResponseEntity<String>("Hello To New World", HttpStatus.OK);
	}
	
}
