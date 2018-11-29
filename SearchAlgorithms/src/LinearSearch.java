
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int findElement=54;
		int[] arr= {3,7,10,26,92,55,47,33,9};
		int index=linearSearch(arr,findElement);
		if(index!=-1) {
			System.out.println("Element found atindex: "+index);
		}else {
			System.out.println("element notfound");
		}
	}
	static int linearSearch(int[] arr, int findElement) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==findElement) {
				return i;
			}
		}
	return -1;
	}
}
