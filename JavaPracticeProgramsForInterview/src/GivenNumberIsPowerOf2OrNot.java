
public class GivenNumberIsPowerOf2OrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=64;
		boolean b=isNumberPowOf2(n);
		System.out.println(b);
		if(b==true)
			System.out.println(n +" is a pow of 2");
		else
			System.out.println(n +" is not a pow of 2");

	}
	static boolean isNumberPowOf2(int n) {
        for(int i=0;i<n/2;i++) {
        	if((Math.pow(i, 2)==n)) {
        		return true;
        	}
        }
		return false;
	}
}
