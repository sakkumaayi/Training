import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author santh
 *
 */
public class SquareRoot {

	/**
	 * Math.sqrt(int n) method returns a double
	 * ========================================
	 * 
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		  System.out.println("enter a number: ");
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(br.readLine());// throws IO exception and Numberformat exception(br.readLine());
          
          double squareRoot=Math.sqrt(n);
          System.out.println(squareRoot);
          System.out.println(sqrt(50));
	}
	public static double sqrt(int number) {
		double t;
		double squareRoot = number / 2;
		do {
		t = squareRoot;
		squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
		}

}
