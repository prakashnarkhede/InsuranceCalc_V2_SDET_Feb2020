package javaPractice;

public class DBConnection {
	
	//3 diff databases

	static String ServerURL = "url.com";
	String DBName;
	String username;
	String password;
	
	public DBConnection(String DBName, String username, String password) {
		this.DBName= DBName;
		this.username = username;
		this.password = password;
	}
	
	public void connect() {
		System.out.println("connect- "+DBName);
		System.out.println("connect- "+username);
		System.out.println("connect- "+password);

	}
	public void readData() {
		System.out.println("connect- "+username);
		System.out.println("connect- "+password);
	}
	
	public static void main(String[] args) {

	}

}
