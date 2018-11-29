
public class fibonnacci {
static int  fibUsingLoop(int n){
	int fib=0;
	int a=0, b=1;
	System.out.print(a+",");
	if(n==0) {
		return n;
	}
	for(int i=2; i<=n; i++) {
		fib=a+b;	
		//System.out.print(a + ","+fib+",");	
		a=b;
		b=fib;
		System.out.print(a+",");
	}
	System.out.println();
	return fib;
}
static int fibRecursion(int n) {
	if(n<=1)
		return n;
	
	return fibRecursion(n-1)+fibRecursion(n-2);
}
public static void main(String[] args) {
	int fibLoop=fibUsingLoop(10);
	//System.out.println(fibLoop);
	int fibRecursion=fibRecursion(6);
	System.out.println(fibRecursion);
	
	
	
	
}
}
