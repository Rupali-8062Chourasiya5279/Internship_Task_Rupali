package firstbasic;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) {
		Configuration conf=new Configuration().configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		AnotationsAddress aa=new AnotationsAddress();
		aa.setCity("ind");
		aa.setDatea(new Date(25/12/2024));
		aa.setIsopen(false);
		aa.setX(344.56);
		aa.setStreet("main");
		aa.setImg(null);
		
		session.beginTransaction();
		session.save(aa);
		session.getTransaction().commit();
		session.close();
		System.out.println("done");
	}

}
