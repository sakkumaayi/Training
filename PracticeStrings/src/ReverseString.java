
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revString("hello");
		String s= recursiveStringReverse("hello");
		System.out.println(s);
	}
	public static void revString(String s) {
		char[] c =s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	public static String recursiveStringReverse(String s) {
		if(s==null||s.length()<=1) {
			return s;
		}
		return recursiveStringReverse(s.substring(1))+s.charAt(0);
	}
}
