package javaPractice;

public class PolymorphismDemo1 {
	static int noOfProducts = 10;
	int prodId;
	String ProdName;
	String Desc;
	

	public PolymorphismDemo1() {
	}

	
	//verify default data	
	public int verifyData() {
		System.out.println("method without any arg");
		return 0;
	}
	
	public void verifyData(String ProductName, String Description) {
		
		//1. Actual Data --> read from webpage --> getText()
		int no = 10;
		//2. Expected Data --> String ProductName, String Descriptio
		if(noOfProducts == no) {
			System.out.println("passed");
		}
		
		
		System.out.println("method with 2 arg");

	}

	public void verifyData(String ProductName, String Description, String ExpDate, String status) {
		System.out.println("method with 4 arg");

	}
	
	public void verifyData(int ProductId, String Description) {
		System.out.println("method with 2 arg (int)");

	}




	public static void main(String[] args) {
		PolymorphismDemo1 p1 = new PolymorphismDemo1();
		p1.verifyData();
		p1.verifyData(11, "Desc1");
		p1.verifyData("ProdctName", "Desc1");
		p1.verifyData("", "", "", "");

	}

}
