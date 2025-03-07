package practice12m;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Location;
import com.entities.Worker;

public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("practice12m/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s  = sf.openSession();
		Worker w = new Worker();
		w.setName("kalu");
		Location l = new Location();
		l.setCity("indore");
		l.setState("mp");
		l.setStreet(2);
		List<Location> list =new ArrayList<Location>();
		list.add(l);
		w.setLocation(list);
		Transaction tx = s.beginTransaction();
		s.save(w);
		tx.commit();
		System.out.println("done");
	}

}
