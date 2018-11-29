/*Java reverse an int value - Pseudocode:

a. Extract off the rightmost digit of your input number. (1234 % 10) = 4

b. Take that digit (4) and add it into a new reversedNum.

c. Multiply reversedNum by 10 (4 * 10) = 40, this exposes a zero to the right of your (4).

d. Divide the input by 10, (removing the rightmost digit). (1234 / 10) = 123

e. Repeat at step a with 123*/
public class ReverseAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int input=1234,lastDigit=0,d=0,reversedNum=0, rev;
                while(input>0) {
                	
                	lastDigit=input%10;
                	 reversedNum=(reversedNum*10)+lastDigit;
                	//System.out.println(reversedNum);
                	input=input/10;
                }
            	System.out.println(reversedNum);

                System.out.println(reverseInteger(1234));
                
                
                
                
        	}
	static int reverseInteger(int input){
		int reversedNum=0;
		while (input != 0) {    
		    int last_digit = input % 10;
		      
		         reversedNum = reversedNum * 10 + last_digit;

		    
		    input = input / 10; 
		}
		//System.out.println(reversedNum);
		return reversedNum;
	}

}
