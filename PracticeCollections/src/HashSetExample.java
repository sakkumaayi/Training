import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*//hashset is a collection as hashset implements set interface and set interface extends collection interface
//arraylist is index based collection 
 * but hashset not index based collection so use iterator to access the objects in Hashset
//list allows duplicate objects 
 * but set doesn't allow duplicate objects*/
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set obj = new HashSet();
		obj.add(10);
		obj.add(10);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add("abc");
		obj.add(new A());
		obj.add(new B());
		System.out.println(obj.size());//set doesn't allow duplicate values
		//Iterator it=obj.iterator();//iterator method is in HashSet
		for(Object o: obj) {//using for loop
			//Object o=it.next();
			if(o instanceof A) {
				A a= (A)o;
				System.out.println("object of class A:" +a.a);
				a.m1();
			}
			else if(o instanceof B) {
				B b=(B)o;
				System.out.println("object od class B: "+ b);
			}
			else if(o instanceof String){
				String s = (String )o;
				System.out.println("string: " +s);
			}else {
				System.out.println("Integer: " +o);
			}

		}
				/* while(it.hasnext()) {//using while loop
				System.out.println("element found");

		 }infinite loop as hasNext() always every time points to first element*/
		/*while(it.hasNext()) {//hasNext() always every time points to first element
			//System.out.println("element found" + ", "+it.next());
			Object o=it.next();
			if(o instanceof String) {
				String s1=(String) o;
				System.out.println(s1);
			}
			else if(o instanceof A) {
				A a = (A)o;
				System.out.println(a);

			}
			else if(o instanceof B) {
				B b = (B)o;
				System.out.println(b);
			}
			else {
			//int a= (int)it.next();//type casting //can type cast integers, Strings //read wrapper classes for type casting
			int c = (int)o;
				System.out.println(c);
			}
		}*/
		
		Set s1=new HashSet();
		s1.add("abc");
		s1.add(new A());
		s1.add(new B());
		Iterator it1= s1.iterator();
		while(it1.hasNext()) {		
			Object o = it1.next();
			if(o instanceof A) {
				A obj_a = (A)o;
				System.out.println(obj_a);
			}
			else if(o instanceof B) {
				B obj_b = (B)o;
				System.out.println(obj_b);
			}else if(o instanceof String) {
				String s= (String)o;
				System.out.println(s);
			}
		}
		
		Set s2=new HashSet();
		s2.add(new A());
		s2.add("lmn");
		Iterator it2=s2.iterator();
		if(it2.hasNext()) {
			System.out.println("s2:object found" + it2.next());
		}
		else {
			System.out.println("no elements or objects found");
		}
		
		
		
	}

}
