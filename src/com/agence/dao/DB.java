package com.agence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB{
	private static Connection connection;
	public static Connection getConnection() throws SQLException {
		if(DB.connection == null ){
		 connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agencedb","papi","papi"); 
		}
		return connection;
	}
}
