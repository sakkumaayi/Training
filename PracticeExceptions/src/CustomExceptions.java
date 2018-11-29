
public class CustomExceptions {
	public void m1() {
		
	}
	public static void main(String[] args) throws Exception {
		
		System.out.println(new CustomExceptions());//when we print an object it calls toString() method in customExceptions class
		System.out.println(new B());// TODO Auto-generated method stub
		CustomExceptions obj = new CustomExceptions();
		System.out.println(obj);//calls toString() method in CustomExceptions as obj is refering to customException class
		//System.out.println(obj.toString());
		B obj1 = new B();
		//System.out.println(obj1.toString());
		
		
		
		int balance=500;
		int minimumBalance = 200;
		int amountToWithdraw = 400;
		
		if((balance-amountToWithdraw)>=minimumBalance) {
			
		}
		else {
			try {
			throw new InSuffientFundsException();
		}catch (Exception e){
			String msg=e.getMessage();
			System.out.println(msg);
			System.out.println(e);//calls toString()
			throw e;
		}
			
		}		
	}
	@Override
	public String toString() {
	
		/*return "CustomExceptions [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";*/
		return "in toString() of A";
	}
	

}
class B extends CustomExceptions{
	@Override
	public String toString() {
	
		/*return "CustomExceptions [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";*/
		return "in toString() of B";
	}
}

class InSuffientFundsException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return "InSufficient exception occured";
	}
	
}