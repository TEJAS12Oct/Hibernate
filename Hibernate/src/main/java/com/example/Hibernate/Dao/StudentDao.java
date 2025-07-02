package com.example.Hibernate.Dao;

import java.util.List;

import com.example.Hibernate.Model.Student;


public interface StudentDao {
	void save(Student student);
	Student findById(Long id);
	List<Student> findAll();
	void update(Student student);
	void delete(Long id);
}
