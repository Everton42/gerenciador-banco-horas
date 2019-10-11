package com.mycompany.comptimemanager.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkHour extends BaseEntity {

	private LocalDate Date;
	private LocalTime Start;
	private LocalTime End;
	private Integer UserId;
	
	public WorkHour(String date, String start, String end) {
		super();
		setDate(date);
		setStart(start);
		setEnd(end);
	}
	public String getDate() {
		return dateFormat(Date);
	}
	public LocalTime getStart() {
		return Start;
	}

	
	public LocalTime getEnd() {
		return End;
	}
	
	public void setDate(String date) {
		LocalDate dateParsed = LocalDate.parse(date);
		this.Date = dateParsed;
	}
	
	public void setStart(String start) {
		LocalTime startParsed = LocalTime.parse(start);
		this.Start = startParsed;
	}

	
	public void setEnd(String end) {
		LocalTime startParsed = LocalTime.parse(end);
		this.End = startParsed;
	}
	
	public Integer getUserId() {
		return UserId;
	}
	
	public void setUserId(Integer userId) {
		this.UserId = userId;
	}

	private String dateFormat(LocalDate dt) {
		String date = dt.format(DateTimeFormatter.ofPattern("dd/MM/Y"));
		return date;
	}
}
