/**
 * 
 */

/**
 * @author santh
 *String is immutable class
 *we cannot change the values of String class object once it is initialized instead when we try to change it creates a new object and stores it in heap at different memory location
 *
 */
public class StringFirstExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";//string literal//an String object is created in stringpool(memory type like stack and heap) as abc
		s=s.concat("def");//another object is abcdef and variable s reference is now changed to abcdef and no longer points to abc 
		//so first string abc object is useless because it has no reference 
		//when garbage collection thread is invoked it searches for unused objects and removes abc object  and before removing it calls finalize method on String that is being removed
		System.out.println("String variable s: "+s);//output is abcdef
		s.concat("xyz");
		System.out.println("String variable s: "+s);
		System.out.println(s.concat("xyz"));
		System.out.println("String variable s: "+s);// output is abcdef
		s="abc".concat("defghij");
		System.out.println("String variable s: "+s);
		s=s.concat("lmn");
		System.out.println("String variable s: "+s);
		s.concat("pqrstukc");
		System.out.println("String variable s: "+s);
		
		
		
		
		int a=5;
		int b=6;
		System.out.println(a==b);//if two integers have same value //output is false
		
		String s1="abc";//string literals//s1 points to abc and abc is stored in string pool memory
		String s2="def";//s2 points to def
		String s3="abc";//s3 points to the value abc where s1 is pointing since s1 and s3 values are same it doesnot create another duplicate string value in string pool
		
		System.out.println(s1==s2);//"==" compares object references if both object variables point to same string value then output is true
		System.out.println(s2==s3);
		System.out.println(s1==s3);//true as s1 and s3 point to abc 
		System.out.println(s1.equals(s3));//out put is true//equals method returns a boolean value after comparing values of two objects.
		System.out.println(s2.equals(s1));
		
		
		String s4="xyz";
		String s5= new String("xyz");
		String s6= new String("xyz");
		String s7= new String("lmn");
		String s8="abc";
		String s9=s5;
		
		System.out.println("==============================================");
		System.out.println(s4==s5);//false
		System.out.println(s5==s6);
		System.out.println(s9==s5);//true
		System.out.println(s4.equals(s5));//s4 and s5 points to different objects but equals() method compare the values of two objects and return a boolean
		System.out.println(s5.equals(s6));
		System.out.println(s9.equals(s5));
		
		
		A objA=new A(8);
		A objA1=new A(7);
		A objA2=new A(8);
		A objA3=objA1;
		System.out.println("================reference comparision using "+ "== " +"comparator ====================object A");
		System.out.println(objA==objA1);
		System.out.println(objA==objA2);
		System.out.println(objA==objA3);
		System.out.println(objA3==objA1);//true
		System.out.println("===================object values comparision using equals() method===================");
		System.out.println(objA.equals(objA1));//when we print object toString() method is called
		System.out.println(objA.equals(objA2));
		System.out.println(objA.equals(objA3));
		System.out.println(objA1.equals(objA3));//true

	


		
		
		
		
		
		
	}

}
