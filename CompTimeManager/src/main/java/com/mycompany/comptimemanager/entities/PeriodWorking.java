package com.mycompany.comptimemanager.entities;

public interface PeriodWorking {

	public String getStart();
	public void setStart(String startDay);

	public String getStartLunch();
	public void setStartLunch(String startLunch);
	
	public String getEndLunch();
	public void setEndLunch(String endLunch);
	
	public String getEnd();
	public void setEnd(String endDay);
}
