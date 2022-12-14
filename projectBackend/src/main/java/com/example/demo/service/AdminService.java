package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.AdminModel;
import com.example.demo.model.Doctor;
import com.example.demo.repo.AdminRepo;
@Service
public class AdminService {
	@Autowired
	private AdminRepo arepo; 
	
	
	public ResponseEntity<AdminModel> loginadminser(String email, String password) 
	{
		AdminModel adminmodel = arepo.findByEmail(email);
		
		if(email.equals(adminmodel.getEmail()) && password.equals(adminmodel.getPassword())) {
			return new ResponseEntity<AdminModel>(adminmodel,HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	
	
	
	public ResponseEntity<AdminModel> aloginUser1(AdminModel user) {
		AdminModel usr = arepo.findByEmail(user.getEmail());
		
		if(user.getEmail().equals(usr.getEmail()) && user.getPassword().equals(usr.getPassword())) {
			return new ResponseEntity<AdminModel>(usr,HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	

	}
	

}

