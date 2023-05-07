package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AdminModel;
@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Integer> 
{
	public  AdminModel findByEmail(String email);
} 	