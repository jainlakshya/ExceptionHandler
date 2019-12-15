package com.exception.handler.exceptionHandler.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExceptionController {
	

	@CrossOrigin
	@GetMapping(value="test")
	public String getProductDetails() throws NewException {
		NewException ce = new NewException("New Exception","000BAD","test");
		ce.setCausing("test22");
			throw ce;
	}
}
