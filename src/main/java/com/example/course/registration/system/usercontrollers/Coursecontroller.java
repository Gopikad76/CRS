package com.example.course.registration.system.usercontrollers;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.registration.system.model.Course;
import com.example.course.registration.system.model.Enrollment;
import com.example.course.registration.system.services.Courseservices;

@RestController
@CrossOrigin(origins="http://127.0.0.1:3000")
public class Coursecontroller {

    @Autowired
    Courseservices courseservice;

    @GetMapping("courses")
    public List<Course> availablecourses() {
        return courseservice.availablecourses();
    }
    
    @GetMapping("courses/enrolledstudents")
    public List<Enrollment> enrolledstudents()
    {
    	return courseservice.enrolledstudents();
    }

    @PostMapping("courses/registeration")
    
    	public String enrollcourse(@RequestParam("name") String name,
    			@RequestParam("emailid") String emailid,
    			@RequestParam("coursename") String coursename)
    	{
    		courseservice.enrollcourse(name,emailid,coursename);
    		return "Congratulation!"+name+" You have Successfully registered for " +coursename; 
    	}
    
}

