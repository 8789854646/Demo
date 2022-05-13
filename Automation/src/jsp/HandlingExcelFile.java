package jsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Get the java representative object of physical file
		
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		
		//Create the workbook or open the excel in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		//Get the control of the sheet,row and cell then read the data
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).toString();
		
		//print the data on the console
		System.out.println(data);
		

	}

}
