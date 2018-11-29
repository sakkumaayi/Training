import java.util.Random;

/*1. How to find the missing number in integer array of 1 to 100? (solution)
This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview. 
You have given an integer array which contains numbers from 1 to 100 but one number is missing, 
you need to write a Java program to find that missing number in an array.
 You cannot use any open source library or Java API method which solves this problem. 
 One trick to solve this problem is to calculate sum of all numbers in the array and compare with expected sum, the difference would be the missing numbe

Read more: https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz5TOwbYl00*/
public class MissingNumberInAnArrayOf1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		int[] arrAfterDeletingAnElement = new int[99]; 
		for(int i=0;i<100;i++) {
			arr[i]=i+1;
			//System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println((new Random()).nextInt(arr.length));
		arrAfterDeletingAnElement=deleteAnIntegerFromArray(arr, arr[(new Random()).nextInt(arr.length)]);
		for(int i=0;i<100;i++) {
			System.out.print(arrAfterDeletingAnElement[i]+" ");
		}
		
		System.out.println();
		
		System.out.println(FindMissingNumberOfArrayFrom1To100(arrAfterDeletingAnElement) );
	}
	
	 static int FindMissingNumberOfArrayFrom1To100(int[] arr) {
		 int sum=0;
		 int totalOfIntegersInAnArrayOf1To100=0;
			int missingNumber=0;
			int arrLengthAfterDeletingAnElement=99;
		 for(int i=0;i<arrLengthAfterDeletingAnElement;i++) {
			   sum= sum+arr[i];
			}
			totalOfIntegersInAnArrayOf1To100=(100*(100+1))/2;
			missingNumber= totalOfIntegersInAnArrayOf1To100-sum;
			
			return missingNumber;
	}
	 static int[] deleteAnIntegerFromArray(int[] arr, int deleteElement){
		 int arrSize=arr.length;
		 int i=0;
		 for(i=0;i<arrSize;i++) {
			 if(arr[i]==deleteElement) {
				 break;
			 }
		 }
		 
		 arrSize--;
		 //System.out.println(i+" "+arrSize);
				 for(int j=i;j<arrSize;j++) {
					 arr[j]=arr[j+1];
				 }
		return arr;
	 }

}
