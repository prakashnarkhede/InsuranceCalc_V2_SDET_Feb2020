package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInsuranceApp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); //set up driver executables
		
		WebDriver driver = new ChromeDriver();   // launch chrome browser
		driver.get("http://demo.automationtalks.com/"); // navigate
		driver.manage().window().maximize(); // maximize window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//writting actual code
		
	}

}
