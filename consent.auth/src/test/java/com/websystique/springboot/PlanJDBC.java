package com.websystique.springboot;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



public class PlanJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		
		/*Properties prop =loadPropertiesFile();
		  //spring.datasource.url
		String url2 = prop.getProperty("spring.datasource.url");
		
		  String driver = prop.getProperty("JDBC.driver");
		  String url = prop.getProperty("JDBC.url");
		  String username = prop.getProperty("JDBC.username");
		  String password =prop.getProperty("JDBC.password");
	    */  
		  System.out.println(" read properties file and getting connection detail ");
		 
		  //System.out.println(" driver name is "+driver);
		  /*System.out.println(" url is "+url2);
		  System.out.println(" username is "+username);
		  System.out.println(" password is "+password);
		  */
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con = DriverManager.getConnection(
	                "jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
		  System.out.println("::: Connection Formed 1");
		  
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		   con = DriverManager.getConnection("jdbc:oracle:thin@127.0.0.1:1521:xe","system", "system");
		  												
		  System.out.println("::: Connection Formed 2");
		  
		}
		catch(Exception ex)
		{   ex.printStackTrace();
			System.out.println("::: Exception");
		}

	}

	public static Properties loadPropertiesFile() throws Exception
	{
		
		Properties prop = new Properties();
        InputStream in = new FileInputStream("application.properties");
        prop.load(in);
        in.close();
		return prop;
	}
}
