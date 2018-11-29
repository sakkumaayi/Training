import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsFromThreeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {1, 5, 10, 20, 40, 80};
		int[] input2 = {6, 7, 20, 80, 100};
		int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
		commonElementsFromThreeSortedArrays(input1,input2,input3);
		/*for(int i=0;i<input1.length;i++) {
			//System.out.println(input1[i]);
			for(int j=0;j<input2.length;j++) {
				//System.out.println(input2[j]);
				if(input1[i]==input2[j]) {					
					System.out.println(input2[j]);
				}
			}
						
			
		}*/
		//Read more: https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz5TanfB1Wx
	}
	
	static void commonElementsFromThreeSortedArrays(int[] ar1,int[] ar2, int[] ar3){
		/*int i=0,j=0,k=0;
		
		while(i<a.length&&j<b.length&&k<c.length) {
			if(a[i]==b[j]&&b[j]==c[k]) {
				System.out.println(a[i]+" "+b[j]+" "+c[k]);
			}
		}
		int[] input1 = {1, 5, 10, 20, 40, 80};
		int[] input2 = {6, 7, 20, 80, 100};
		int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};*/
		int i = 0, j = 0, k = 0; 
		  
        // Iterate through three arrays while all arrays have elements 
        while (i < ar1.length && j < ar2.length && k < ar3.length) 
        { 
             // If x = y and y = z, print any of them and move ahead 
             // in all arrays 
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
             {   System.out.print(ar1[i]+" ");   i++; j++; k++; } 
  
             // x < y 
             else if (ar1[i] < ar2[j]) 
                 i++; 
  
             // y < z 
             else if (ar2[j] < ar3[k]) 
                 j++; 
  
             // We reach here when x > y and z < y, i.e., z is smallest 
             else
                 k++; 
        } 
	}

}
