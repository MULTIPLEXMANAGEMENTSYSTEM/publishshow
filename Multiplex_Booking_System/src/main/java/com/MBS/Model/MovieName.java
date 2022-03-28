package com.MBS.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class MovieName {
	@Id
	private String name;
	private String type;
	private String actor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public MovieName(String name,String type,String actor) {
		super();
		this.name=name;
		this.type=type;
		this.actor=actor;
	}
	public MovieName() {
		super();
		
	}
	@Override
	public String toString() {
		return "MovieName [name=" + name + ", type=" + type + ", actor=" + actor + "]";
	}
	
	

}
