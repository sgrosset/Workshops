package apps.salesApp.Contacts;

import java.util.ArrayList;
import java.util.Iterator;

import apps.salesApp.Contacts.Contacts;
import apps.salesApp.Contacts.Contacts;
import apps.salesApp.Contacts.Contacts;

public class Contacts extends ContactsLibrary
{
    // Model
        // primitives
        int age;
        String name;
        String address;

        String DBTableName;
        
        String DBTableField1Name;               // ID
        String DBTableField1Value; 
        String DBTableField2Name;               // NAME
        String DBTableField2Value;
        String DBTableField3Name;               // JOB
        String DBTableField3Value; 
        String DBTableField4Name;               // PHONE
        String DBTableField4Value; 
        String DBTableField5Name;               // EMAIL
        String DBTableField5Value;     


        /*
        
            +----+----------+------------+---------+-----------------+
            | ID | NAME     | JOB        | PHONE   | EMAIL           |
            +----+----------+------------+---------+-----------------+
            |  1 | John     | Carpenter  | 123456  | john@you.com    |
            |  2 | Valerie  | Singer     | 235456  | valerie@you.com |
            |  3 | Cassidy  | Developer  | 345688  | cassidy@you.com |
            |  4 | Harper   | Consultant | 958786  | harper@you.com  |
            |  5 | Benjamin | Painter    | 7895520 | ben@me.com      |
            |  6 | Marie    | Singer     | 123456  | marie@you.com   |
            |  7 | Luc      | Teacher    | 852963  | luc@you.com     |
            +----+----------+------------+---------+-----------------+

         */
    
        // objects
        //ArrayList<Contacts> ContactsList = new ArrayList<Contacts>();    // instance of ArrayList class   

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
            public Contacts(int someAge, String someName, String someAddress)
            {
                this.age = someAge;
                this.name = someName;
                this.address = someAddress;
            }  
            public Contacts()
            {
                age = 0;
                name = "default child name";
                address = "default child's address";                                  
            }            
            public Contacts(String DBTableField1Value, String DBTableField2Value, 
                            String DBTableField3Value, String DBTableField4Value,
                            String DBTableField5Value)
            {                
                super();


                DBTableName = "Contacts";

                DBTableField1Name = "ID";                
                DBTableField2Name = "NAME";                
                DBTableField3Name = "JOB";                
                DBTableField4Name = "PHONE";            
                DBTableField5Name = "EMAIL";                

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
            public void addToRecords(ArrayList<Contacts> someContactsList, 
                                    int[] someAgeArray, String[] someNameArray, 
                                    String[] someAddressArray)
            {                                                   
                Contacts ContactRecord1 = new Contacts(someAgeArray[0], someNameArray[0], someAddressArray[0]);        // instance of Contacts class
                Contacts ContactRecord2 = new Contacts(someAgeArray[1], someNameArray[1], someAddressArray[1]);        // instance of Contacts class
                Contacts ContactRecord3 = new Contacts(someAgeArray[2], someNameArray[2], someAddressArray[2]);        // instance of Contacts class
                Contacts ContactRecord4 = new Contacts(someAgeArray[3], someNameArray[3], someAddressArray[3]);        // instance of Contacts class

                someContactsList.add(ContactRecord1);
                someContactsList.add(ContactRecord2);
                someContactsList.add(ContactRecord3);
                someContactsList.add(ContactRecord4);              
            }             
            
            public void addToRecords(ArrayList<Contacts> someContactsList, Contacts someContactRecord)
            {                                                                   
                someContactsList.add(someContactRecord);             
            } 
            // showAllRecords() - R 
            public void showAllRecords(ArrayList<Contacts> someContactsList)
            {
                for(int counter = 0; counter < someContactsList.size(); counter++)
                {                    
                    System.out.println(someContactsList.get(counter).toString());                    
                }
            }           
            // changeRecords() - U/E
            public void changeItemFromRecords(ArrayList<Contacts> someContactsList, int TableRecordIndex, 
                                                int someAgeValue, String someNameValue, String someAddressValue)
            {             
                Contacts NewContactRecordValue = new Contacts(someAgeValue, someNameValue, someAddressValue);        // instance of Contacts class
                someContactsList.set(TableRecordIndex,NewContactRecordValue);
            }

            public void changeItemFromRecords(ArrayList<Contacts> someContactsList, 
                                                Contacts someContactRecord, int TableRecordIndex)
            {                             
                someContactsList.set(TableRecordIndex,someContactRecord);
            }  
            // removeItemFromRecord() - D  
            /*
            public void removeItemFromRecords(ArrayList<Contacts> someContactsList, int TableRecordIndex)
            {
                someContactsList.remove(TableRecordIndex);
            }
            */

            public void removeItemFromRecords(ArrayList<Contacts> someContactsList, int TableRecordIndex)
            {
                // previous approach gave an IndexOutofBoundException
                // someContactsList.remove(TableRecordIndex);               

                // Use the Iterator approach instead
                // THEORY: You cannot remove while iterating over a List with anything other than an Iterator
                final Iterator<Contacts> someContactsListIterator = someContactsList.iterator();
                while (someContactsListIterator.hasNext())
                {                    
                    final Contacts SomeContact = someContactsListIterator.next();
                    
                    someContactsListIterator.remove();            
                }
            }
            

    // View
        // create the frame
        // create the widgets
        // create the events
        // create the interactions
        // populate view with data
}
