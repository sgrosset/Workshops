package apps.salesApp;

import java.util.ArrayList;

import apps.salesApp.Accounts.Accounts;
import apps.salesApp.Contacts.Contacts;
import apps.salesApp.Leads.Leads;
import apps.salesApp.Opportunities.Opportunities;
import apps.salesApp.Products.Products;
import apps.salesApp.Users.Users;

public class salesApp extends salesAppLibrary
{    
    public salesApp()
    {                                        
        /* 
        boolean isAppOpen = true;       // Boolean flag variable to check that the application remains open
        
        int failedLoginAttempts = 0;

        String userLogin = "";
        String userPassword = "";
        String[] loginValuesArray = {userLogin,userPassword};

        // Database information
        private String DBUserName = "sicolo";
        private String DBName = "SalesApp";

        // create our mysql database connection
        private String someDriver1 = "com.mysql.jdbc.Driver";            
        private String myDriver = someDriver1;
        private String myUrl = "jdbc:mysql://localhost/" + DBName;
        

        while(isAppClosed != false)
        {
            // Show Login Screen
                showMenu(menuOptionsArgs);

            // Read Login Values
                loginValuesArray = readLoginValues();
                userLogin = loginValuesArray[0];
                userPassword = loginValuesArray[1];

            // Check Login Values vs Database                                                                                                              
              


                // if isLoginValid = true
                    asUser = CurrentUser.getDBTableField6Value();
                    showAppMenu()
                // else isLoginValid = false
                    failedLoginAttempts++;
                    // loginMenu()
        }


        
        public String[] readLoginValues()
        {
            String userLogin = "";
            String userPassword = "";
            String[] someLoginValuesArray = {userLogin,userPassword};


            System.out.println("\nEnter Login [username]: " );
            userLogin = myScanner.next() + myScanner.nextLine();

            System.out.println("\nEnter Password: " );
            userPassword = myScanner.next() + myScanner.nextLine();



            return someLoginValuesArray;
        }


        public User validateUser(String[] someLoginValuesArray)
        {
            try
            {
                // Connect to database  - add ?useSSL=false
                    // 1- Connect to database
                    Class.forName(getMyDriver());
                    Connection DBconnection = DriverManager.getConnection(getMyUrl(), 
                                                                                   getDBUserName(), 
                                                                                   "Scu96spg@2023");                    

                    // 2- Create a select query to check if the username and the password exist in the database
                    String DBconnectionQueryFromMySQLUSerTbl = "SELECT * FROM users_db.users WHERE username = ? AND password = ?";  // Querying MySQL's table of users                             

                    String DBconnectionQueryFromUserTbl = "SELECT * FROM Users WHERE Login = ? and Password = ?";          // Querying our own table of Users                    
                    String DBconnectionQueryFromUserTblUsingGetters = "SELECT * FROM " + getDBTableName() 
                                                                    + " WHERE " + getDBTableField4Name + " = ? "
                                                                    + " AND " + getDBTableField4Name + " = ?"; 

                    String DBconnectionQuery = DBconnectionQueryFromMySQLUSerTbl;
                    // String DBconnectionQuery = DBconnectionQueryFromUserTbl;
                    // String DBconnectionQuery = DBconnectionQueryFromUserTblUsingGetters;
                    

                    // 3- Prepare the Statement
                    Statement DBconnectionStatement = DBconnection.createStatement();

                    PreparedStatement DBconnectionPreparedStatement = DBconnection.prepareStatement(DBconnectionQuery);                                                    
                    DBconnectionPreparedStatement.setString(1, userLogin);
                    DBconnectionPreparedStatement.setString(2, userPassword);
                    

                    // 4- Capture the Results set
                    ResultSet DBconnectionResultSetFromStatement;
                    ResultSet DBconnectionResultSetFromPreparedStatement;
                    ResultSet DBconnectionResultSet;

                    DBconnectionResultSetFromStatement = DBconnectionStatement.executeQuery(DBconnectionQuery);
                    DBconnectionResultSetFromPreparedStatement = DBconnectionPreparedStatement.executeQuery();

                    DBconnectionResultSet = DBconnectionResultSetFromStatement;
                    // DBconnectionResultSet = DBconnectionResultSetFromPreparedStatement;

                    
                    while (DBconnectionResultSet.next())
                    {                              
                        setDBTableField1Value(rs.getString( getDBTableField1Name() ));              // User ID
                        setDBTableField2Value(rs.getString( getDBTableField2Name() ));              // User First Name
                        setDBTableField3Value(rs.getString( getDBTableField3Name() ));              // User surname
                        setDBTableField4Value(rs.getString( getDBTableField4Name() ));              // User Login                        
                        setDBTableFiel5Value(rs.getString( getDBTableField5Name() ));               // User Password                 
                        setDBTableFiel6Value(rs.getString( getDBTableField6Name() ));               // User Role                 

                        // instance of Products class
                        Users CurrentUserRecordValue = new Users(getDBTableField1Value(),                                                               
                                                                                    getDBTableField2Value(),                                                                
                                                                                    getDBTableField3Value(),
                                                                                    getDBTableField4Value(),
                                                                                    getDBTableFiel5Value(),
                                                                                    getDBTableFiel6Value());

                        ArrayList<Users> UsersList = new ArrayList<Users>();           // ArrayList
                        
                        CurrentUserRecordValue.addToRecords(UsersList,CurrentUserRecordValue);          
                        
                        // print the results
                        NewProductRecordValue.showAllRecords(UsersList);
                        System.out.println("\tUsers Record Index: [" + TableRecordIndex + "]");
                    }              
                    System.out.println("---------------------------------------------------\n\n");  
                    st.close();
                                                                                                

            }   catch (SQLException ex)
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

        runAsUser(User CurrentUser)
        {                 
            String asUser = CurrentUser.getDBTableField6Name();


            switch (asUser) 
            {
                case "admin":                    
                    ShowAppMenu(menuOptionsArgs, asAdmin);
                break;
                case "manager":                    
                    ShowAppMenu(asManager);
                break;
                case "sales":                    
                    ShowAppMenu(asSales);
                break;
                default:                    
                    ShowAppMenu(asNoUser);
                break;
            }
         }
         
        */
          

        /*
         showMenu(String menuOptionsArgs)
         {

         }
         */


        /*
        ShowAppMenu(String asUser)
             option 1: Add Records
             option 2: Show Records
             option 3: Edit Records
             option 4: Delete Records            

         Show Records (All tables / AsAdmin)

         WORKING AT THE DATABASE LEVEL - MODEL        
             Create the Data Model
                 For the Admin
                 For the Managers
                 For the Sales Users


         WORKING AT THE CRM LEVEL - CONTROLLER
             workOnAccountswithDB();        
             workOnContactswithDB();
             workOnLeadswithDB();
             workOnOpportunitieswithDB();
             workOnProductswithDB();
            workOnUserswithDB();

            
         WORKING AT THE GUI LEVEL - VIEW
        */
    }   


    public void MyNewMethod()
    {
      // Variables
        // Primitives
        // Objects
      // Logic
      System.out.println("I am inside the logic: [MyNewMethods]");
    }

}
