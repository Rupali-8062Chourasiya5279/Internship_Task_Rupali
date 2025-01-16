package todolistapplication;
import java.sql.SQLException;
import java.util.Scanner;
public class SwitchTask {
	

	Scanner sc = new Scanner(System.in); 
	int ch;
	public void task() throws ClassNotFoundException, SQLException {
		do {
		System.out.println("Press 1. for add task .");
		System.out.println("Press 2. for update task .");
		System.out.println("Press 3. for delete task .");
		System.out.println("Press 4. for select task .");
		System.out.println("Press 5. for exit from application .");
		System.out.println("Enter your choice : ");
		
		ch=sc.nextInt();
		
		switch(ch)
		{
		
		case 1: AddTask at=new AddTask();
				at.add();
		break;
		
		case 2: UpdateTask ut=new UpdateTask();
				ut.update();
		break;
		
		case 3:  DeleteTask dt=new DeleteTask();
				dt.delete();
		break;
		
		case 4: SelectTask st=new SelectTask();
				st.select();
		break;
		
		case 5: System.out.println("Exiting application.......");
		break;
		
		}
		}while(ch!=5);
	}
}
