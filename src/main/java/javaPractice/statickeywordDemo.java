package javaPractice;

import org.apache.commons.lang3.StringUtils;

public class statickeywordDemo {

	//bank -- generate report
	static String BankName;
	static String ReportName;
	static int intRate;
	String customerName;
	int AccountNumer;
	int AccountBalance;
	
	
	public void gernerateReport() {
		
		System.out.println("              "+ BankName + "                      ");
		System.out.println("              "+ ReportName + "                      ");
		System.out.println();
		System.out.println("customerName: "+customerName);
		System.out.println("AccountNumer: "+AccountNumer);
		System.out.println("AccountBalance: "+AccountBalance);


	}
	
	public static void main(String[] args) {
		
		statickeywordDemo.BankName = "XYZ Bank";
		statickeywordDemo.ReportName = "Monthly Report";
		
		statickeywordDemo customer1 = new statickeywordDemo();
		customer1.customerName = "Robert";
		customer1.AccountNumer = 111;
		customer1.AccountBalance = 100;
		
		
		System.out.println("*******************************************");
		
		statickeywordDemo customer2 = new statickeywordDemo();
		
		customer2.customerName = "prakash";
		customer2.AccountNumer = 222;
		customer2.AccountBalance = 200;
		
		customer1.gernerateReport();
		customer2.gernerateReport();
	}

}
