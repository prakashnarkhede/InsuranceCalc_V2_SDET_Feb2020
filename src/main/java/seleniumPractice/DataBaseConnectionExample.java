package seleniumPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBaseConnectionExample {
	
	@Test
	public void readDBdata() throws ClassNotFoundException, Exception {
		
		//1. databsae url, credentaials, name of db, tables
		
		//2. register jdbc driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//3. opening connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/automationtalks", "automationtalks", "automationtalks");
		
		//4. Execute Query
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from student where Name='Deepak'");
		
		
		//5. Extract data from result set.
		
		while(rs.next()) {
			String title = rs.getString("TITLE");
			System.out.println("title is: "+title);
			
		}
		//6. cleaning up
		rs.close();
		stmt.close();
		conn.close();
	}

}
