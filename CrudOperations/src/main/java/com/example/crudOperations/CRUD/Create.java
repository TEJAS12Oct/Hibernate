package com.example.crudOperations.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.crudOperations.SessionFactoryProvider;
import com.example.crudOperations.Model.Employee;

public class Create {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();

        Employee s = new Employee(101, "John", 10);
        // Save or update the student record
        session.saveOrUpdate(s);  
        t.commit();

        session.close();
        sessionFactory.close();
    }
}
