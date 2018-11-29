//Abstract classes can contain both abstract and concrete methods but interfaces can contain only abstract methods
//multiple inheritance is implemented using interfaces and not possible through classes
interface X{//all the methods in an interface are public abstract by default
	
	public static final a=10;
	void m1();//public abstract
	void m2();//public abstract
	void m3();//public abstract
}

interface R extends X{//interfaces can extend other interfaces
	void m4();
	void m5();
}
public class DemonstrateInterface implements R {//interfaces are implemented by a class using "implements" keyword

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				R obj= new DemonstrateInterface();//R is an interface which is implemented by class DemonstrateInterface and can referred using interface variable
				System.out.println(M.a);
	}
	//all the public abstract methods must be implemented or overridden in the class that is implementing the interface
	//if the interface implementing class doesnot override atleast one method from interface the class should be named abstract.
    public void m1() {
    	
    }
    public void m2() {
    	
    }
    public void m3() {
    	
    }
    public void m4() {
    	
    }
    public void m5() {
    	
    }
}
//we cannot achieve multiple inheritance in java using extends keyword
//we can implement multiple inheritance in java using interface

//interface can contain public abstact methods and static final variables
//by default interfaces methods are public abstract and interface variables are static and final
//We cannot have instance variables in interface because interfaces cannot be instantiated static variables can directly accessed by interface name R.a 
interface M{
	int a=0;//by default variables in interface are static and final.
	void m7();
	void m8();
}
interface N{
	void m8();
	void m9();
	void m10();
	void m11();
	
}

class T implements M,N{

	@Override
	public void m9() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m10() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		
	}
	
}