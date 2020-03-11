package javaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Abs1 {
	
	//constructor are supported in abstract classes, but we can not create an instance of the class

	public Abs1(String name) {
		System.out.println("ABS1 con");
		
	}

	//Abstract class--> does not contain method implementation
	//Abstract methods
	
	//abstracts methods + concrete method
	
	//abstracts methods
	public abstract void getInerestRate();
	
	public abstract void getRepoRate();
	
//	//Concrete methods
	public void MinBaanceReq() {
		System.out.println("Here are banks details");
	}
	
	
	public static void main(String[] args) {
		System.out.println("demo");
	}

}
