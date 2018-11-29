import java.util.Scanner;
/*Binary search is implemented with sorted arrays
 * We basically ignore half of the elements just after one comparison.

Compare x with the middle element.
If x matches with middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
Else (x is smaller) recur for the left half.
 
 * */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,7,11,15,16,19,25,33};
		//System.out.println("Enter a number to find in the array:34");
		//Scanner in = new Scanner(System.in);
		//int n=in.nextInt();
		binarySearch(arr,33);
		
	}
	static void binarySearch(int[] arr,int findElement){
		int size=arr.length;
		int first=0;
		int last=size;
		int mid=last/2;
		
		if(arr[mid]==findElement){
			System.out.println(findElement+" Element found at index: "+mid);
		}
			else if(arr[mid]>findElement) 
			{
			for(int i=first;i<mid;i++) {
				if(arr[i]==findElement) {
					System.out.println(findElement+" Element found at index: "+i);
				}
			}
		}else if(arr[mid]<findElement) {
			for(int i=mid+1;i<last;i++) {
				if(arr[i]==findElement) {
					System.out.println(findElement+" Element found at index: "+i);
				}
			}
		}else {
			System.out.println("Element is not found");
		}
	}

}
