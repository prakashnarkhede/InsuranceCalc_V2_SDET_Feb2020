package seleniumPractice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class fileUploadeDemo2 {

	@Test
	public void checkLinks() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().window().maximize();

		//if upload webelement if do not have type = file, --> sendKeys will not work
	
		//go to insurant data page where we have image upload
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//not working
	//	WebElement picEle = driver.findElement(By.id("picture"));
	//	picEle.sendKeys("C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\ScreenShotsDemo\\table.jpg");

		//Ways to deal with file upload --> Sikuli / AutoIT ---> Robot class

		//click on open button
		driver.findElement(By.id("open")).click();
		Thread.sleep(2000);

		//copy the path to clipboard
		String str = "C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\ScreenShotsDemo\\table.jpg";
		StringSelection strSel = new StringSelection(str);

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		clipboard.setContents(strSel, null);
		
		//use robot class to do CTRL+V
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		
		
		//user robot class to hit Enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		
	}





}


