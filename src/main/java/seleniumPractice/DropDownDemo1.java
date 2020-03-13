package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo1 {
	

	@Test (enabled = false)
	public void selectNormalDropdown() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().window().maximize();
		
		
		//Dropdown is coded using select tag --> Use Select Class from Selenium API
		WebElement makeEle = driver.findElement(By.id("make"));  //location of DD	
		Select makeDD = new Select(makeEle); //object of Select class for Make dropdown
		
		//0. get all options from dropdown
		List<WebElement> l1 = makeDD.getOptions();
		System.out.println("No of options in dd: "+l1.size());
		System.out.println("l1 is: "+l1);
			for(WebElement ele : l1 ) {
				System.out.println("Data from Make dd is: "+ele.getText());
			}
		
		//1. Select by visible Text
		makeDD.selectByVisibleText("BMW");
		
		
		//2. Select by value
		WebElement modelEle = driver.findElement(By.id("model"));
		Select modelDD = new Select(modelEle);
		modelDD.selectByValue("Scooter");
		
		//3. Select by index
		WebElement numberofseatsEle = driver.findElement(By.id("numberofseats"));
		Select numberofseatsDD = new Select(numberofseatsEle);
		numberofseatsDD.selectByIndex(5);
	}
	
	@Test (enabled = false)
	public void jQueryDDHandling() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
		driver.manage().window().maximize();
		
		//Select class code is not working because DD is coded in Jquery
//		WebElement salutationEle = driver.findElement(By.id("salutation"));
//		Select os = new Select(salutationEle);
//		os.selectByIndex(1);
		
		//1. Click on DD
		String valueToBeSelected = "Dr.";
		driver.findElement(By.id("salutation-button")).click();
		//2. Click on respective option
		driver.findElement(By.xpath("//ul[@id='salutation-menu']//div[text()='"+valueToBeSelected +"']")).click();
	}
	
	@Test (enabled = false)
	public void multiselectDDExmaple() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/DemoQAapplication/DemoQa/demoqa.com/selectmenu/index.html");
		driver.manage().window().maximize();
		
		
		//1. WebElement for select class
		WebElement mulDD = driver.findElement(By.id("selenium_suite"));
		
		//2. Creat object of select class
		Select os = new Select(mulDD);
		
		String valueToBeSelected = "Selenium IDE;Selenium WebDriver;Selenium Grid";
		String[] arr = valueToBeSelected.split(";");
		
//		for(int i = 0; i <arr.length; i++) {
//			//3. Select multiple values
//			os.selectByVisibleText(arr[i]);
//			
//		}
		for (String str : arr) {
			os.selectByVisibleText(str);
		}
		
		//DeSelect value from multiselect dropdown
		os.deselectByVisibleText("Selenium WebDriver");
		
		//how to check if dd is multselect? 
		os.isMultiple();  // returns true if dropdown is multiselect
	}
	
	public void selectmethod(WebElement ele, String value) {
		Select os = new  Select(ele);
		os.selectByVisibleText(value);
	}
	
	@Test
	public void smartBearDDdemo() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/register?returnurl=%2fsamples%2fTestComplete14%2fsmartstore");
		driver.manage().window().maximize();
		
		WebElement DateOfBirthDayEle = driver.findElement(By.name("DateOfBirthDay"));
		WebElement DateOfBirthMonthEle = driver.findElement(By.name("DateOfBirthMonth"));
		WebElement DateOfBirthYearEle = driver.findElement(By.name("DateOfBirthYear"));

//		Select os = new  Select(DateOfBirthDayEle);
//		os.selectByVisibleText("3");
		DropDownDemo1 d = new DropDownDemo1();
		d.selectmethod(DateOfBirthDayEle, "3");
		d.selectmethod(DateOfBirthMonthEle, "May");
		d.selectmethod(DateOfBirthYearEle, "1910");

	}
	

}
