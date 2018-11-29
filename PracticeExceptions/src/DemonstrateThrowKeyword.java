
public class DemonstrateThrowKeyword {
//jre creates exceptions when it cannot handle the given situation
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=1000;
		int minimumBalance = 100;
		int amountToWithdraw = 950;
		try {//exception object should be created in the try block so tthat it is caught in catch block
		//when  exceptions are thrown outsidde the try block, catch block cannot catch it
		if((balance-amountToWithdraw)<minimumBalance) {
			throw new ArithmeticException();//create exception object and throw out of the method
			//because jre is unable to throw exception we have to create and throw
			
//throw keyword is used to throw exception intentionally and befor throwing we have to create an exception
		} 
		else {
			/*update the balance
			 * send instruction to cashmachine to give cash Rs.800*/
			System.out.println("Inside else");
		}
		}catch(Exception e) {//Since Exception is super class for all the exception class and Exception reference variable is used to refer to any exception object
			
		}
		throw new ArithmeticException();//exception thrown is not inside the try block so catch block cannot catch this
		//that means exceptions outside try block cannot be handled.
	}

}
