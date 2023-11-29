package apps.SalesApp.Accounts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import apps.SalesApp.SalesAppLibrary;





/**
 * Class Manifest:
 *      Global Variables:
 *          [primitives]  
 *              static DBUserName: String
                static DBName: String
                static someDriver: String
                static myDriver: String
                static myUrl: String
 *          [objects] 
 *              AccountsList: ArrayList<Accounts>
 *      Methods:
 *          Constructors:
 *                  [primitives]                      
 *                  [objects] 
 *          Getters & Setters: 
 *              ArrayList<Accounts> getAccountsList() 
 *              void setAccountsList(ArrayList<Accounts> AccountsList)                               
 *          Helpers:
 *              String toString()
 *                  [primitives]
 *                  [objects] 
 *          Utilities:
 *              void getAllRecordsFromDBAccountsTable(Accounts SomeAccount)
 *                  [primitives]
 *                      readAllRecordsquery: String
 *                      tableRecordIndex: int
 *                  [objects]
 *                      Conn: Connection
 *                      Stmt: Statement
 *                      ResSet: ResultSet    
 *                      NewAccountRecordValue: Accounts
 *                      AccountsList: ArrayList<Accounts>
 *                      SQLex: SQLException
 *                      ClassNotFoundEx: ClassNotFoundException
 *                      Ex: Exception
 */
public class AccountsLibrary extends SalesAppLibrary 
{
    /* CLASS METHOD STRUCTURE TEMPLATE
        public void myMethod()
        {
            //  variable
                // primitives                                        
                // objects
            // logic
                // presentation
                // Inputs
                // Processing
                // Validations
                // Exceptions            
                // Outputs  
                // Cleanup
                // Returns 
        }
     */


