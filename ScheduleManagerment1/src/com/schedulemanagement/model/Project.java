package com.schedulemanagement.model;

public class Project {
	private int projectid;
	private String title;
	private String introduce;
	private String time;
	private String state;
	private int managerid;
	
	public int getProjectid(){
		return projectid;
	}
	public void setProjectid(int projectid){
		this.projectid = projectid;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getIntroduce(){
		return introduce;
	}
	public void setIntroduce(String introduce){
		this.introduce = introduce;
	}
	public String getTime(){
		return time;
	}
	public void setTime(String time){
		this.time = time;
	}
	public String getState(){
		return state;
	}
	public void setState(String state){
		this.state = state;
	}
	public int getManagerid(){
		return managerid;
	}
	public void setManagerid(int managerid){
		this.managerid = managerid;
	}
}
