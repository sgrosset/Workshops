package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import apps.SalesApp.Accounts.Accounts;

public class Database 
{ 
    // Database information
        private String DBUserName = "sicolo";
        private String DBName = "SalesApp";

    // create our mysql database connection
        private String someDriver1 = "com.mysql.jdbc.Driver";            
        private String myDriver = someDriver1;
        private String myUrl = "jdbc:mysql://localhost/" + DBName;
                

    // Getter & Setters
    public String getDBUserName() {
        return this.DBUserName;
    }
    public void setDBUserName(String DBUserName) {
        this.DBUserName = DBUserName;
    }

    public String getDBName() {
        return this.DBName;
    }
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    public String getSomeDriver1() {
        return this.someDriver1;
    }
    public void setSomeDriver1(String someDriver1) {
        this.someDriver1 = someDriver1;
    }

    public String getMyDriver() {
        return this.myDriver;
    }
    public void setMyDriver(String myDriver) {
        this.myDriver = myDriver;
    }

    public String getMyUrl() {
        return this.myUrl;
    }
    public void setMyUrl(String myUrl) {
        this.myUrl = myUrl;
    }



    // Utility functions & methods
    public void connectToDB()
    {
        try 
        {
            // Connect to database
            Class.forName(getMyDriver());
            Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");

        } 
        catch(ClassNotFoundException ex) 
        {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }   
    }
    
}