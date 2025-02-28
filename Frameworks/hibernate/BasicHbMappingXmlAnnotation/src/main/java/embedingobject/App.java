package embedingobject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg  = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Certificate c1 = new Certificate(4,"Java Full Stack");
		Student s1 = new Student("Rupali",c1);
		s.save(s1);
		tx.commit();
		System.out.println("done ");
		
	}

}
