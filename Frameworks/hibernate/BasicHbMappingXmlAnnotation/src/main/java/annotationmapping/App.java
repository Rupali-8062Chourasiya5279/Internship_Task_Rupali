package annotationmapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws ParseException {
		System.out.println("Hello");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter name : ");
	        String name = sc.next();
	        
	        System.out.println("Enter email : ");
	        String email = sc.next();
	        
	        System.out.println("Enter contact : ");
	        String contact = sc.next();
	        
	        System.out.println("Enter city : ");
	        String city = sc.next();
	        
	        System.out.println("Enter dob : ");
	        String dob = sc.next();
	        Date dob1 =new  SimpleDateFormat("dd/MM/yyyy").parse(dob);
		
	        
	        UserInfo u = new UserInfo(name, email, contact, dob1, city);
	        
	        Session s  = sf.openSession();
	        Transaction tx = s.beginTransaction();
	        s.save(u);
	        tx.commit();
	        System.out.println("done");
	        
	}

}
