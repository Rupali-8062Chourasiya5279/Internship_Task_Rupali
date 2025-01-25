package newsapp_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC

{
	
	public Connection connect() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/newsapp";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
	}

}
