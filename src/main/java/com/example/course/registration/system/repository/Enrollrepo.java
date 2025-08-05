package com.example.course.registration.system.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.registration.system.model.Enrollment;

@Repository
public interface Enrollrepo extends JpaRepository<Enrollment,Integer>{

	
		
}
