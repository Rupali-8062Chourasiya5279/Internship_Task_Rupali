package practice121;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Author;
import com.entities.Book;
import com.entities.Student;

public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("practice121/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter book name : ");
		String bname = sc.next();
		System.out.println("Enter book rate : ");
		double brate = sc.nextDouble();
		
		System.out.println("Entyer author name ");
		String aname = sc.next();
		
		Author a = new Author();
		a.setAname(aname);
		Book b = new Book(bname, brate, a);
		a.setBook(b);
		
		Transaction tx = s.beginTransaction();
		s.save(b);
		s.save(a);
		tx.commit();
		System.out.println("done ");
	}

}
