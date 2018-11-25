package com.training;

public class A {
	//java.lang(speciality) package is the only package which is imported by default by java to all the classes we create
	//java adds import java.lang by default to every class we create
	int a=2;
	public A(){//public to access it outside of the package 
		System.out.println("inside class A zero argument constructor");
	}
	A(int a){
		
	}
	A(int a,int b){
		
	}
public static void main(String[] args) {	
	B objSuper = new B(); //when subclass object is created java will automatically invoke super class zero argument constructor by default in java using "super();" in sub class constructor
	//if you don't want to invoke super class zero argument constructor we have to explicitly write the super(2,3); to call one or two argument constructors in subclass.
	objSuper.m4();//super.a in class B prints "a" value from its immediate parent class A
	C objSuper1 = new C();//when  class C object is created first grand parent class A default constructor is called then parent class B default constructor is called then current class C default constructor is called
      objSuper1.m5();//super.a in class C prints "a" value from its grand parent class A
	
	
	
	
	System.out.println("this a demo for operater overloading using '+'sign " + 2);// internally converts the integer "2" to a string and then concatenates.
	System.out.println(5+7);//same operator "+" is acting as a addition operator and adds two integers
	System.out.println("abc"+"def");//here "+" operator acts as a concatenator between two strings output is "abcdef"
// this behavior of "+" operator acting in two different forms
	// 1. as addition operation and 2. as concatenator.
	//"+" is the only operator which exhibits operator overloading.
	
	
	  new B();//the following three lines is to implement constructor overloading used to initialize variables for a object at the time of its creation.
	  new B(5,10);
	  new B("abc", "def");
	
	
	HumanBeings obj=new HumanBeings();// default constructor is not called for the object created if zero argument constructor is not written in the java class 
	obj.eyes=2;
	Employee e = new Employee();
	
	//inheritance
	e.ears=2;//ears is a property that has been inherited from HumanBeings class to Employee class (inheritance)
	HumanBeings ob=new Employee();//child class Employee can be referred by parent class HumanBeing variable
	
	//child class will inherit all the properties(variables) and behavior(methods) of the parent class
	//class B inherited methods m1(), main() and add() from class A
	B object = new B();
	object.m1();// m1() method which is in class A is called using class B object
	
	HumanBeings obj1=new HumanBeings(5);
	HumanBeings obj2= new HumanBeings(7,8);
	HumanBeings obj3= new HumanBeings("abc");
	obj.see();
	obj.listen();
}
//same method name add is existing in many form
//in one method it has two argument and 2nd one has three arguments and 3rd has different data type
//this is called polymorphism
/*in order to exhibit a polymorphism behavior a method name can be written multiple times only 
when number of arguments passed are different
or when data types of arguments are different

 if a method is called with same name multiple times in multiple forms in the same class is called method overloading(type of polymorphism
 method overloading is also called as compile time polymorphism because it throws compile time error if polymorphism is not exhibited properly
 eg: int add(int c, int d) this cannot be implemented because it has 2 arguments and data type is also same
 
 *polymorpism is of 2 forms
 *compile time polymorphism (method overloading) and 
 *run time polymorphism(method overriding).
 *
 *
 *
 *compiler throws error when same method is loaded multiple time with same number of arguments 
 *and the arguments passed are of same data type.
 *this is why it is called compile time polymorphism(method overloading).
 */

int add(int a,int b) {
	return a+b;
	
}
/*
 * this method throws compile time error because this is not properly overloaded as it contains same number of arguments with same data types.
 * void add(int c, int d) {

}*/

int add(int a, int b, int c) {
	return a+b+c;
	
}
float add(float a, float b) {
	return a+b;
}
	
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	//same method "add" is overloaded properly 5 times. 
	
	void m1() {
		System.out.println("inside m1 class A");//behavior of this method is to print a line on console
	}
}
class B extends A{
	int a=5; // "a" variable is inherited from class A but overridden in class B a=5;
	
	void m4() {
		System.out.println(super.a+"-----------------"+"in class B");//super keyword is used to refer to parent class variables and methods
	}
	
	
	
	//constructor overloading
	//==========================================
	B(){
		super();//super class constructor should be called in the first line of sub class constructor
		//if we explicitly give super(2)(one argument constructor of super class is called) default zero argument is not called by default in java
		System.out.println("inside class B zero argument constructor");
	}
	B(int a, int b){
		System.out.println("inside 2 integer argument constructor");
	}
	B(String a, String B){
		System.out.println("inside two String  argument  constructor");
	}
	
	
	/*
	 * overriding(used only in inheritance when a child class as inherited properties from parent class) where as overloading can be exhibited anywhere
	 * ===============================================================================================
	 * m1() method is overridden in class B to exhibit a different behavior from m1() which is written in class A 
	 * class B doesn't like to exhibit the behavior of m1() from class A so it has overridden m1() in class B by creating new m1 method in class B and writing a new behavior inside it
	 //changing the behavior of method that is inherited from parent class in the child class is called overriding.
	  *method overriding is achieved in child class when a method  is inherited from parent class.
	  * ==========================================================================================================
	 */
	void m1() {
		System.out.println("inside m1 class B");//overriding is a run time polymorphism
		//m1() is existing in two forms 
		//one in class A and other in class B
		// m1() is inherited from class A to class B but class B does not want the same method behavior
		//so class B has created a new method m1 and overridden(with same method name) the inherited m1() from class A
	}
	void m2() {
		System.out.println("inside m2 class B");
	}
}

class C extends B{
	C(){
		System.out.println("inside class c zero argument constructor");
	}
	void m5() {
		System.out.println(super.a+"-----------------------" + "in class c");
		//a=2 in class A but it is overridden in class B as a=5; 
		//so "super" keyword refers to only immediate parent(super) class 
		//and retrieves overridden "a" value from class B as a=5;
	}
}