package xmlmapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter uid : ");
        int id = sc.nextInt();
        
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
        
        User u = new User(id, name, email, contact, city, dob1);
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        s.save(u);
        t.commit();
        System.out.println("done");
    
    }
}
