package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.model.DoctorTemp;
import com.example.demo.repo.DoctorRepo;
import com.example.demo.repo.DoctorRepoTemp;
@Service
public class DoctorServiceTemp
{
	
	
	@Autowired
	private DoctorRepoTemp doctorRepoTemp;

	
	
	
	
	public DoctorTemp registerDoctor(DoctorTemp doctorTemp) 
	{		
			return doctorRepoTemp.save(doctorTemp);
	}


	
	
	
	
	
	public java.util.List<DoctorTemp> allDoctor() {
		return doctorRepoTemp.findAll();
	}
	
	
	


		public boolean deleteDoctor(int d_id) {
			doctorRepoTemp.deleteById(d_id);
			return true;
			
		}

	
	

}