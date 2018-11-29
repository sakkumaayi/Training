import java.util.Scanner;

public class HarmonicNumbers {
	double harmonicSum(int x) {
	    double sumOfHarmonicNumbers=0;
	    for(int i=1;i<=x;i++) {
        	double temp = 1.0/i;
        	sumOfHarmonicNumbers = sumOfHarmonicNumbers + temp;
        }
        return sumOfHarmonicNumbers;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        HarmonicNumbers h=new HarmonicNumbers();
        double sum = h.harmonicSum(x);
          	System.out.println(sum);
        s.close(); 
	}

}