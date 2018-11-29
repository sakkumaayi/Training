import java.util.Random;
//local variables are created in stack when the control comes out of the method local variables are deleted from stack.
//all the objects that are created in the heap memory  
/*Garbage collection thread scans the heap memory to check if there are any object that don't have any references and removes those objects but before removing it calls 
finalize() method that has been inherited from object class*/
public class GarbageCollectionFinalizeMethod {
	static int a=2;
	int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random obj = new Random();
		for (int i=1; i>=1;i++) {
			Random obj = new Random();
			GarbageCollectionFinalizeMethod obj1 = new GarbageCollectionFinalizeMethod();
			System.out.println("Random created");
		obj1.b=obj.nextInt();
		a= obj.nextInt();//
		}
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("inside finalize");
		super.finalize();
	}
	 
	
}
