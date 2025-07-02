package com.example.TablePerConcreteClass.Model;

//Java Program to Demonstrate Implementation

//of C_Employee Class 

//Importing required classes 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//Class 
@Entity
@Table(name = "C_Employee")
public class C_Employee extends Employee {

	// Class data members
	@Column(name = "hourlyRate")
	private double hourlyRate;
	@Column(name = "duration")
	private double duration;

	// getters and setters
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		// this keyword refers to current instance
		this.hourlyRate = hourlyRate;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
}
