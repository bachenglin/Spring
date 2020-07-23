package hibernate.one.to.one;

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
	public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate-cfg.xml");
        System.out.println("Configuration Object Created ");
        SessionFactory sf = cfg.buildSessionFactory();
        System.out.println("session Factory object created");
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Emp e = new Emp();
        e.setId(12);
        e.setName("Monami");
        PhoneNumber ph = new PhoneNumber();
        ph.setPid(13);
        ph.setNetwork("Aritel");
        ph.setPhonenumber("1234567");
        e.setPhoneno(ph);
        ph.setEmp(e);
        s.persist(e);
        tx.commit();
        s.close();
        sf.close();
    }
}
