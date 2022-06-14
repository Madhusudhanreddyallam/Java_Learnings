package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_write_excel_data {

	public static void main(String[] args) throws IOException {
		// File src = new File("C:\\Users\\madhu\\Desktop"+"\\madhu.xlsx");

		FileInputStream file = new FileInputStream("C:\\Users\\madhu\\Desktop\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh = wb.getSheet("Sheet1");
		String value = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);

		
		  System.out.println(value); System.out.println("System property: " + System.getProperty("user.dir"));
		  
		  FileOutputStream out = new FileOutputStream("C:\\Users\\madhu\\Desktop"+"\\madhu.xlsx");
		  XSSFWorkbook wb1 = new XSSFWorkbook(file);
		  sh.getRow(0).createCell(0).setCellValue("madhu"); wb1.write(out); wb1.close();
		 

	}

}
