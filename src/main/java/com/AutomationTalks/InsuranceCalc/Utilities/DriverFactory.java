package com.AutomationTalks.InsuranceCalc.Utilities;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	//create private constructor so that no one can create instance of this class
	private DriverFactory() {
	}

	private static DriverFactory instance  =new DriverFactory();
	
	public static DriverFactory getInstance() {
		return instance;
	}
	
	//This class provides thread-local variables.
	//Each thread holds an implicit reference to its copy of a thread-local 
	//variable as long as the thread is alive and the 
	ThreadLocal<WebDriver> driver  = new ThreadLocal<WebDriver>();

	
	public WebDriver getDriver() throws InterruptedException {
		Thread.sleep(1000);
		return driver.get();  //Returns the value in the current thread's copy of this thread-local variable. 
	}

	public void setDriver(WebDriver driverParm) throws InterruptedException {
		Thread.sleep(1000);
		driver.set(driverParm); //Sets the current thread's copy of this thread-local variable to the specified value.
	}
	
	public void closeBrowsers() throws InterruptedException {
		Thread.sleep(1000);
		driver.get().close(); //get current driver instance and close it
		driver.remove(); //Removes the current thread's value for this thread-local variable.
	}
	
	
}
