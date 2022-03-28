package com.MBS.Model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Hall  {
	
	@Id
	private int hallId;
	private String hallName;
	private int totalCapacity;
	 	
	public Hall(int hallId, String hallName, int totalCapacity) {
		super();
		this.hallId = hallId;
		this.hallName = hallName;
		this.totalCapacity = totalCapacity;
	}
	public Hall() {
		super();
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}
	public int getTotalCapacity() {
		return totalCapacity;
	}
	
	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}
	
	
}

