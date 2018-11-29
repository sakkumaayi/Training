package junk;

public class StaticVariable {
	static int a=8;
	int b=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);

		int a=5;
		System.out.println(a);
		System.out.println(StaticVariable.a);
		StaticVariable obj=new StaticVariable();
		System.out.println(obj.b);
		obj.b=12;
		System.out.println(obj.b);

		obj.m1();
		System.out.println(obj.b);

	}
	public  void m1() {
		System.out.println(a);
		this.b=15;
	}
	
	public static void m2() {
	}

}
