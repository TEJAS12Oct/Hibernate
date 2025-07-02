package com.example.HibernateOneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.HibernateOneToMany.Model.Manufactures;
import com.example.HibernateOneToMany.Model.Model;
import com.example.HibernateOneToMany.Repository.ManufacturesRepo;
import com.example.HibernateOneToMany.Repository.ModelRepo;

@SpringBootApplication
public class HibernateOneToManyApplication implements CommandLineRunner {

	// Injecting Manufactures and Model repositories using autowiring
	@Autowired
	private ManufacturesRepo manufacturesRepo;
	@Autowired
	private ModelRepo modelRepo;

	public static void main(String[] args) {
		SpringApplication.run(HibernateOneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creating a new Manufactures object with ID 1 and name "Honda"
		Manufactures data = new Manufactures("Honda");

		// Saving the Manufactures record
		manufacturesRepo.save(data);

		// Creating two new Model objects associated with the "Honda" manufacturer
		Model model1 = new Model(1, "AYZ", data);
		Model model2 = new Model(2, "ZET", data);

		// Saving the Model records
		modelRepo.save(model1);
		modelRepo.save(model2);
	}
}
