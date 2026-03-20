package data_driven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Workbook w=new XSSFWorkbook();
Sheet sh=w.createSheet("excelWrite");
//sheet is predefined interface of org.apache.poi.ss.usermodel package

Row r1= sh.createRow(0);
//row is predefined interface of org.apache.poi.ss.usermodel package
r1.createCell(0).setCellValue("Username");
//cell means column
r1.createCell(1).setCellValue("Password");
r1.createCell(2).setCellValue("test status");

Row r2= sh.createRow(1);
r2.createCell(0).setCellValue("Admin@gmail.com");
r2.createCell(1).setCellValue("12345");
r2.createCell(2).setCellValue("Fail");

Row r3= sh.createRow(2);
r1.createCell(0).setCellValue("Admin");
r1.createCell(1).setCellValue("admin@123");
r1.createCell(2).setCellValue("Pass");

FileOutputStream f=new FileOutputStream("C:\\Users\\Akansha\\Downloads\\Automation.xlsx");
//FileOutputStream is predefined class pf java.io package used to write data in excel sheet
w.write(f);
System.out.println("data written success..");
	}

}
