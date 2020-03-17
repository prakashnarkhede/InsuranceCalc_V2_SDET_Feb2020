package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckIfAllLinksAreWOrking {
	
	@Test
	public void checkLinks() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//1. Get all links -- using tagname = a
		List<WebElement> listEle = driver.findElements(By.tagName("a"));
		
		//2. how many total number of links? 
		int no_OF_Links = listEle.size();
		System.out.println("no_OF_Links: "+no_OF_Links);
		
		for(WebElement ele : listEle) {
			String curentUrl = ele.getAttribute("href");
			//3. check status of each link
			URL url = new URL(curentUrl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
		int respCode =	conn.getResponseCode(); //if response code is not 200, then not working
		System.out.println(respCode);
		Assert.assertEquals(respCode, 200, "resp code is not mathcing for url: "+curentUrl);
		}
		
		
		
		
			
	}

}
