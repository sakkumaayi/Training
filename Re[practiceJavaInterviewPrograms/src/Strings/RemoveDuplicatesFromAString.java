package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aeroplane";
		char[] c=s.toCharArray();
		int arrsize=c.length;
		//s.contains(c[i])
		/*Set set=new HashSet();//to eliminate duplicates
		for(int i=0;i<arrsize;i++) {
			set.add(c[i]);
		}
		Iterator it =set.iterator();
		while(it.hasNext()) {
		
			System.out.print(it.next());
		}*/
		/*Map<Character,Integer> m=new HashMap<Character,Integer>();//to get the count of each character
		for(int i=0;i<arrsize;i++) {
			if(!m.containsKey(c[i])) {
				m.put(c[i], 1);
			}else {
				int value=(int) m.get(c[i]);
				value++;
				m.put(c[i], value);
			}
		}
		
		Set set=m.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		int count=0;
		List l=new ArrayList();
		for(int i=0;i<c.length;i++) {
			if(!l.contains(c[i])) {
				l.add(c[i]);
				count++;
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==c[j]) {
						count++;
					}
					
				}
				if(count==2) {
					System.out.println(c[i] +" is present " +count+" times");
				}
				count=0;
			}
		}
		
		
	}

}
