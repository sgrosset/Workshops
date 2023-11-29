package apps.salesApp.Accounts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import apps.salesApp.salesAppLibrary;

public class AccountsLibrary extends salesAppLibrary
{
    // Database information
        private String DBUserName = "sicolo";
        private String DBName = "SalesApp";

    // create our mysql database connection
        private String someDriver1 = "com.mysql.jdbc.Driver";            
        private String myDriver = someDriver1;

        private String myUrl = "jdbc:mysql://localhost/" + DBName;
        
    // Data Model 
        // This is the list of fields by table in the database
        private String DBTableName = "Accounts";    
            private String DBTableField1Name = "ID";
            private String DBTableField1Value = "default";
            private String DBTableField2Name = "NAME";
            private String DBTableField2Value = "default";
            private String DBTableField3Name = "ADDRESS";
            private String DBTableField3Value = "default";                    
    
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();           // ArrayList

    


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





    public String getDBTableName() {
        return this.DBTableName;
    }
    public void setDBTableName(String DBTableName) {
        this.DBTableName = DBTableName;
    }

    public String getDBTableField1Name() {
        return this.DBTableField1Name;
    }
    public void setDBTableField1Name(String DBTableField1Name) {
        this.DBTableField1Name = DBTableField1Name;
    }

    public String getDBTableField1Value() {
        return this.DBTableField1Value;
    }
    public void setDBTableField1Value(String DBTableField1Value) {
        this.DBTableField1Value = DBTableField1Value;
    }

    public String getDBTableField2Name() {
        return this.DBTableField2Name;
    }
    public void setDBTableField2Name(String DBTableField2Name) {
        this.DBTableField2Name = DBTableField2Name;
    }

    public String getDBTableField2Value() {
        return this.DBTableField2Value;
    }
    public void setDBTableField2Value(String DBTableField2Value) {
        this.DBTableField2Value = DBTableField2Value;
    }

    public String getDBTableField3Name() {
        return this.DBTableField3Name;
    }
    public void setDBTableField3Name(String DBTableField3Name) {
        this.DBTableField3Name = DBTableField3Name;
    }

    public String getDBTableField3Value() {
        return this.DBTableField3Value;
    }
    public void setDBTableField3Value(String DBTableField3Value) {
        this.DBTableField3Value = DBTableField3Value;
    }





    public ArrayList<Accounts> getAccountsList() {
        return this.AccountsList;
    }
    public void setAccountsList(ArrayList<Accounts> AccountsList) {
        this.AccountsList = AccountsList;
    }

    // Utility functions & methods
    
        // System-Mode
        // These methods will perform CRUDS into the database
        // TO BE USED CAREFULLY - BY System Admins ONLY

