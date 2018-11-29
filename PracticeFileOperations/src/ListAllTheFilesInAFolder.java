import java.io.File;

public class ListAllTheFilesInAFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder=new File("C:/Users/santh/Desktop/shravya selenium and java");
		/*if(folder.exists()) {
			String[] filesList=folder.list();//list() method displays relative path (Automation_Engineer_Role.docx)			
			for(String s:filesList) {
				System.out.println(s);
			}
		}*/
		if(folder.exists()) {
			File[] filesList=folder.listFiles();//listFiles() display absolute files path like this (C:\Users\santh\Desktop\shravya selenium and java\Automation_Engineer_Role.doc)
			for(File files:filesList) {
				System.out.println(files.getName());
			}
		}
	}

}
