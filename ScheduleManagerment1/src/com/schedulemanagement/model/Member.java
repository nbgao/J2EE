package com.schedulemanagement.model;

public class Member {
	private int gmid;
	private String name;
	private String password;
	public int getPmid(){
		return gmid;
	}
	public void setPmid(int gmid){
		this.gmid = gmid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
}
