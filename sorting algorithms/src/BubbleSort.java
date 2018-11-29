/*Bubble Sort:  
 * In bubble sort algorithm array/list is traversed from 0 to the length-1 index. 
 *  It compares one element to the next element.  
 *  It swaps the values in between if the next element is less than the previous element.   
 *  In other words, bubble sorting algorithm compare two values and put the largest value at largest index.  
 *  The algorithm follow the same steps repeatedly until the values of array is sorted.   
 * In worst-case the complexity of bubble sort is O(n2) and in  best-case the complexity of bubble sort is O(n). */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort b = new BubbleSort();
		int[] arr= {24,16,7,35,0,11,46,88,4,2};
		b.bubbleSort(arr);
		System.out.println("sorted array");
		b.printArray(arr);
		
	}
	void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	void bubbleSort(int[] arr) {

		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-(i+1);j++) 
			{
				if(arr[j]>arr[j+1]) {
					/*int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;*/	
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					printArray(arr);
					System.out.println("inside if loop");
				}
			printArray(arr);
			System.out.println("in j loop");
					
			}
		printArray(arr);
		System.out.println("in i loop" + i);
		}
	}

}
