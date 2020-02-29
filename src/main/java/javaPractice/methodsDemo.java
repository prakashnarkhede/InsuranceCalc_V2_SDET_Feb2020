package javaPractice;

public class methodsDemo {

	//no return value- no arguments
	public void addition() {
		//actual method body
		System.out.println("In Addition Method");
		int num1 = 10;
		int num2 = 20;
		int sum = num1+num2;
		System.out.println("Addition is: "+sum);
	}
	
	//paramerised methods
	public void mul(int num1, int num2) {
		System.out.println("In mul method");
		int num3 = num1*num2;
		System.out.println("Mul is: "+num3  );
	}
	
	public int sub(int num1, int num2) {
		System.out.println("In sub method");
		int num3 = num1-num2;
		return num3;	
	}
	
	
	public static void main(String[] args) {
		methodsDemo  m  = new methodsDemo();
		m.addition();
		m.mul(2, 4);
		int subResult = m.sub(10, 3);
		System.out.println("subResult: "+subResult);
	}

}
