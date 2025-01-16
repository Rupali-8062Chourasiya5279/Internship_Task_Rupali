package todolistapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	
	public Connection connect() throws SQLException, ClassNotFoundException
	{
		String  url="jdbc:mysql://localhost:3306/todoapp";
		String username="root";
		String password="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
	}

}
