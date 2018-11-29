import java.io.File;

public class ListAllFilesAndSubdirectoriesFromADirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        listFiles("C:/Users/santh/Desktop");

	}
	public static void listFiles(String path) {
		File folder = new File("C:/Users/santh/Desktop");
        
        File[] files = folder.listFiles();
         
        for (File file : files) 
        {
            if (file.isFile())
            {
                System.out.println(file.getName());
            }
            else if (file.isDirectory())
            {
                listFiles(file.getAbsolutePath());
            }
        }
	}

}
