package implementingservice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.User;

import crudoperation.InsertUserData;

public class InsertBl implements InsertUserData {

	@Override
	public void insertdata(Session s, Transaction tx) throws ParseException {
      System.out.println( "Hello World!" );
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User id : ");
        int id = sc.nextInt();
        
        System.out.println("Enter user name : ");
        String name = sc.next();
      //  String v = sc.nextLine();
      //  System.out.flush();
        
        System.out.println("Enter user mobile : ");
        String mobile = sc.next();
        
        System.out.println("Enter user city : ");
        String city = sc.next();
        
        System.out.println("Enter user email : ");
        String email = sc.next();
        
        System.out.println("Enter user password : ");
        String password = sc.next();
        
        System.out.println("Enter user date of birth : ");
        String dob = sc.next();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        
        User u = new User(id, name, email, password, date, city, mobile);
        
         s.save(u);
         tx.commit();
         System.out.println("saved");
         System.out.println("HQL has no query for inserting data.");
		
	}

	
	
}
