package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	@Test
	public void checkLinks() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().window().maximize();
	
		//why JavaScriptExecutor
		   //--> It performs all operations like navigate, click, selectDropdown values ,findElement
		   // scrolling
		//when to javascriptExecutor
		   // JSE --> should be last preference
		//jse is an interface, having 2 methods which are implemented in RemoteWebDriver class
		WebElement NextBtn = driver.findElement(By.id("nextenterinsurantdata"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		   js.executeScript("arguments[0].click();", NextBtn);
		   String pageURL = (String) js.executeScript("return document.URL;");
		   System.out.println(pageURL);
	}
}
