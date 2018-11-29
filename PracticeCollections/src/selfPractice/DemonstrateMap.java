package selfPractice;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class DemonstrateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemonstrateMap d = new DemonstrateMap();
		d.hashmap();
		d.hashTable();
	}
	public void hashmap() {
		HashMap obj=new HashMap();
		obj.put("abc", "xyz");
		obj.put("def","asdf");
		obj.put("xyz", new A());
		
		//using while loop
		//get all keys from map in to set collection
		Set set=obj.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object key=it.next();//getting keys from set
			Object value = obj.get(key);// get value of specific key
			if(value instanceof String) {
				String str = (String) value;
				System.out.println("key: "+key+ ", Value: "+str);
			}
			if(value instanceof A) {
				A a = (A)value;
				System.out.println("key: "+key + ", Value: "+a.a);
				a.m1();
			}
		}
		
		
		
		//using for loop
		
		for(Object key: set) {
			Object value =obj.get(key);
			if(value instanceof String) {
				String str = (String) value;
				System.out.println("key: "+key+ ", Value: "+str);
			}
			if(value instanceof A) {
				A a = (A)value;
				System.out.println("key: "+key + ", Value: "+a.a);
				a.m1();
			}
		}
	}
	
	public void hashTable() {
		Hashtable ht=new Hashtable();
		ht.put("abc", "xyz");
		ht.put("def","asdf");
		ht.put("xyz", new A());	
		
		Set set=ht.keySet();
		for (Object s:set)
		{
			System.out.print(s+"    ");
		}
		System.out.println();
		Enumeration e=ht.keys();
		while(e.hasMoreElements()) {
			System.out.println("In enumeration: "+e.nextElement());
			
		}
		Set setEntry=ht.entrySet();//prints both key=value format
		for (Object s:setEntry)
		{
			System.out.print("In setEntry"+s+"    ");
		}
		
	}
}
