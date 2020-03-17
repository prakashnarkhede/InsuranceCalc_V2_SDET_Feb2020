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

public class AlertsHnadling {

	@Test
	public void checkLinks() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/AlertMessage/index.html");
		driver.manage().window().maximize();

		//click on button to generate alert
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		
		
		//handle alert
		// click on OK --> accept method
		//click on calcel --> dismis method
		// get text on alert --> gettext method
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		String alText = al.getText();
		System.out.println("Alert Text: "+alText);

		if(alText.equals("This is Alert Text here !!!!")) {
			al.accept();
			
		}else {
			al.dismiss();
		}

	}





}


