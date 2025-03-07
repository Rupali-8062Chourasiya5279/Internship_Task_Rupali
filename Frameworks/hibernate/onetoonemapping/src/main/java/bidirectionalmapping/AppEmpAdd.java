package bidirectionalmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entities.Address;
import com.entities.Employee;


public class AppEmpAdd {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("bidirectionalmapping/hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		
		Employee e1 = new Employee();
		e1.setEmpname("Rupali");
		e1.setEmpsalary(89000.6);
		
		Address a1 = new Address();
		a1.setCity("Indore");
		a1.setState("MP");

		e1.setAddress(a1);
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(a1);
		tx.commit();
		System.out.println("done");
	}

}
