
public class FindLargestAndSmallestNumberInAnArray {

	public static void main(String[] args) {
		int[] a= {2,1,8,10,0,-1,30};
		kthSmallestElementInAnArray( a);
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-(i+1);j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
		}*/
		System.out.println(" ================================================= ");
		twoLargestNumbersInAnArray(a);
	}
	
	static void kthSmallestElementInAnArray(int[] a) {
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);
		
	}
	static void twoLargestNumbersInAnArray(int[] a) {
		int largest1=0,largest2=0; 
		int i=0;
		while(i<a.length) {
			if(largest1<a[i]) {
				largest2=largest1;
				largest1=a[i];
				System.out.println(largest1+" "+largest2);
			}
			else if(largest2<a[i]) {
				largest2=a[i];
			}
			i++;
		}
		System.out.println("final: " + largest1+ "largest2: "+largest2 );
		/*i=0;
		while(i<a.length) {
			if(largest2<largest1&&largest2<a[i]) {
				l
				largest2=a[i];
			}
			
			i++;
		}*/
		System.out.println("largest 2: "+largest2);
	}

}
