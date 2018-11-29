import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInputFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFromfileUsingScanner();
	}
	public static void readFromfileUsingScanner() {
		File f= new File("C:/Users/santh/Desktop/java2novice.com interview questions.txt");
		Scanner s;
		String string=null;
		//s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			System.out.println(n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*while(s.hasNext()) {
				System.out.println(s.nextInt());

		}
		s.close();*/
		
	}
}
