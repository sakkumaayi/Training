
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {24,16,7,35,0,11,46,88,4,2};
		int[] sortedArray=selectionSort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static int[] selectionSort(int[] arr) {
		int i=0,j=0,temp=0,min_value=0;
		for(i=0;i<arr.length;i++) {
			min_value=i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_value]) {
					min_value=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min_value];
			arr[min_value]=temp;

		}
		
		return arr;
	}

}
