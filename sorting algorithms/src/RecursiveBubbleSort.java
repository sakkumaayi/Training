
public class RecursiveBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveBubbleSort b = new RecursiveBubbleSort();
		int[] arr= {24,16,7,35,0,11,46,88,4,2};
		//b.bubbleSort(arr);
		b.recursiveBubbleSort(arr, arr.length-1);
		System.out.println("sorted array");
		b.printArray(arr);
		
	}
	void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-(i+1);j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void recursiveBubbleSort(int[] arr, int size) {
	if(size ==1) {
		return;
	}
		for(int i=0;i<size;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
		}
			recursiveBubbleSort( arr, size-1)	;	
	}
	}
}
