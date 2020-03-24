package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	@Test
	public void checkLinks() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/automation-practice-switch-windows/index.html");
		driver.manage().window().maximize();

		//0. get current window id
		String baseWindow = driver.getWindowHandle();

		//1. click on new browser tab
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		
		//2. jump to newly opened window and perform some operations to it
		Set<String> windowSet = driver.getWindowHandles(); // set stores only unique values
		                                                   //no insertion seq is maintained
		
		System.out.println("windowSet: "+windowSet);
		System.out.println("baseWindow: "+baseWindow);
		String childWindow = null;
		for (String str : windowSet) {
			if(!str.equals(baseWindow)) {
				childWindow = str;
				break;
			}
		}
		
		//jump to child window
		driver.switchTo().window(childWindow);
		
		//perform some operations on child winodw
		driver.findElement(By.name("q")).sendKeys("Selenium.dev");
		Thread.sleep(4000);
		driver.findElement(By.name("btnK")).click();
		
		//jump to parent window
		driver.switchTo().window(baseWindow);
		
		//get the h1 title from base window
		System.out.println("h1 title is: "+driver.findElement(By.xpath("//h1")).getText());
		
		//driver.close --> will close only window on which driver is focused currently
		//driver.quit --> will close all the windows opened by driver instance
		
		driver.quit();
		
		//swith to last window --> jump to last tab using CTRL+9  (just do sendkeys using robot class)
		// CTRL+1  CTRL+2
	}
}


