/**
 * 
 */
package com.training1;

/**
 * @author santh
 *
 */
abstract public class Vehicle {//Abstract classes cannot be instantiated.//objects cannot be created for abstract classes
//because to avoid confusion 
	/**
	 * @param args
	 */
	
	int vin;//vehicle identification number
	int gears;
	int make;
	String model;
	int steeringWheel;
	
	Vehicle(){//we can have constructor in a abstract class
		System.out.println("inside constructor vehicle");
	}
	
	abstract void firstGearFunctionality(); //abstract method means we just declare the method but not defining(not writing behavior by opening braces) it
	//abstract method has declartion but no definition
	//If atleast one method in the class is abstract then the class should be declared Abstract because the class is incomplete as we have not defining the method behavior.
	void secondGearFunctionality() {//not an abstract method but concrete method(declare and define)
		System.out.println();
	}
	

}
class Car extends Vehicle{//override abstract method that is inherited from super class in the sub class
	Car(){
		System.out.println("inside constructor car");
	}
	void firstGearFunctionality() {//give definition or dummy logic
		System.out.println("inside firstgear functionality of car");
	}
}

class Truck extends Car{
	Truck(){//super() constructor is invoked by default by java.
		System.out.println("inside constructor Truck");
	}
	void firstGearFunctionality() {//give definition or dummy logic
		System.out.println("inside firstgear functionality of truck");
	}

}