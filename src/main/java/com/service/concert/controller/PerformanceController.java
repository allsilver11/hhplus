package com.service.concert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/performance")
public class PerformanceController {

	@GetMapping(value = "/datelist/{performance_id}")
	public String getPerformanceSchedule() {
		
		return "";
	}
	
	@GetMapping(value = "/seatlist/{performance_id}/{selected_date}")
	public String getPerformanceSeat() {
		
		return "";
	}
	
	@PostMapping(value = "/reservseat")
	public String reservPerformanceSeat() {
		
		return "";
	}
}
