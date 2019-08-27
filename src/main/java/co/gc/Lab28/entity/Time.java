package co.gc.Lab28.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Time {
	public ArrayList<String> startPeriodName;

	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(ArrayList<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	
	
}
