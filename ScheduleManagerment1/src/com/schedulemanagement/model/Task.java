package com.schedulemanagement.model;

public class Task {
	private int taskid;
	private String title;
	private String introduce;
	private String state;
	private String time;
	private int projectid;
	private String member;
	
	public int getTaskid(){
		return taskid;
	}
	public void setTaskid(int taskid){
		this.taskid = taskid;
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
	public String getState(){
		return state;
	}
	public void setState(String state){
		this.state = state;
	}
	public String getTime(){
		return time;
	}
	public void setTime(String time){
		this.time = time;
	}
	public int getProjectid(){
		return projectid;
	}
	public void setProjectid(int projectid){
		this.projectid = projectid;
	}
	public String getMember(){
		return member;
	}
	public void setMember(String member){
		this.member = member;
	}
	
}
