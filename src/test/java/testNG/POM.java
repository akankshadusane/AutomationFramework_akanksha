package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM {
	//POM - Page Object Model 
		//it is used to store xpath secured way 
	//private WebDriver d;
		
		//PARAMETERIZED CONSTRUCTOR IS ACTING LIKE A SETTER METHOD 
		 POM(WebDriver d)
		 {
			 PageFactory.initElements(d, this);
			 //PageFactory is predefined class from org.openqa.selenium package 
			 
		 }
		
		 //@FindBy is predefined annotations from org.openqa.selenium package
		 //it is used to store xpath inside the object of Webelement 
		 //@FindBy has its dependency on Webelement 
		 
		 @FindBy (xpath="//a[@id='open-login-modal']")
		 WebElement loginTab;
		 
		 @FindBy (xpath="//input[@id='username']")
		 WebElement username;
		 
		 @FindBy(xpath = "//input[@id='userpassword']")
		 WebElement password;
		 
		 @FindBy(xpath = "(//input[@class='login'])[1]")
		 WebElement LoginButton;
		 
		 
		 
		 
		 


}
