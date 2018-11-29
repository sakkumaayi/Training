package ReadDataFromXcelSheetUsingDataProviderAnnotation.TestNgDataProviderAnnotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiLibrary {
	public void getAccessToExcelSheet(String filepath, String sheetname, String columnname) throws IOException {
		FileInputStream fis = new FileInputStream("C:/Users/santh/Desktop/datadriventesting.xlsx");
		//XSSFWorkbook object accepts file inputstream object
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		int sheetcount=workbook.getNumberOfSheets();//number of sheets
		for (int i=0;i<sheetcount;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase(sheetname)){//get all sheet names and compare with desired sheet name 
				XSSFSheet sheet = workbook.getSheetAt(i);//when you are at desired sheet get the sheet in to a variable
				Iterator<Row>row=sheet.iterator();//iterates through all the rows
				Row FirstRowInSheet=row.next();
				//we have to traverse thhrough all the cells in the first row and get the column with name "testcases"
				Iterator<Cell>cells=FirstRowInSheet.cellIterator();//iterates all the cells of a specific row	
				int column=0, k=0;
				while(cells.hasNext()) {
					Cell ce=cells.next();
					if(ce.getStringCellValue().equalsIgnoreCase(columnname)) {
						column=k;//get column no of the desired column name
					}
					k++;
				}
				System.out.println(column);
				while(row.hasNext()) {//after getting column number again iterate through the rows
					Row rowno=row.next();
					if(rowno.getCell(column).getStringCellValue().equalsIgnoreCase(testcase)){//get cell data for desired column 
						Iterator<Cell> cell=rowno.cellIterator();
						while(cell.hasNext()) {
							Cell c=cell.next();
							if(c.getCellTypeEnum().equals(CellType.NUMERIC)) {//checks if cell data is numeric
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}else {
								a.add(c.getStringCellValue());

							}
							
						}
					}
				}
			}

		}
	}
}
