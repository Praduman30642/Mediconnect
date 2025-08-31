package com.wecp.progressive.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class DatabaseConnectionManager {
private static final String File_Name="application.properties";
private static String url;
private static String user;
private static String password;
private static String driver;
private static void loadConfig() {
    try(InputStream input=DatabaseConnectionManager.class.getClassLoader().getResourceAsStream(File_Name)) {
        if(input==null){
            throw new RuntimeException("Configuration file not found: "+File_Name);

        }
        Properties props=new Properties();
        props.load(input);
        url=props.getProperty("db.url");
        user=props.getProperty("db.user");
        password=props.getProperty("db.password");
        driver=props.getProperty("db.driver");

        Class.forName(driver);


    }catch(Exception e){
        throw new IllegalStateException("Failed to load DB configuration",e);

    }
}
public static Connection getConnection() throws SQLException {
    if(url==null || user==null || password==null) {
        loadConfig();
    }
    return DriverManager.getConnection(url, user, password);
}
}
