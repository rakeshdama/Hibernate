package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Employees employee = new Employees(221,"Rakesh","PenTester","100000$");
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Employees.class);
       SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(employee);
        transaction.commit();
    }
}
