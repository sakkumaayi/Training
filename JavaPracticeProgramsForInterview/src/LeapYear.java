import java.util.Scanner;

public class LeapYear {
	void leapYear(int x){
		if(x%4==0) {
			System.out.println(x+ " "+"is a leap year");
		}else if(x%4!=0) {
			System.out.println(x+ " "+"is not a leap year");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		LeapYear year=new LeapYear();
		System.out.println("Enter a year:");
		Scanner scYear = new Scanner(System.in);
		x=scYear.nextInt();
		year.leapYear(x);
		scYear.close();

	}

}
