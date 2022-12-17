package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.DoctorTemp;
import com.example.demo.service.DoctorServiceTemp;



@CrossOrigin("*")
@RestController
@RequestMapping("/doctortemp")
public class DoctorControllerTmp 
{

	@Autowired
	 private DoctorServiceTemp doctorServiceTemp;
	 
	
	@PostMapping("/dregisterationtemp")
	public DoctorTemp  registerDoctor(@RequestBody  DoctorTemp doctorTemp) throws Exception
	{
		if(doctorTemp == null) {
			 throw new Exception();
		 }
		return doctorServiceTemp.registerDoctor(doctorTemp);
	
	}
	
	

	
	@GetMapping("/adoctortemp")
	public List<DoctorTemp> allDoctor()
	{
		return doctorServiceTemp.allDoctor();
	}

	
	
	@DeleteMapping("/deldoctortemp/{d_id}")
	public Boolean deleteDoctor(@PathVariable int d_id)
	{
		boolean value=doctorServiceTemp.deleteDoctor(d_id);
		if(value==true)
			return true;
		else
			return false;
	}
	
	
	 
}