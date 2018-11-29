
public class BinarySearchUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,7,11,15,16,19,25,33};
		int index=binarySearch(arr,33);
		if(index==-1) {
			System.out.println("Element not found in array");
		}else {
			System.out.println("Element found at index: "+index);
		}
	}
	static int binarySearch(int[] arr, int findElement) {
		int first=0;
		int last=arr.length-1;
		int mid=0;
		while(first<=last) {
			mid=first+last/2;
			if(arr[mid]==findElement) {
				return mid;
			}
			
			if(arr[mid]<findElement) {
				first=mid+1;
			}else if(arr[mid]>findElement) {
				last=mid-1;
			}
			
		}
		
		return -1;
	}

}
