package com.h1.hibernatepractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg =  new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
       Session session = sf.openSession();
       Question q1 = new Question();
       q1.setQid(1);
       q1.setQue("hii");
       Answer a1 = new Answer();
       a1.setAid(1);
       a1.setAns("bye");
       q1.setAns(a1);
       
       session.save(q1);
       session.save(a1);
       session.beginTransaction().commit();
    }
}
