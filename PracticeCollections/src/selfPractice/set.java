package selfPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set is interface which is implemented by classes hashset,linkedhashset,treeset
//set doesnot allow duplicate elements
//set elements are not ordered
//set allows unique values
//set allows one null value
public class set {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("dgfj");
		s.add("sakmkjsdj");
		s.add("kdjkjsdn");
		s.add("dgfj");//duplicate values are not allowed
		s.add(new A());
		s.add(new B());

		s.add(null);
		s.add(null);//set allows only one null value
		//treeSet does not allow null values
		System.out.println(s);//only one null values is printed in the console
		
		/*Iterator it = s.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			if(o instanceof A) {
				A a=(A)o;
				System.out.println(a.a);
			}
			else if(o instanceof B) {
				B b=(B)o;
				System.out.println(b.b);
			}
			else if(o instanceof String) {
				String str=(String)o;
				System.out.println(str);
			}
			else {
				System.out.println(o);
			}
			
		}
*//////using while loop
		
		for(Object o: s) {
			if(o instanceof A) {
				A a=(A)o;
				System.out.println(a.a);
			}
			else if(o instanceof B) {
				B b=(B)o;
				System.out.println(b.b);
			}
			else if(o instanceof String) {
				String str=(String)o;
				System.out.println(str);
			}
			else {
				System.out.println(o);
			}
		}
	}
}
