package com.inheititance.com.single.table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


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
        Emp_TPH_Annotation emp1=new Emp_TPH_Annotation();
        emp1.setName("Ashwin");
        RegEmp_TPH_Annotation emp2=new RegEmp_TPH_Annotation();
        emp2.setName("Jianjun Liu");
        emp2.setSalary(95000);
        emp2.setBonus(300000);
        ContractEmp_TPH_Annotation emp3=new ContractEmp_TPH_Annotation();
        emp3.setName("Haoxuan Yang");
        emp3.setPay_per_hour(4000);
        emp3.setContact_duration("40 hours");
        s.persist(emp1);
        s.persist(emp2);
        s.persist(emp3);
        tx.commit();
        s.close();
        sf.close();
        System.out.println("Succuessfully Done");
    }
}
