package com.example.course.registration.system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	    @Id
		private String courseid;
		private String coursename;
		private String trainer;
		private int durationweeks;
		
		
		
		public String getCourseid() {
			return courseid;
		}
		public void setCourseid(String courseid) {
			this.courseid = courseid;
		}
		public String getCoursename() {
			return coursename;
		}
		public void setCoursename(String coursename) {
			this.coursename = coursename;
		}
		public String getTrainer() {
			return trainer;
		}
		public void setTrainer(String trainer) {
			this.trainer = trainer;
		}
		public int getDurationweeks() {
			return durationweeks;
		}
		public void setDurationweeks(int durationweeks) {
			this.durationweeks = durationweeks;
		}
		
		
}