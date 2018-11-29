
public class SwapIntegersWithoutTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=10,c=0;
		c=a+b;
		b=c-b;
		a=c-a;
		System.out.println(a+" "+ b +" " + c);
	}

}
