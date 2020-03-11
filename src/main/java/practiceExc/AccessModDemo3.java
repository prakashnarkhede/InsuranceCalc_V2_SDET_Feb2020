package practiceExc;

import javaPractice.AccessModDemo;

public class AccessModDemo3 extends AccessModDemo{

	AccessModDemo3 acc3 = new AccessModDemo3();
	AccessModDemo acc = new  AccessModDemo();
	
	public void demoMethod() {
		acc3.country = "Country1";
	}

	
	public static void main(String[] args) {
		//acc.name = "Prakash";
	//	acc3.country = "democountry";

	}

}
