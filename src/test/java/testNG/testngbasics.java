package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testngbasics {
	
	/*
	TestNG is base framework 
	TestNG does not have java main method 
	TestNG has its own main method 
	
	@Test
	public void f()
	{
	//TestNG main method 
	}
	
	TestNG are of 2 types:-
	1.CLASSIC TestNG
	2.Advanced TestNG
	
	Annotations are concept where it control flow of execution of method 
	Annotations has its dependency with method 
	Annotations are always written above the method 
	
Classic	TestNG sequence of execution:- 
Before Suite 
Before Test
Before Class
Before Method
Main method
After Method
After Class
After Test
After Suite
	
	
	 */
	
	WebDriver d;
	String url="https://biodataking.com/";
	
	
  @Test
  public void f() {
	  System.out.println("Main method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass 
  public void MouseHover_Automate() throws InterruptedException {
	  System.out.println("Before Class");
	  
	  Actions a=new Actions(d);
	  
	  String m[]=new String[4];
	  m[0]="//a[@id='open-login-modal']";
	  m[1]="(//a[contains(.,'Register FREE')])[1]";
	  m[2]="(//a[contains(.,'Profiles eBook')])[1]";
	  m[3]="(//a[contains(.,'Home')])[1]";
	  
	  //          1< 4
	  for(int i=0;i<m.length;i++)
	  {
		  //                                  m[1]
	   a.moveToElement(d.findElement(By.xpath(m[i]))).perform();
	   Thread.sleep(1000);
	  }
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void LoginForm_Automate() throws InterruptedException {
	  System.out.println("Before Test");
	  
	  d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("123456");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("(//input[@class='login'])[1]")).click();
	  Thread.sleep(2000);
	  d.navigate().refresh(); //it will refresh the page
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void Setup() {
	  System.out.println("Before Suite");
	  d=new ChromeDriver();
	  d.get(url);
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	  
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
