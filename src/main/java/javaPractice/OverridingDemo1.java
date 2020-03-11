package javaPractice;

import java.io.FileNotFoundException;

public class OverridingDemo1  {

	public Object add(int a, int b) {
		System.out.println("In OverridingDemo1 class, add method: "+ a +", "+b);
		return null;
	}
	
	public Object add(int a, int b, int c) {
		System.out.println("In OverridingDemo1 class, add method: "+ a +", "+b+" + "+c);
		return null;
	}
	
	protected Object mul(int a, int b) throws Exception{
		System.out.println("In OverridingDemo1 class, mul method: "+ a +", "+b);
		return null;
	}
	
	public void div() {
		System.out.println("div");
	}
	
	public static void main(String[] args) {

	}

}
