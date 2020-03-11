package javaPractice;

import java.io.FileNotFoundException;

import org.openqa.selenium.chrome.ChromeDriver;

public class OverridingDemo2 extends OverridingDemo1 {


	public String add(int a, int b) {
		System.out.println("In OverridingDemo2 class, add method: "+ a +", "+b);
		return "";

	}
	
	public Integer add(int a, int b, int c) {
		System.out.println("In OverridingDemo1 class, add method: "+ a +", "+b+" + "+c);
		return 0;
	}
	
	protected Object mul(int a, int b) throws FileNotFoundException{
		System.out.println("In OverridingDemo1 class, mul method: "+ a +", "+b);
		return null;
	}
	
	
	
	public static void main(String[] args) {
		OverridingDemo2 d2 = new OverridingDemo2();
		d2.add(8, 9);
	//	d2.div();
		
		OverridingDemo1 d1 = new OverridingDemo1();
		d1.add(8, 10);
		
		OverridingDemo1 d3 = new OverridingDemo2(); //upcasting
		d3.add(9, 9);
		
	//	OverridingDemo2 d4 = new OverridingDemo1(); //not possible

	}

}
