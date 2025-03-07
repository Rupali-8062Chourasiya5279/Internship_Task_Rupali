package newsapp_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NewsService {
	
	Scanner sc = new Scanner(System.in);
	ConnectionJDBC co = new ConnectionJDBC();
	public void addDetail() throws ClassNotFoundException, SQLException  {
		int c;
		do {
		System.out.println("1. Add News ");
		System.out.println("2. Add News Details .");
		System.out.println("3. Add Photo Path or Url .");
		System.out.println("4. Add News Title .");
		System.out.println("5. Exit ");
		System.out.println("Enter your choice : ");
		c = sc.nextInt();
	switch(c)
	{
	case 4 : addTitle();
	break;
	
	case 2: addDesc();
	break;
	
	case 3 : addUrl();
	break;
	
	case 1: add();
	break;
	
	case 5 : System.out.println("Exiting from adding........");
	break;
	
	default:
	{
		System.out.println("Enter valid choice ..................");
	}
	
	}	
		}while(c != 5);
		
	}

	public void add() throws SQLException, ClassNotFoundException
	{
		System.out.println("Enter title of the news : ");
		String title = sc.next();
		System.out.println("Enter description of the news : ");
		String desc = sc.next();
		System.out.println("Enter url of the photo : ");
		String url = sc.next();
		//String tit = sc.next();
		Connection con = co.connect();
		String q = Queries.getAdd(); 
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, title);
		ps.setString(2, desc);
		ps.setString(3, url);
		int i  = ps.executeUpdate();
		if(i != 0)
		{
			System.out.println("News added Successfully...");
		}
		else
		{
			System.out.println("Failed to add news...");
		}
	}
	
	public void addTitle() throws SQLException, ClassNotFoundException
	{
		System.out.println("Enter id :");
		int id = sc.nextInt();
		System.out.println("Enter title of the news : ");
		String title = sc.next();
		//String tit = sc.next();
		Connection con = co.connect();
		String q = Queries.getAddtitle(); 
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, title);
		ps.setInt(2, id);
		int i  = ps.executeUpdate();
		if(i != 0)
		{
			System.out.println("Title added Successfully...");
		}
		else
		{
			System.out.println("Failed to add title...");
		}
	}
	
	public void  addDesc() throws SQLException, ClassNotFoundException
	{
		System.out.println("Enter id :");
		int id = sc.nextInt();
		System.out.println("Enter description of the news : ");
		String desc = sc.next();
		//String tit = sc.next();
		Connection con = co.connect();
		String q = Queries.getAddesc(); 
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, desc);
		ps.setInt(2, id);
		int i  = ps.executeUpdate();
		if(i != 0)
		{
			System.out.println("Description added Successfully...");
		}
		else
		{
			System.out.println("Failed to add description...");
		}
	}
	
	public void  addUrl() throws SQLException, ClassNotFoundException
	{
		System.out.println("Enter id :");
		int id = sc.nextInt();
		System.out.println("Enter url of the photo : ");
		String url = sc.next();
		//String tit = sc.next();
		Connection con = co.connect();
		String q = Queries.getAddurl(); 
		PreparedStatement ps = con.prepareStatement(q);
		ps.setString(1, url);
		ps.setInt(2, id);
		int i  = ps.executeUpdate();
		if(i != 0)
		{
			System.out.println("Path added Successfully...");
		}
		else
		{
			System.out.println("Failed to add path...");
		}
	}
	
	public void listNews() throws ClassNotFoundException, SQLException {
		Connection con = co.connect();
		String q = Queries.getShow();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(q);
		System.err.println("id           title            details              photo");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"         "+rs.getString(2)+"         "+rs.getString(3)+"         "+rs.getString(4));
		}
		
	}

}
