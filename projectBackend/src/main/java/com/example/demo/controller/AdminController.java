package com.example.demo.controller;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.AdminModel;
import com.example.demo.model.ApiDailyCounter;
import com.example.demo.model.ApiWeeklyCounter;
import com.example.demo.service.AdminService;
import com.example.demo.service.ApiCountService;
@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminController 
{
	@Autowired
	private AdminService aservice;
	
	@Autowired
	private ApiCountService apiCountService;
	
	@GetMapping("/getDayCount")
	public ApiDailyCounter getDailyHitCount(@RequestParam("date") @DateTimeFormat(iso = ISO.DATE) LocalDate date) {
		
		System.out.println(date);
		return apiCountService.getHitcountForDay(date);
	}
	
	
	@GetMapping("/getWeekCount")
	public ApiWeeklyCounter getWeekHitCount(@RequestParam("date") @DateTimeFormat(iso = ISO.DATE) LocalDate date) {
		
		
		return apiCountService.getHitCountForWeek(date);
	}
	
	
	
	@PostMapping("/adminlogin")
	public ResponseEntity<AdminModel> loginadmin2(@RequestBody AdminModel admin)
	{
		return aservice.aloginUser1(admin);
	}

}

//https://localhost:8080/admin/adminlogin
