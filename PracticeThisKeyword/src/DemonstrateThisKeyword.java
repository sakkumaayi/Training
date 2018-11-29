//this keyword refers to the current object on which variable or method is called


/*Constructors and methods use the keyword this quite differently. 
 * A method uses this to refer to the instance of the class that is executing the method. Static methods do not use this; 
 * they do not belong to a class instance, so this would have nothing to reference. 
 * Static methods belong to the class as a whole, rather than to an instance. 
 * Constructors use this to refer to another constructor in the same class with a different parameter list. Study the following code:
 * 
 * 
 * public class Platypus {
       String name;
       Platypus(String input) {
               name = input;
       }
       Platypus() {
               this("John/Mary Doe");
       }
       public static void main(String args[]) {
               Platypus p1 = new Platypus("digger");
               Platypus p2 = new Platypus();
               }
       }
       
       In the code, there are two constructors. The first takes a String input to name the instance. 
       The second, taking no parameters, calls the first constructor by the default name "John/Mary Doe".

*/
public class DemonstrateThisKeyword {
	int a=2;
	int b=5;
	int c;
	DemonstrateThisKeyword(){
		this(5,4,6);//this is used to call constructors with different number of constructors
	}
	DemonstrateThisKeyword(int a, int b, int c){
		this.a = a;
		this.b=b;
		this.c= c;
		System.out.println( a+b+c+"---------------------");
		
	}
	
	void m1(int a, int b) {
		a=7;//"a" variable is local to this method
		this.a=8; //"this.a" is change the variable value of "a" which is instance variable
		m2();
	}
	void m2() {
		this.a=10;
	}
	DemonstrateThisKeyword m3(DemonstrateThisKeyword d) {
		System.out.println("obj d in m3 method"+"____"+d.a+" "+ d.b);
		System.out.println("inside 1st print in m3 method"+"----"+this.a+" "+ this.b);
		this.b = d.a;//20
		this.a = d.b; //20
		System.out.println("inside 2nd print in m3 method"+"____"+this.a+" "+ this.b);
		//System.out.println("inside 2nd print in m3 method"+"____"+d.a+" "+ d.b);
		return this;
		
	}
	void p() {
		m3(this);
	}
public static void main(String[] args) {
	DemonstrateThisKeyword obj= new DemonstrateThisKeyword();
	DemonstrateThisKeyword obj1= new DemonstrateThisKeyword();
	DemonstrateThisKeyword obj2= new DemonstrateThisKeyword(15, 20, 25);
	DemonstrateThisKeyword temp;
	System.out.println(obj.a);//output is 2//5
	//m1(5, 4);
	//System.out.println(obj.a);//8
	temp = obj.m3(obj1);
	System.out.println("obj object"+ "------"+ obj.a+" "  +obj.b);
	System.out.println("temp object"+ "-----"+ temp.a+" "+ temp.b);
	//obj1.m3(obj);
	//System.out.println("obj1 object"+ "------"+ obj1.a+" "  +obj1.b);
	obj.m3(obj2);
	obj.p();

}
}
