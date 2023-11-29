package apps.salesApp;

import lib.Library;

import java.util.ArrayList;
import java.util.Scanner;

import apps.salesApp.Accounts.Accounts;
import apps.salesApp.Accounts.AccountsLibrary;

import apps.salesApp.Contacts.Contacts;
import apps.salesApp.Contacts.ContactsLibrary;

import apps.salesApp.Leads.Leads; 
import apps.salesApp.Leads.LeadsLibrary;

import apps.salesApp.Opportunities.Opportunities;
import apps.salesApp.Opportunities.OpportunitiesLibrary;

import apps.salesApp.Products.Products;
import apps.salesApp.Products.ProductsLibrary;
import apps.salesApp.Users.UsersLibrary;
import lib.Database;




public class salesAppLibrary extends Library
{        
    // methods
    public salesAppLibrary()
    {
        // Variables
            // primitives            

            // objects             
            
        // Logic        
    }    


    // UTILITY CONTROLLERS - DB (MODEL LEVEL)
    
    
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
            String newAddressValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBLeadsTableByID(rowIndex,"SERVICE_OF_INTEREST",newAddressValue);
            System.out.println("\nNew Value of [PRODUCT OF INTEREST]: " );
            String newPhoneValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBLeadsTableByID(rowIndex,"PRODUCT_OF_INTEREST",newPhoneValue);
            System.out.println("\nNew Value of [LEAD RATING]: " );
            String newEmailValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBLeadsTableByID(rowIndex,"LEAD_RATING",newEmailValue);

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
            System.out.println("\nNew Value of [FIRST NAME]: " );
            String newFirstNameValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBUsersTableByID(rowIndex,"FIRST_NAME",newFirstNameValue);
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
            String newRoleValue = myScanner.next() + myScanner.nextLine();
            AccessToDatabase.updateRecordFromDBUsersTableByID(rowIndex,"PASSWROLEORD",newRoleValue);

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







    // UTILITY CONTROLLERS - WITHOUT DB
    
    /*
    public void workOnAccounts()
    {
        String CRMMode = "noDBMode";
        
        // Create Data Model
        int[] someAgeArray = {5,45,34,12};
        String[] someNameArray = {"Sosthene","Markus","Francis","Lucas"};
        String[] someAddressArray = {"Paris", "Berlin", "London","Milan"}; 

        
        ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();           // ArrayList
        Accounts myAccount = new Accounts();                            // ArrayList instance (Table Record) -- using the no argument constructor to enter some default values                

        // Show Default Data contents
        System.out.println("\n\n-------------- ***** DEFAULT ACCOUNTS VALUES ***** -----------------------------");        
        System.out.println("Account Age: " + myAccount.getAge());
        System.out.println("Account Name: " + myAccount.getName());
        System.out.println("Account Address: " + myAccount.getAddress());


        // Populate Data Structure
        myAccount.addToRecords(AccountsList, someAgeArray, someNameArray, someAddressArray);

        // Show Data contents
        System.out.println("\n\n-------------- ***** FRESH ACCOUNTS VALUES ***** -----------------------------");
        myAccount.showAllRecords(AccountsList,CRMMode);

        // Remove Record        
        int recordIndex = 0;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("\nWhich table record index do you wish to delete? [0 - " + (AccountsList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next()); 

        myAccount.removeItemFromRecords(AccountsList, recordIndex);

        // Show Data contents
        System.out.println("\n\n-------------- ***** NEW ACCOUNTS VALUES ***** -----------------------------");
        myAccount.showAllRecords(AccountsList,CRMMode);

        System.out.println("\nWhich table record index do you wish to change? [0 - " + (AccountsList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next());

        System.out.println("\nNew Value of [Age]: " );
        int newAgeValue = Integer.parseInt(myScanner.next());
        System.out.println("\nNew Value of [Name]: " );
        String newNameValue = myScanner.next();
        System.out.println("\nNew Value of [Address]: " );
        String newAddressValue = myScanner.next();

        myAccount.changeItemFromRecords(AccountsList, recordIndex, newAgeValue, newNameValue, newAddressValue);    
        
        
        // Show Data contents
        System.out.println("\n\n-------------- ***** MODIFIED ACCOUNTS VALUES ***** -----------------------------");
        myAccount.showAllRecords(AccountsList, CRMMode);

        // Close the Scanner buffer
        myScanner.close();        
    }          
    */

