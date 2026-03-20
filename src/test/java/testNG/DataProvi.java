package testNG;

import org.testng.annotations.Test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DataProvi {
	
	
	WebDriver d;
	String url="https://biodataking.com/";
	
	//Write automation script for test login form with diff inputs with hard code values 
	
	
  @Test(dataProvider = "dp")
  public void f(String username,String epass, String cntry, String mobno,String mpass) throws InterruptedException {
	  
	  d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(epass);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("(//input[@class='login'])[1]")).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@value='mobile']")).click();
	  Thread.sleep(2000);
	  
	  new Select(d.findElement(By.xpath("//select[contains(@id,'code')]"))).selectByVisibleText(cntry);
	  Thread.sleep(2000);
	  
	  d.findElement(By.xpath("//input[@id='usermobile']")).sendKeys(mobno);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(mpass);
	  Thread.sleep(2000);
	  d.findElement(By.xpath("(//input[@class='login'])[1]")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeMethod
  public void Setup() {
	  
	  d=new ChromeDriver();
	  d.get(url);
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
  }


  @DataProvider
  public Object[][] dp() {
    
	  ///                  [no of users] [no of fields]
	  Object[][] obj=new Object[3][5];
	  
	  obj[0][0]="abcd.xyz@gmail.com";
	  obj[0][1]="abcd@1234";
	  obj[0][2]="Belgium";
	  obj[0][3]="9272727";
	  obj[0][4]="rty@123";
	  
	  obj[1][0]="Kshitij.salgar@gmail.com";
	  obj[1][1]="2872724";
	  obj[1][2]="India";
	  obj[1][3]="abcde@345";
	  obj[1][4]="$#$%%^^";
	  
	  obj[2][0]="jsdbdb.asuhwdgw";
	  obj[2][1]="123456";
	  obj[2][2]="China";
	  obj[2][3]="12728282";
	  obj[2][4]="jwsbdbdhbd";
	  
	  
	  return obj;
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
