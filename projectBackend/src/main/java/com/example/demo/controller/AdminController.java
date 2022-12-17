package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.AdminModel;
import com.example.demo.service.AdminService;
@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService aservice;
	
	
	@GetMapping("/adminl")
	public ResponseEntity<AdminModel> loginadmin(@RequestParam String email,@RequestParam String password)
	{
		System.out.println(email);
		return aservice.loginadminser(email, password);
	}
	
	
	@PostMapping("/adminlogin")
	public ResponseEntity<AdminModel> loginadmin2(@RequestBody AdminModel admin)
	{
		return aservice.aloginUser1(admin);
	}

}
