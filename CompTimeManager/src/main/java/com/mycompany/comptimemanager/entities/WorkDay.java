package com.mycompany.comptimemanager.entities;

public class WorkDay implements PeriodWorking {

	private String StartDay;
	private String StartLunch;
	private String EndLunch;
	private String EndDay;
	
	public WorkDay(String startDay, String startLunch, String endLunch, String endDay) {
		setStart(startDay);
		setStartLunch(startLunch);
		setEndLunch(endLunch);
		setEnd(endDay);
	}
	
	public String getStart() {
		return StartDay;
	}
	public void setStart(String startDay) {
		StartDay = startDay;
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
		return EndDay;
	}
	public void setEnd(String endDay) {
		EndDay = endDay;
	}
}
