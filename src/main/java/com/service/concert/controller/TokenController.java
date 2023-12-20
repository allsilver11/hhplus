package com.service.concert.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/token")
public class TokenController {

	@PostMapping(value = "/issue")
	public String issueToken() {
		
		return "";
	}
	
	@PostMapping(value = "/validate")
	public String validateToken() {
		
		return "";
	}
	
}
