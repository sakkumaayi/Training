import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*In the above program, for loop is used to determine if the given number num is prime or not. 
 * We only have to loop through 2 to half of num, because no number is divisible by more than its half.

Inside the for loop, we check if the number is divisible by any number in the given range (2..num/2).
 This determines num is not a prime number.

*/
public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter a number: ");
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int n=Integer.parseInt(br.readLine());
		System.out.println(n+" " +primeNumber(n));
	}
	public static String primeNumber(int n) {
		
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return "is not a Prime number";				
			}
		}
		return "is a prime number";
	}
	
	
}
