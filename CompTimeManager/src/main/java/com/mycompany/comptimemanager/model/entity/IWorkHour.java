package com.mycompany.comptimemanager.model.entity;

import java.time.LocalTime;
public interface IWorkHour {
	
	public LocalTime getStart();
	public LocalTime getEnd();
	public String getDate();
	public Integer getUserId();
	public void setDate(String date);
	public void setStart(String start);
	public void setEnd(String end);
	public void setUserId(Integer userId);
}
