package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager{
	public static Connection getConnection() throws ClassNotFoundException, SQLException  {
		Properties prop = null;
		try {
			prop = loadPropertiesFile();
		} 
		catch (Exception e) {
			e.getMessage();
		}
		Class.forName(prop.getProperty("driver"));	
		Connection con = null;
		con =DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));	
		return con;
	}
		
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);in.close();
		return prop; 
	} 	

}