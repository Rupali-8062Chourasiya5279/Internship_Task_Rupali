package getloadmethods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import annotationmapping.UserInfo;


public class LoadMethod {
	public static void main(String[] args) {
		System.out.println("Hello ");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		 Session s = sf.openSession();
		 
		 UserInfo u = s.load(UserInfo.class, 2);
		 
		 System.out.println("a f t e r   l o a d");
		 System.out.println(u);
		 
		 
		 //exception
		 UserInfo u1 = s.load(UserInfo.class, 12);
		 System.out.println(u1);
		 System.out.println("done");
	}

}
