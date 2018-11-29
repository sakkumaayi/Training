package Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//using generics we can restrict the type of data or objects that can be stored in A COLLECTION.
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<A> obj=new ArrayList<A>();
		obj.add(new A());
		//obj.add("abc");//we cannot add String into this object as we have restricted the collection data type using Generics<> as object of class A so, compiler gives error
	
	Set<String> objSet = new HashSet<String>();
	//objSet.add(new A());//this is not allowed as objSet allows String as datatype not any other objects can be stored in objSet.
	objSet.add("abc");
	
	
	
	}

}
