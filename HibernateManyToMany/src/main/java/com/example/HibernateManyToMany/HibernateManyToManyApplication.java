package com.example.HibernateManyToMany;

import java.util.Set;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.HibernateManyToMany.Model.Course;
import com.example.HibernateManyToMany.Model.Teacher;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class HibernateManyToManyApplication {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Course course1 = new Course();
		course1.setTitle("Math");

		Course course2 = new Course();
		course2.setTitle("Physics");

		Teacher teacher1 = new Teacher();
		teacher1.setName("John");
		teacher1.setCourses(Set.of(course1, course2));

		Teacher teacher2 = new Teacher();
		teacher2.setName("Alice");
		teacher2.setCourses(Set.of(course1));

		em.persist(course1);
		em.persist(course2);
		em.persist(teacher1);
		em.persist(teacher2);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}