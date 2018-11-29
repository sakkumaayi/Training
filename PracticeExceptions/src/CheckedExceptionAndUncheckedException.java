import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionAndUncheckedException {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		CheckedExceptionAndUncheckedException obj = new CheckedExceptionAndUncheckedException();
		obj.m1();//here unhandled checked exception is propagated to jre and jre prints exception on console
	}
	void m1() throws SQLException {
		//Database logic
		DriverManager.getConnection("url","username", "password");//SQL exception is a checked exception
		throw new SQLException();//when checked exceptions are not handled java compiler throws error 
		//so we have to tell compiler that this method m1() has a chance to thrrow exception using "throws" keyword
		//at the method declaration eg:m1() throws SQLException
		//Then the exception is propagated to main method from where m1() method is called 
		//In main method also exception is not handled so java compiler throws error and add "throws SQLException" at main method declaration 
		//compiler knows at exceptions are thrown for SQLException
	}
}

//throw  keyword is used to throw exception intentionally where as


/*throws keyword is used at method signature to tell java compiler that this method has a chance to throw 
 * exception and propagate the exception to the method from where current method is called
 */



//the exception classes that extend RuntimeException class are unchecked exceptions
//when unchecked exceptions are runtime exceptions as they extend RuntimeException class and java compiler doesnot identify unchecked exceptions



//all other exceptions extends Exception class directly are checked exceptions
/*checked exceptions should be handled otherwise javac will throw compilation error to avoid this error 
 * add "throws Exception" at method signature
 * 
 * when we add throws exception at method signature compiler knows that we do not know how to handle the exception
 * and this exception will be handled where this current method is called */
