
package newsapp_package;

import java.sql.SQLException;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		System.out.println("hello main");
		News ob = new News();
		ob.news();
	}

}
