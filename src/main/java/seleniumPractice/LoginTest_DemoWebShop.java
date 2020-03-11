package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest_DemoWebShop {
	
	@Test
	public void loginTestCheck() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   // maximize browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait - part of synchronization
		
		driver.get("http://demowebshop.tricentis.com/"); // navigate to AUT
		
		driver.findElement(By.linkText("Log in")).click(); // click on login link
		
		
		driver.findElement(By.id("Email")).sendKeys("dem123@dem123.com");
		driver.findElement(By.name("Password")).sendKeys("dem123@dem123.com");
		
		driver.findElement(By.xpath("//input[@type='submit' and @value = 'Log in']")).click();
		
		
		String accountName = driver.findElement(By.xpath("//div[@class='header-links']//a[@href='/customer/info']")).getText();
		
		String logoutText = driver.findElement(By.xpath("//a[@href='/logout']")).getText();
		
//		if(accountName.equals("dem123@dem123.com")) {
//			System.out.println("TC passed");
//		} else {
//			System.out.println("failed");
//		}
	
		//Hard Assert
//		Assert.assertEquals(accountName, "dem123@dem123.com1", "Account Names are not matching");    // testng API
//		Assert.assertEquals(logoutText, "Log out1", "Logout Text is not matching");

		//SoftAssert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(accountName, "dem123@dem123.com1", "Account Names are not matching");
		sa.assertEquals(logoutText, "Log out1", "Logout Text is not matching");
		sa.assertAll();
		
		driver.close();
		
		
//		1. Hard Assert 
//		   --> terminate execution immediatly if any assertion fails
//		   --> should be used only if you have one assert in TC
//		   Assert.AssertEquals();
//		
//		2. Soft Assert
//		--> does not terminate execution immediatly if any assertion fails
//		--> continues and execute all assertion
//	   --> should be used only if you have multiple assert in TC
//		
//		SoftAssert sa = new SoftAssert();
//		sa.AssertEquals();
//		sa.AssertEquals();
//		sa.AssertEquals():
//		
//		sa.AssertAll();
	}
	
}
