package Framework.ExcelDrivenTesting;

import java.io.IOException;
import java.util.ArrayList;

public class testsample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDrivenTestFromExcelUsingPOIApi d=new DataDrivenTestFromExcelUsingPOIApi();
		ArrayList<String> a=d.getDataFromExcel("Add Profile");
		System.out.println("printing a row of data from excel");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
