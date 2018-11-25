package com.training1;
import com.training.A;//to import specific class A
import com.training.D;//to import specific class D
import com.training.E;//to import specific class E

import com.training.*;//to import all classes in the package

//All classes in a package should have unique names

//extends(inheritance) means "is a" relationship eg. every employee is a humanbeing

public class G { //class G has a Class H variable ("has a"  relationship ) also called as composition
	int a;//default value of integer is 0
	boolean b;//boolean can accept true or false values only. //default value of boolean is false
	String c;//default value of string is null
	
	H obj;//H is a custom data type // variable of type H //class G has a Class H variable ("has a"  relationship ) also called as composition.
	
	
	
	int a_thiskeyword = 2;//a instance variable is created to demonstrate this keyword
	
public static void main(String[] args) {
	/*final int a;// we can place final keyword in front of a variable, method and class
	//final variable means we cannot change or modify the variable value, so it is a constant variable.
	//final class means we cannot extend the class that is final class in the hierarchy.
	boolean b;
	String C;*/
	Vehicle c = new Truck();
	c.firstGearFunctionality();
	
	
	
	G obj4 = new G();
	System.out.println(obj4.a);//prints 0
	System.out.println(obj4.b);//prints false
	System.out.println(obj4.c);//prints null. String will always point to null
	System.out.println(obj4.obj);//prints null// because it is not pointing to any object
	
	A obj = new A();//class G doesn't know class A as they belong to different packages because java compiler is instructed to check for the class existence in current package.
//we have to tell compiler the package where class A exist for that we have to import the package where class A exist
    D obj1 = new D();
    E obj2 = new E();//to check errors hover the cursor on error and press ctrl+1
    
    
    //////////////////////////////////////////////////////////////////////////this keyword///////////////////////////////////////////////////////////////////////////////////////////
    G obj_this=new G();
    G obj_this1=new G();

    obj_this.a=2;
    obj_this.m3();//a value for this object(obj_this) is 6 and a value for this method is changed using this keyword in void m3();
    obj_this1.m3();//a value for this object(obj_this1) is 6 and a value for this method is changed using this keyword in void m3();

    System.out.println("obj_this"+ " " +obj_this.a);
    System.out.println("obj_this1"+" " + obj_this1.a);

    
}

final void m1() {// final method cannot be overridden in its sub class. we cannot change the behavior in its sub class
	
}
void m1(int a, int b) {
	
}
//====================================================================================================================================================================================================
//this keyword
//********************************

void m3() {
	int a=6;
	this.a=5;//this refers to the current object(the object on which method is called) here current object is obj_this because in main method obj_this().m3 is called.
	System.out.println("inside m3"+" "+this.a);
	this.m4();
}
void m4() {
	this.a = 10;
}








}
final class H extends G{	//final class means we cannot extend the class that is final class in the hierarchy.

	
}
//class P extends H{ //this is not possible as H is the final class cannot extend H.
	
//}


