import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDuplicateCharactersFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		//Scanner s=new Scanner(System.in);
		//char[] c=s.next().toCharArray();
		String str ="afdhaetfgdehhytfddsgchjiuhgfdrser";
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;   }				
				}	
			if(count==2) {
				System.out.println(c[i] +" is a duplicate");
			}
			count=1;
			
		}
		System.out.println("============================================================");
		count=0;
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
