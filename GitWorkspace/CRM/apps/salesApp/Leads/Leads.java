package apps.salesApp.Leads;

import java.util.ArrayList;
import java.util.Iterator;

import apps.salesApp.Leads.Leads;
import apps.salesApp.Leads.Leads;
import apps.salesApp.Leads.Leads;

public class Leads extends LeadsLibrary
{
    // Model
        // primitives
        int age;
        String name;
        String address;

        String DBTableName;
        
        String DBTableField1Name;               // ID
        String DBTableField1Value; 
        String DBTableField2Name;               // LEAD NAME
        String DBTableField2Value;
        String DBTableField3Name;               // SERVICE_OF_INTEREST
        String DBTableField3Value; 
        String DBTableField4Name;               // PRODUCT_OF_INTEREST
        String DBTableField4Value; 
        String DBTableField5Name;               // LEAD_RATING
        String DBTableField5Value;   
        
        /*
        
            +----+-------------------------------------+------------------------+---------------------+-------------+
            | ID | LEAD_NAME                           | SERVICE_OF_INTEREST    | PRODUCT_OF_INTEREST | LEAD_RATING |
            +----+-------------------------------------+------------------------+---------------------+-------------+
            |  1 | German shop ODA                     | SaaS Upgrade           | ODA                 | 3           |
            |  2 | HP Server 9000 installation         | HP 9000 installation   | HP 9000             | 4           |
            |  3 | SGI Indy 2000 repair                | Server repair          | SGI Indy 2000       | 4           |
            |  4 | Android A21 Smaprthpone replacement | Smartphone replacement | Android A21         | 5           |
            +----+-------------------------------------+------------------------+---------------------+-------------+


         */
    
        // objects
        //ArrayList<Leads> LeadsList = new ArrayList<Leads>();    // instance of ArrayList class   

        // getters & setters
        public int getAge() {
            return this.age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return this.address;
        }
        public void setAddress(String address) {
            this.address = address;
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

        public String getDBTableField4Name() {
            return this.DBTableField4Name;
        }
        public void setDBTableField4Name(String DBTableField4Name) {
            this.DBTableField4Name = DBTableField4Name;
        }

        public String getDBTableField4Value() {
            return this.DBTableField4Value;
        }
        public void setDBTableField4Value(String DBTableField4Value) {
            this.DBTableField4Value = DBTableField4Value;
        }
        
        public String getDBTableField5Name() {
            return this.DBTableField5Name;
        }
        public void setDBTableField5Name(String DBTableField5Name) {
            this.DBTableField5Name = DBTableField5Name;
        }

        public String getDBTableField5Value() {
            return this.DBTableField5Value;
        }
        public void setDBTableField5Value(String DBTableField5Value) {
            this.DBTableField5Value = DBTableField5Value;
        }

    // Controller
        // constructors               
            public Leads(int someAge, String someName, String someAddress)
            {
                this.age = someAge;
                this.name = someName;
                this.address = someAddress;
            }  
            public Leads()
            {
                age = 0;
                name = "default child name";
                address = "default child's address";                                  
            }            
            public Leads(String DBTableField1Value, String DBTableField2Value, 
                            String DBTableField3Value, String DBTableField4Value,
                            String DBTableField5Value)
            {                
                super();


                DBTableName = "Leads";

                DBTableField1Name = "ID";                
                DBTableField2Name = "LEAD_NAME";                
                DBTableField3Name = "SERVICE_OF_INTEREST";                
                DBTableField4Name = "PRODUCT_OF_INTEREST";            
                DBTableField5Name = "LEAD_RATING";                

                this.DBTableField1Value = DBTableField1Value;                
                this.DBTableField2Value = DBTableField2Value;                
                this.DBTableField3Value = DBTableField3Value;  
                this.DBTableField4Value = DBTableField4Value;  
                this.DBTableField5Value = DBTableField5Value;  
            }           
        // helper functions/methods
        @Override
        public String toString() // CRUD/CRED - E
        {
            return "\n\n============================" + 
                    "\n" + getDBTableName() + " table fields and values are: " +
                    "\nfield 1 (" + getDBTableField1Name() + ") " + getDBTableField1Value() +                                         
                    "\nfield 2 (" + getDBTableField2Name() + ") " + getDBTableField2Value() +                     
                    "\nfield 3 (" + getDBTableField3Name() + ") " + getDBTableField3Value() +                     
                    "\nfield 4 (" + getDBTableField4Name() + ") " + getDBTableField4Value() +                     
                    "\nfield 5 (" + getDBTableField5Name() + ") " + getDBTableField5Value() +                     
                    "\n============================";
        }
        // utility functions/methods
            // addToRecords() - C  
            public void addToRecords(ArrayList<Leads> someLeadsList, 
                                    int[] someAgeArray, String[] someNameArray, 
                                    String[] someAddressArray)
            {                                                   
                Leads LeadRecord1 = new Leads(someAgeArray[0], someNameArray[0], someAddressArray[0]);        // instance of Leads class
                Leads LeadRecord2 = new Leads(someAgeArray[1], someNameArray[1], someAddressArray[1]);        // instance of Leads class
                Leads LeadRecord3 = new Leads(someAgeArray[2], someNameArray[2], someAddressArray[2]);        // instance of Leads class
                Leads LeadRecord4 = new Leads(someAgeArray[3], someNameArray[3], someAddressArray[3]);        // instance of Leads class

                someLeadsList.add(LeadRecord1);
                someLeadsList.add(LeadRecord2);
                someLeadsList.add(LeadRecord3);
                someLeadsList.add(LeadRecord4);              
            }             
            
            public void addToRecords(ArrayList<Leads> someLeadsList, Leads someLeadRecord)
            {                                                                   
                someLeadsList.add(someLeadRecord);             
            } 
            // showAllRecords() - R 
            public void showAllRecords(ArrayList<Leads> someLeadsList)
            {
                for(int counter = 0; counter < someLeadsList.size(); counter++)
                {                    
                    System.out.println(someLeadsList.get(counter).toString());                    
                }
            }           
            // changeRecords() - U/E
            public void changeItemFromRecords(ArrayList<Leads> someLeadsList, int TableRecordIndex, 
                                                int someAgeValue, String someNameValue, String someAddressValue)
            {             
                Leads NewLeadRecordValue = new Leads(someAgeValue, someNameValue, someAddressValue);        // instance of Leads class
                someLeadsList.set(TableRecordIndex,NewLeadRecordValue);
            }

            public void changeItemFromRecords(ArrayList<Leads> someLeadsList, 
                                                Leads someLeadRecord, int TableRecordIndex)
            {                             
                someLeadsList.set(TableRecordIndex,someLeadRecord);
            }  
            // removeItemFromRecord() - D  
            /*
            public void removeItemFromRecords(ArrayList<Leads> someLeadsList, int TableRecordIndex)
            {
                someLeadsList.remove(TableRecordIndex);
            }
            */

            public void removeItemFromRecords(ArrayList<Leads> someLeadsList, int TableRecordIndex)
            {
                // previous approach gave an IndexOutofBoundException
                // someLeadsList.remove(TableRecordIndex);               

                // Use the Iterator approach instead
                // THEORY: You cannot remove while iterating over a List with anything other than an Iterator
                final Iterator<Leads> someLeadsListIterator = someLeadsList.iterator();
                while (someLeadsListIterator.hasNext())
                {                    
                    final Leads SomeLead = someLeadsListIterator.next();
                    
                    someLeadsListIterator.remove();            
                }
            }
            

    // View
        // create the frame
        // create the widgets
        // create the events
        // create the interactions
        // populate view with data
}
