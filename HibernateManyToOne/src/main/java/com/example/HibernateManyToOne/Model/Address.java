package com.example.HibernateManyToOne.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Address {

	@Id
	private int addressId;
	private String location;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
	private List<Patient> Patient = new ArrayList<>();

	public Address(int addressId, String location) {
		super();
		this.addressId = addressId;
		this.location = location;
	}

	public Address() {
		super();
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Patient> getPatient() {
		return Patient;
	}

	public void setPatient(List<Patient> patient) {
		Patient = patient;
	}

}
