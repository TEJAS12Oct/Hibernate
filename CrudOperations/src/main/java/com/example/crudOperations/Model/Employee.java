package com.example.crudOperations.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private int std;

	public Employee() {
	}

	public Employee(int id, String name, int std) {
		this.id = id;
		this.name = name;
		this.std = std;
	}

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

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}
}