package javaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ControlStatementsDemo {

	public static void main(String[] args) {
		WebDriver driver;
		
		String browser = "FF";
		
		if(browser.equals("FF")) {
			 driver = new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			System.out.println("Select correct browser type");
			System.exit(0);
		}
		
		//switch case demo
		switch (browser) {
		case "FF":
			 driver = new FirefoxDriver();
			break;
		case "chrome":
			 driver = new ChromeDriver();
			break;

		default:
			System.out.println("Select correct browser type");
			System.exit(0);
			break;
		}
	}

}
