/**
 * 
 */
package com.training;

/**
 * @author santh
 *class can contain constructors, variables, methods
 */
public class HumanBeings {

	/**
	 * @param args
	 */
	int eyes;
	int ears;
	//when a program is ran in java it calls main method
	//constructor name is same as java class name
	//constructor doesn't have a return type and method has a return type
	//when an object is created for a class a default constructor is called or invoked automatically
	//can write any number of constructors
	//when constructors are not written in a class default constructor is called by java 
	//when a constructor is written in java class java doesnot provide any default constructor
	//constructors are invoked or called during object creation
	//while creating an object in order to initialize the object properties then we have to use constructors
	HumanBeings(){//zero argument constructor
		eyes =2;
		ears =1;
		System.out.println("inside a HumanBeings constructor");
	}
	HumanBeings(int a){// one argument constructor
		System.out.println(a);
	}
	HumanBeings(int a, int b){//two argument constructor
		eyes = a;
		ears = b;
		System.out.println(a);
		System.out.println(b);
	}
	HumanBeings(String a){//one argument constructor can be called multiple times with a different data type
		System.out.println(a);
	}
//===================================================================================================================
	/*
	 * polymorphism-exists in many forms
	 * 
	 * 
	 * 
	 * */
	void see() {
		System.out.println("inside see");
	}
	void listen() {
		System.out.println("inside listen");
	}
}

