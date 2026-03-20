package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClaass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://biodataking.com/");
		Thread.sleep(2000);
		
		
		POM p=new POM(d);
		
		p.loginTab.click();
		
		p.username.sendKeys("abcd.xyz@gmail.com");
		
		p.password.sendKeys("123455");
		
		p.LoginButton.click();
		

	}

}
