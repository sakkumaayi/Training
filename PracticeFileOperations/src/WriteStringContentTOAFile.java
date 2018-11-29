import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteStringContentTOAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		FileWriter fw=null;
		File f=null;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String: ");
		
		try {
			input = br.readLine();
			System.out.println(input);
			//f=new File("C:/Users/santh/Desktop/dummy.txt");
			//fw=new FileWriter(f);
			fw=new FileWriter("C:/Users/santh/Desktop/dummy.txt");
			fw.write(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
