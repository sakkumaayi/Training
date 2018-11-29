
public class FactorialRecursion {
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//int fact=fibRecursion(n);
		//int fact1 = fibUsingLoop(n);
		//System.out.println("factorial of " + n+ "= "+fact1);
		int fact2= FactorialUsingLoop.fibUsingLoop(n);
		System.out.println(fact2);
	}
	static int fibRecursion(int n) {
		if(n<=1) {
			return 1;
		}
		System.out.println(n + " "+i++);
		return fibRecursion(n-1)*n; 
	}
	static int fibUsingLoop(int n){
		int fact=1;
		for(int  i=2;i<=n;i++) {
			System.out.println(i);
			fact=fact*i;
			System.out.println(fact);
		
		}
		return fact;
	}
}
class FactorialUsingLoop{
	static int fibUsingLoop(int n){
		int fact=1;
		System.out.println(n);
		for(int i=n;i>=1;i--) {
			System.out.println(i+" "+n);
			fact = fact*i;
		}
		return fact;
	}
}
;