package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_homepageValidation {
	
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	
	public static void browserOpen()
	
	{
		System.out.println("Chrome browser launching");
		
		System.setProperty("webdriver.chrome.driver","C:\\DevOPs1\\MyProject\\forumAutomation\\digitalpoint\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test 
	
	public static void homepage()
	
	{
		driver.get("https://forum.digitalpoint.tech/");
		
	}

@AfterMethod

public static void closebrowser()

{
	//driver.close();
}



}



