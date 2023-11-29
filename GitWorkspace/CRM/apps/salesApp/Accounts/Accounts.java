package apps.salesApp.Accounts;

import java.util.ArrayList;
import java.util.Iterator;

// import apps.salesApp.Accounts.Accounts;

public class Accounts extends AccountsLibrary
{
    // Model
        // primitives            
            String DBTableName;

            String DBTableField1Name;           // ID
            String DBTableField1Value; 
            String DBTableField2Name;           // NAME
            String DBTableField2Value;
            String DBTableField3Name;           // ADDRESS
            String DBTableField3Value;   
            
            /*
                +----+----------+--------------+
                | ID | NAME     | ADDRESS      |
                +----+----------+--------------+
                |  1 | Markus   | Hannover     |
                |  2 | Sosthene | Malaga       |
                |  3 | Ariella  | Torremolinos |
                |  4 | Francis  | London       |
                |  5 | Juninho  | Tours        |
                |  6 | Julie    | Louanda      |
                |  7 | Ma Maman | Malaga       |
                +----+----------+--------------+
             
             */
    
        // objects
        //ArrayList<Accounts> AccountsList = new ArrayList<Accounts>();    // instance of ArrayList class   

        // getters & setters        
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

        public String getDBTableField3Name() {
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


    // Controller
        // constructors                                             
            public Accounts()
            {
                DBTableName = "Accounts";
                
                DBTableField1Name = "ID";                
                DBTableField2Name = "NAME";                
                DBTableField3Name = "ADDRESS"; 
            }
            public Accounts(String DBTableField1Value, String DBTableField2Value, String DBTableField3Value)
            {                
                super();                                 

                this.DBTableField1Value = DBTableField1Value;                
                this.DBTableField2Value = DBTableField2Value;                
                this.DBTableField3Value = DBTableField3Value;  
            }                     
        // helper functions/methods
        @Override
        public String toString()
        {
            return "\n\n============================" + 
                    "\n" + getDBTableName() + " table fields and values are: " +
                    "\nfield 1 (" + getDBTableField1Name() + ") " + getDBTableField1Value() +                                         
                    "\nfield 2 (" + getDBTableField2Name() + ") " + getDBTableField2Value() +                     
                    "\nfield 3 (" + getDBTableField3Name() + ") " + getDBTableField3Value() +                                         
                    "\n============================";
        }

        // utility functions/methods
            // addToRecords() - C                 
            public void addToRecords(ArrayList<Accounts> someAccountsList, Accounts someAccountRecord)
            {                                                   
                //Accounts NewAccountRecordValue = new Accounts(DBTableField1Value, DBTableField2Value, DBTableField3Value);                
                someAccountsList.add(someAccountRecord);             
            }         
            // showAllRecords() - R 
            public void showAllRecords(ArrayList<Accounts> someAccountsList)
            {                                
                for(int counter = 0; counter < someAccountsList.size(); counter++)
                {                    
                    System.out.println(someAccountsList.get(counter).toString());                    
                };                                                
            }                                   
            // changeRecords() - U/E                          
            public void changeItemFromRecords(ArrayList<Accounts> someAccountsList, 
                                                Accounts someAccountRecord, int TableRecordIndex)
            {                             
                someAccountsList.set(TableRecordIndex,someAccountRecord);
            }            
            // removeItemFromRecord() - D  
            public void removeItemFromRecords(ArrayList<Accounts> someAccountsList, int TableRecordIndex)
            {
                // previous approach gave an IndexOutofBoundException
                // someAccountsList.remove(TableRecordIndex);               

                // Use the Iterator approach instead
                // THEORY: You cannot remove while iterating over a List with anything other than an Iterator
                final Iterator<Accounts> someAccountsListIterator = someAccountsList.iterator();
                while (someAccountsListIterator.hasNext())
                {                    
                    final Accounts SomeAccount = someAccountsListIterator.next();
                    
                    someAccountsListIterator.remove();            
                }
            }
            

    // View
        // create the frame
        // create the widgets
        // create the events
        // create the interactions
        // populate view with data
}
