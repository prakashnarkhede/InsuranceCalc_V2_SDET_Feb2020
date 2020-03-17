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

public class framesDemo {

	@Test
	public void checkLinks() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html");
		driver.manage().window().maximize();

		//send text to TOPIC
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Prakash");
		
		
		//identify if there is any frame
		//switch to frame
		driver.switchTo().frame("frame3");
		
		//perform the operations on frame
		//click on checkBox
		driver.findElement(By.id("a")).click();
		
		//switch back to parent
		driver.switchTo().parentFrame();
		
		//get main page text
		String pageHeader = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(pageHeader);
	}





}


