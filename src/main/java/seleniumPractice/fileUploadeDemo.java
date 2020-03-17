package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUploadeDemo {

	@Test
	public void checkLinks() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/keyboard-events/index.html");
		driver.manage().window().maximize();

		//if upload webelement if you have type = file, --> sendKeys will work
		
		WebElement uploadEle = driver.findElement(By.id("browseFile"));
		uploadEle.sendKeys("C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\ScreenShotsDemo\\table.jpg");
		
		//click on upload button
		driver.findElement(By.id("uploadButton")).click();
	}





}


