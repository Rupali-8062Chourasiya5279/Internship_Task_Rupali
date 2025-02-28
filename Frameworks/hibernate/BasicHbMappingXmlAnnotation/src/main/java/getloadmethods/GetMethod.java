package getloadmethods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import annotationmapping.UserInfo;

public class GetMethod {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		UserInfo ui = s.get(UserInfo.class, 3);
		System.out.println("after Query");
		System.out.println(ui);
		
		
		//return null
		UserInfo ui1 = s.get(UserInfo.class, 5);
		System.out.println(ui1);
		System.out.println("End");
	}

}
