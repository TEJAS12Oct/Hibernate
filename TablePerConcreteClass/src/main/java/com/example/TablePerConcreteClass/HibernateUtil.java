package com.example.TablePerConcreteClass;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.TablePerConcreteClass.Model.Employee;
import com.example.TablePerConcreteClass.Model.P_Employee;
import com.example.TablePerConcreteClass.Model.C_Employee;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().configure();

            // Register all annotated entity classes
            configuration.addAnnotatedClass(Employee.class);
            configuration.addAnnotatedClass(P_Employee.class);
            configuration.addAnnotatedClass(C_Employee.class);

            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
