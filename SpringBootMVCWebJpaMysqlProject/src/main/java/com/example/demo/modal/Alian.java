package com.example.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Alian {
	@Id
	private int aid;
	private String aname;
	
	// generate the getter and setter method
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	// generate the constructor field(Within arugument)
	
	public Alian(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	
	
	// generate the constructor superclass(without arugument)
	
	public Alian() {
		super();
		
	}
	
// generate the to string
	@Override
	public String toString() {
		return "Alian [aid=" + aid + ", aname=" + aname + "]";
	}
	
}
