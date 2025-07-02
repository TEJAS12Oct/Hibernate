package com.example.crudOperations.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.crudOperations.SessionFactoryProvider;
import com.example.crudOperations.Model.Employee;

public class Retrieve {
	public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        Session session = sessionFactory.openSession();

        // Fetching object using get()
        System.out.println("Fetching object using get:");
		Employee s1 = session.get(Employee.class, 101);
        if (s1 != null) {
            System.out.println("Id: " + s1.getId());
            System.out.println("Name: " + s1.getName());
            System.out.println("Class: " + s1.getStd());
        } else {
            System.out.println("Student not found.");
        }

        sessionFactory.close();
    }
}