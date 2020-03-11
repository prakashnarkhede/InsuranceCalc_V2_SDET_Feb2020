package javaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Abs4 extends Abs1{
	
	//constructor are supported in abstract classes, but we can not create an instance of the class

//	public Abs4() {
//		System.out.println("ABS1 con");
//		
//	}


	public Abs4(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	//	//Concrete methods
	public void MinBaanceReq() {
		System.out.println("Here are banks details");
		RemoteWebDriver driver = new ChromeDriver();
	}
	
	
	public static void main(String[] args) {
		Abs4 ab = new Abs4(null);
		System.out.println("demo");
	}


	@Override
	public void getInerestRate() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getRepoRate() {
		// TODO Auto-generated method stub
		
	}

}
