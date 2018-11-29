import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EliminateDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,2,3,3,3};
		int n=arr.length;
		int index=0;
		
		int j = 0; 
		  
	    // Doing same as done in Method 1 
	    // Just maintaining another updated index i.e. j 
	    for (int i=0; i < n-1; i++) 
	        if (arr[i] != arr[i+1]) 
	            arr[j++] = arr[i]; 
	  
	    arr[j++] = arr[n-1]; 
	  
		for(int i=0;i<j;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		/*Set s = new HashSet();
		
		for(int i=0; i<l;i++) {
			s.add(a[i]);
		}
		for(Object element:s) {
			System.out.println((int)element);
		}
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashMap map=new HashMap();
		for(int i=0; i<l;i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}else {
				int value=(int) map.get(a[i]);
				value++;
				map.put(a[i],value);
			}
		}	
		Set set=map.keySet();
		Iterator it_map=set.iterator();
		System.out.println("iterating through hash map");
		while(it_map.hasNext()) {
			int key=(int) it_map.next();
			int value=(int) map.get(key);
			System.out.println(key+" "+value);
		}*/
	}

}