    // Variables
        // Primitives 
            // Database information
            static String DBUserName = "sicolo";
            static String DBName = "SalesApp";
            // create our mysql database Connection
            static String someDriver = "com.mysql.jdbc.Driver";            
            static String myDriver = someDriver;
            static private String myUrl = "jdbc:mysql://localhost/" + DBName;
            // static String myUrl = "jdbc:mysql://localhost:3306/" + DBName + "?autoReconnect=true&useSSL=false";
        // Objects
            ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();    // instance of ArrayList class   
    // CONTROLLERS
        // Getters & Setters
        public ArrayList<Accounts> getAccountsList() 
        {
            return this.AccountsList;
        }
        public void setAccountsList(ArrayList<Accounts> AccountsList) 
        {
            this.AccountsList = AccountsList;
        }
        // Utilities
        public void getAllRecordsFromStaticAccountsTable(Accounts SomeAccount)
        {
            //  variable
                // primitives 
                    int tableRecordIndex = 0;                                       
                // objects
                    Accounts NewAccountRecordValue = new Accounts();
                    ArrayList<Accounts> AccountsList = new ArrayList<Accounts>(); 
            // logic
                // presentation
                // Inputs
                // Processing
                    NewAccountRecordValue.setDBTableField1Value( SomeAccount.getDBTableField1Value() );
                    NewAccountRecordValue.setDBTableField2Value( SomeAccount.getDBTableField2Value() );
                    NewAccountRecordValue.setDBTableField3Value( SomeAccount.getDBTableField3Value() );
                    
                    NewAccountRecordValue.addToRecords(AccountsList,NewAccountRecordValue);          
                // Validations 
                // Exceptions
                // Outputs  
                    NewAccountRecordValue.showAllRecords(AccountsList);
                    System.out.println("\tAccounts Record Index: [" + tableRecordIndex + "]");
                // Cleanup
                // Returns                 
        }
        public void getAllRecordsFromDBAccountsTable(Accounts SomeAccount)    
        {             
            //  variable
                // primitives                                        
                // objects
            // logic
                // presentation
                // Inputs
                // Processing
                // Validations                                   
                try
                {                        
                    // Connect to database
                    Class.forName(myDriver);
                    Connection Conn = DriverManager.getConnection(myUrl, DBUserName, "Scu96spg@2023");
                                                    
                    // SQL SELECT query.             
                    String readAllRecordsquery = "SELECT * FROM " + SomeAccount.getDBTableName();                        

                    // create the java statement
                    Statement Stmt = Conn.createStatement();
                    
                    // execute the query, and get a java resultset
                    ResultSet ResSet = Stmt.executeQuery(readAllRecordsquery);

                    int tableRecordIndex = 0;
                    while (ResSet.next())
                    {
                        tableRecordIndex++;  
                        SomeAccount.setDBTableField1Value(ResSet.getString( SomeAccount.getDBTableField1Name() ));
                        SomeAccount.setDBTableField2Value(ResSet.getString( SomeAccount.getDBTableField2Name() ));
                        SomeAccount.setDBTableField3Value(ResSet.getString( SomeAccount.getDBTableField3Name() ));

                        // instance of Accounts class
                        Accounts NewAccountRecordValue = new Accounts(SomeAccount.getDBTableField1Value(),                                                               
                                                                        SomeAccount.getDBTableField2Value(),                                                                
                                                                        SomeAccount.getDBTableField3Value() );
                        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();           // ArrayList
                        
                        NewAccountRecordValue.addToRecords(AccountsList,NewAccountRecordValue);          
                        
                        NewAccountRecordValue.showAllRecords(AccountsList);
                        System.out.println("\tAccounts Record Index: [" + tableRecordIndex + "]");
                    }              
                    System.out.println("---------------------------------------------------\n\n");  
                    Stmt.close();            
                }
                // Exceptions                                
                catch (SQLException SQLex)
                {
                    // handle any errors
                    System.out.println("SQLException: " + SQLex.getMessage());
                    System.out.println("SQLState: " + SQLex.getSQLState());
                    System.out.println("VendorError: " + SQLex.getErrorCode());
                }
                catch(ClassNotFoundException ClassNotFoundEx) 
                {
                    System.out.println("Error: unable to load driver class!");
                    System.exit(1);
                }
                catch (Exception Ex)
                {
                    System.err.println("Got an exception! ");
                    System.err.println(Ex.getMessage());
                    Ex.printStackTrace();
                }    
                // Outputs  
                // Cleanup
                // Returns                   
        } 
        public void getRecordFromDBAccountsTableByID(Accounts SomeAccount, int rowIndex)    
        {       
            //  variable
                // primitives                                        
                    String TableIndexfieldName = SomeAccount.getDBTableField1Name();                                
                // objects
            // logic
                // presentation
                // Inputs
                // Processing
                // Validations                                        
                try
                {            
                    // Connect to database
                    Class.forName(myDriver);
                    Connection Conn = DriverManager.getConnection(myUrl, DBUserName, "Scu96spg@2023");                                                

                    // SQL SELECT query
                    String readRecordByRowQuery = "SELECT * FROM " + SomeAccount.getDBTableName() + 
                                                " WHERE " + TableIndexfieldName + " = " + rowIndex;                        

                    // create the java statement
                    Statement st = Conn.createStatement();
                    
                    // execute the query, and get a java resultset
                    ResultSet rs = st.executeQuery(readRecordByRowQuery);
                                
                    int tableRecordIndex = 0;
                    while (rs.next())
                    {            
                        tableRecordIndex++;
                        SomeAccount.setDBTableField1Value(rs.getString( SomeAccount.getDBTableField1Name() ));
                        SomeAccount.setDBTableField2Value(rs.getString( SomeAccount.getDBTableField2Name() ));
                        SomeAccount.setDBTableField3Value(rs.getString( SomeAccount.getDBTableField3Name() ));

                        // instance of Accounts class
                        Accounts NewAccountRecordValue = new Accounts(SomeAccount.getDBTableField1Value(),                                                               
                                                                    SomeAccount.getDBTableField2Value(),                                                                
                                                                    SomeAccount.getDBTableField3Value());                
                        
                        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();           // ArrayList

                        
                        NewAccountRecordValue.addToRecords(AccountsList,NewAccountRecordValue); 
                                                                        
                        NewAccountRecordValue.showAllRecords(AccountsList);
                        System.out.println("\tAccounts Record Index: [" + tableRecordIndex + "]");
                    }                          
                    st.close();                                                     
                }
                // Exceptions                                
                catch (SQLException SQLex)
                {
                    // handle any errors
                    System.out.println("SQLException: " + SQLex.getMessage());
                    System.out.println("SQLState: " + SQLex.getSQLState());
                    System.out.println("VendorError: " + SQLex.getErrorCode());
                }
                catch(ClassNotFoundException ClassNotFoundEx) 
                {
                    System.out.println("Error: unable to load driver class!");
                    System.exit(1);
                }
                catch (Exception Ex)
                {
                    System.err.println("Got an exception! ");
                    System.err.println(Ex.getMessage());
                    Ex.printStackTrace();
                } 
                // Outputs
                // Cleanup
                // Returns 
        }
        public void deleteRecordFromDBAccountsTableByID(Accounts SomeAccount, int rowIndex)    
        {        
            //  variable
                // primitives
                    String TableIndexfieldName = SomeAccount.getDBTableField1Name();            
                    String TablefieldName = SomeAccount.getDBTableName();
                    String TablefieldEmptyValue = ""; 
                // objects
            // logic
                // presentation
                // Inputs
                // Processing
                // Validations                
                try
                {            
                    // Connect to database
                    Class.forName(myDriver);
                    Connection Conn = DriverManager.getConnection(myUrl, DBUserName, "Scu96spg@2023");                                                

                                

                    Accounts deletedAccountRecord = new Accounts(TablefieldEmptyValue, TablefieldEmptyValue, TablefieldEmptyValue);                    
                    // A- Build query
                    String deleteRecordByRowQuery = "DELETE FROM " + TablefieldName  + " WHERE " + TableIndexfieldName + " = ?";                        
                    // B- Create statement
                    PreparedStatement preparedStmt = Conn.prepareStatement(deleteRecordByRowQuery);
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
                    preparedStmt.close();
                    Conn.close();
                } 
                // Exceptions                                        
                catch (IndexOutOfBoundsException IndexOutOfBoundsEx)
                {
                    // handle any errors
                    System.out.println("IndexOutOfBoundsException: " + IndexOutOfBoundsEx.getMessage()); 

                    IndexOutOfBoundsEx.printStackTrace();           
                }
                catch (SQLException SQLEx)
                {
                    // handle any errors
                    System.out.println("SQLException: " + SQLEx.getMessage());
                    System.out.println("SQLState: " + SQLEx.getSQLState());
                    System.out.println("VendorError: " + SQLEx.getErrorCode());

                    SQLEx.printStackTrace();
                }
                catch(ClassNotFoundException ClassNotFoundEx) 
                {
                    System.out.println("Error: unable to load driver class!");
                    System.exit(1);

                    ClassNotFoundEx.printStackTrace();
                }
                catch (Exception Ex)
                {
                    System.err.println("Got an exception! ");
                    System.err.println(Ex.getMessage());

                    Ex.printStackTrace();
                }   
                // Outputs  
                // Cleanup
                // Returns
        }    
        public void updateRecordFromDBAccountsTableByID(Accounts SomeAccount, int rowIndex, String TablefieldName, String TablefieldValue)    
        {      
            //  variable
                // primitives
                // objects  
            // logic
                // presentation
                // Inputs
                // Processing
                // Validations 
                try
                {                        
                    // Connect to database
                    Class.forName(myDriver);
                    Connection Conn = DriverManager.getConnection(myUrl, DBUserName, "Scu96spg@2023");

                    String TableIndexfieldName = SomeAccount.getDBTableField1Name();                 
                    String parsedRowIndex = String.valueOf(rowIndex);                                        

                    // SQL SELECT query                                                
                    String updatedRecordByRowQuery = "UPDATE " + SomeAccount.getDBTableName()  +                                              
                                                    " SET " + TablefieldName + " = ? " + 
                                                    " WHERE " + TableIndexfieldName + " = ?";                                              
                    PreparedStatement preparedStmt = Conn.prepareStatement(updatedRecordByRowQuery);            
                    preparedStmt.setString(1, TablefieldValue);            
                    preparedStmt.setString(2, parsedRowIndex);                        
                    preparedStmt.executeUpdate();
                    
                    // st.close();  
                    preparedStmt.close();
                    Conn.close();
                }        
                // Exceptions
                catch (IndexOutOfBoundsException IndexOutOfBoundsEx)
                {
                    // handle any errors
                    System.out.println("IndexOutOfBoundsException: " + IndexOutOfBoundsEx.getMessage()); 

                    IndexOutOfBoundsEx.printStackTrace();           
                }
                catch (SQLException SQLEx)
                {
                    // handle any errors
                    System.out.println("SQLException: " + SQLEx.getMessage());
                    System.out.println("SQLState: " + SQLEx.getSQLState());
                    System.out.println("VendorError: " + SQLEx.getErrorCode());

                    SQLEx.printStackTrace();
                }
                catch(ClassNotFoundException ClassNotFoundEx) 
                {
                    System.out.println("Error: unable to load driver class!");
                    System.exit(1);

                    ClassNotFoundEx.printStackTrace();
                }
                catch (Exception Ex)
                {
                    System.err.println("Got an exception! ");
                    System.err.println(Ex.getMessage());

                    Ex.printStackTrace();
                } 
                // Outputs  
                // Cleanup
                // Returns
        }
}
