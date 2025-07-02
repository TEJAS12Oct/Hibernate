package com.example.TablePerConcreteClass.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//Java Program to Demonstrate P_Employee Class

//Importing required classes

//Class
@Entity
@Table(name = "P_Employee")
public class P_Employee extends Employee {

	// Class data member
	@Column(name = "salary")
	private double salary;

	// Getter and setters
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		// this keyword refers to current instance itself
		this.salary = salary;
	}
}
