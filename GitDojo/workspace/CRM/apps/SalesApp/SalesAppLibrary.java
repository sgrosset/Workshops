package apps.SalesApp;

import java.util.Scanner;

import apps.SalesApp.Users.UserCredentials;
import lib.Library;





/**
 * Class Manifest:
 *      Global Variables:
 *          [primitives]
 *          [objects]
 *      Methods:
 *          Constructors:
 *              SalesAppLibrary()
 *                  [primitives]                     
 *                  [objects]                      
 *          Getters & Setters:
 *              [primitives]
 *              [objects]
 *          Helpers:     
 *              [primitives]
 *              [objects]         
 *          Utilities:
 *              showAppMenu(String[] menuArgs)
 *                  [primitives]
 *                  [objects]
 *              String[] readCredentials()
 *                  [primitives]
 *                      loginCredentials: String[] 
                        loginLabel: String[] 
                        passwordLabel: String[] 
 *                  [objects]
 *                      UserKeyboardInput: Scanner
 *              String checkLoginCredentials(String[] loginCredentials, UserCredentials SomeUserCredentials) 
*                   [primitives]
                        readLoginValue: String
                        readPasswordValue: String
                        storedLoginValue: String
                        storedPasswordValue: String
                        IsUserValid: String
 *                  [objects]
 */
