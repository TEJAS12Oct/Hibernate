package com.project.HibernateOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.project.HibernateOneToOne.Model.Student;
import com.project.HibernateOneToOne.Model.StudentDetail;

public class AddingEntryMain {

	public static void main(String[] args) {

		// Create session factory
		SessionFactory factory = new Configuration().configure("Hibernate.Config.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(StudentDetail.class).buildSessionFactory();

		// Create session
		try (Session session = factory.getCurrentSession()) {
			// Get the current session

			// Create relevant object.
			Student student = new Student("Tejas", "Jawale", "Tejas@gmail.com");

			StudentDetail studentGfgDetail = new StudentDetail("IET College", 20);

			student.setStudentGfgDetail(studentGfgDetail);

			// Begin the transaction
			session.beginTransaction();

			// Save the student object.
			// This will also save the StudentGfgDetail
			// object as we have used CascadeType.ALL
			session.save(student);

			// Commit the transaction
			session.getTransaction().commit();

			System.out.println("Transaction Successfully Completed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
