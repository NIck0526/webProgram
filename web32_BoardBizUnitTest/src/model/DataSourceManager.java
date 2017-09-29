package model;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import config.OracleInfo;

/*
 * 
 */
public class DataSourceManager {
	private Connection conn;
	private static DataSourceManager instance = new DataSourceManager();
	private DataSourceManager() {
		try {
			Class.forName(OracleInfo.DRIVER);
			System.out.println("Driver Loading...");
			
			conn = DriverManager.getConnection(OracleInfo.URL,"hr","hr");
			System.out.println("db Connection.....");
		}catch(Exception e) {
			
		}
		
		
	}	
	public static DataSourceManager getInstance() {
		return instance;
	}
	//Ãß°¡
	public Connection getConnection() {
		return conn;
	}
	
	
}
