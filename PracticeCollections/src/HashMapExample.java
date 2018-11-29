import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
//map will store objects in key value pairs
//and if we add values to duplicate keys that particular key will have the last value that we have added to that particular key
//example: obj.put("abc", "xyz"); xyz value is added to abc key 
//           obj.put("abc", "fgh");fgh is replaced with xyz to abc key i.e, abc key will have fgh value
//           obj.put("abc", "lmn");lmn is replaced with fgh to abc key i.e, abc key will have lmn value
//finally abc key will map to lmn value.
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap obj = new HashMap();
		obj.put("abc", "xyz");
		obj.put("def","asdf");
		obj.put("xyz", new A());
		
		Set set=obj.keySet();//will return a set with all the keys on the object it is called.
		/*Iterator it = set.iterator();
		while(it.hasNext()) {
			Object key =  it.next();
			Object o=obj.get(key);
			//Object o = obj.get(it.next());
			if(o instanceof String) {
				String s = (String) o;
				System.out.println("key: "+key+ ", Value: "+s);
			}
			if(o instanceof A) {
				A a = (A)o;
				System.out.println("key: "+key + ", Value: "+a);
				a.m1();
			}
		}*/

		for(Object key: set) {
			Object o =obj.get(key);
			if(o instanceof String) {
				String s = (String) o;
				System.out.println("key: "+key+ ", Value: "+s);
			}
			if(o instanceof A) {
				A a = (A)o;
				System.out.println("key: "+key + ", Value: "+a);
				a.m1();
			}
		}
	}

}
