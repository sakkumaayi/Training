/**if an exception is not handled in a method m2() the exception object is thrown to the method m1() from 
 * where method m2() is called.
 * if exception is not handled in method m1() the exception object is thrown to the main method from where 
 * m1() is called.
 * the way exception are propagating or chaining from one method to other method and from that method to other method 
 * is called exception propagation or exception chaining.
 *          ===================================================================================================
 * 
 */

/**
 * @author santh
 *
 */
public class DemonstrateExceptionChainingOrExceptionPropagation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemonstrateExceptionChainingOrExceptionPropagation obj = new DemonstrateExceptionChainingOrExceptionPropagation();
		try{
			obj.m1();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("inside m1 exception");
		}
	}
	public void m1() {
		try{
			m2();//jre will create an object for ArithmeticException class and thrown out to main method befor thrwing finally block is executed
		}
		finally{//finally block must be executed whether or not exception is caught
			System.out.println("finally in m2");
		}
	}
	
	public void m2() {
		System.out.println("before");
		//try{//try should either followed by catch or finally
			int i = 8/0;//object is created for ArithmeticException class and thrown and it is not caught using try catch block
		//}
		//catch(Exception e){}
		//so the control goes out of method m2() to m1() 
		//and in m1() method also ArithmeticException class object is not caught so control goes out from m1() method to main method
		//in  main method also exception is not caught so the control goes out of main method and exception is thrown to jre where jre prints exception on the console
		System.out.println("after");
	}

}
