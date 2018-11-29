import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintuniqueNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3, 4, 5, 6, 5, 5, 4, 6,6, 9, 6};
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();		
		for(int i=0;i<a.length;i++) {
			int counter =0;

			if(!al.contains(a[i])) {
				al.add(a[i]);
				counter++;
				for(int j=i+1; j<a.length;j++) {
					if(a[i]==a[j]) {
						counter++;
					}
				}
				System.out.println( a[i] +" is present "+counter +" times");
				if(counter==1) {
					System.out.println(a[i]+ " is a unique number in the array");
				}
			}
		}
		
		
	}

}
