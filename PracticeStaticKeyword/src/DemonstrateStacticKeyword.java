
public class DemonstrateStacticKeyword {
	static int a =100; //static variable is class level variable. can access the static variables using the class name.
	//all the objects of the class will share the same value
	//all the objects will refer to the same value
	//***********************static variables and static methods can be accessed by class name and object creation for the class is not required by can be acessed by object name
	int b = 20; //instance variable is object level variable
	//instance variable "b" value can be changed for different objects
	//each object can have different values
	//*******************instance variables and instance methods can be accessed only when an object is created for the class.
	
	//static methods can access only static variables and static methods
	//static methods can access instance variables and methods only after creating object through the reference variable of the object
	//this keyword cannot be used in static context because static methods are class level methods where as this refers to instance of a class.
	public static void main(String[] args) {
		System.out.println(DemonstrateStacticKeyword.a);       //can access the static variables using the class name.
		DemonstrateStacticKeyword obj= new DemonstrateStacticKeyword();
		DemonstrateStacticKeyword obj1= new DemonstrateStacticKeyword();

		obj.a = 10;
		System.out.println(DemonstrateStacticKeyword.a);
		obj1.a=300;
		System.out.println(DemonstrateStacticKeyword.a);
		
		
		Q obj3 = new Q();
		obj3.m1();
		
		DemonstrateStacticKeyword.m1();
		obj.m1();
	}
	
	static void m1() {
		DemonstrateStacticKeyword.a = 1;
		System.out.println("in m1 of class DemonstrateStacticKeyword---------"+DemonstrateStacticKeyword.a);
	}

}

class Q{
	void m1() {
		DemonstrateStacticKeyword obj= new DemonstrateStacticKeyword();
		obj.a=60;
		System.out.println("in class Q "+DemonstrateStacticKeyword.a);
		DemonstrateStacticKeyword.a =5000;
		System.out.println("in class Q " + DemonstrateStacticKeyword.a);

	}
}