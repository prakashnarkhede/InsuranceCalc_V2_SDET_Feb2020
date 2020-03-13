package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo {
	
	@Test
	public void CheckDemo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().window().maximize();
		
		//click on next button --> to see radio button
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//select Male radio button
		//driver.findElement(By.xpath("//input[@id='gendermale']/parent::label")).click(); // not using because we want to make the xpath as generic
		
		//way 1
//		String hobbies = "Speeding;Other";
//		String[] arr = hobbies.split(";");
//		for(String str:arr) {
//			driver.findElement(By.xpath("//label[text()=' "+str+"']")).click();			
//		}
		
		//way 2
		
		List<WebElement> hobbiesEleList = driver.findElements(By.xpath("//label[text()='Hobbies']/following-sibling::p/label"));
																		//input[@name='Hobbies']/parent::label  --> this xpath can also be used
		String hobbies = "Speeding;Other";
		String[] arr = hobbies.split(";");
		
		for (String str : arr) {
			for (WebElement ele : hobbiesEleList) {
				if(ele.getText().equals(str)){
					ele.click();
				}
			}
		}
		
		
		
		
	}

}
