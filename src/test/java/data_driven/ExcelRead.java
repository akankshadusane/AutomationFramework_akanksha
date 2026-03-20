package data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
//file i/o
		
		FileInputStream f=new FileInputStream(new File("C:\\Users\\Akansha\\Downloads\\Excel1.xlsx"));
		//FileInputStream is predefined class from java.io package 
				//it is used to read and store the location of excel sheet 
	XSSFWorkbook w=new XSSFWorkbook(f);
		//XSSFWorkbook is predefined class from org.apache.poi package
	
	XSSFSheet sh=w.getSheetAt(0);
	//XSSFSheet is predefined class from org.apache.poi package 
			//it is used to define sheet index from where we have to read the record 
	XSSFCell c;
	//XSSFCell is predefined class from org.apache.poi package 
	
			//getLastRowNum() is predefined method of XSSFSheet 
			//it is used to read the data until it get empty cell values 
			for(int i=1;i<=sh.getLastRowNum();i++)
			{
			c=sh.getRow(i).getCell(0);
			//Row 1, Column 0
			c.setCellType(CellType.STRING);
			d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(c.getStringCellValue());
			System.out.println(c.getStringCellValue());

			//getStringCellValue is predefined method of XSSFCell 
			//it will read the data from excel file and print it in console 
			
			c=sh.getRow(i).getCell(1);
			//Row 2, Column 1
			c.setCellType(CellType.STRING);
			d.findElement(By.xpath("//input[@type='password']")).sendKeys(c.getStringCellValue());
			System.out.println(c.getStringCellValue());
			
			d.findElement(By.xpath("//button[@type='submit']")).click();
			}
			
w.close();
	}

}
