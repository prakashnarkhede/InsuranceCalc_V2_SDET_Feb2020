package javaPractice;

public class InheritanceDemo2 extends InheritanceDemo1{
	//generating report
	// account number, cust name
	
	//super --> Object ref of parent class / super class
	//this --> Object ref of currnet class

	//constructor
		public InheritanceDemo2(String str) {
		//	super("Prakash");
		//	super("Prakash", 4);
			System.out.println("Constructor of Demo2 class");
		}




	public void getReport() {
		System.out.println(accountNumber);
		System.out.println(city);

		System.out.println(age);
	//	age=23;
	}	
	
	
	
	public static void main(String[] args) {
		InheritanceDemo2 d2 = new InheritanceDemo2("demo");

		d2.calculateInterest();
		//d2.customerGenralInfo();
		d2.getBalance();
		
	}

}
