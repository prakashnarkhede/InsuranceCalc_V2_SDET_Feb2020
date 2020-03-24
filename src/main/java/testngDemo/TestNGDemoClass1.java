package testngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemoClass1 {
	static WebDriver driver = null;
	
	@BeforeClass
	public void initializeExcel() {
		System.out.println("Doing Excel init, in before class annotation");
	}

	@BeforeMethod
	                                         
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 3, timeOut = 500, groups = {"regression"})
	public void PageTitleVerificationTest() {
		System.out.println("PageTitleVerificationTest executed");
		Assert.assertEquals(driver.getTitle(), "title");
	}
	
	@Test(enabled = true, priority = -1, groups = {"sanity", "regression"})
	public void PageURLVerificationTest() {
		System.out.println("PageURLVerificationTest executed");
		Assert.assertEquals(driver.getCurrentUrl(), "title");
	}
	
	@Test(priority = 5, groups = {"regression"}, description = "objective of test case")
	public void Test3() {
		System.out.println("Test 3 got executed");	

	}
	
	@Test(priority = 1, invocationCount = 2, groups = {"sanity"})
	public void Test1() {
		System.out.println("Test 1 got executed");	
	
	}
	
	@Test(priority = 2, groups = {"sanity", "regression"})
	public void Test2() {
	System.out.println("Test 2 got executed");	
	}
	
	//1. sanity group
	//2. regression group
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@AfterClass
	public void endTest() {
		System.out.println("Enging Test in After class annotaion");
	}
	
}
