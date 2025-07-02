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
			// Begin the transaction
			session.beginTransaction();

			int theId = 2;
			StudentDetail StudentDetail = session.get(StudentDetail.class, theId);

			System.out.println(StudentDetail.getStudent());
			System.out.println(StudentDetail);

			// Commit the transaction
			session.getTransaction().commit();

			System.out.println("Transaction Successfully Completed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
