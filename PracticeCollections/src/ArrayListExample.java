import java.util.ArrayList;
import java.util.List;

//collection can store any datatype or any type of object
//collection size is not limited  and size need not to be initialized . size is expanded as we add the objects into it

public class ArrayListExample {
	int a=10;
	String s= "list";
//Arraylist is a collection as arraylist implements list interface and list interface extends collection interface
//arraylist is index based collection but set not index based collection
//arraylist allows duplicate objects but set doesn't accept or store duplicate values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListExample al=new ArrayListExample();
		//System.out.println(al.a+ " ,"+ al.s);
		List obj = new ArrayList(); 
		obj.add(20);
		obj.add("abc");
		obj.add(al);
		obj.add(new ArrayListExample());
		//System.out.println(obj.size());
		for(int i=0; i<obj.size();i++) {
			System.out.println(obj.get(i));
			//System.out.println(obj.iterator().next());

		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "to string method of array list object";
	}
	

}
