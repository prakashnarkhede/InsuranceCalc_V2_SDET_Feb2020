package javaPractice;

public class BreakLoopsKeyword {
	public static void main(String[] args) {

		//break --> break current loop and continue execution after loop
		
		int num = 2;
		while (num<=10) {
			System.out.println(num);
			if(num==8) {
				break; 
			}
			num++;
		}
		System.out.println("After while loop");
		
		System.out.println("**********************************");
		
		
		//continue --> skip execution for perticular case and contiune on next iteration of the loop
		// print number 2 to 10 excluding number 8
		int num3 = 2;
		while (num3<=10) {
			if(num3==8) {
				num3++;
				continue;
			}
			System.out.println(num3);
			num3++;
		}
		System.out.println("After while loop");
		
		
		//return keyword demo
		// return keyword --> return execution control to caller
		//    			  --> return the actual value
	
		BreakLoopsKeyword b1 = new BreakLoopsKeyword();
		String returnedValue = b1.method1();
		System.out.println("returnedValue is: "+returnedValue);
		
		
	}
	public String method1() {
		System.out.println("in method1, before return statement");
		String str = "Demo1";
		if(str.equalsIgnoreCase("demo")) {
			return "demo";
		}
		return "DemoReturn";
	}


}
