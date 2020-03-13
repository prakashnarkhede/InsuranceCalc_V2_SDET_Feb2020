package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {
	
	@Test
	public void radioDemo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().window().maximize();
		
		//click on next button --> to see radio button
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//select Male radio button
		//driver.findElement(By.xpath("//input[@id='gendermale']/parent::label")).click(); // not using because we want to make the xpath as generic
		
		//way 1
		String gender = "Male";
		driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
		
	}

}
