package com.hibernate.many.to.one.or.many;

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
	 public static void main( String[] args )
	    {
	    	Configuration cfg=new Configuration();
	        cfg.configure("hibernate-cfg.xml");
	        System.out.println("Configuration Object Created Successfully");
	        SessionFactory sf=cfg.buildSessionFactory();
	        System.out.println("Session Factory Object Created");
	        Session s=sf.openSession();
	        Transaction tx=s.beginTransaction();
	        Emp e1=new Emp();
	        e1.setName("Monami");
	        Emp e2=new Emp();
	        e2.setName("Priya");
	        PhoneNumber ph=new PhoneNumber();
	        ph.setNetwork("AIRTEL");
	        ph.setPhonenumber("9900334455");
	        e1.setPhoneno(ph);
	        e2.setPhoneno(ph);
	        s.persist(ph);
	        s.persist(e1);
	        s.persist(e2);
	        tx.commit();
	        s.close();
	        sf.close();
	    }
}
