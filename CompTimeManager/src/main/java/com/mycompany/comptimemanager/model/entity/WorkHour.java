package com.mycompany.comptimemanager.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class WorkHour extends BaseEntity implements IWorkHour{

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
	@Override
	public LocalDate getDate() {
		return Date;
	}
	@Override
	public LocalTime getStart() {
		return Start;
	}

	@Override
	public LocalTime getEnd() {
		return End;
	}
	@Override
	public void setDate(String date) {
		LocalDate dateParsed = LocalDate.parse(date);
		this.Date = dateParsed;
	}
	@Override
	public void setStart(String start) {
		LocalTime startParsed = LocalTime.parse(start);
		this.Start = startParsed;
	}

	@Override
	public void setEnd(String end) {
		LocalTime startParsed = LocalTime.parse(end);
		this.End = startParsed;
	}
	@Override
	public Integer getUserId() {
		return UserId;
	}
	@Override
	public void setUserId(Integer userId) {
		this.UserId = userId;
	}

}
