package com.websystique.springboot;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.ibatis.common.jdbc.ScriptRunner;

import ch.qos.logback.core.net.SyslogOutputStream;

/**
 *
 @author Dhinakaran Pragasam
 */
public class RunSqlScript {
	/**
	 * @param args
	 *            the command line arguments
	 */
	
	
	public static void main(String[] args) throws ClassNotFoundException,
		SQLException {
		
		

	/*	String aSQLScriptFilePath = "c://exportScript.sql";

		// Create MySql Connection
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/database", "username", "password");
		
		Connection con = DriverManager.getConnection(
                  "jdbc:oracle:thin:@9.42.158.21:1521/consmgmt", "consmgmt_UI", "cu8a$Mdev");

		Statement stmt = null;

		try {
			// Initialize object for ScripRunner
			ScriptRunner sr = new ScriptRunner(con, false, false);

			// Give the input file to Reader
			Reader reader = new BufferedReader(
                               new FileReader(aSQLScriptFilePath));

			// Exctute script
			sr.runScript(reader);
			//SyslogOutputStream

		} catch (Exception e) {
			System.err.println("Failed to Execute" + aSQLScriptFilePath
					+ " The error is " + e.getMessage());
		}*/
	}
}