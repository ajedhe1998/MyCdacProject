package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DoctorTemp;

@Repository
public interface DoctorRepoTemp extends JpaRepository<DoctorTemp, Integer> 
{

	public  DoctorTemp findByEmail(String email);
	
	
}