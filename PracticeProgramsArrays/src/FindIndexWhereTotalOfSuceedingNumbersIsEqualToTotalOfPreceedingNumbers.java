
public class FindIndexWhereTotalOfSuceedingNumbersIsEqualToTotalOfPreceedingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,5,6,6,5,4,3,1,1};	
		int index=indexWhereTotalOfSuceedingNumbersIsEqualToTotalOfPreceedingNumbers(a); 		
		System.out.println("TotalOfSuceedingNumbersIsEqualToTotalOfPreceedingNumbers at index: "+index);		
	}
	static int indexWhereTotalOfSuceedingNumbersIsEqualToTotalOfPreceedingNumbers(int[] a) {
		int i=0;
		int leftSum=0,rightSum=0;
		for(i=0;i<a.length;i++) {
			leftSum=leftSum+a[i];
			for(int j=i+1;j<a.length;j++) {
				rightSum = rightSum+a[j];
			}
			if(leftSum==rightSum) {
				return i;
			}
			rightSum=0;
		}
		return 0;
	}

}
