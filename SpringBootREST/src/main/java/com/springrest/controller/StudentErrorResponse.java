package com.springrest.controller;

public class StudentErrorResponse {
	private int status;
	private String message;
	private long timeline;
	
	public StudentErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentErrorResponse(int status, String message, long timeline) {
		super();
		this.status = status;
		this.message = message;
		this.timeline = timeline;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeline() {
		return timeline;
	}
	public void setTimeline(long timeline) {
		this.timeline = timeline;
	}
	
	

}
