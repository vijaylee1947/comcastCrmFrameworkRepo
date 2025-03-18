package com.zoho.CRM.generic.dbUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDataFromDB {
	Connection connect = null;
	
	public void getRegisterttoDB() throws SQLException {
		try {
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		}catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public void getConnectiontoDB(String url, String username, String password) throws Throwable {
		
		try {
			connect = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}
	
public void getConnectiontoDBwithCredentials() throws Throwable {
		
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_data", "root", "root");
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public ResultSet executeQuery(String query) throws SQLException {
		Statement stmt = connect.createStatement();
		ResultSet result = stmt.executeQuery(query);
		return result;
	}

	public void updateQuery(String query) throws SQLException {
		try {
			Statement stmt = connect.createStatement();
			stmt.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}
	
	public void closeDB() throws Throwable {
		try {
			connect.close();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

}
