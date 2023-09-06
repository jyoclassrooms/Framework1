package Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Webbase 
{
	public WebDriver driver=null;

	@BeforeTest
	public void dbconnect()
	{
		System.out.println("connect to db");
	}
	@AfterTest
	public void db_destroy()
	{
		System.out.println("close to db");
	}
	
	
	@BeforeClass
	void configure_chrome()
	{		
		System.out.println("before class");	
	}
	@AfterClass
	void close_chrome()
	{
		//driver.quit();
		System.out.println("after class");
	}
	
	
	@BeforeMethod
	public void login()
	{
//		driver=new ChromeDriver();
//		driver.get("http://127.0.0.1/login.do");
		System.out.println("before method");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("After method");
		//driver.findElement(By.className("logout")).click();
	}
}
