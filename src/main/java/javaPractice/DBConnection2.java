package javaPractice;

public class DBConnection2 {
	
	//3 diff databases
	public static void main(String[] args) {
		DBConnection db1 = new DBConnection("DB1", "user1", "pass1");
		db1.connect();
		db1.readData();
		
		DBConnection db2 = new DBConnection("DB2", "user2", "pass2");
		db2.connect();
		db2.readData();

	}

}