    /*
    public void workOnContacts()
    {
        // Create Data Model
        int[] someAgeArray = {5,45,34,12};
        String[] someNameArray = {"Juninho","Maguy","Sara","Ariella"};
        String[] someAddressArray = {"Paris", "Berlin", "London","Milan"}; 

        
        ArrayList<Contacts> ContactsList = new ArrayList<>();           // ArrayList
        Contacts myContact = new Contacts();                            // ArrayList instance (Table Record) -- using the no argument constructor to enter some default values                

        // Show Default Data contents
        System.out.println("\n\n-------------- ***** DEFAULT CONTACTS VALUES ***** -----------------------------");        
        System.out.println("Contact Age: " + myContact.getAge());
        System.out.println("Contact Name: " + myContact.getName());
        System.out.println("Contact Address: " + myContact.getAddress());


        // Populate Data Structure        
        myContact.addToRecords(ContactsList, someAgeArray, someNameArray, someAddressArray);

        // Show Data contents
        System.out.println("\n\n-------------- ***** FRESH CONTACTS VALUES ***** -----------------------------");
        myContact.showAllRecords(ContactsList);

        // Remove Record        
        int recordIndex = 0;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("\nWhich table record index do you wish to delete? [0 - " + (ContactsList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next()); 

        myContact.removeItemFromRecords(ContactsList, recordIndex);        


        // Show Data contents
        System.out.println("\n\n-------------- ***** NEW CONTACTS VALUES ***** -----------------------------");
        myContact.showAllRecords(ContactsList);

        System.out.println("\nWhich table record index do you wish to change? [0 - " + (ContactsList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next());

        System.out.println("\nNew Value of [Age]: " );
        int newAgeValue = Integer.parseInt(myScanner.next());
        System.out.println("\nNew Value of [Name]: " );
        String newNameValue = myScanner.next();
        System.out.println("\nNew Value of [Address]: " );
        String newAddressValue = myScanner.next();

        myContact.changeItemFromRecords(ContactsList, recordIndex, newAgeValue, newNameValue, newAddressValue);    
        
        
        
        // Show Data contents
        System.out.println("\n\n-------------- ***** MODIFIED CONTACTS VALUES ***** -----------------------------");
        myContact.showAllRecords(ContactsList);

        // Close the Scanner buffer
        myScanner.close();        
    }   
    */

    /*
    public void workOnLeads()
    {
        // Create Data Model
        int[] someAgeArray = {5,45,34,12};
        String[] someNameArray = {"Juninho","Maguy","Sara","Ariella"};
        String[] someAddressArray = {"Paris", "Berlin", "London","Milan"}; 

        
        ArrayList<Leads> LeadsList = new ArrayList<>();           // ArrayList
        Leads myLead = new Leads();                            // ArrayList instance (Table Record) -- using the no argument constructor to enter some default values                

        // Show Default Data contents
        System.out.println("\n\n-------------- ***** DEFAULT LEADS VALUES ***** -----------------------------");        
        System.out.println("Contact Age: " + myLead.getAge());
        System.out.println("Contact Name: " + myLead.getName());
        System.out.println("Contact Address: " + myLead.getAddress());


        // Populate Data Structure        
        myLead.addToRecords(LeadsList, someAgeArray, someNameArray, someAddressArray);

        // Show Data contents
        System.out.println("\n\n-------------- ***** FRESH LEADS VALUES ***** -----------------------------");
        myLead.showAllRecords(LeadsList);

        // Remove Record        
        int recordIndex = 0;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("\nWhich table record index do you wish to delete? [0 - " + (LeadsList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next()); 

        myLead.removeItemFromRecords(LeadsList, recordIndex);
        

        // Show Data contents
        System.out.println("\n\n-------------- ***** NEW LEADS VALUES ***** -----------------------------");
        myLead.showAllRecords(LeadsList);

        System.out.println("\nWhich table record index do you wish to change? [0 - " + (LeadsList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next());

        System.out.println("\nNew Value of [Age]: " );
        int newAgeValue = Integer.parseInt(myScanner.next());
        System.out.println("\nNew Value of [Name]: " );
        String newNameValue = myScanner.next();
        System.out.println("\nNew Value of [Address]: " );
        String newAddressValue = myScanner.next();

        myLead.changeItemFromRecords(LeadsList, recordIndex, newAgeValue, newNameValue, newAddressValue);    
        
        
        
        // Show Data contents
        System.out.println("\n\n-------------- ***** MODIFIED LEADS VALUES ***** -----------------------------");
        myLead.showAllRecords(LeadsList);
        
        // Close the Scanner buffer
        myScanner.close();        
    }
    */

