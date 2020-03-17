package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import javaPractice.DemoClass;

public class FirstSeleniumTest {

	//Execution starts from main method
		public static void main(String[] args) {
			
			//start writting code --> Selenium + Java

			//specify browser driver--> chromedriver.exe
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\f1\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			
			//1. Launch Chrome Browser
			ChromeDriver driver = new ChromeDriver();

			//2. Navigate to AUT
			driver.get("http://demo.automationtalks.com/");

			//3. Verify Page Title
			String ExpectedPageTitle = "Fill Vehicle Data";
			//ActualPageTitle???
			String ActualPageTitle = driver.getTitle();
			File src1 =driver.getScreenshotAs(OutputType.FILE);
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(src1, new File("E:\\HSBC Documents/f1.jpg"));
				FileUtils.copyFile(src, new File("E:\\HSBC Documents/f.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ActualPageTitle); //syso
			
			if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle)) {
				System.out.println("Test Case Passed");
			} else {
				System.out.println("Test Case Failed");
			}

			//4. Close Browser
			driver.close();
		}

}
