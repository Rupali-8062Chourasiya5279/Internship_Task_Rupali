package newsapp_package;
import java.sql.SQLException;
import java.util.Scanner;
public class News {
	public void news() throws ClassNotFoundException, SQLException
	{
		System.out.println("news");
		Scanner sc = new Scanner(System.in);
		NewsService bl = new NewsService();
		int ch ;
		do {
		System.out.println("1. Add news details .");
		System.out.println("2. List news .");
		System.out.println("3. Exit app .");
		System.out.println("Enter choice : ");
		ch = sc.nextInt();
		
		switch(ch)
		{
		case 1 : bl.addDetail();
		break;
		
		case 2 : bl.listNews();
		break;
		
		case 3 : System.out.println("Exiting app...........");
		break;
		
		default :
		{
			System.err.println("Please Enter Valid Choice..........");
		}
		
		}
		}while(ch!=3);
	}

}
