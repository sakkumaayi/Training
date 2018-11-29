
import java.io.IOException;
import java.sql.SQLException;

public class PredefinedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*new Exception();//java.lang package is import by default in all the classes need not have to be imported explicitly
		new ArithmeticException();
		new ArrayIndexOutOfBoundsException();
		new  IOException();//java.io package should imported
		new SQLException();//java.sql package is imported
		*/
		
		
		
	}
	
	public void m1() {
		try {
			//database connection logic
			//money transfer from one account to another
			//amount should be debited from one account
			//amount should be credited to another account
			//lets say that money is debitted from account but not credittted to another
			//when it happenns money debited should be transferred back to account or cancel that transaction this should be handled in catch block in the real time scenario
			
			throw new SQLException();
		} catch (SQLException e) {//what towrite in catch block to handle the exception is our business requirement
			//log the exception into log file
			//****************************************************
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
