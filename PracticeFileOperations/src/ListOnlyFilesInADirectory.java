import java.io.File;

public class ListOnlyFilesInADirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder=new File("C:/Users/santh/Desktop");
		File[] files=folder.listFiles();
		for(File f:files) {
			if(f.isFile()){
				System.out.println(f);
			}
		}
	}

}
