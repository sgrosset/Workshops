package apps.SalesApp.Accounts;

import java.util.ArrayList;
import java.util.Iterator;




/**
 * Class Manifest:
 *      Global Variables:
 *          [primitives]
 *              markusAccount: String[]
                sostheneAccount: String[]
                ariellaCredentials: String[]
                francisAccount: String[]
                juninhoAccount: String[]
                julieAccount: String[]
                mamanAccount: String[]
                
                DBTableName: String
                DBTableField1Name: String
                DBTableField1Value: String
                DBTableField2Name: String          
                DBTableField2Value: String
                DBTableField3Name: String          
                DBTableField3Value: String             
 *          [objects]
 *              AccountsList: ArrayList<Accounts>
 *      Methods:
 *          Constructors:
 *              Accounts()
 *                  [primitives]                      
 *                  [objects]
 *              Accounts(String DBTableField1Value, String DBTableField2Value, String DBTableField3Value) 
 *                  [primitives]                      
 *                  [objects]
 *              Accounts(String[] objectArray)
 *                  [primitives]                      
 *                  [objects] 
 *          Getters & Setters:
                String getDBTableName() 
                void setDBTableName(String DBTableName) 

                String getDBTableField1Name() 
                void setDBTableField1Name(String DBTableField1Name) 
                
                String getDBTableField1Value() 
                void setDBTableField1Value(String DBTableField1Value) 
                
                String getDBTableField2Name() 
                void setDBTableField2Name(String DBTableField2Name) 
                
                String getDBTableField2Value() 
                void setDBTableField2Value(String DBTableField2Value) 
                
                String getDBTableField3Name() 
                void setDBTableField3Name(String DBTableField3Name) 
                
                String getDBTableField3Value() 
                void setDBTableField3Value(String DBTableField3Value)                   
 *          Helpers:
 *              String toString()
 *                  [primitives]
 *                  [objects] 
 *          Utilities:
 *              void showAllRecords(ArrayList<Accounts> someAccountsList)
 *              void addToRecords(ArrayList<Accounts> someObjectArrayList, Accounts someAccountRecord)
 *              void changeItemFromRecords(ArrayList<Accounts> someAccountsList, Accounts someAccountRecord, int TableRecordIndex)
 *              void removeItemFromRecords(ArrayList<Accounts> someAccountsList, int TableRecordIndex)
 *                  [primitives]
 *                  [objects]
 */
