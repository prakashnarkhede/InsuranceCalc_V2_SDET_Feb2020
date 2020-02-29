package javaPractice;

public class ConstructorDemo {

	String DBserverURL= "url.com";
	String DBname;
	String UserName; 
	String Password;

	//constructor --> initialize class level variables
	// when object / instance of any class is created --> constructor get invoked

	// constructor is special method

	//create constructor --> name is same as class name, 2. no return type
	public ConstructorDemo(String name, String uName, String pass) {
		System.out.println("In parameterised constructor - 3 arg");
		DBname = name;
		UserName = uName;
		Password = pass;
	}
	
	public ConstructorDemo(String serverURL, String name, String uName, String pass) {
		DBserverURL = serverURL;
		DBname = name;
		UserName = uName;
		Password = pass;
	}

	//default constructor
	public ConstructorDemo() {

	}


	public void readTableData() {

		System.out.println("Started reading data from table: "+DBserverURL + " "+DBname + " "+UserName + " "+ Password);
	}

	public void createDBConnection() {
		System.out.println("Connecting to DB: "+DBserverURL + " "+DBname + " "+UserName + " "+ Password);

	}

}
