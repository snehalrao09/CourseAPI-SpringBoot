package com.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	String id;
	String name;
	String level;
	String description;
	
	public Topic(){
		
	}
	
	public Topic(String id, String name, String level, String description) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.description = description;
	}
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
