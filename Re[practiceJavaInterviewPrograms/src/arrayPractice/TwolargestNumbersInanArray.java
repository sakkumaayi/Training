package arrayPractice;

public class TwolargestNumbersInanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,8,10,0,-1,30};
		twolargestNumbers(a);
		threelargestNumbers(a);
	}
	public static void twolargestNumbers(int[] a) {
		int arrsize=a.length;
		int largest1=0,largest2=0;
		for(int i=0;i<arrsize;i++) {
			if(a[i]>largest1) {
				largest2=largest1;
				largest1=a[i];
			}else if(a[i]>largest2) {
				largest2=a[i];
			}
		}
		System.out.println(largest1+ "   "+largest2);
	}
	public static void threelargestNumbers(int[] a) {
		int arrsize=a.length;
		int largest1=0,largest2=0,largest3=0;
		for(int i=0;i<arrsize;i++) {
			if(a[i]>largest1) {
				largest3=largest2;
				largest2=largest1;
				largest1=a[i];
			}else if(a[i]>largest2) {
				largest3=largest2;
				largest2=a[i];
			}else if(a[i]>largest3) {
				largest3=a[i];
			}
		}
		System.out.println(largest1+ "   "+largest2+"   "+largest3);
	}
}
