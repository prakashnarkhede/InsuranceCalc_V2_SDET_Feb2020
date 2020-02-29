package javaPractice;

public class readDBdata {

	public static void main(String[] args) {		
				
		ConstructorDemo db1 = new ConstructorDemo("DBname1", "User1", "Pass1");
		db1.createDBConnection();
		db1.readTableData();
		
		System.out.println("******************************************");
		
		ConstructorDemo db2 = new ConstructorDemo("DBname2", "User2", "Pass2");
		db2.createDBConnection();
		db2.readTableData();
		
		System.out.println("******************************************");

		
		ConstructorDemo db = new ConstructorDemo();
		db.createDBConnection();
		db.readTableData();
		
		
		
		System.out.println("******************************************");
		
		ConstructorDemo db3 = new ConstructorDemo("changedURL.com", "DBname3", "user3", "Pass3");
		db3.createDBConnection();
		db3.readTableData();
	}

}
