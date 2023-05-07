package com.example.demo.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ApiDailyCounter {
	
public Map<LocalDate,Integer> dailycount = new HashMap<>();

	public ApiDailyCounter(Map<LocalDate, Integer> dailycount) {
		super();
		this.dailycount = dailycount;
	}

	public ApiDailyCounter() {
		super();
		// TODO Auto-generated constructor stub
	}

}
