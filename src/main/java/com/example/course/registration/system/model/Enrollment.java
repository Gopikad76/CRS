package com.example.course.registration.system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enrollment {
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private int id;
            private String name;
            public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getEmailId() {
				return emailId;
			}
			public void setEmailId(String emailId) {
				this.emailId = emailId;
			}
			public String getCoursename() {
				return coursename;
			}
			public void setCoursename(String coursename) {
				this.coursename = coursename;
			}
			private String emailId;
			private String coursename;
            public Enrollment(String name, String emailId, String coursename) {
				super();
				this.name = name;
				this.emailId = emailId;
				this.coursename = coursename;
			}
            
            public Enrollment()
            {
            	
            }
			
           
}
