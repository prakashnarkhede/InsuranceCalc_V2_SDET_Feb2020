package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	@Test
	public void checkLinks() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/SE-ESY/www.AutomationTalks.com/test/table-sort-search-demo.html");
		driver.manage().window().maximize();
		
		String name = "C. Kelly";
		String salary = driver.findElement(By.xpath("//table[@id='example']/tbody//td[text()='"+name+"']/following-sibling::td[5]")).getText();
		System.out.println("Salary of "+ name +" is: "+salary);
		
		//capture screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\ScreenShotsDemo\\table.jpg");
		FileUtils.copyFile(src, dest);
		
		driver.close();
		
	}





}


