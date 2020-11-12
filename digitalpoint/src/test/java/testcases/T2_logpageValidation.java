package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_logpageValidation {
	
	
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
	
	public static void loginpage()
	
	{
		driver.get("https://forum.digitalpoint.tech/user/index.php/login");
		
		
		
		
		
	}

@AfterMethod

public static void closebrowser()

{
	//driver.close();
}



}