public class Accounts extends AccountsLibrary 
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


    // Data Model
    /*
        +----+-----------+-------------------+
        | ID | NAME      | ADDRESS           |
        +----+-----------+-------------------+
        |  1 | IBM       | New York          |
        |  2 | APPLE     | Cupertino         |
        |  3 | DECATHLON | Villeneuve-d'Ascq |
        |  4 | BOSCH     | Gerlingen         |
        |  5 | SUZUKI    | Hamamatsu         |
        |  6 | HUAWEI    | Shenzhen          |
        |  7 | Maman     | Malaga            |
        +----+-----------+-------------------+             
    */

    // Variables
        // Primitives
            // Static Data Model
            String[] company1Account = {"1","Company 1","Address 1"};
            String[] company2Account = {"1","Company 2","Address 2"};
            String[] company3Account = {"1","Company 3","Address 3"};
            // RDBMS Data Model
            String DBTableName;

            String DBTableField1Name;           // ID
            String DBTableField1Value; 
            String DBTableField2Name;           // NAME
            String DBTableField2Value;
            String DBTableField3Name;           // ADDRESS
            String DBTableField3Value;             
        // Objects
            ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();    // instance of ArrayList class   
    // CONTROLLERS
        // Constructors
            public Accounts()      // no-argument constructor: initializing static data model "label" values
            {
                //  variable
                    // primitives   
                        // Database to Data Model Transposition
                        this.DBTableName = "Accounts";
                        this.DBTableField1Name = "ID";                        
                        this.DBTableField2Name = "NAME";                        
                        this.DBTableField3Name = "ADDRESS";                        
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
            public Accounts(String DBTableField1Value, String DBTableField2Value, 
                            String DBTableField3Value)      // one argument constructor: using data model field values as arguments
            {                                                           
                this();     // calling the no-argument constructor

                this.DBTableField1Value = DBTableField1Value;                
                this.DBTableField2Value = DBTableField2Value;                
                this.DBTableField3Value = DBTableField3Value;                
            } 
            public Accounts(String[] objectArray)    // one argument constructor: using data model array values as arguments
            {                
                this();     // calling the no-argument constructor
                //  variable
                    // primitives   
                        // Database to Data Model Transposition                        
                        this.DBTableField1Value = objectArray[0];                        
                        this.DBTableField2Value = objectArray[1];                        
                        this.DBTableField3Value = objectArray[2];                                     
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
        // Getters & Setters            
            public String getDBTableName() 
            {
                return this.DBTableName;
            }
            public void setDBTableName(String DBTableName) 
            {
                this.DBTableName = DBTableName;
            }

            public String getDBTableField1Name() 
            {
                return this.DBTableField1Name;
            }
            public void setDBTableField1Name(String DBTableField1Name) 
            {
                this.DBTableField1Name = DBTableField1Name;
            }

            public String getDBTableField1Value() 
            {
                return this.DBTableField1Value;
            }
            public void setDBTableField1Value(String DBTableField1Value) 
            {
                this.DBTableField1Value = DBTableField1Value;
            }

            public String getDBTableField2Name() 
            {
                return this.DBTableField2Name;
            }
            public void setDBTableField2Name(String DBTableField2Name) 
            {
                this.DBTableField2Name = DBTableField2Name;
            }

            public String getDBTableField2Value() 
            {
                return this.DBTableField2Value;
            }
            public void setDBTableField2Value(String DBTableField2Value) 
            {
                this.DBTableField2Value = DBTableField2Value;
            }

            public String getDBTableField3Name() 
            {
                return this.DBTableField3Name;
            }
            public void setDBTableField3Name(String DBTableField3Name) 
            {
                this.DBTableField3Name = DBTableField3Name;
            }

            public String getDBTableField3Value() 
            {
                return this.DBTableField3Value;
            }
            public void setDBTableField3Value(String DBTableField3Value) 
            {
                this.DBTableField3Value = DBTableField3Value;
            }    
            
            
        // Helpers
            public String toString()
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
                        return "\n\n============================" + 
                        "\n" + getDBTableName() + " table fields and values are: " +
                        "\nfield 1 (" + getDBTableField1Name() + ") " + getDBTableField1Value() +                                         
                        "\nfield 2 (" + getDBTableField2Name() + ") " + getDBTableField2Value() +                     
                        "\nfield 3 (" + getDBTableField3Name() + ") " + getDBTableField3Value() +                                         
                        "\n============================";
            }
        // Utilities                         
            // ==== CRUDS ====
            // showAllRecords() - R
            public void showAllRecords(ArrayList<Accounts> someAccountsList)
            {
                //  variable
                    // primitives                                        
                    // objects
                // logic
                    // presentation
                    // Inputs
                    // Processing
                        for(int counter = 0; counter < someAccountsList.size(); counter++)
                        {                    
                            System.out.println(someAccountsList.get(counter).toString());                    
                        }; 
                    // Validations
                    // Exceptions            
                    // Outputs  
                    // Cleanup
                    // Returns 
            }
            public void addToRecords(ArrayList<Accounts> someObjectArrayList, Accounts someAccountRecord)
            {
                //  variable
                    // primitives                                                   
                    // objects
                // logic
                    // presentation
                    // Inputs
                    // Processing
                        // Database to Data Model Transposition                          
                        someObjectArrayList.add(someAccountRecord);                        
                    // Validations
                    // Exceptions            
                    // Outputs  
                    // Cleanup
                    // Returns 
            }
            // changeRecords() - U/E  
            public void changeItemFromRecords(ArrayList<Accounts> someAccountsList, 
                                                Accounts someAccountRecord, int TableRecordIndex)
            {        
                //  variable
                    // primitives                                                   
                    // objects
                // logic
                    // presentation
                    // Inputs
                    // Processing
                        // Database to Data Model Transposition                       
                        someAccountsList.set(TableRecordIndex,someAccountRecord);
                    // Validations
                    // Exceptions            
                    // Outputs  
                    // Cleanup
                    // Returns 
            } 
            // removeItemFromRecord() - D  
            public void removeItemFromRecords(ArrayList<Accounts> someAccountsList, int TableRecordIndex)
            {   
                //  variable
                    // primitives                                                   
                    // objects             
                    final Iterator<Accounts> someAccountsListIterator = someAccountsList.iterator();
                // logic
                    // presentation
                    // Inputs
                    // Processing
                        // Database to Data Model Transposition
                        while (someAccountsListIterator.hasNext())
                        {                    
                            final Accounts SomeAccount = someAccountsListIterator.next();
                            
                            someAccountsListIterator.remove();            
                        }
                    // Validations
                    // Exceptions            
                    // Outputs  
                    // Cleanup
                    // Returns
            }
}
