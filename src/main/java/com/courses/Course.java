package com.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.topics.Topic;

@Entity
public class Course {
	
	@Id
	String ID;
	String name;
	String level;
	String description;
	@ManyToOne
	private Topic topic;
	
	public Course(){
		
	}
	
	public Course(String iD, String name, String level, String description, String topicId) {
		super();
		ID = iD;
		this.name = name;
		this.level = level;
		this.description = description;
		this.topic=new Topic(topicId,"","","");
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	

}
