package com.ba.com.hibpractice;

import java.util.HashMap;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate-cfg.xml");
        System.out.println("Configuration Object Created ");
        SessionFactory sf = cfg.buildSessionFactory();
        System.out.println("session Factory object created");
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("123", "John Lee ");
        map1.put("java is a platform", "Ashok Su");

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("servlet technology is a server side programming",
                "John Milton");
        map2.put("Servlet is an Interface", "Ashok Lee");
        map2.put("Servlet is a package", "Rahul Su");

        Question question1 = new Question("What is java?", "Alok", map1);
        Question question2 = new Question("What is servlet?", "Jai Dixit", map2);

        s.persist(question1);
        s.persist(question2);

        tx.commit();
        s.close();
        System.out.println("successfully stored");
    }

      
}
