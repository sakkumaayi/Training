package sortingandsearchingAlgorithms;

public class BinarySearchAlogorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,4,6,8,18,20,35,45,65};
		int first =0;
		int last=a.length-1;
		int findelement=2;
		int index=binarySearch(a, findelement);
		System.out.println("found at index: "+index);
		int index1=recursiveBinarySearch(a, findelement,first,last);
		System.out.println("found at index : "+index1);
	}
	public static int binarySearch(int[] a, int findelement) {
		int first =0, mid=0;
		int last=a.length-1;
		
		while(first<=last) {
			mid=(first+last)/2;
			if(a[mid]==findelement) {
				return mid;//return the mid index when mid index contains findelement
			}else if(a[mid]>findelement) {
				last=mid-1;
			}else if(a[mid]<findelement) {
				first=mid+1;
			}
		}		
		return -1;//we return -1 when an element is not found in the array		
	}
	
	public static int recursiveBinarySearch(int[]a, int findelement,int first, int last) {
		if(first>last) {
			return -1;
		}
			int mid=(first+last)/2;
			if(a[mid]==findelement) {
				return mid;
			}
			if(a[mid]>findelement) {
				recursiveBinarySearch(a, findelement,first,mid-1);
			}
			if(a[mid]<findelement) {
				recursiveBinarySearch(a, findelement,mid+1,last);
			}
	return -1;
	}
}
