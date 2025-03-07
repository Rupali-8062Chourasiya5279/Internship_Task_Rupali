package uniderctionalmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Answer;
import com.entities.Question;



public class AppQueAns 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("uniderctionalmapping/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        Question q1 = new Question();
        q1.setQuestion("What is java ?");
        
        Answer a1 = new Answer();
        a1.setAnswer("Java is a programming language");
        
        q1.setAnswer(a1);
        
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        s.save(q1);
        s.save(a1);
        tx.commit();
       
    }
}
