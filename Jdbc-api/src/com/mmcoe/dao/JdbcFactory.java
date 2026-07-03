//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.SQLException;
package com.mmcoe.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public final class JdbcFactory {
	private JdbcFactory() {
	}
	public static Connection getConnection() throws SQLException {

	    Properties prop = new Properties();

	    try (FileReader reader = new FileReader("src/mysql.info")) {

	        prop.load(reader);

	        String url = prop.getProperty("url");

	        Class.forName(prop.getProperty("driver"));

	        return DriverManager.getConnection(
	                url,
	                prop.getProperty("user"),
	                prop.getProperty("pass")
	        );

	    } catch (ClassNotFoundException | IOException e) {
	        throw new SQLException("Error initializing DB connection", e);
	    }
	}

}
