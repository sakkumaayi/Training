
public class EliminateDuplicatesInAnIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,7,4,3,2,1,2,1,4,2,9,7,8,5,9};
		int aSize=eliminateDuplicatesInAnIntegerArray(a);
		System.out.println(aSize);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<aSize;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] newArray = new int[aSize];
		for(int i=0;i<newArray.length;i++) {
			newArray[i]=a[i];
			System.out.print(newArray[i]+ " ");
		}
	}
	static int eliminateDuplicatesInAnIntegerArray(int[] a) {
		int i=0,j=0,k=0,temp=0;
		int l=a.length;
		for(i=0;i<l;i++) {
			for(j=i+1;j<l;j++) {
				if(a[i]==a[j] ){
					/*for(k=j;k<l;k++) {
						temp=a[j];
						a[j]=a[l-1];
						a[l-1]=temp;}*/
					a[j]=a[l-1];//assign last index element to the index where duplicate element is found
					l--;
				}
			}
		}
		return l;
	}
}