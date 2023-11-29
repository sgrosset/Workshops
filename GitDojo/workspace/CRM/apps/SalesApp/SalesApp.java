package apps.SalesApp;

import apps.SalesApp.Accounts.Accounts;
import apps.SalesApp.Accounts.AccountsLibrary;
import apps.SalesApp.Users.UserCredentials;


/**
 * Class Manifest:
 *      Global Variables:
 *          [primitives]
 *          [objects]
 *      Methods:
 *          Constructors:
 *              SalesApp()
 *                  [primitives]
 *                      isAppClosed: boolean
 *                      loginAttemptCounter: int
 *                      menuArgs: String[]
 *                      loginCredentials: String[]
 *  
 *                      systemCredentials: String[]
 *                      sostheneCredentials: String[]
 *                      juninhoCredential: String[]
 *                      ariellaCredentials: String[]
 *                      malyaCredentials: String[]
 *                  [objects]
 *                      ThisUserCredentials: UserCredentials
 *          Getters & Setters:
 *              [primitives]
 *              [objects]
 *          Helpers:
 *                  [primitives]
 *                  [objects]
 *          Utilities:
 *              [primitives]
 *              [objects]
 */
public class SalesApp extends SalesAppLibrary
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


    public SalesApp()
    {   
        // Variables 
            // Primitives
                String isAppClosed = "FALSE";
                int loginAttemptCounter = 0;
                String[] menuArgs = {"\n===============================\n" +
                                    "  Welcome to my CRM Application  " +
                                    "\n================================\n",
                                    "Please enter your Login and Password\n\n"
                                    };   

                String[] loginCredentials = {"",""};                     
            
                /*        
                    +----+------------+---------------+-------+------------+---------+
                    | ID | FIRST_NAME | SURNAME       | LOGIN | PASSWORD   | ROLE    |
                    +----+------------+---------------+-------+------------+---------+
                    |  1 | System     | Administrator | root  | root@2023  | admin   |
                    |  2 | Sosthene   | Grosset-Janin | sos10 | sos10@2023 | manager |
                    |  3 | Juninho    | Loungila      | juni  | juni@2023  | manager |
                    |  4 | Ariella    | Grosset-Janin | ari   | ari@2023   | sales   |
                    |  5 | Malya      | Loungila      | malya | malya@2023 | sales   |
                    +----+------------+---------------+-------+------------+---------+
                */
                // Data Model
                String[] systemCredentials = {"1","System","Administrator","root","root@2023","admin"};
                String[] sostheneCredentials = {"2","Sosthene","Grosset-Janin","sos10","sos10@2023","manager"};
                String[] juninhoCredential = {"3","Juninho","Loungila","juni","juni@2023","manager"};
                String[] ariellaCredentials = {"4","Ariella","Grosset-Janin","ari","ari@2023","sales"};
                String[] malyaCredentials = {"5","Malya","Loungila","malya","malya@2023","sales"};                

            // Objects
                UserCredentials ThisUserCredentials = new UserCredentials();
                    ThisUserCredentials.setUserID(sostheneCredentials[0]);
                    ThisUserCredentials.setUserFirstName(sostheneCredentials[1]);
                    ThisUserCredentials.setUserSurname(sostheneCredentials[2]);
                    ThisUserCredentials.setUserLogin(sostheneCredentials[3]);
                    ThisUserCredentials.setUserPassword(sostheneCredentials[4]);
                    ThisUserCredentials.setUserRole(sostheneCredentials[5]); 
                Accounts SomeAccount = new Accounts();           
                AccountsLibrary MyAccountsLibrary = new AccountsLibrary();                                                
        
        // Logic         
            while(isAppClosed == "FALSE")     // alternative while(!isAppClosed){}
            {
                //Show Menu
                showAppMenu(menuArgs);
            
                // Read User Credentials
                loginCredentials = readCredentials();                        

                // launch login method
                // option 1 - simple                                                
                    String isCheckValid = "FALSE";
                    isCheckValid = checkLoginCredentials(loginCredentials,ThisUserCredentials);
                    if (isCheckValid == "TRUE")
                    {
                        // execute some code
                        ThisUserCredentials.userCredentialsCheck();

                        MyAccountsLibrary.getAllRecordsFromDBAccountsTable(SomeAccount);
                    } 
                    else
                    {
                        loginAttemptCounter++;      // alternative: loginAttemptCounter = (loginAttemptCounter + 1)
                        System.out.println("\nloginAttemptCounter: " + loginAttemptCounter);
                        if (loginAttemptCounter >= 3)
                        {
                            isAppClosed = "TRUE";
                            System.out.println("\n\n================= ERROR ==================\n" +
                                               "        Too many failed login attempts !!     \n" + 
                                               "        Login out of the application...       \n" + 
                                               "\n" + 
                                               "        Goodbye :-(                           \n" + 
                                               "================= ERROR ==================\n");
                        }
                    }                                                                                        
            }                
    } 
    
    public void myNewMethod()
    {
      // Variables
        // Primitives
        int myIntVar1 = 1;
        int myCharVar1 = 's';
        int myBoolVar1 = true;
        // Objects
        String myStringVar = "Sosthene";
      // Logic
      System.out.println("I am inside the logic: [MyNewMethod]");
    }

}
































// WORKING AT THE DATABASE LEVEL - MODEL        
            // workOnAccountswithDB();        
            // workOnContactswithDB();
            // workOnLeadswithDB();
            // workOnOpportunitieswithDB();
            // workOnProductswithDB();
            // workOnUserswithDB();

        // WORKING AT THE CRM LEVEL - CONTROLLER

            //workOnAccounts();
            // workOnContacts();
            // workOnLeads();
            // workOnOpportunities();
            // workOnProducts();        

        // WORKING AT THE GUI LEVEL - VIEW   