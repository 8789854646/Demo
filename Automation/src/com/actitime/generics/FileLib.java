package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class for Data Driven Testing(DDT).
 * @author kushw
 *
 */
public class FileLib {
	/**
	 * This is a generic method to read the data from Property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */

	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property.txt");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;

	}
	/**
	 * This is a generic method to read the data from Excel file.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

   public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	   FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	   Workbook wb = WorkbookFactory.create(fis);
	   String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	   return data;
	   
   }
   /**
    * This is a generic method to write the data to Excel file.
    * @param sheetname
    * @param row
    * @param cell
    * @param value
    * @throws EncryptedDocumentException
    * @throws IOException
    */
   
   public void setExcelData(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	   FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	   Workbook wb = WorkbookFactory.create(fis);
	   wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
	   FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	   wb.write(fos);
	   wb.close();
   }
}