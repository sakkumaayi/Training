
public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,7,11,15,16,19,25,33};
		int index=binarySearch(arr,15,0,arr.length-1);
		if(index==-1) {
			System.out.println("Element not found in array");
		}else {
			System.out.println("Element found at index: "+index);
		}

	}
	static int binarySearch(int[] arr, int findElement, int first,int last) {
		if(first<=1)
		 {
			int mid=(first+last)/2;		
			if(arr[mid]==findElement)
				return mid;
			if(arr[mid]<findElement) {
				return binarySearch(arr, findElement, mid+1,last);
			}else if(arr[mid]>findElement)
				return binarySearch(arr, findElement, first,mid-1);
		}
		
	return -1;	
	}

}