public class SalesAppLibrary extends Library
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

     
    // CONSTRUCTORS
    public SalesAppLibrary()
    {            
        // Variables
            // primitives            
            // objects                         
        // Logic        
    }    

    // UTILITY CONTROLLERS - DB (MODEL LEVEL)    
    
    public void showAppMenu(String[] menuArgs)
    {
        //  variable
            // primitives                                        
            // objects                
        // logic
            // presentation
            System.out.println(menuArgs[0]);                
            // Inputs
            // Processing
            // Validations
            // Exceptions            
            // Outputs                
            System.out.println(menuArgs[1]);                        
        }      

    public String[] readCredentials()
    {
        //  variable
            // primitives 
                String[] loginCredentials = {"",""};
                String loginLabel = "Enter Login : ";
                String passwordLabel = "Enter Password : ";
            // objects
                Scanner UserKeyboardInput = new Scanner(System.in);
        // logic
            // presentation
            // Inputs
                System.out.println(loginLabel);            
                String loginValue = UserKeyboardInput.next() + UserKeyboardInput.nextLine();
                    
                System.out.println(passwordLabel);
                String passwordValue = UserKeyboardInput.next() + UserKeyboardInput.nextLine();        //  + UserKeyboardInput.nextLine()
            // Processing
                loginCredentials[0] = loginValue;
                loginCredentials[1] = passwordValue;
            // Validations
            // Exceptions            
            // Outputs   
            // Cleanup
                // UserKeyboardInput.close();   // close the Scanner buffer stream             
            // Returns
                return loginCredentials;
    }

    public String checkLoginCredentials(String[] loginCredentials, UserCredentials SomeUserCredentials) 
    {           
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

        String readLoginValue = loginCredentials[0];
        String readPasswordValue = loginCredentials[1];

        String storedLoginValue = SomeUserCredentials.getUserLogin();
        String storedPasswordValue = SomeUserCredentials.getUserPassword();          
        
        String IsUserValid = "FALSE";

        if ( // Login & Password are BOTH valid: Success !!
                readLoginValue.equals(storedLoginValue) 
                && 
                readPasswordValue.equals(storedPasswordValue) 
            ) 
        {    
            //SomeUserCredentials.setIsUserValid(true);
            IsUserValid = "TRUE";
            System.out.println("\nAccess Granted! Welcome!");            
        }    
        else if ( // Login is invalid: Login Failure !!
                    (!readLoginValue.equals(storedLoginValue)) 
                    && 
                    readPasswordValue.equals(storedPasswordValue) 
                )
        {
            System.out.println("Invalid Login!");
        } else if ( // Password is invalid: Password Failure !!
                    readLoginValue.equals(storedLoginValue) 
                    && 
                    (!readPasswordValue.equals(storedPasswordValue)) 
                )
        {
            System.out.println("Invalid Password!");
        } else // Login & Password are BOTH invalid: Failure !!
        {
            System.out.println("Invalid Username & Password!");

        }       
        
        // return SomeUserCredentials.getIsUserValid();
        return IsUserValid;
    }




















































    /*
    public void workOnUserswithDB()
    {
        // Variables
            // primitives            
            int rowIndex = 0;
            // objects 
            Scanner myScanner = new Scanner(System.in);
            UsersLibrary AccessToDatabase = new UsersLibrary();
            
            
        // Logic
            // READ All records from Object Table
            System.out.println("\n\n====== DEBUG ========= Show entire table before CRUDS =======");
            
            AccessToDatabase.getAllRecordsFromDBUsersTable();
            // -----------------------------------------------------------------------------------------------------------------
        



            // READ record from Object Table By ID                        
            System.out.println("\nWhich table record index do you wish to read?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n\n====== DEBUG ========= Show table at row " + rowIndex + " before CRUDS =======");
            AccessToDatabase.getRecordFromDBUsersTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------




            // UPDATE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= UPDATE CRUD =======");
                        
            System.out.println("\nWhich table record index do you wish to update?");
            rowIndex = Integer.parseInt(myScanner.next()); 

            System.out.println("\n====== DEBUG ========= Updating value from table at row " + rowIndex);
            System.out.println("\nNew Value of [FIRST_NAME]: " );
            String newNameValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBUsersTableByID(rowIndex,"FIRST_NAME",newNameValue);
            System.out.println("\nNew Value of [SURNAME]: " );
            String newSurnameValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBUsersTableByID(rowIndex,"SURNAME",newSurnameValue);
            System.out.println("\nNew Value of [LOGIN]: " );
            String newLoginValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBUsersTableByID(rowIndex,"LOGIN",newLoginValue);
            System.out.println("\nNew Value of [PASSWORD]: " );
            String newPasswordValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBUsersTableByID(rowIndex,"PASSWORD",newPasswordValue);
            System.out.println("\nNew Value of [ROLE]: " );
            String newRolewordValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBUsersTableByID(rowIndex,"ROLE",newRolewordValue);

            System.out.println("\n====== DEBUG ========= Show table at row " + rowIndex + " after UPDATE CRUD =======");
            AccessToDatabase.getRecordFromDBUsersTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------
        



            // DELETE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= DELETE CRUD =======");
            
            System.out.println("\nWhich table record index do you wish to delete?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n====== DEBUG ========= Deleting value from table at row " + rowIndex);
            AccessToDatabase.deleteRecordFromDBUsersTableByID(rowIndex);        

            System.out.println("\n====== DEBUG ========= Show entire table after DELETE CRUD =======");
            AccessToDatabase.getAllRecordsFromDBUsersTable();
            // -----------------------------------------------------------------------------------------------------------------
    }
    */
    /*
    public void workOnAccountswithDB()
    {
        // Variables
            // primitives            
            int rowIndex = 0;
            // objects 
            Scanner myScanner = new Scanner(System.in);
            AccountsLibrary AccessToDatabase = new AccountsLibrary();
            
        // Logic
            // READ All records from Object Table
            System.out.println("\n\n====== DEBUG ========= Show entire table before CRUDS =======");

            AccessToDatabase.getAllRecordsFromDBAccountsTable();
            // -----------------------------------------------------------------------------------------------------------------
        



            // READ record from Object Table By ID                        
            System.out.println("\nWhich table record index do you wish to read?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n\n====== DEBUG ========= Show table at row " + rowIndex + " before CRUDS =======");
            AccessToDatabase.getRecordFromDBAccountsTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------




            // UPDATE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= UPDATE CRUD =======");
                        
            System.out.println("\nWhich table record index do you wish to update?");
            rowIndex = Integer.parseInt(myScanner.next()); 

            System.out.println("\n====== DEBUG ========= Updating value from table at row " + rowIndex);
            System.out.println("\nNew Value of [NAME]: " );
            String newNameValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBAccountsTableByID(rowIndex,"NAME",newNameValue);
            System.out.println("\nNew Value of [ADDRESS]: " );
            String newAddressValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBAccountsTableByID(rowIndex,"ADDRESS",newAddressValue);

            System.out.println("\n====== DEBUG ========= Show table at row " + rowIndex + " after UPDATE CRUD =======");
            AccessToDatabase.getRecordFromDBAccountsTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------
        



            // DELETE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= DELETE CRUD =======");
            
            System.out.println("\nWhich table record index do you wish to delete?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n====== DEBUG ========= Deleting value from table at row " + rowIndex);
            AccessToDatabase.deleteRecordFromDBAccountsTableByID(rowIndex);        

            System.out.println("\n====== DEBUG ========= Show entire table after DELETE CRUD =======");
            AccessToDatabase.getAllRecordsFromDBAccountsTable();
            // -----------------------------------------------------------------------------------------------------------------
    }
    */
    /*
    public void workOnContactswithDB()
    {
        // Variables
            // primitives            
            int rowIndex = 0;
            // objects 
            Scanner myScanner = new Scanner(System.in);
            ContactsLibrary AccessToDatabase = new ContactsLibrary();
            
        // Logic
            // READ All records from Object Table
            System.out.println("\n\n====== DEBUG ========= Show entire table before CRUDS =======");

            AccessToDatabase.getAllRecordsFromDBContactsTable();
            // -----------------------------------------------------------------------------------------------------------------
        



            // READ record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= Show table at row " + rowIndex + " before CRUDS =======");
            
            System.out.println("\nWhich table record index do you wish to read?");
            rowIndex = Integer.parseInt(myScanner.next());

            AccessToDatabase.getRecordFromDBContactsTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------




            // UPDATE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= UPDATE CRUD =======");
                        
            System.out.println("\nWhich table record index do you wish to update?");
            rowIndex = Integer.parseInt(myScanner.next()); 

            System.out.println("\n====== DEBUG ========= Updating value from table at row " + rowIndex);
            System.out.println("\nNew Value of [NAME]: " );
            String newNameValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBContactsTableByID(rowIndex,"NAME",newNameValue);
            System.out.println("\nNew Value of [JOB]: " );
            String newAddressValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBContactsTableByID(rowIndex,"JOB",newAddressValue);
            System.out.println("\nNew Value of [PHONE]: " );
            String newPhoneValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBContactsTableByID(rowIndex,"PHONE",newPhoneValue);
            System.out.println("\nNew Value of [EMAIL]: " );
            String newEmailValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBContactsTableByID(rowIndex,"EMAIL",newEmailValue);

            System.out.println("\n====== DEBUG ========= Show table at row " + rowIndex + " after UPDATE CRUD =======");
            AccessToDatabase.getRecordFromDBContactsTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------
        



            // DELETE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= DELETE CRUD =======");
            
            System.out.println("\nWhich table record index do you wish to delete?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n====== DEBUG ========= Deleting value from table at row " + rowIndex);
            AccessToDatabase.deleteRecordFromDBContactsTableByID(rowIndex);        

            System.out.println("\n====== DEBUG ========= Show entire table after DELETE CRUD =======");
            AccessToDatabase.getAllRecordsFromDBContactsTable();
            // -----------------------------------------------------------------------------------------------------------------
    }
    */
    /*
    public void workOnLeadswithDB()
    {
        // Variables
            // primitives            
            int rowIndex = 0;
            // objects 
            Scanner myScanner = new Scanner(System.in);
            LeadsLibrary AccessToDatabase = new LeadsLibrary();
            
        // Logic
            // READ All records from Object Table
            System.out.println("\n\n====== DEBUG ========= Show entire table before CRUDS =======");
            
            AccessToDatabase.getAllRecordsFromDBLeadsTable();
            // -----------------------------------------------------------------------------------------------------------------
        



            // READ record from Object Table By ID                        
            System.out.println("\nWhich table record index do you wish to read?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n\n====== DEBUG ========= Show table at row " + rowIndex + " before CRUDS =======");
            AccessToDatabase.getRecordFromDBLeadsTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------




            // UPDATE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= UPDATE CRUD =======");
                        
            System.out.println("\nWhich table record index do you wish to update?");
            rowIndex = Integer.parseInt(myScanner.next()); 

            System.out.println("\n====== DEBUG ========= Updating value from table at row " + rowIndex);
            System.out.println("\nNew Value of [LEAD NAME]: " );
            String newNameValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBLeadsTableByID(rowIndex,"LEAD_NAME",newNameValue);
            System.out.println("\nNew Value of [SERVICE OF INTEREST]: " );
            String newServiceValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBLeadsTableByID(rowIndex,"SERVICE_OF_INTEREST",newServiceValue);
            System.out.println("\nNew Value of [PRODUCT OF INTEREST]: " );
            String newProductValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBLeadsTableByID(rowIndex,"PRODUCT_OF_INTEREST",newProductValue);
            System.out.println("\nNew Value of [LEAD RATING]: " );
            String newRatingValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBLeadsTableByID(rowIndex,"LEAD_RATING",newRatingValue);

            System.out.println("\n====== DEBUG ========= Show table at row " + rowIndex + " after UPDATE CRUD =======");
            AccessToDatabase.getRecordFromDBLeadsTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------
        



            // DELETE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= DELETE CRUD =======");
            
            System.out.println("\nWhich table record index do you wish to delete?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n====== DEBUG ========= Deleting value from table at row " + rowIndex);
            AccessToDatabase.deleteRecordFromDBLeadsTableByID(rowIndex);        

            System.out.println("\n====== DEBUG ========= Show entire table after DELETE CRUD =======");
            AccessToDatabase.getAllRecordsFromDBLeadsTable();
            // -----------------------------------------------------------------------------------------------------------------
    }
    */
    /*
    public void workOnOpportunitieswithDB()
    {
        // Variables
            // primitives            
            int rowIndex = 0;
            // objects 
            Scanner myScanner = new Scanner(System.in);
            OpportunitiesLibrary AccessToDatabase = new OpportunitiesLibrary();
            
        // Logic
            // READ All records from Object Table
            System.out.println("\n\n====== DEBUG ========= Show entire table before CRUDS =======");
            
            AccessToDatabase.getAllRecordsFromDBOpportunitiesTable();
            // -----------------------------------------------------------------------------------------------------------------
        



            // READ record from Object Table By ID                        
            System.out.println("\nWhich table record index do you wish to read?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n\n====== DEBUG ========= Show table at row " + rowIndex + " before CRUDS =======");
            AccessToDatabase.getRecordFromDBOpportunitiesTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------




            // UPDATE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= UPDATE CRUD =======");
                        
            System.out.println("\nWhich table record index do you wish to update?");
            rowIndex = Integer.parseInt(myScanner.next()); 

            System.out.println("\n====== DEBUG ========= Updating value from table at row " + rowIndex);
            System.out.println("\nNew Value of [OPPORTUNITY NAME]: " );
            String newNameValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBOpportunitiesTableByID(rowIndex,"OPPORTUNITY_NAME",newNameValue);
            System.out.println("\nNew Value of [SERVICE OF INTEREST]: " );
            String newAddressValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBOpportunitiesTableByID(rowIndex,"SERVICE_OF_INTEREST",newAddressValue);
            System.out.println("\nNew Value of [PRODUCT OF INTEREST]: " );
            String newPhoneValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBOpportunitiesTableByID(rowIndex,"PRODUCT_OF_INTEREST",newPhoneValue);
            System.out.println("\nNew Value of [OPPORTUNITY VALUE]: " );
            String newEmailValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBOpportunitiesTableByID(rowIndex,"OPPORTUNITY_VALUE",newEmailValue);

            System.out.println("\n====== DEBUG ========= Show table at row " + rowIndex + " after UPDATE CRUD =======");
            AccessToDatabase.getRecordFromDBOpportunitiesTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------
        



            // DELETE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= DELETE CRUD =======");
            
            System.out.println("\nWhich table record index do you wish to delete?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n====== DEBUG ========= Deleting value from table at row " + rowIndex);
            AccessToDatabase.deleteRecordFromDBOpportunitiesTableByID(rowIndex);        

            System.out.println("\n====== DEBUG ========= Show entire table after DELETE CRUD =======");
            AccessToDatabase.getAllRecordsFromDBOpportunitiesTable();
            // -----------------------------------------------------------------------------------------------------------------
    }
    */
    /*
    public void workOnProductswithDB()
    {
        // Variables
            // primitives            
            int rowIndex = 0;
            // objects 
            Scanner myScanner = new Scanner(System.in);
            ProductsLibrary AccessToDatabase = new ProductsLibrary();
            
            
        // Logic
            // READ All records from Object Table
            System.out.println("\n\n====== DEBUG ========= Show entire table before CRUDS =======");
            
            AccessToDatabase.getAllRecordsFromDBProductsTable();
            // -----------------------------------------------------------------------------------------------------------------
        



            // READ record from Object Table By ID                        
            System.out.println("\nWhich table record index do you wish to read?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n\n====== DEBUG ========= Show table at row " + rowIndex + " before CRUDS =======");
            AccessToDatabase.getRecordFromDBProductsTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------




            // UPDATE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= UPDATE CRUD =======");
                        
            System.out.println("\nWhich table record index do you wish to update?");
            rowIndex = Integer.parseInt(myScanner.next()); 

            System.out.println("\n====== DEBUG ========= Updating value from table at row " + rowIndex);
            System.out.println("\nNew Value of [PRODUCT NAME]: " );
            String newNameValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBProductsTableByID(rowIndex,"PRODUCT_NAME",newNameValue);
            System.out.println("\nNew Value of [PRODUCT TYPE]: " );
            String newAddressValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBProductsTableByID(rowIndex,"PRODUCT_TYPE",newAddressValue);
            System.out.println("\nNew Value of [PRODUCT PRICE]: " );
            String newPhoneValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBProductsTableByID(rowIndex,"PRODUCT_PRICE",newPhoneValue);
            System.out.println("\nNew Value of [PRODUCT QUANTITY]: " );
            String newEmailValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBProductsTableByID(rowIndex,"PRODUCT_QUANTITY",newEmailValue);

            System.out.println("\n====== DEBUG ========= Show table at row " + rowIndex + " after UPDATE CRUD =======");
            AccessToDatabase.getRecordFromDBProductsTableByID(rowIndex);
            // -----------------------------------------------------------------------------------------------------------------
        



            // DELETE record from Object Table By ID
            System.out.println("\n\n====== DEBUG ========= DELETE CRUD =======");
            
            System.out.println("\nWhich table record index do you wish to delete?");
            rowIndex = Integer.parseInt(myScanner.next());

            System.out.println("\n====== DEBUG ========= Deleting value from table at row " + rowIndex);
            AccessToDatabase.deleteRecordFromDBProductsTableByID(rowIndex);        

            System.out.println("\n====== DEBUG ========= Show entire table after DELETE CRUD =======");
            AccessToDatabase.getAllRecordsFromDBProductsTable();
            // -----------------------------------------------------------------------------------------------------------------
    }
    */
    // UTILITY CONTROLLERS - WITHOUT DB
}
