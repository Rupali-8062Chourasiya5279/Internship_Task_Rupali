package AnnnotationCascade;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Student;

public class AppStudentCourse {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter dob : ");
		int dob = sc.nextInt();
		System.out.println("Enter Contact number : ");
		String contact  = sc.next();
		System.out.println("Enter course name : ");
		String course = sc.next();
		
		Configuration cfg = new Configuration();
		cfg.configure("AnnnotationCascade/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Student s1 = new Student();
		s1.setName(name);
		s1.setSdob(dob);
		s1.setContact(contact);
		
		Course c1 = new Course();
		c1.setCoursename(course);
		
		s1.setCourse(c1);
		
		
		s.save(s1);
		s.save(c1);
		
		tx.commit();
		
		System.out.println("done");

	}

}
