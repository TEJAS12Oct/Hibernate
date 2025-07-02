package com.example.HibernateOneToMany.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Manufactures {

	// Unique identifier for the manufacturer
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// Name of the manufacturer
	private String manufactures_name;

	// A manufacturer can have many models
	@OneToMany(mappedBy = "manufacturer")
	private List<Model> models;

	// Constructor with both id and name
	public Manufactures(int id, String manufactures_name) {
		this.id = id;
		this.manufactures_name = manufactures_name;
	}

	// Default constructor
	public Manufactures() {

	}

	// Getters and setters for id and name

	public Manufactures(String manufactures_name) {
		super();
		this.manufactures_name = manufactures_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufactures_name() {
		return manufactures_name;
	}

	public void setManufactures_name(String manufactures_name) {
		this.manufactures_name = manufactures_name;
	}

	// Getter for models
	public List<Model> getModels() {
		return models;
	}

	// Setter for models
	public void setModels(List<Model> models) {
		this.models = models;
	}
}
