
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,7,3,1,10,6};
		int[] sortedArray=insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	static int[] insertionSort(int[] arr) {
		int key=0,j=0,temp=0;
		for(int i=1;i<arr.length;i++) {
			key=arr[i];
			j=i-1;
			while(j>=0&&key<arr[j]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
		}
		
		
		
		
		return arr;
	}
}
