import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteContentsToAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="sasnjhfkjdd";
		byte[] arr=s.getBytes();
		FileOutputStream fos=null;
		try {
			File f=new File("C:/Users/santh/Desktop/dummy.txt");
			if(!f.exists()) {
				f.createNewFile();
			}
			 fos=new FileOutputStream("C:/Users/santh/Desktop/dummy.txt");
			fos.write(arr);
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				fos.close();
			}
		}
	}

}
