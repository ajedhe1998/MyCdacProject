package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AdminModel;
public interface AdminRepo extends JpaRepository<AdminModel, Integer> 
{
	public  AdminModel findByEmail(String email);
} 
	


