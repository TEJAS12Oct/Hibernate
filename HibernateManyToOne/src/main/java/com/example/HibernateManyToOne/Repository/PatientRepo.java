package com.example.HibernateManyToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HibernateManyToOne.Model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
