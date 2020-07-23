package com.nagendra.com.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        Configuration cfg = new Configuration();
        cfg.configure("hibernate-cfg.xml");
        System.out.println("Configuration Object Created ");
        SessionFactory sf = cfg.buildSessionFactory();
        System.out.println("session Factory object created");
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        
        HashMap<String, String> map1 = new HashMap<String,String>();
        map1.put("network", "BA");
        map1.put("Phonenumber", "1234");
        
        HashMap<String, String> map2 = new HashMap<String,String>();
        map1.put("network", "BAA");
        map1.put("Phonenumber", "12345");
        
        
       
        Emp emp1 = new Emp("1",map1);
        Emp emp2 = new Emp("2",map2);
        
		
       
        
        
        
        
        tx.commit();
   
        s.close();
        sf.close();
    }
}
