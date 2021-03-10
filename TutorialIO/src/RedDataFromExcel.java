import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class RedDataFromExcel {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream(new File("e://howtodoinjava_demo.xls"));  
	//creating workbook instance that refers to .xls file  
	HSSFWorkbook wb=new HSSFWorkbook(fis);   
	//creating a Sheet object to retrieve the object  
	HSSFSheet sheet=wb.getSheetAt(0);  
	
	for(Row row:sheet) {
		System.out.println(row.getCell(0)+"\t"+row.getCell(1));
	}
	
}
}
