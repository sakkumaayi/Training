
public class Palindrome {
	public static void main(String[] args) {
		String s= "madam";
		String s1="santhusha";
		
		StringBuffer sb= new StringBuffer(s);
		StringBuffer sb1=sb.reverse();
		
		if(sb1.equals(sb)) {
			System.out.println(sb+" is a palindrome");
		}else {
			System.out.println(sb+" is not a palindrome");

		}
		
		char temp;
		String strrev=stringReverse(s);
		String strrev1=stringReverse(s1);

		System.out.println(s+palindrome(s,strrev));		
		System.out.println(s1+palindrome(s1,strrev1));		

	}
	static String stringReverse(String s) {
		char temp;
		char[] a=s.toCharArray();
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		//String strreverse= new String(a);//converts char array to String
		String strreverse = String.valueOf(a);//another way to convert char array to string

		return strreverse;
		
	}
	static String palindrome(String s, String strrev) {
		if(s.equals(strrev)) {
			return " is a palindrome";
		}
		return " is not a palindrome";
	}
	
}
