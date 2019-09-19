package com.mycompany.comptimemanager.persistence;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.comptimemanager.entities.WorkDay;

public class FakeDb {
	private  static List<WorkDay> hours = new ArrayList<>();
	
	static {
		WorkDay dayOne = new WorkDay("08:00","12:00","13:00","17:00");
		WorkDay dayTwo = new WorkDay("08:00","12:00","13:00","17:00");
		WorkDay dayThree = new WorkDay("08:00","12:00","13:00","17:00");
		WorkDay dayFour = new WorkDay("08:00","12:00","13:00","17:00");
		
		hours.add(dayOne);
		hours.add(dayTwo);
		hours.add(dayThree);
		hours.add(dayFour);
	}
	
	public List<WorkDay> getWorkingDays() {
		return hours;
	}
	
	public void setWorkingDays(String startDay, String startLunch, String endLunch, String endDay) {
		WorkDay newDay = new WorkDay(startDay,startLunch,endLunch,endDay);
		hours.add(newDay);
	}
}
