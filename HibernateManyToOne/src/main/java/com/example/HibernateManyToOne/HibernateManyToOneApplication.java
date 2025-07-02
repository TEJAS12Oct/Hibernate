package com.example.HibernateManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.HibernateManyToOne.Model.Address;
import com.example.HibernateManyToOne.Model.Patient;
import com.example.HibernateManyToOne.Repository.AddressRepo;
import com.example.HibernateManyToOne.Repository.PatientRepo;

@SpringBootApplication
public class HibernateManyToOneApplication implements CommandLineRunner {

	@Autowired
	AddressRepo addessRepo;
	@Autowired
	PatientRepo paiRepo;

	public static void main(String[] args) {
		SpringApplication.run(HibernateManyToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Address addr = new Address(1, "Bangloor");
		addessRepo.save(addr);

		Patient emp1 = new Patient(1, "Alpha", addr);
		Patient emp2 = new Patient(2, "Beeta", addr);

		paiRepo.save(emp1);
		paiRepo.save(emp2);
	}
}