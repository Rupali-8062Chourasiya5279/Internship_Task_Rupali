package implementingservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import crudoperation.DeleteUserData;

public class DeleteBl implements DeleteUserData {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void delete(Session s, Transaction tx) {
		DeleteBl db = new DeleteBl();
		int c;
		do
		{
			System.out.println("1. Delete Single User .");
			System.out.println("2. Delete Multiple Users .");
			System.out.println("3. Delete All Users .");
			System.out.println("4. Delte By City .");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			c = sc.nextInt();
			switch(c)
			{
			case 1: db.delte1(s, tx);
				break;
				
			case 2: 
				System.out.println("Enter how many user you want to delete : ");
				int n = sc.nextInt();
				List<Integer> l = new ArrayList();
				System.out.println("Enter user id of "+n+" users : ");
				for(int i = 1;i<=n;i++)
				{
					l.add(sc.nextInt());
				}
				System.out.println(l);
				for(int id :l)
				{
				db.delte2(s, tx,id);
				}
				break;
			case 3: db.delte3(s, tx);
			break;
			
			case 4: db.delte1(s, tx);
			break;
				
			case 5: System.out.println("Exiting from deleting the users.");
				break;
				
			default:
				System.out.println("Enter choice from given options only.");
			}
			
		}
		while(c!=5);
		
	}


	@Override
	public void delte1(Session s, Transaction tx) {
		System.out.println("Enter user id : ");
		int id = sc.nextInt();
		tx = s.beginTransaction();
		String hql = "delete from User where uid=:x";
		Query q=s.createQuery(hql);
		q.setParameter("x", id);
		int i= q.executeUpdate();
		if(i>0)
		{
		System.out.println("deleted user is "+id);
		tx.commit();
		}
	}


	@Override
	public void delte2(Session s, Transaction tx,int id) {
		tx = s.beginTransaction();
		String hql = "delete from User where uid=:x";
		Query q=s.createQuery(hql);
		q.setParameter("x", id);
		int i= q.executeUpdate();
		if(i>0)
		{
		System.out.println("deleted user is "+id);
		tx.commit();
		}
	}


	@Override
	public void delte3(Session s, Transaction tx) {

		tx = s.beginTransaction();
		String hql = "delete from User ";
		Query q=s.createQuery(hql);
		int i= q.executeUpdate();
		if(i>0)
		{
		System.out.println("deleted all users...  ");
		tx.commit();
		}
	}


	@Override
	public void delte4(Session s, Transaction tx, String city) {
		
		System.out.println("Enter city : ");
		 city = sc.next();
		tx = s.beginTransaction();
		String hql = "delete from User where ucity=:x";
		Query q=s.createQuery(hql);
		q.setParameter("x", city);
		int i= q.executeUpdate();
		if(i>0)
		{
		System.out.println("deleted user of "+city);
		tx.commit();
		}
	}
	
	
}
