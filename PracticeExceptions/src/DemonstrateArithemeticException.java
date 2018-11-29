//Exception is always a chance

public class DemonstrateArithemeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=8;
        int b=0;
        m1();//main is a static method and static methods can access static methods directly which are present in the same class
        //because object instantiation is not required to access static methods
        /*if m1 is in different class we have to access it 
        by using class name DemonstrateArithemeticException.m1()*/
       
        
        try {//try block should be surrounded by cattch block
        	int c=a/b;//when b=0 at the end of this line jre creates a object(for Arithmetic Exception class) and throws that object 
        //to handle this exception we have put this statement in try block
        }//followed by this try block we have to add catch block to catch the exception(object that is thrown)
        catch(ArithmeticException f){
        	//f is a reference variable of type Arithmetic exception that catches the object that is thrown by jre in try block 
        	System.out.println(f);
        	System.out.println("first catch block.  Arithmetic Exception occured");
        }//a try block can be followed by multiple exceptions
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Second catch block array out of bound exception");
        }
        
        
        /*when no exception is handled(no catch is implemented control goes from main method to jre 
         * and jres print the exception object on the console
         * below print statement will not be called because program ends abruptly by jre when catch is not 
         * implemented
         */
        
        
        
        //System.out.println(c); cannot access c as it is local to try block
        System.out.println(a + " "+b);
	}
	
	static void m1() {
		System.out.println("inside static method");
	}

}
