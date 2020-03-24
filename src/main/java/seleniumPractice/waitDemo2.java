package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitDemo2 {

	@Test
	public void checkLinks() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/WebDriverWait%20Demo/practice/wait.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.findElement(By.id("alert")).click(); // create alert after 5 sec
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
		
		FluentWait fw = new FluentWait(driver);
		fw.withTimeout(Duration.ofSeconds(20));
		fw.pollingEvery(100, TimeUnit.MILLISECONDS);
		fw.ignoring(NoSuchFieldError.class);
		fw.withMessage("message?????");
		
	//	fw.until(ExpectedConditions.alertIsPresent())
		
		
	
	}
}


