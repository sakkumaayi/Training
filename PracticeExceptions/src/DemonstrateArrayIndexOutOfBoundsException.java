//Exception is always a chance
public class DemonstrateArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];//this array has 5 elements
		a[0] =10; //the value at the 0th index is the first element
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//exception classes are in java.lang
		//string class, object class, system predefined classes in java.lang
		try{
			int d = 9/0;//this statement creates an exception for arithmeticException class object and throws that object by jre and caught in catch block
			//if arithmetic exception is created in the above line control will come out of try block 
			//and will not execute any below lines in the try block and control goes into catch block to catch exception
			
			a[5]=60;/*the value at the 5th index becomes the 6th element but array size is 5 and cannot have 6th element
	at this statement jre throws ArrayIndexOutOfBoundsException since jre cannot handle this situation
	so put this line in try block*/
		}
		//if exception is not handle control comes out of the any method here main method and then jre throws exception object on the console.
		catch(Exception f){//Exception f=new ArithmeticException();
			System.out.println("inside catch block");
		}
		/*catch(ArithmeticException e) {//unreachable code is always a compiler error in java since Exception e catches all kinds of exceptions
			
		}*/
		//instead of using multiple exceptions use generic exception code which catches all kinds of exceptions
		//catch(Exception e)
		
        try {
        	a[5]=60;
        }
        catch(ArrayIndexOutOfBoundsException e){
        	System.out.println("inside 2nd catch block");
        }
   //Exception class is the super class of all the exception classes
		//ArithmeticException extends Exception
		//ArrayIndexOutOfBoundsException extends Exception
		
		System.out.println(a[1]);
	}

}
