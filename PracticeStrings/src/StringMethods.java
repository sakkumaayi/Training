
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "This is a java demo";
		
		
		boolean b=s.contains("java"); //if charsequence "java" is in String s then return true or returns false
		System.out.println(b);
		
		boolean b1=s.contains("run"); //if charsequence "run" is in String s then return true or returns false
		System.out.println(b1);
		
		
		
		String s1="      This is a java demo       ";//to trim extra spaces in a string
		String s2=s1.trim();
		System.out.println(s1);		
		System.out.println(s2);		
		
		System.out.println(s1==s2);//false
		System.out.println(s==s2);//false
		System.out.println(s1.equals(s2));//false
		System.out.println(s.equals(s2));//true
		 
		String s3=s2;
		System.out.println(s3==s2);//true
		System.out.println(s3.equals(s2));//true
		
		
		
		int s3length=s3.length();//prints length of a string
		int s1length=s1.length();
		System.out.println(s3length);
		System.out.println(s1length);
		
		String s4="";
		boolean isEmptyString=s.isEmpty();
		System.out.println(isEmptyString);
		
		boolean isEmptyString1=s4.isEmpty();
		System.out.println(isEmptyString1);
		
		String s5="abc. ,g abc      abc   mn	def g";
		System.out.println(s5.substring(1, 5));// prints from index 1 to 4//begin index here "1" is included in substring where as final index "5" is excluded
		System.out.println(s5.substring(2));//prints string from index 2
		System.out.println(s5.substring(1, 5));// prints from index 1 to 4//begin index here "1" is included in substring where as final index "5" is excluded
		System.out.println("0 to 0 substring result:" +s5.substring(0, 0));// prints from index 1 to 4//begin index here "1" is included in substring where as final index "5" is excluded

		
		String[] s6=s5.split(" ");//here space is a delimiter to split string
		System.out.println("s6 length:"+s6.length);
		System.out.println("index 0:"+s6[0]);
		System.out.println("index 1:"+s6[1]);
		System.out.println("index 2:"+s6[2]);

		String[] s7=s5.split(",");//here space is a delimiter to split string
		System.out.println("s7 length: "+s7.length);
		System.out.println("index 0:"+s7[0]);
		System.out.println("index 1:"+s7[1]);	
		
		String[] s8 = s5.split("\\s+");//regex(regular expression) here "\\s+" s means spaces the argument passed will remove extra spaces
		System.out.println("s8 length: "+s8.length);
		
		
		
		String s9 = s5.replace("abc", "def");
		System.out.println(s9);

		String s10=s5.replace(",", " ");
		System.out.println(s10);


		String s11=s5.replace(".", " ");
		System.out.println(s11);
		
	}

}
