package javaPractice;

import java.io.FileNotFoundException;

public class InheritanceDemo1 {
	
	//Final variable --> can not reassign the value
	//Final Method --> can not override
	//Final Class --> Can not extend it.
	final static int age = 22;
	
	public InheritanceDemo1() {
		System.out.println("COnstructor of Demo1 clas");
	}
	public InheritanceDemo1(String name) {
		System.out.println("COnstructor of Demo1 class - parameterized constructors");
	}

	public InheritanceDemo1(String name, int age) {
		System.out.println("COnstructor of Demo1 class - 2 parameterized constructors");
	}

	
	int accountNumber;
	int CIFnumber;
	String customerName;
	protected String city;

	final String bankName = "ABC Bank";
	
	public void calculateInterest() {
		//bankName = "XYZ Bank";
		System.out.println("calculateInterest method is called");
	}
	private void customerGenralInfo() {
		System.out.println("customerGenralInfo method is called");
	}
	
	protected void getBalance() {
		System.out.println("getBalance method is called");
	}
	
	public static void main(String[] args) {
	
	}

}