        public void getAllRecordsFromDBAccountsTable()    
        {    
            String CRMMode = "DBMode";
            
            try
            {                        
                // Connect to database
                Class.forName(getMyDriver());
                Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");
                            
                
                // SQL SELECT query.             
                String readAllRecordsquery = "SELECT * FROM " + getDBTableName();                        

                // create the java statement
                Statement st = conn.createStatement();
                
                // execute the query, and get a java resultset
                ResultSet rs = st.executeQuery(readAllRecordsquery);

                int TableRecordIndex = 0;
                while (rs.next())
                {
                    TableRecordIndex++;  
                    setDBTableField1Value(rs.getString( getDBTableField1Name() ));
                    setDBTableField2Value(rs.getString( getDBTableField2Name() ));
                    setDBTableField3Value(rs.getString( getDBTableField3Name() ));

                    // instance of Accounts class
                    Accounts NewAccountRecordValue = new Accounts(getDBTableField1Value(),                                                               
                                                                getDBTableField2Value(),                                                                
                                                                getDBTableField3Value());
                    ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();           // ArrayList
                    
                    NewAccountRecordValue.addToRecords(AccountsList,NewAccountRecordValue);          
                    
                    NewAccountRecordValue.showAllRecords(AccountsList);
                    System.out.println("\tAccounts Record Index: [" + TableRecordIndex + "]");
                }              
                System.out.println("---------------------------------------------------\n\n");  
                st.close();            
            }
            catch (SQLException ex)
            {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
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

        public void getRecordFromDBAccountsTableByID(int rowIndex)    
        {       
            String CRMMode = "CRMMode";
            
            try
            {            
                // Connect to database
                Class.forName(getMyDriver());
                Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");
                        
                String TableIndexfieldName = getDBTableField1Name();            
                String TablefieldName = getDBTableName();
                String TablefieldNewValue = "";

                // SQL SELECT query
                String readRecordByRowQuery = "SELECT * FROM " + getDBTableName() + 
                                            " WHERE " + TableIndexfieldName + " = " + rowIndex;                        

                // create the java statement
                Statement st = conn.createStatement();
                
                // execute the query, and get a java resultset
                ResultSet rs = st.executeQuery(readRecordByRowQuery);
                            
                int TableRecordIndex = 0;
                while (rs.next())
                {            
                    TableRecordIndex++;
                    setDBTableField1Value(rs.getString( getDBTableField1Name() ));
                    setDBTableField2Value(rs.getString( getDBTableField2Name() ));
                    setDBTableField3Value(rs.getString( getDBTableField3Name() ));

                    // instance of Accounts class
                    Accounts NewAccountRecordValue = new Accounts(getDBTableField1Value(),                                                               
                                                                getDBTableField2Value(),                                                                
                                                                getDBTableField3Value());                
                    
                    ArrayList<Accounts> AccountsList = new ArrayList<>();           // ArrayList

                    
                    NewAccountRecordValue.addToRecords(AccountsList,NewAccountRecordValue); 
                                                                    
                    NewAccountRecordValue.showAllRecords(AccountsList);
                    System.out.println("\tAccounts Record Index: [" + TableRecordIndex + "]");
                }                          
                st.close();            
            }
            catch (SQLException ex)
            {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
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

        public void deleteRecordFromDBAccountsTableByID(int rowIndex)    
        {        
            try
            {            
                // Connect to database
                Class.forName(getMyDriver());
                Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");

                String TableIndexfieldName = getDBTableField1Name();            
                String TablefieldName = getDBTableName();
                String TablefieldNewValue = "";
                boolean queryStatus = false;

                Accounts deletedAccountRecord = new Accounts();
                

                // (1) execute statement approach   
                    // A- Query building     
                    // String deleteRecordByRowQuery = "DELETE FROM " + getDBTableName()  + " WHERE " + TableIndexfieldName + " = " + rowIndex; 
                    // B- Create statement                                    
                    // Statement st = conn.createStatement();      
                    // C- Execute Statement               
                    // queryStatus = st.execute(deleteRecordByRowQuery);                     // delete Account record row in the database 
                    // IF execute() returns the boolean FALSE
                    //  THEN a query returned an INT value or returned NOTHING
                    //      HERE This IS the behaviour expected as we are DELETING from the ResultSet at index rowIndex !!!         
                    // ELSE IF execute() returns the boolean TRUE
                    //  THEN a ResultSet Object was returned
                    //      HERE This is NOT the behaviour expected as we are DELETING from the ResultSet at index rowIndex !!!
                    /*
                    if(queryStatus == false)     
                    {
                    System.out.println("\n" + 
                                        "============ ----***---- ===============================" +
                                        "\nSUCCESS ! -- Deleted table record at row ("+ rowIndex + ")");                                       
                    } else
                    {               
                    System.out.println("\n" + 
                                            "============ ----***---- ===============================" +                                        
                                            "\n<< ERROR >> -- Coult not delete table record at row ("+ rowIndex + ")");
                    }
                    */
                

                // (2) executeUpdate() statement approach
                    // A- Query building
                    // String deleteRecordByRowQuery = "DELETE FROM " + getDBTableName()  + " WHERE " + TableIndexfieldName + " = " + rowIndex;      
                    // B- Create statement                  
                    // Statement st = conn.createStatement(); 
                    // C- Execute Statement       
                    // int count = st.executeUpdate(deleteRecordByRowQuery);                               
                    /*
                    if(count>0)
                    {
                    System.out.println("\n" + 
                                        "============ ----***---- ===============================" +
                                        "\nSUCCESS ! -- Deleted table record at row ("+ rowIndex + ")");
                    } else
                    {               
                    System.out.println("\n" + 
                                            "============ ----***---- ===============================" +
                                            "\n<< ERROR >> -- Coult not delete table record at row ("+ rowIndex + ")");
                    }
                    */


                // (3) Prepared statement approach
                    // A- Query building
                    String deleteRecordByRowQuery = "DELETE FROM " + getDBTableName()  + " WHERE " + TableIndexfieldName + " = ?";                        
                    // B- Create statement
                    PreparedStatement preparedStmt = conn.prepareStatement(deleteRecordByRowQuery);
                    // C- Invoke statement with arguments
                    preparedStmt.setInt(1, rowIndex);
                    // D- Execute Statement
                    int count = preparedStmt.executeUpdate();
                    if(count>0)
                    {
                    System.out.println("\n" + 
                                        "============ ----***---- ===============================" +
                                        "\nSUCCESS ! -- Deleted table record at row ("+ rowIndex + ")");
                    } else
                    {               
                    System.out.println("\n" + 
                                            "============ ----***---- ===============================" +
                                            "\n<< ERROR >> -- Coult not delete table record at row ("+ rowIndex + ")");
                    }



                deletedAccountRecord.removeItemFromRecords(AccountsList, rowIndex);  // delete Account record row in the AccountsArrayList
                // st.close();  
                // preparedStmt.close();
                conn.close();
            }        
            catch (IndexOutOfBoundsException indexOutOfBoundsException)
            {
                // handle any errors
                System.out.println("IndexOutOfBoundsException: " + indexOutOfBoundsException.getMessage()); 

                indexOutOfBoundsException.printStackTrace();           
            }
            catch (SQLException sqlException)
            {
                // handle any errors
                System.out.println("SQLException: " + sqlException.getMessage());
                System.out.println("SQLState: " + sqlException.getSQLState());
                System.out.println("VendorError: " + sqlException.getErrorCode());

                sqlException.printStackTrace();
            }
            catch(ClassNotFoundException classNotFoundException) 
            {
                System.out.println("Error: unable to load driver class!");
                System.exit(1);

                classNotFoundException.printStackTrace();
            }
            catch (Exception exception)
            {
                System.err.println("Got an exception! ");
                System.err.println(exception.getMessage());

                exception.printStackTrace();
            }
        }

        public void updateRecordFromDBAccountsTableByID(int rowIndex, String TablefieldName, String TablefieldValue)    
        {        
            try
            {                        
                // Connect to database
                Class.forName(getMyDriver());
                Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");

                String TableIndexfieldName = getDBTableField1Name(); 
                boolean queryStatus = false;  
                String parsedRowIndex = String.valueOf(rowIndex);                                        

                // SQL SELECT query                                                
                String updatedRecordByRowQuery = "UPDATE " + getDBTableName()  +                                              
                                                " SET " + TablefieldName + " = ? " + 
                                                " WHERE " + TableIndexfieldName + " = ?";
                                                // " WHERE " + TableIndexfieldName + " = " + rowIndex;                        
                                                //" SET " + TablefieldName + " = " + TablefieldValue +

                // create the java statement
                // Statement st = conn.createStatement();
                PreparedStatement preparedStmt = conn.prepareStatement(updatedRecordByRowQuery);            
                preparedStmt.setString(1, TablefieldValue);            
                preparedStmt.setString(2, parsedRowIndex);            
                
                // execute the query, and get a java resultset            
                // queryStatus = st.execute(updatedRecordByRowQuery);                     // delete Account record row in the database                                

                // execute the java preparedstatement
                preparedStmt.executeUpdate();
                
                // st.close();  
                preparedStmt.close();
                conn.close();
            }        
            catch (IndexOutOfBoundsException ex)
            {
                // handle any errors
                System.out.println("IndexOutOfBoundsException: " + ex.getMessage());            
            }
            catch (SQLException ex)
            {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
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
