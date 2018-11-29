import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
BufferedReader is synchronous while Scanner is not.
 BufferedReader should be used if we are working with multiple threads.
BufferedReader has significantly larger buffer memory than Scanner.
The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer),
 but it’s more than enough.
BufferedReader is a bit faster as compared to scanner because scanner does parsing of input data and
 BufferedReader simply reads sequence of characters.
 * 
 */

/**
 * @author santh
 * import java.lang.math
 * public static double random()

Return :
This method returns a pseudorandom double greater than or equal to 0.0 and less than 1.0.
 *
 */
public class MathRandom {

	/**
	 * @param args
	 * @throws NumberFormatException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
		int n;
		int[] arr= {1,2,3,4,5,6};
		/*System.out.println("enter number:");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());//integer casting
		for(int i=1; i<=n;i++) {
     System.out.println(i+ " "+Math.random());
		}*/
		//System.out.println(arr[new Random().nextInt(arr.length)]);//
		
		
		//How to generate random integers within a specific range in Java?
		
		int min=10;
		int max=20;
		
		int rand=0;
		
		System.out.println(min+new Random().nextInt(max-min+1));
		
		System.out.println(min+(int)(Math.random()*(max-min)+1));
		
		
	}

}
