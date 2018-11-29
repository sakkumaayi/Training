/*.Given the series of numbers 1,1,1,3,5,9,17
Clue: First 3 numbers remain as 1 and from 4th position it starts adding up the previous 3 digits.
4th number=1+1+1
5th num= 3+1+1 etc
Write a java program to disply the number in nth position after passing a numbe for position.
ex: If I pass 4 it should display the number in 4th position. ie 3*/
public class SimilarTOFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		similarTofibonacci(8);
	}
	static void similarTofibonacci(int n) {
		int a=1,b=1,c=1,sum=0;
		System.out.print(a+", "+b+", "+c+", ");
		for(int i=3;i<n;i++) {
			sum=a+b+c;
			 a=b;
			 b=c;
			 c=sum;
			 System.out.print(sum+",");
		}
		System.out.println();
		System.out.println(sum);
	}

}
