package firstbasic;

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
       // SessionFactory session=new Configuration().configure().buildSessionFactory();
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");//path of cfg.xml if not follow standard than mandatory to provide path
        SessionFactory factory=cfg.buildSessionFactory();//factory gives session and session has save methof
        System.out.println(factory);
        
        //student creating
        
       Student st=new Student();
       st.setId(2);
       st.setName("anu");
       st.setCity("Indore");
       System.out.println(st);
       Session session=factory.openSession();
       session.beginTransaction();
       session.save(st);//object save
       session.getTransaction().commit();//actual database
       session.close();//session close
        System.out.println(factory.isClosed());
        System.out.println(factory.isOpen());
        
    }
}
//xml me mistake h to could not relocate error
//file not found if path nhi mil rha h h 
