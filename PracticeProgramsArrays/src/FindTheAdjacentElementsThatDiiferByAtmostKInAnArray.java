
public class FindTheAdjacentElementsThatDiiferByAtmostKInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,7,5,8,6,5,1,4,8,5,10,15,11,9};
		int startIndex=0;
		int arrayLength=a.length;
		findAdjacentElementsThatDifferAtmostByK(a,2);
		System.out.println("========================================");
		findAdjacentElementsThatDifferAtmostByK(a,3);
		System.out.println("***********************************************************************");
		findAdjacentElementsThatDifferAtmostByKUsingRecursion(a,startIndex, arrayLength,2);
		System.out.println("====================================================================");
		findAdjacentElementsThatDifferAtmostByKUsingRecursion(a,startIndex, arrayLength,3);

	}
	static void findAdjacentElementsThatDifferAtmostByK(int[] a,int k) {
		int i;
		int differ;
		for(i=0;i<a.length-1;i++) {
			differ=Math.abs(a[i]-a[i+1]);
			if(differ<=k) {
				System.out.println(a[i]+","+a[i+1]);
			}
		}
	}
	static void findAdjacentElementsThatDifferAtmostByKUsingRecursion(int[] a,int startIndex, int arrayLength,int k ) {
		int differ;
		if(startIndex==arrayLength-1) {
			return;
		}
		differ=Math.abs(a[startIndex]-a[++startIndex]);
		if(differ<=k) {
			System.out.println(a[startIndex-1]+" " +a[startIndex]);
		}
		findAdjacentElementsThatDifferAtmostByKUsingRecursion(a,startIndex,arrayLength,k );
	}
}
