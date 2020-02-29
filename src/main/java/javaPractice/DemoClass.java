package javaPractice;

public class DemoClass {

	//User Defined
	//Ssytem Defined Methods

	final static int num3 = 10;

	//user defined Method
	//Non static method
	

	public void addition(int num1, int num2) {
		//actual method body
		System.out.println("In Addition Method");
		
		//num3 = 100;
		int sum = num1+num2;
		System.out.println("Addition is: "+sum);
	}

	
	public static void mul() {
		//actual method body
		System.out.println("In Multiplication Method");
		int num1 = 10;
		int num2 = 20;
		int mul = num1*num2;
		System.out.println("Multiplication is: "+mul);
	}

	
	

	//special type of method from where execution starts
	public static void main(String[] args) {

		//how to call method
		//create object / instance of class

		DemoClass obj1 = new DemoClass();
		obj1.addition(30, 60);
		
		DemoClass obj2 = new DemoClass();
		obj2.addition(200, 500);
	//	DemoClass obj2 = new DemoClass();
		//System.out.println("Num3 value is: "+DemoClass.num3);
		
		//1. Using static, No need to create object of the class
		//2. Memory saving
		//3. Static methods / variable is class specific (not instance / object specific)
	//	mul();

	}

}
