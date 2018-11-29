package Encapsulation;
//public instance variables in a class can be accessed out of a class using e1.empName
//but private instance variables in a class cannot be accessed out of a class
//to access private instance variables out of a class we have to generate getters and setters in a class
//these private variables are hiding in a class but can be accessed using getters and setters method
//this process of hiding variables as private and accessing through getters and setters method is called Encapsulation 
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();

		e1.setEmpId(1234);
		e1.setEmpName("santhusha");
		
		e2.setEmpId(5678);
		e2.setEmpName("vijendar");
		
		e3.setEmpId(1234);
		e3.setEmpName("Tejas");
		
		e4.setEmpId(1234);
		e4.setEmpName("santhusha");
		

		
		int e1Id=e1.getEmpId();
		String e1Name=e1.getEmpName();
		
		int e2Id=e2.getEmpId();
		String e2Name=e2.getEmpName();
		
		System.out.println("e1 id: "+e1Id+" ,"+"e1Name : "+e1Name);
		System.out.println("e2 id: "+e2Id+" ,"+"e2Name : "+e2Name);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
		
		System.out.println(e1==e2);//compares object references not values.
		

	}

}
