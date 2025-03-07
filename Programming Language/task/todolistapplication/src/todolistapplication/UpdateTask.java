package todolistapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTask {

	Scanner sc=new Scanner(System.in);
	ConnectionClass cc=new ConnectionClass();
	public void update() throws ClassNotFoundException, SQLException {
		int c;
		
		do {
			System.out.println("Press 1. for update title .");
			System.out.println("Press 2. for update status .");
			System.out.println("Press 3. for update title and status both .");
			System.out.println("Press 4. for exit from updating tasks .");
			System.out.println("Enter your choice : ");
			
			c=sc.nextInt();
			
				switch(c)
				{
				
				case 1: updatetitle();
				break;
				
				case 2: updatestatus();
				break;
				
				case 3: updateAll();
				break;
			
				case 4: System.out.println("Exiting application.......");
				break;
			
				}
			}while(c!=4);
		
		
	}
	public void updateAll() throws ClassNotFoundException, SQLException
	{
	Connection con=cc.connect();	
	
	System.out.println("Enter id");
	int sno=sc.nextInt();
	
	System.out.println("Enter task and status .");
	String tile = sc.nextLine();
	String title = sc.nextLine();
	String status = sc.next();
	
	String q=AllQueries.update;
	
	PreparedStatement ps=con.prepareStatement(q);
	ps.setInt(3, sno);
	ps.setString(1,title);
	ps.setString(2, status);
	
	int i=ps.executeUpdate();
	
	if(i>0)
	{
		System.out.println("Data updated Successfully.");
	}
	else
	{
		System.out.println("Failed to update data.");
	}
	}
	
	public void updatestatus() throws ClassNotFoundException, SQLException
	{
		Connection con=cc.connect();	
		
		System.out.println("Enter id");
		int sno=sc.nextInt();
		
		System.out.println("Enter task  status .");
		String status = sc.next();
		
		String q=AllQueries.updatestatus;
		
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(2, sno);
		ps.setString(1, status);
		
		int i=ps.executeUpdate();
		
		if(i>0)
		{
			System.out.println("Data updated Successfully.");
		}
		else
		{
			System.out.println("Failed to update data.");
		}	
	}
	
	public void updatetitle() throws ClassNotFoundException, SQLException
	{
		Connection con=cc.connect();	
		
		System.out.println("Enter id");
		int sno=sc.nextInt();
		
		System.out.println("Enter task title .");
		String tile = sc.nextLine();
		String title = sc.nextLine();
		
		String q=AllQueries.updatetitle;
		
		PreparedStatement ps=con.prepareStatement(q);
		ps.setInt(2, sno);
		ps.setString(1,title);
		
		int i=ps.executeUpdate();
		
		if(i>0)
		{
			System.out.println("Data updated Successfully.");
		}
		else
		{
			System.out.println("Failed to update data.");
		}	
	}
}
