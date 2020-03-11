package javaPractice;

public class DataTypesDemo {

	public static void main(String[] args) {

		//1. Primitive Data type
			// very basic data types
			//They store only single values
			// byte, char, int, float, 
			// they contain actual data (not a reference only)
		
		int a = 10;
		int b = 10;
		
		
		if(a==b) {
			System.out.println("int - True");
		} else {
			System.out.println("int  - False");
		}
		
		char c = 'A';
		long mobileNumber = 8888;
		
		
		//2. Non Primitive data type
			// it is derived from primitive data types
			//store multiple values
		
			//It is reference type  as it  references a memory location where data is stored
			//rather than directly storing value
			//Arrays, List, classes
		
		//variablesDemo demo = new variablesDemo();
	//	Integer c = new Integer(10);
		String str1 = "demo";
		String str2 = new String("demo");
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);

		if(str1.equals(str2)) {  // str1 == str2 not working
			System.out.println("string - true");
		} else {
			System.out.println("string - false");
		}
		
	}

}
