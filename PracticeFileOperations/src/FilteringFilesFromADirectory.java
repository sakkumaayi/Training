import java.io.File;
import java.io.FilenameFilter;

public class FilteringFilesFromADirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder=new File("C:/Users/santh/Desktop");
		if(folder.exists()) {
			//Implementing FilenameFilter to retrieve only txt files
	         
			FilenameFilter txtfilter=new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					if(name.endsWith(".txt")){
						return true;
					}else
						return false;
				}
		};
		//Passing txtFileFilter to listFiles() method to retrieve only txt files
		File[] files=folder.listFiles(txtfilter);
		for(File f:files)
			System.out.println(f);
	}
		else {
			System.out.println("No file found");
		}
	}
}
