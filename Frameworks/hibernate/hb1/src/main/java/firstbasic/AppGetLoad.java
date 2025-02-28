package firstbasic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppGetLoad {

	public static void main(String[] args) {
		Configuration conf=new Configuration().configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		
		Student student=(Student)session.get(Student.class, 1);//get method to select data
		System.out.println(student);
		Student student3=(Student)session.get(Student.class, 1);//get method to select data
		System.out.println(student3);
		Student student2=(Student)session.get(Student.class, 10);//get method to select data retuens null if not found
		System.out.println(student2);
		
		AnotationsAddress address=(AnotationsAddress)session.load(AnotationsAddress.class, 1);//only return object -throws error if object not founf
		System.out.println(student2);
		System.out.println(address);//now it will fire query
		System.out.println(address);//cache work
		System.out.println(address.getCity());//for particular
		session.close();
		factory.close();

	}

}
