package com.schedulemanagement.model;

public class Manager {
	private int pmid;
	private String name;
	private String password;
	public int getPmid(){
		return pmid;
	}
	public void setPmid(int pmid){
		this.pmid = pmid;
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
