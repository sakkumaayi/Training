import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//read from .txt to console
		File f= new File("C:/Users/santh/Desktop/samplefor fileoperations.txt");
		boolean b=f.exists();
		System.out.println(b);
		
		
			FileInputStream fis=new FileInputStream(f);
			int asciiValue;
			
			
			while((asciiValue=fis.read())!=-1) {//read method reads one character from file and return the ascii value othat character
				//and moves the pointer to next character in the file
				System.out.print((char)asciiValue);
			
			}
		
		System.out.println();
		fis.close();

		
		//read from .java file to console
		
		File f1= new File("C:/Users/santh/eclipse-workspace/PracticeFileOperations/src/FileOperations.java");
			boolean b1=f1.exists();
			System.out.println(b1);
			
			
			FileInputStream fis1=new FileInputStream(f1);//FileInputStream throws FileNotFoundException
			int asciiValue1;
			
			
			while((asciiValue1=fis1.read())!=-1) {//throws IOException
				//read() method reads one character from file and return the ascii value(int) of that character
				//and moves the pointer to next character in the file
				System.out.print((char)asciiValue1);
			
			}
			fis1.close();
	
		
		FileOutputStream fos=new FileOutputStream("C:/Users/santh/desktop/writefromjavafile.txt");
		fos.write(80);//converts integer ascii value 80 to char value//write P to file.
		fos.write(13);
		fos.write(10);
		String s="This is a string to write in a file";
		byte[] barray=s.getBytes();//reads data from a string as bytes and each byte is stored as a value in byte array at each index
		fos.write(barray);
		
		FileInputStream fi=new FileInputStream("C:/Users/santh/Desktop/samplefor fileoperations.txt");
		FileOutputStream fo=new FileOutputStream("C:/Users/santh/desktop/writefromjavafile.txt");
		int data;
		while((data=fi.read())!=-1) {
			System.out.print((char)data);
			fo.write(data);
		}
		
	}

}
