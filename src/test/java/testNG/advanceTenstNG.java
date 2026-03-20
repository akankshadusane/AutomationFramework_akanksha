package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class advanceTenstNG {

	WebDriver d;
	String url= "https://biodataking.com/";
	
	
	@Test (priority=1)
	public void setup() {
		System.out.println("Before Suite");
		  d=new ChromeDriver();
		  d.get(url);
		  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		}
	
	@Test (priority=2, invocationCount = 3) //so it will run 3 times
	public void loginform_automate() throws InterruptedException {
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
	@Test (priority=3)
	public void mousehover_automate() throws InterruptedException {
		Actions a= new Actions(d);
		a.moveToElement(d.findElement(By.xpath("//a[@id='open-login-modal']"))).perform();
		 Thread.sleep(100);
		 a.moveToElement(d.findElement(By.xpath("(//a[contains(.,'Register FREE')])[1]"))).perform();
		 Thread.sleep(100);
		 a.moveToElement(d.findElement(By.xpath("(//a[contains(.,'Profiles eBook')])[1]"))).perform();
		 Thread.sleep(100);
		 a.moveToElement(d.findElement(By.xpath("(//a[contains(.,'Home')])[1]"))).perform();
		 Thread.sleep(100);
	}
	
	
	
}
