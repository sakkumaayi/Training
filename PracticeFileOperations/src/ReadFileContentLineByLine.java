import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileContentLineByLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:/Users/santh/Desktop/java2novice.com interview questions.txt");
		try {
			FileReader fr=new FileReader(f);//FileReader accepts file object
			BufferedReader br=new BufferedReader(fr);//BufferedReader accepts FileReader object
			StringBuffer sb=new StringBuffer();
			String s=null;
			try {
				while(br.readLine()!=null) {//BufferedReader has a method readLine() to read file contents line by line
					s=br.readLine();
					sb.append(s);
					sb.append("\n");
				}
				fr.close();
				System.out.println(sb);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
