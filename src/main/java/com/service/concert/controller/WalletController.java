package com.service.concert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/wallet")
public class WalletController {

	@GetMapping(value = "/check/{user_id}")
	public String checkDeposit() {
		
		return "";
	}
	
	@PostMapping(value = "/deposit")
	public String deposit() {
		
		return "";
	}
	
	@PostMapping(value = "/pay")
	public String pay() {
		
		return "";
	}
}
