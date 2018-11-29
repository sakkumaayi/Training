
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;int r=0;
		String str="";
		while(n>0) {
			r=n%2;
			str=str+r;
			n=n/2;
		}
		System.out.println(str);
		decimalToBinary(50);
	}
	static void decimalToBinary(int n) {
		/*String s="";
		int r=0;
		while(n>0) {
			r=n%2;
			n=n/2;
			System.out.println(r);
			s=s+r;
			System.out.println("================================");
			System.out.println(s);*/
//this prints binary number in the reverse order use array to print in the correct order
//==========================================================================================
		int[] binary=new int[n];
		int index=0,i=0;
		while(n>0) {
			binary[index++]=n%2;
			n=n/2;
			//System.out.println(index+": "+binary[index-1]);
		}
		for(i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		
	}
	
	

}
