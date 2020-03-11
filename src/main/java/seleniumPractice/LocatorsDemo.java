package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.automationtalks.com/");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
//		WebElement cylCap = driver.findElement(By.id("cylindercapacity"));
//		cylCap.clear();
//		cylCap.sendKeys("333");
		
//		driver.findElement(By.
//				xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//	}
		//find webelement via linkText
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.partialLinkText("Log")).click();
	
		//Xpath 
		//driver.findElement(By.xpath("//a[@href='/login']"))
		
		
	}
}
