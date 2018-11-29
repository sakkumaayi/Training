package package1;
//increasing order of scope of access modifiers
//1.public
//2.protected
//3.default
//private

//when overriding a method in its subclass methods scope can be increased but cannot be decreased
//eg:can change from default to public or private to public but not vice versa
//we can increase the scope of the method but not reduce


//all classes are by default public or default type they cannot  be protected or private.
public class DemonstrateAccessModifiersPublicPrivateProtectedDefault {
	int f;
	private int a=10;//private variables visibility (scope) is within the class where it is defined
	protected int b = 50;//protected variables scope is within the package and outside the package inside the subclasses and can be accessed through a subclass object reference but these 
	//variables are not accessed with parent class reference.
    public int c = 30;//public variables are visible to all the classes across all the packages
    int d=35; //default variables are visible within the package//package level modifier.
	
    
    void m1() {//m1 is a instance method 
		a=20;//this statement automatically by default changes like this "this.a=20" this refers to current object through which m1() method is called
		// class object instantiation is not required we can initialize an instance variable "a" inside a instance method because m1() method will anyway 
		//be called in some other method after  instantiating an object and refering the m1() method with the reference variable of that object created. eg:obj.m1()
	}
    /////
   // f=50;this is not allowed declaration in one line and initialization in one ine
    //in a class we can write
   // 1.variables
    //2.methods
    //3.constructors 
    //and nothing else is written in the class
    //instance variables declaration and definition should be done in the same line.
    //eg: int a =10;
    //this is not allowed eg: int a; declaration in one line and
	
    //in the  next line we cannot define it like this a=10;
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	DemonstrateAccessModifiersPublicPrivateProtectedDefault obj=new DemonstrateAccessModifiersPublicPrivateProtectedDefault();
    	obj.a = 30;
    	
	}

}
