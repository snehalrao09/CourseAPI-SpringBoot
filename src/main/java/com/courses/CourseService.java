package com.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CourseService {
	

	
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getCourses(String topicId) {
		List<Course> courses= new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id){
		return courseRepository.findOne(id);
		
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}


	
}
