package junk;

public class InstanceVariables {
	int a =5;
	public static void main(String[] args) {
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.a);
		obj.a = 6;
		System.out.println(obj.a);
		
		String a="apple";
		String b="banana";
		String c="apple";
		System.out.println(a==c);
		System.out.println(b==a);
	}
}
