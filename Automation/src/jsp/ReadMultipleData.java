package jsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/MultipleData1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		//get the count of last row number which contains data
		int rowCount = wb.getSheet("InvalidLogin").getLastRowNum();
		for (int i = 1; i <= rowCount; i++) {
	    String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
	    String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
	    System.out.println(un+"  "+pw);
			
		}

	}

}
