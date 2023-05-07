package com.example.demo.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ApiWeeklyCounter {

	
	public Map<LocalDate,Integer> weeklycount = new HashMap<>();

	public ApiWeeklyCounter(Map<LocalDate, Integer> weeklycount) {
		super();
		this.weeklycount = weeklycount;
	}

	public ApiWeeklyCounter() {
		super();
		// TODO Auto-generated constructor stub
	}

}
