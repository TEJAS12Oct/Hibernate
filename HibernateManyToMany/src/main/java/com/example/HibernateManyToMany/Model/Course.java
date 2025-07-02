package com.example.HibernateManyToMany.Model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	@ManyToMany(mappedBy = "courses")
	private Set<Teacher> Teachers;

	public Course(Long id, String title, Set<Teacher> teachers) {
		super();
		this.id = id;
		this.title = title;
		Teachers = teachers;
	}

	public Course() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Teacher> getTeachers() {
		return Teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		Teachers = teachers;
	}

	// Constructors, getters and setters
}
