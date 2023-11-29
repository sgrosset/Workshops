package apps.salesApp.Users;

import java.util.ArrayList;
import java.util.Iterator;

import apps.salesApp.Users.Users;

public class Users 
{
    // Model
        // primitives
        String DBTableName;

        String DBTableField1Name;           // User ID
        String DBTableField1Value;          
        String DBTableField2Name;           // User First Name
        String DBTableField2Value;          
        String DBTableField3Name;           // User Surname
        String DBTableField3Value;   
        String DBTableField4Name;           // User Login
        String DBTableField4Value;
        String DBTableField5Name;           // User Password
        String DBTableField5Value;
        String DBTableField6Name;           // User Role
        String DBTableField6Value;         
        
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
            

    // Controllers
        // Getters & Setters
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

            public String getDBTableField6Name() {
                return this.DBTableField6Name;
            }
            public void setDBTableField6Name(String DBTableField6Name) {
                this.DBTableField6Name = DBTableField6Name;
            }

            public String getDBTableField6Value() {
                return this.DBTableField6Value;
            }
            public void setDBTableField6Value(String DBTableField6Value) {
                this.DBTableField6Value = DBTableField6Value;
            }
        
        // Constructors
            public Users()
            {

            };
            public Users(String DBTableField1Value, String DBTableField2Value, 
                        String DBTableField3Value, String DBTableField4Value,
                        String DBTableField5Value, String DBTableField6Value)
            {                
                super();                

                DBTableName = "Users";
                
                DBTableField1Name = "ID";                
                DBTableField2Name = "FIRST_NAME";                
                DBTableField3Name = "SURNAME";                  
                DBTableField4Name = "LOGIN";                  
                DBTableField5Name = "PASSWORD";                  
                DBTableField6Name = "ROLE";                  

                this.DBTableField1Value = DBTableField1Value;                
                this.DBTableField2Value = DBTableField2Value;                
                this.DBTableField3Value = DBTableField3Value;  
                this.DBTableField4Value = DBTableField4Value;                
                this.DBTableField5Value = DBTableField5Value;                
                this.DBTableField6Value = DBTableField6Value;
            }  
        
        // Helper Functions & Methods
            @Override
            public String toString()
            {
                return "\n\n============================" + 
                        "\n" + getDBTableName() + " table fields and values are: " +
                        "\nfield 1 (" + getDBTableField1Name() + ") " + getDBTableField1Value() +                                         
                        "\nfield 2 (" + getDBTableField2Name() + ") " + getDBTableField2Value() +                     
                        "\nfield 3 (" + getDBTableField3Name() + ") " + getDBTableField3Value() + 
                        "\nfield 4 (" + getDBTableField4Name() + ") " + getDBTableField4Value() +                                         
                        "\nfield 5 (" + getDBTableField5Name() + ") " + getDBTableField5Value() +                     
                        "\nfield 6 (" + getDBTableField6Name() + ") " + getDBTableField6Value() +                                                                                 
                        "\n============================";
            }
        // Utility functions & Methods - CRUDs
            // CRUD: CREATE (C)
            public void addToRecords(ArrayList<Users> someUsersList, Users someUserRecord)
            {                                                                   
                someUsersList.add(someUserRecord);             
            }

            // CRUD: READ (R)
            public void showAllRecords(ArrayList<Users> someUsersList, String userMode)
            {                                           
                for(int counter = 0; counter < someUsersList.size(); counter++)
                {                    
                    System.out.println(someUsersList.get(counter).toString());                    
                };                    
                
            }

            // CRUD: UPDATE/EDIT (U/E)
            public void changeItemFromRecords(ArrayList<Users> someUsersList, 
                                                Users someUserRecord, int TableRecordIndex)
            {                             
                someUsersList.set(TableRecordIndex,someUserRecord);
            }

            // CRUD: DELETE (D)
            public void removeItemFromRecords(ArrayList<Users> someUsersList, int TableRecordIndex)
            {
                // previous approach gave an IndexOutofBoundException
                // someUsersList.remove(TableRecordIndex);               

                // Use the Iterator approach instead
                // THEORY: You cannot remove while iterating over a List with anything other than an Iterator
                final Iterator<Users> someUsersListIterator = someUsersList.iterator();
                while (someUsersListIterator.hasNext())
                {                    
                    final Users SomeUser = someUsersListIterator.next();
                    
                    someUsersListIterator.remove();            
                }
            }

        // Views    
}
