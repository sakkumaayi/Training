import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConvertByteArrayToInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "converting to input stream";
        byte[] content = str.getBytes();
        int size = content.length;
        InputStream is = null;
        byte[] b = new byte[size];
        try {
            is = new ByteArrayInputStream(content);
            is.read(b);
            System.out.println("Data Recovered: "+new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(is != null) is.close();
            } catch (Exception ex){
                 
            }
        }
	}

}
