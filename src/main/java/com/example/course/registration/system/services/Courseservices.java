package com.example.course.registration.system.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.registration.system.model.Course;
import com.example.course.registration.system.model.Enrollment;
import com.example.course.registration.system.repository.Courserepo;
import com.example.course.registration.system.repository.Enrollrepo;

@Service
public class Courseservices {
    @Autowired
    Courserepo courserepo;

    @Autowired
    Enrollrepo enrollrepo;
    
    public List<Course> availablecourses() {
        return courserepo.findAll();
    }
    
    
    public List<Enrollment> enrolledstudents()
    {
    	return enrollrepo.findAll();
    }
    
    public void enrollcourse(String name,String emailid,String coursename)
    {
    	Enrollment enrolled=new Enrollment(name,emailid,coursename);
    	enrollrepo.save(enrolled);
    }
}
