package com.example.demo.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.model.ApiDailyCounter;
import com.example.demo.model.ApiWeeklyCounter;

@Service
public class ApiCountService {

	
	private Map<LocalDate, Integer> hitcountDaily = new HashMap<>();
	private Map<LocalDate, Integer> hitcountweekly = new HashMap<>();
	
	
	
	
	
	public void increamentDAilyHitCount() {
		LocalDate today = LocalDate.now();
		hitcountDaily.merge(today, 1, Integer::sum);
		
	}
	
	
	
	public ApiDailyCounter getHitcountForDay(LocalDate date) {
		
		ApiDailyCounter counter = new ApiDailyCounter();
		counter.dailycount.put(date,hitcountDaily.getOrDefault(date,0));
		
		return counter;
		
	}
	
	public void increamentWeeklyHitCount() {
		TemporalAdjuster temporalAdjuster = TemporalAdjusters.previous(DayOfWeek.MONDAY);
		LocalDate today = LocalDate.now();
		LocalDate weekstart = today.with(temporalAdjuster);
		hitcountweekly.merge(weekstart, 1, Integer::sum);
		
	}
	
	
	public ApiWeeklyCounter getHitCountForWeek(LocalDate date)  {
		
		
		TemporalAdjuster temporalAdjuster = TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY);
		LocalDate weekstart = date.with(temporalAdjuster);
		int hitcount =  0;
		for(int i =0; i<7;i++)
		{
			LocalDate day = weekstart.plusDays(i);
			hitcount += hitcountweekly.getOrDefault(day,0);
		}
		
		ApiWeeklyCounter counter = new ApiWeeklyCounter();
		
		counter.weeklycount.put(date, hitcount);
		
		return counter;
	}
	
}
