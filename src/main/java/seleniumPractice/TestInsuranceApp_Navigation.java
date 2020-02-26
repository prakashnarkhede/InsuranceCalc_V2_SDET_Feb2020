package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInsuranceApp_Navigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup(); //set up driver executables
		
		WebDriver driver = new ChromeDriver();   // launch chrome browser
		driver.get("http://demo.automationtalks.com/"); // navigate
		driver.manage().window().maximize(); // maximize window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//navigation
		//refresh
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);

		//back
		driver.findElement(By.id("nav_truck")).click(); //click on other web elemenet
		Thread.sleep(4000);

		driver.navigate().back();  // come back to homepage again
		Thread.sleep(4000);

		//forword
		driver.navigate().forward(); // take me forward
		
	}

}
