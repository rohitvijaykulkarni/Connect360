package com.websystique.springboot;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class OracleJDBCExample {

    public static void main(String[] argv) {

        System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registered!");

        Connection connection = null;
        
        /*
         * <property name="hibernate.connection.password">cu8a$Mdev</property>
        <property name="hibernate.connection.url">jdbc:oracle:thin:@9.42.158.21:1521:consmgmt_UI</property>
        <property name="hibernate.connection.username">consmgmt_UI</property>
        <p
         */

        try {

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@9.42.158.21:1521/consmgmt", "consmgmt_UI", "cu8a$Mdev");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

}
