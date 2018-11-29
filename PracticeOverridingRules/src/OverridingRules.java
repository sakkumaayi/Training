//overriding is implemented in subclasses
//overriding can be stopped in three ways
//1. method is declared private
//2.method is static
//3.method is final//best way to stop overriding
//If a subclass inherits the methods from superclass there is a chance to change its definition(override)unlesss the method is final

/*why overriding is a runtime polymorphism
 * ================================================
because lets say a subclass object is created with parent class referrence variable and overridden method is called using parent class reference variable 
at compiler time copiler checks if the overridden method exists in parent class
the decision of calling parent class method or subclass overridden method happens during runtime 
this is the reason overriding is called Runtime Polymorphism*/

/*overridingrules
 * ======================
 * static methods cannot be overrridden
 * overridden method should have
 * 1.same method name
 * 2. same no. of arguments with same datatypes
 * 3.same return type
 * we can increase the visibilty of the method but cannot decrease
 * eg: protected method can be changed to public but public cannot to be changed to default or protected type
 * exception rules
 * ========================================================================
If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
If the superclass method declares an exception
If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception*/
public class OverridingRules {
	protected void m1(int n) {
		System.out.println("inside m1 of parent class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingRules obj = new SubClassForDemonstratingOverridingRules();
		obj.m1(10);
		
		
	}

}

