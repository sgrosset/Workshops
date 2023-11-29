package apps.salesApp.Products;

import java.util.ArrayList;
import java.util.Iterator;

import apps.salesApp.Products.Products;
import apps.salesApp.Products.Products;
import apps.salesApp.Products.Products;

public class Products extends ProductsLibrary
{
    // Model
        // primitives
        int age;
        String name;
        String address;

        String DBTableName;
        
        String DBTableField1Name;
        String DBTableField1Value; 
        String DBTableField2Name;
        String DBTableField2Value;
        String DBTableField3Name;
        String DBTableField3Value; 
        String DBTableField4Name;
        String DBTableField4Value; 
        String DBTableField5Name;
        String DBTableField5Value;   
        
        /*
            +----+---------------------+--------------+---------------+------------------+
            | ID | PRODUCT_NAME        | PRODUCT_TYPE | PRODUCT_PRICE | PRODUCT_QUANTITY |
            +----+---------------------+--------------+---------------+------------------+
            |  1 | Oracle ODA          | Server       | 9000          | 99               |
            |  2 | HP Server 9000      | Server       | 3750          | 99               |
            |  3 | SGI Oxygen 2000     | Server       | 15700         | 99               |
            |  4 | Samsung Android A21 | Smartphone   | 500           | 98               |
            +----+---------------------+--------------+---------------+------------------+

        */
    
        // objects
        //ArrayList<Products> ProductsList = new ArrayList<Products>();    // instance of ArrayList class   

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
            public Products(int someAge, String someName, String someAddress)
            {
                this.age = someAge;
                this.name = someName;
                this.address = someAddress;
            }  
            public Products()
            {
                age = 0;
                name = "default child name";
                address = "default child's address";                                  
            }            
            public Products(String DBTableField1Value, String DBTableField2Value, 
                            String DBTableField3Value, String DBTableField4Value,
                            String DBTableField5Value)
            {                
                super();


                DBTableName = "Products";

                DBTableField1Name = "ID";                
                DBTableField2Name = "PRODUCT_NAME";                
                DBTableField3Name = "PRODUCT_TYPE";                
                DBTableField4Name = "PRODUCT_PRICE";            
                DBTableField5Name = "PRODUCT_QUANTITY"; 
                                
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
            public void addToRecords(ArrayList<Products> someProductsList, 
                                    int[] someAgeArray, String[] someNameArray, 
                                    String[] someAddressArray)
            {                                                   
                Products ProductRecord1 = new Products(someAgeArray[0], someNameArray[0], someAddressArray[0]);        // instance of Products class
                Products ProductRecord2 = new Products(someAgeArray[1], someNameArray[1], someAddressArray[1]);        // instance of Products class
                Products ProductRecord3 = new Products(someAgeArray[2], someNameArray[2], someAddressArray[2]);        // instance of Products class
                Products ProductRecord4 = new Products(someAgeArray[3], someNameArray[3], someAddressArray[3]);        // instance of Products class

                someProductsList.add(ProductRecord1);
                someProductsList.add(ProductRecord2);
                someProductsList.add(ProductRecord3);
                someProductsList.add(ProductRecord4);              
            }             
            
            public void addToRecords(ArrayList<Products> someProductsList, Products someProductRecord)
            {                                                                   
                someProductsList.add(someProductRecord);             
            } 
            // showAllRecords() - R 
            public void showAllRecords(ArrayList<Products> someProductsList)
            {
                for(int counter = 0; counter < someProductsList.size(); counter++)
                {                    
                    System.out.println(someProductsList.get(counter).toString());                    
                }
            }           
            // changeRecords() - U/E
            public void changeItemFromRecords(ArrayList<Products> someProductsList, int TableRecordIndex, 
                                                int someAgeValue, String someNameValue, String someAddressValue)
            {             
                Products NewProductRecordValue = new Products(someAgeValue, someNameValue, someAddressValue);        // instance of Products class
                someProductsList.set(TableRecordIndex,NewProductRecordValue);
            }

            public void changeItemFromRecords(ArrayList<Products> someProductsList, 
                                                Products someProductRecord, int TableRecordIndex)
            {                             
                someProductsList.set(TableRecordIndex,someProductRecord);
            }  
            // removeItemFromRecord() - D  
            /*
            public void removeItemFromRecords(ArrayList<Products> someProductsList, int TableRecordIndex)
            {
                someProductsList.remove(TableRecordIndex);
            }
            */

            public void removeItemFromRecords(ArrayList<Products> someProductsList, int TableRecordIndex)
            {
                // previous approach gave an IndexOutofBoundException
                // someProductsList.remove(TableRecordIndex);               

                // Use the Iterator approach instead
                // THEORY: You cannot remove while iterating over a List with anything other than an Iterator
                final Iterator<Products> someProductsListIterator = someProductsList.iterator();
                while (someProductsListIterator.hasNext())
                {                    
                    final Products SomeProduct = someProductsListIterator.next();
                    
                    someProductsListIterator.remove();            
                }
            }
            

    // View
        // create the frame
        // create the widgets
        // create the events
        // create the interactions
        // populate view with data
}
