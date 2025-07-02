package com.example.crudOperations.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.crudOperations.SessionFactoryProvider;
import com.example.crudOperations.Model.Employee;

public class Delete {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();

		Employee s = session.get(Employee.class, 101);
		// Delete the student record
		session.delete(s);
		t.commit();

		session.close();
		sessionFactory.close();
	}
}