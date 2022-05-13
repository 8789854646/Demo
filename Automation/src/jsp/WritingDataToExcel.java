package jsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	//get the java representative object of physical file
     FileInputStream fis=new FileInputStream("./data/Multiple.xlsx");
     
     //create the workbook or open the excel in read mode
     Workbook wb = WorkbookFactory.create(fis);
     
     //get the control of the sheet ,row and cell then type the data
     wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("pass");
     
     //convert the java representative object into physical file format or open the file in write mode
     FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
     
     //save the excel in write mode (actual writing happens here) 
     wb.write(fos);
     
     //close the workbook(Mandatory)
     wb.close();
	}

}
