//video class 15

import java.sql.SQLException;

public class DemonstrateFinallyUsingDatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* try {
        	//create a database connection
        	//read data from the database
        	//close database connection (database connection cannot be closed in try block
        	//because when an exception is created in try block while reading from database control goes
        	//into catch block and close connection line is not executed
        }
        catch(SQLException e) {//java.sql.SQlException
        	throw e;//
        }
        finally {//finally block is executed whether or not exception has occurred. the code that is mandatory to execute is written in finally block. 
        	//close database connection is mandatory because database is a rich resource
        	//number of users to access the database is limited so users has to freeup their account for others to use so by close database connection others can use it
        	//lets say maximum users for a database is 2000 users when 2001 user tries to access database this user has to wait until any other user close their database connection. 
        	//connection.close();
        }*/
	}

}
////////////////////////////Exception propagation or Exception chaining////////////////////
//exception propagate from one method to other until the exception is handled if exception is not handled it is propagated to jre
//and jre prints exception on console

//when we want to throw exception intentionaally then we have to use "throw" keyword.
