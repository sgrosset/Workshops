package apps.salesApp.Opportunities;

import java.util.ArrayList;
import java.util.Iterator;

import apps.salesApp.Opportunities.Opportunities;
import apps.salesApp.Opportunities.Opportunities;
import apps.salesApp.Opportunities.Opportunities;

public class Opportunities extends OpportunitiesLibrary
{
    // Model
        // primitives
        int age;
        String name;
        String address;

        String DBTableName;
        
        String DBTableField1Name;               // ID
        String DBTableField1Value; 
        String DBTableField2Name;               // OPPORTUNITY_NAME 
        String DBTableField2Value;
        String DBTableField3Name;               // SERVICE_OF_INTEREST
        String DBTableField3Value; 
        String DBTableField4Name;               // PRODUCT_OF_INTEREST
        String DBTableField4Value; 
        String DBTableField5Name;               // OPPORTUNITY_VALUE
        String DBTableField5Value;   
        
        /*
        
            +----+--------------------------------+------------------------+------------------------+-------------------+
            | ID | OPPORTUNITY_NAME               | SERVICE_OF_INTEREST    | PRODUCT_OF_INTEREST    | OPPORTUNITY_VALUE |
            +----+--------------------------------+------------------------+------------------------+-------------------+
            |  1 | New ODA purchase               | SaaS Upgrade           | New ODA                | 9000              |
            |  2 | HP Server Installation         | Server Installation    | HP Server 9000         | 3750              |
            |  3 | SGI Server Repair              | SGI Oxygen 2000 Repair | SGU Oxygen 2000        | 15700             |
            |  4 | Android Smartphone Replacement | Smartphone Replacement | Android A21 Smartphone | 500               |
            +----+--------------------------------+------------------------+------------------------+-------------------+

         */         

    
        // objects
        //ArrayList<Opportunities> OpportunitiesList = new ArrayList<Opportunities>();    // instance of ArrayList class   

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
            public Opportunities(int someAge, String someName, String someAddress)
            {
                this.age = someAge;
                this.name = someName;
                this.address = someAddress;
            }  
            public Opportunities()
            {
                age = 0;
                name = "default child name";
                address = "default child's address";                                  
            }            
            public Opportunities(String DBTableField1Value, String DBTableField2Value, 
                                String DBTableField3Value, String DBTableField4Value,
                                String DBTableField5Value)
            {                
                super();


                DBTableName = "Opportunities";

                DBTableField1Name = "ID";                
                DBTableField2Name = "OPPORTUNITY_NAME";
                DBTableField3Name = "SERVICE_OF_INTEREST";
                DBTableField4Name = "PRODUCT_OF_INTEREST";                
                DBTableField5Name = "OPPORTUNITY_VALUE";                                                

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
            public void addToRecords(ArrayList<Opportunities> someOpportunitiesList, 
                                    int[] someAgeArray, String[] someNameArray, 
                                    String[] someAddressArray)
            {                                                   
                Opportunities OpportunitieRecord1 = new Opportunities(someAgeArray[0], someNameArray[0], someAddressArray[0]);        // instance of Opportunities class
                Opportunities OpportunitieRecord2 = new Opportunities(someAgeArray[1], someNameArray[1], someAddressArray[1]);        // instance of Opportunities class
                Opportunities OpportunitieRecord3 = new Opportunities(someAgeArray[2], someNameArray[2], someAddressArray[2]);        // instance of Opportunities class
                Opportunities OpportunitieRecord4 = new Opportunities(someAgeArray[3], someNameArray[3], someAddressArray[3]);        // instance of Opportunities class

                someOpportunitiesList.add(OpportunitieRecord1);
                someOpportunitiesList.add(OpportunitieRecord2);
                someOpportunitiesList.add(OpportunitieRecord3);
                someOpportunitiesList.add(OpportunitieRecord4);              
            }             
            
            public void addToRecords(ArrayList<Opportunities> someOpportunitiesList, Opportunities someOpportunitieRecord)
            {                                                                   
                someOpportunitiesList.add(someOpportunitieRecord);             
            } 
            // showAllRecords() - R 
            public void showAllRecords(ArrayList<Opportunities> someOpportunitiesList)
            {
                for(int counter = 0; counter < someOpportunitiesList.size(); counter++)
                {                    
                    System.out.println(someOpportunitiesList.get(counter).toString());                    
                }
            }           
            // changeRecords() - U/E
            public void changeItemFromRecords(ArrayList<Opportunities> someOpportunitiesList, int TableRecordIndex, 
                                                int someAgeValue, String someNameValue, String someAddressValue)
            {             
                Opportunities NewOpportunitieRecordValue = new Opportunities(someAgeValue, someNameValue, someAddressValue);        // instance of Opportunities class
                someOpportunitiesList.set(TableRecordIndex,NewOpportunitieRecordValue);
            }

            public void changeItemFromRecords(ArrayList<Opportunities> someOpportunitiesList, 
                                                Opportunities someOpportunitieRecord, int TableRecordIndex)
            {                             
                someOpportunitiesList.set(TableRecordIndex,someOpportunitieRecord);
            }  
            // removeItemFromRecord() - D  
            /*
            public void removeItemFromRecords(ArrayList<Opportunities> someOpportunitiesList, int TableRecordIndex)
            {
                someOpportunitiesList.remove(TableRecordIndex);
            }
            */

            public void removeItemFromRecords(ArrayList<Opportunities> someOpportunitiesList, int TableRecordIndex)
            {
                // previous approach gave an IndexOutofBoundException
                // someOpportunitiesList.remove(TableRecordIndex);               

                // Use the Iterator approach instead
                // THEORY: You cannot remove while iterating over a List with anything other than an Iterator
                final Iterator<Opportunities> someOpportunitiesListIterator = someOpportunitiesList.iterator();
                while (someOpportunitiesListIterator.hasNext())
                {                    
                    final Opportunities SomeOpportunitie = someOpportunitiesListIterator.next();
                    
                    someOpportunitiesListIterator.remove();            
                }
            }
            

    // View
        // create the frame
        // create the widgets
        // create the events
        // create the interactions
        // populate view with data
}