    /*
    public void workOnOpportunities()
    {
        // Create Data Model
        int[] someAgeArray = {5,45,34,12};
        String[] someNameArray = {"Juninho","Maguy","Sara","Ariella"};
        String[] someAddressArray = {"Paris", "Berlin", "London","Milan"}; 

        
        ArrayList<Opportunities> OpportunitiesList = new ArrayList<>();           // ArrayList
        Opportunities myOpportunity = new Opportunities();                        // ArrayList instance (Table Record) -- using the no argument constructor to enter some default values                

        // Show Default Data contents
        System.out.println("\n\n-------------- ***** DEFAULT OPPORTUNITY VALUES ***** -----------------------------");        
        System.out.println("Opportunity Age: " + myOpportunity.getAge());
        System.out.println("Opportunity Name: " + myOpportunity.getName());
        System.out.println("Opportunity Address: " + myOpportunity.getAddress());


        // Populate Data Structure        
        myOpportunity.addToRecords(OpportunitiesList, someAgeArray, someNameArray, someAddressArray);

        // Show Data contents
        System.out.println("\n\n-------------- ***** FRESH OPPORTUNITY VALUES ***** -----------------------------");
        myOpportunity.showAllRecords(OpportunitiesList);

        // Remove Record        
        int recordIndex = 0;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("\nWhich table record index do you wish to delete? [0 - " + (OpportunitiesList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next()); 

        myOpportunity.removeItemFromRecords(OpportunitiesList, recordIndex);
        

        // Show Data contents
        System.out.println("\n\n-------------- ***** NEW OPPORTUNITY VALUES ***** -----------------------------");
        myOpportunity.showAllRecords(OpportunitiesList);

        System.out.println("\nWhich table record index do you wish to change? [0 - " + (OpportunitiesList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next());

        System.out.println("\nNew Value of [Age]: " );
        int newAgeValue = Integer.parseInt(myScanner.next());
        System.out.println("\nNew Value of [Name]: " );
        String newNameValue = myScanner.next();
        System.out.println("\nNew Value of [Address]: " );
        String newAddressValue = myScanner.next();

        myOpportunity.changeItemFromRecords(OpportunitiesList, recordIndex, newAgeValue, newNameValue, newAddressValue);    
        
        
        
        // Show Data contents
        System.out.println("\n\n-------------- ***** MODIFIED OPPORTUNITY VALUES ***** -----------------------------");
        myOpportunity.showAllRecords(OpportunitiesList);

        // Close the Scanner buffer
        myScanner.close();                
    }
    */

    /*
    public void workOnProducts()
    {
        // Create Data Model
        int[] someAgeArray = {5,45,34,12};
        String[] someNameArray = {"Juninho","Maguy","Sara","Ariella"};
        String[] someAddressArray = {"Paris", "Berlin", "London","Milan"}; 

        
        ArrayList<Products> ProductsList = new ArrayList<>();           // ArrayList
        Products myProduct = new Products();                            // ArrayList instance (Table Record) -- using the no argument constructor to enter some default values                

        // Show Default Data contents
        System.out.println("\n\n-------------- ***** DEFAULT PRODUCTS VALUES ***** -----------------------------");        
        System.out.println("Product Age: " + myProduct.getAge());
        System.out.println("Product Name: " + myProduct.getName());
        System.out.println("Product Address: " + myProduct.getAddress());


        // Populate Data Structure        
        myProduct.addToRecords(ProductsList, someAgeArray, someNameArray, someAddressArray);

        // Show Data contents
        System.out.println("\n\n-------------- ***** FRESH PRODUCTS VALUES ***** -----------------------------");
        myProduct.showAllRecords(ProductsList);

        // Remove Record        
        int recordIndex = 0;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("\nWhich table record index do you wish to delete? [0 - " + (ProductsList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next()); 

        myProduct.removeItemFromRecords(ProductsList, recordIndex);
        

        // Show Data contents
        System.out.println("\n\n-------------- ***** NEW PRODUCTS VALUES ***** -----------------------------");
        myProduct.showAllRecords(ProductsList);

        System.out.println("\nWhich table record index do you wish to change? [0 - " + (ProductsList.size() - 1) + "]");
        recordIndex = Integer.parseInt(myScanner.next());

        System.out.println("\nNew Value of [Age]: " );
        int newAgeValue = Integer.parseInt(myScanner.next());
        System.out.println("\nNew Value of [Name]: " );
        String newNameValue = myScanner.next();
        System.out.println("\nNew Value of [Address]: " );
        String newAddressValue = myScanner.next();

        myProduct.changeItemFromRecords(ProductsList, recordIndex, newAgeValue, newNameValue, newAddressValue);    
        
        
        
        // Show Data contents
        System.out.println("\n\n-------------- ***** MODIFIED PRODUCTS VALUES ***** -----------------------------");
        myProduct.showAllRecords(ProductsList);

        // Close the Scanner buffer
        myScanner.close();        
    }
     */     

}
