package jsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Get the control of the sheet
		Sheet s = wb.getSheet("CreateCustomer");
		//Get the control of the row
		Row r = s.getRow(1);
		//Get the control of the cell
		Cell c = r.getCell(2);
		//Get the data present in cell and print it
		String data = c.getStringCellValue();
		System.out.println(data);

	}

}
