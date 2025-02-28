package onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App2 {
	public static void main(String[] args) {
		System.out.println("helloo");
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Employee e1 = new Employee();
		e1.setEid(2);
		e1.setName("Vaishali");
		e1.setSalary(768756);
		Address a1 = new Address();
		a1.setAid(2);
		a1.setCity("Indore");
		a1.setState("MP");
		e1.setAddress(a1);
		session.save(e1);
		session.save(a1);
		session.beginTransaction().commit();
		session.close();
		sf.close();
		
	}

}
