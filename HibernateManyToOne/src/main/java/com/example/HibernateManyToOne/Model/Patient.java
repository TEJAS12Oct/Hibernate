package com.example.HibernateManyToOne.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Patient {

	@Id
	private int paiId;
	private String paiName;

	// Many Patient has one company address
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	public Patient(int paiId, String paiName, Address address) {
		super();
		this.paiId = paiId;
		this.paiName = paiName;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public Patient() {
		super();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPaiId() {
		return paiId;
	}

	public void setPaiId(int paiId) {
		this.paiId = paiId;
	}

	public String getPaiName() {
		return paiName;
	}

	public void setPaiName(String paiName) {
		this.paiName = paiName;
	}

	@Override
	public String toString() {
		return "Patient []";
	}

}