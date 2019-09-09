package com.mycompany.comptimemanager.entities;

public class WorkDay implements PeriodWorking {

	private String Start;
	private String StartLunch;
	private String EndLunch;
	private String End;
	
	public WorkDay(String start, String startLunch, String endLunch, String end) {
		setStart(start);
		setStart(startLunch);
		setEndLunch(endLunch);
		setEnd(end);
	}
	
	public String getStart() {
		return Start;
	}
	public void setStart(String start) {
		Start = start;
	}
	public String getStartLunch() {
		return StartLunch;
	}
	public void setStartLunch(String startLunch) {
		StartLunch = startLunch;
	}
	public String getEndLunch() {
		return EndLunch;
	}
	public void setEndLunch(String endLunch) {
		EndLunch = endLunch;
	}
	public String getEnd() {
		return End;
	}
	public void setEnd(String end) {
		End = end;
	}
}
