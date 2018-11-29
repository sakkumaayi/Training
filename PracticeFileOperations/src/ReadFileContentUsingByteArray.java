import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileContentUsingByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:/Users/santh/Desktop/java2novice.com interview questions.txt");
		byte[] byteArray=new byte[(int)f.length()];
		try {
			FileInputStream fis=new FileInputStream(f);
			try {
				fis.read(byteArray);//reads each character(as a byte) in to array
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*for(byte b:byteArray) {
			System.out.print((char)b);
		}*/
		for(int i=0;i<byteArray.length;i++) {
			System.out.print((char)byteArray[i]);
		}
	}

}
