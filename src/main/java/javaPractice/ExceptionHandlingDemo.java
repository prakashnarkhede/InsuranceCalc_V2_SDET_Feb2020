package javaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class ExceptionHandlingDemo {
	
	
	public void throwsKeyWordDemoMethod1() throws FileNotFoundException {
		FileReader file = new FileReader("C:\\de.txt");

	}
	ExceptionHandlingDemo demo = new ExceptionHandlingDemo();

	public void throwsKeyWordDemoMethod2() throws FileNotFoundException {
		demo.throwsKeyWordDemoMethod1();
	}
	public void throwsKeyWordDemoMethod3() throws FileNotFoundException {
		demo.throwsKeyWordDemoMethod2();
	}
	
	public void throwExceptionManually() throws Exception {
		int age = 17;
		if(age < 18) {
			throw new Exception("Sorry, you are not eligible");
		}
	}
	
	//compile time (Checked Exception)
	// --1. Using try - catch handle exception
	// --2. Pass the exception to the caller so that he can handle --> throws keyword
	public void readFile() throws IOException {
		File testDataFile = new File("??//completepath//testData.xlsq");
		FileInputStream fis1 = null;
		try {
			 fis1 = new FileInputStream(testDataFile);
			fis1.read();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis1.close();
		}
	}
	
	
	
	
	
	
	public void readTextFile() {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			FileReader file = new FileReader("C:\\de.txt");
	//	} catch (FileNotFoundException | ArithmeticException e) {
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block is executed");
		}
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		ExceptionHandlingDemo e1 = new ExceptionHandlingDemo();
		e1.throwsKeyWordDemoMethod3();
		e1.readTextFile();
		//e1.readFile();

			int a = 10;
			int b = 0;
			
			
			try {
				int c = a/b;				
			} catch(ArithmeticException e) {
				System.out.println("Can not devide by Zero");
			}
			
			System.out.println("Hello");
	}

}
