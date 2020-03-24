package testngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemoClass2 {
	//WebDriver driver = null;


	@Test(priority = 3, timeOut = 500, groups = {"regression"})
	@Parameters("browser")                                           
	public void PageTitleVerificationTest(String browser) {
		System.out.println("Browser value is : "+browser);
		System.out.println("PageTitleVerificationTest executed");
	}
	
	@Test(enabled = true, priority = -1, groups = {"sanity", "regression"})
	public void PageURLVerificationTest() {
		System.out.println("PageURLVerificationTest executed");
	}
	
	@Test(priority = 5, groups = {"regression"})
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

}
