package zohoCRMGUIFramwWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class readDataFromDB1 {
	
	@Test
	
	public void getdatafromdbTest() throws SQLException {
		
		Connection connt=null;
		try {
		//register/ load to db
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		// connect to db
		 connt= DriverManager.getConnection("jdbc:mysql://localhost:3306/students_data", "root", "root");
	
		// create statement
		Statement stamt=connt.createStatement();
		
		//update query
		stamt.executeUpdate("insert into stddetails values('lisa','mini')");
		
		//execute query
		ResultSet result= stamt.executeQuery("select * from stddetails");
		
		System.out.println(result);
		
		while(result.next()) {
			System.out.println(result.getString(0)+"\t"+result.getString(1));
		}
	}catch (Exception e) {
			//close db
			connt.close();
		}
		
	}

}
