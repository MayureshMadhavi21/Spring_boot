package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1,"learn aws","Mayuresh"),
				new Course(2,"learn devops","Mayuresh"),
				new Course(3,"learn javascript","Mayuresh")
				);
	}
}
