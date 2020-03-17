package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDemo {

	@Test
	public void checkLinks() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/frames/index.html");
		driver.manage().window().maximize();
		
		
//		WebElement electronicsEle = driver.findElement(By.id("ui-id-4"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(electronicsEle).perform();
		
//		WebElement dEle = driver.findElement(By.id("doubleClickBtn"));
//		Actions act = new Actions(driver);
//		act.moveToElement(dEle).doubleClick().build().perform();
		//act.doubleClick(dEle).perform();

		
//		WebElement dragEle = driver.findElement(By.id("draggable"));
//		WebElement dropEle = driver.findElement(By.id("droppable"));
//
//		Actions act = new Actions(driver);
//		act.dragAndDrop(dragEle, dropEle).perform();

		//driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/input")).sendKeys("");
	//	WebElement txtFiled = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/input"));
		Actions act = new Actions(driver);
	//	act.sendKeys(txtFiled, "Prakash").perform();
	
		act.sendKeys(Keys.END).perform();
		act.sendKeys(Keys.CONTROL, Keys.ARROW_DOWN).perform();
		
	}





}


