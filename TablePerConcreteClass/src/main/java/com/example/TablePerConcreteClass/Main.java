package com.example.TablePerConcreteClass;
//Java Program to Illustrate Application Class

//Importing required classes

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.TablePerConcreteClass.Model.C_Employee;
import com.example.TablePerConcreteClass.Model.Employee;
import com.example.TablePerConcreteClass.Model.P_Employee;



//Main class
public class Main {

	// Main driver method
	public static void main(String[] args) {
		// Getting session factory using Hibernate Util
		// class
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		// Getting session from Session factory
		Session session = sessionFactory.openSession();

		// Begin transaction
		Transaction transaction = session.beginTransaction();

		// Creating Employee base class record
		Employee employee = new Employee();
		employee.setName("KirikoChan");
		employee.setAge(19);

		// Creating Permanent Employee subclass record
		P_Employee permanentEmployee = new P_Employee();
		permanentEmployee.setName("Saili.H");
		permanentEmployee.setAge(20);
		permanentEmployee.setSalary(30000);

		// Creating Contract Employee subclass record
		C_Employee contractEmployee = new C_Employee();
		contractEmployee.setName("ChikkoRita");
		contractEmployee.setAge(21);
		contractEmployee.setHourlyRate(2000);
		contractEmployee.setDuration(7.5);

		// Persisting all the employee records
		session.persist(employee);
		session.persist(permanentEmployee);
		session.persist(contractEmployee);

		// Commit the transaction and
		// closing the session
		transaction.commit();
		session.close();

		// Display message
		System.out.println("Employee records successfully persisted.");
	}
}
