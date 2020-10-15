package com.chinasoft.controller._03_param;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
	private int  id;
	private String name;
	private String age;
	private  Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@JsonFormat(pattern="yyyy:MM:dd hh:mm:ss",timezone="GMT+8")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User(int id, String name, String age, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.date = date;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id2, String name2, int i, Date date2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", date="
				+ date + "]";
	}
	
}
