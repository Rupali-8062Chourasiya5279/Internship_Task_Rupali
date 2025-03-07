package com.hqlcrudoperations;

import java.text.ParseException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import implementingservice.DeleteBl;
import implementingservice.InsertBl;
import implementingservice.SelectBl;
import implementingservice.UpdateBl;

public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	
    	 Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory sf = cfg.buildSessionFactory();
         
         Session s = sf.openSession();
         Transaction tx = s.beginTransaction();
         
    	Scanner sc = new Scanner(System.in);
    	int ch;
    	System.out.println("HQL Project (CRUD operations)");
    	do {
    	System.out.println("1. Add Data of Users.");
    	System.out.println("2. Remove Data Users.");
    	System.out.println("3. Update Data of Users.");
    	System.out.println("4. Read Data of Users.");
    	System.out.println("5. Exit.");
    	System.out.println("Enter your choice : ");
    	ch = sc.nextInt();
    	switch(ch)
    	{
    	case 1: InsertBl ib = new InsertBl();
    		    ib.insertdata(s,tx);
    		break;
    	case 2:  DeleteBl db = new DeleteBl();
    			 db.delete(s,tx);
    		break;
    	case 3: UpdateBl ub =new UpdateBl();
    			ub.updateUserData(s, tx);
    		break;
    	case 4: SelectBl sb = new SelectBl();
    			sb.selectData(s);
    		break;
    	case 5:
    		System.out.println("Exiting from the application.......");
    		break;
    	default:
    		System.out.println("Enter choice from given options only......");
    	}
    	}while(ch!=5);
  
    }
}
