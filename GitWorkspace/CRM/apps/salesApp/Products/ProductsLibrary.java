package apps.salesApp.Products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import apps.salesApp.salesAppLibrary;

public class ProductsLibrary extends salesAppLibrary
{
    // Database information
        private String DBUserName = "sicolo";
        private String DBName = "SalesApp";

    // create our mysql database connection
        private String someDriver1 = "com.mysql.jdbc.Driver";            
        private String myDriver = someDriver1;

        private String myUrl = "jdbc:mysql://localhost/" + DBName;
        
    // Data Model 
        // This is the list of fields by table in the database          
        private String DBTableName = "Products";
            private String DBTableField1Name = "ID";
            private String DBTableField1Value = "default";                
            private String DBTableField2Name = "PRODUCT_NAME";
            private String DBTableField2Value = "default";
            private String DBTableField3Name = "PRODUCT_TYPE";
            private String DBTableField3Value = "default";
            private String DBTableField4Name = "PRODUCT_PRICE";
            private String DBTableField4Value = "default";
            private String DBTableField5Name = "PRODUCT_QUANTITY";
            private String DBTableFiel5Value = "default";
            
        ArrayList<Products> ProductsList = new ArrayList<Products>();           // ArrayList

    
    // Getter & Setters
    public String getDBUserName() {
        return this.DBUserName;
    }
    public void setDBUserName(String DBUserName) {
        this.DBUserName = DBUserName;
    }

    public String getDBName() {
        return this.DBName;
    }
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    public String getSomeDriver1() {
        return this.someDriver1;
    }
    public void setSomeDriver1(String someDriver1) {
        this.someDriver1 = someDriver1;
    }

    public String getMyDriver() {
        return this.myDriver;
    }
    public void setMyDriver(String myDriver) {
        this.myDriver = myDriver;
    }

    public String getMyUrl() {
        return this.myUrl;
    }
    public void setMyUrl(String myUrl) {
        this.myUrl = myUrl;
    }
        

    public ArrayList<Products> getProductsList() {
        return this.ProductsList;
    }
    public void setProductsList(ArrayList<Products> ProductsList) {
        this.ProductsList = ProductsList;
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

    public String getDBTableFiel5Value() {
        return this.DBTableFiel5Value;
    }
    public void setDBTableFiel5Value(String DBTableFiel5Value) {
        this.DBTableFiel5Value = DBTableFiel5Value;
    }

    // Utility functions & methods    

    // System-Mode
    // These methods will perform CRUDS into the database
    // TO BE USED CAREFULLY - BY System Admins ONLY

    public void getAllRecordsFromDBProductsTable()    
    {                
        try
        {                        
            // Connect to database
            Class.forName(getMyDriver());
            Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");
                        
            
            // SQL SELECT query.             
            String readAllRecordsquery = "SELECT * FROM " + getDBTableName();                        

            // create the java statement
            Statement st = conn.createStatement();
            
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(readAllRecordsquery);

            int TableRecordIndex = 0;
            while (rs.next())
            {
                TableRecordIndex++;        

                setDBTableField1Value(rs.getString( getDBTableField1Name() ));
                setDBTableField2Value(rs.getString( getDBTableField2Name() ));
                setDBTableField3Value(rs.getString( getDBTableField3Name() ));                
                setDBTableField4Value(rs.getString( getDBTableField4Name() ));                
                setDBTableFiel5Value(rs.getString( getDBTableField5Name() ));                                

                // instance of Products class
                Products NewProductRecordValue = new Products(getDBTableField1Value(),                                                               
                                                                            getDBTableField2Value(),                                                                
                                                                            getDBTableField3Value(),
                                                                            getDBTableField4Value(),
                                                                            getDBTableFiel5Value());

                ArrayList<Products> ProductsList = new ArrayList<Products>();           // ArrayList
                
                NewProductRecordValue.addToRecords(ProductsList,NewProductRecordValue);          
                
                // print the results
                NewProductRecordValue.showAllRecords(ProductsList);
                System.out.println("\tProducts Record Index: [" + TableRecordIndex + "]");
            }              
            System.out.println("---------------------------------------------------\n\n");  
            st.close();         
        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        catch(ClassNotFoundException ex) 
        {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }                       
    } 

    public void getRecordFromDBProductsTableByID(int rowIndex)    
    {        
        try
        {            
            // Connect to database
            Class.forName(getMyDriver());
            Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");
                       
            String TableIndexfieldName = getDBTableField1Name();            
            String TablefieldName = getDBTableName();
            String TablefieldNewValue = "";

            // SQL SELECT query
            String readRecordByRowQuery = "SELECT * FROM " + getDBTableName() + 
                                          " WHERE " + TableIndexfieldName + " = " + rowIndex;                        

            // create the java statement
            Statement st = conn.createStatement();
            
            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(readRecordByRowQuery);
                        
            int TableRecordIndex = 0;
            while (rs.next())
            {
                TableRecordIndex++;

                setDBTableField1Value(rs.getString( getDBTableField1Name() ));
                setDBTableField2Value(rs.getString( getDBTableField2Name() ));
                setDBTableField3Value(rs.getString( getDBTableField3Name() ));                
                setDBTableField4Value(rs.getString( getDBTableField4Name() ));                
                setDBTableFiel5Value(rs.getString( getDBTableField5Name() ));                                

                // instance of Products class
                Products NewProductRecordValue = new Products(getDBTableField1Value(),                                                               
                                                                            getDBTableField2Value(),                                                                
                                                                            getDBTableField3Value(),
                                                                            getDBTableField4Value(),
                                                                            getDBTableFiel5Value());

                ArrayList<Products> ProductsList = new ArrayList<Products>();           // ArrayList
                
                NewProductRecordValue.addToRecords(ProductsList,NewProductRecordValue);          
                
                // print the results
                NewProductRecordValue.showAllRecords(ProductsList);
                System.out.println("\tProducts Record Index: [" + TableRecordIndex + "]");
            }              
            System.out.println("---------------------------------------------------\n\n");  
            st.close();           
        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        catch(ClassNotFoundException ex) 
        {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }  
    }

    public void deleteRecordFromDBProductsTableByID(int rowIndex)    
    {        
        try
        {            
            // Connect to database
            Class.forName(getMyDriver());
            Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");

            String TableIndexfieldName = getDBTableField1Name();            
            String TablefieldName = getDBTableName();
            String TablefieldNewValue = "";
            boolean queryStatus = false;

            Products deletedProductRecord = new Products();
            

            // (1) execute statement approach   
                // A- Query building     
                // String deleteRecordByRowQuery = "DELETE FROM " + getDBTableName()  + " WHERE " + TableIndexfieldName + " = " + rowIndex; 
                // B- Create statement                                    
                // Statement st = conn.createStatement();      
                // C- Execute Statement               
                // queryStatus = st.execute(deleteRecordByRowQuery);                     // delete Product record row in the database 
                // IF execute() returns the boolean FALSE
                //  THEN a query returned an INT value or returned NOTHING
                //      HERE This IS the behaviour expected as we are DELETING from the ResultSet at index rowIndex !!!         
                // ELSE IF execute() returns the boolean TRUE
                //  THEN a ResultSet Object was returned
                //      HERE This is NOT the behaviour expected as we are DELETING from the ResultSet at index rowIndex !!!
                /*
                if(queryStatus == false)     
                {
                   System.out.println("\n" + 
                                       "============ ----***---- ===============================" +
                                       "\nSUCCESS ! -- Deleted table record at row ("+ rowIndex + ")");                                       
                } else
                {               
                   System.out.println("\n" + 
                                        "============ ----***---- ===============================" +                                        
                                        "\n<< ERROR >> -- Coult not delete table record at row ("+ rowIndex + ")");
                }
                */
            

            // (2) executeUpdate() statement approach
                // A- Query building
                // String deleteRecordByRowQuery = "DELETE FROM " + getDBTableName()  + " WHERE " + TableIndexfieldName + " = " + rowIndex;      
                // B- Create statement                  
                // Statement st = conn.createStatement(); 
                // C- Execute Statement       
                // int count = st.executeUpdate(deleteRecordByRowQuery);                               
                /*
                if(count>0)
                {
                   System.out.println("\n" + 
                                       "============ ----***---- ===============================" +
                                       "\nSUCCESS ! -- Deleted table record at row ("+ rowIndex + ")");
                } else
                {               
                   System.out.println("\n" + 
                                        "============ ----***---- ===============================" +
                                        "\n<< ERROR >> -- Coult not delete table record at row ("+ rowIndex + ")");
                }
                */


            // (3) Prepared statement approach
                // A- Query building
                String deleteRecordByRowQuery = "DELETE FROM " + getDBTableName()  + " WHERE " + TableIndexfieldName + " = ?";                        
                // B- Create statement
                PreparedStatement preparedStmt = conn.prepareStatement(deleteRecordByRowQuery);
                // C- Invoke statement with arguments
                preparedStmt.setInt(1, rowIndex);
                // D- Execute Statement
                int count = preparedStmt.executeUpdate();
                if(count>0)
                {
                   System.out.println("\n" + 
                                       "============ ----***---- ===============================" +
                                       "\nSUCCESS ! -- Deleted table record at row ("+ rowIndex + ")");
                } else
                {               
                   System.out.println("\n" + 
                                        "============ ----***---- ===============================" +
                                        "\n<< ERROR >> -- Coult not delete table record at row ("+ rowIndex + ")");
                }



            deletedProductRecord.removeItemFromRecords(ProductsList, rowIndex);  // delete Product record row in the ProductsArrayList
            // st.close();  
            // preparedStmt.close();
            conn.close();
        }        
        catch (IndexOutOfBoundsException indexOutOfBoundsException)
        {
            // handle any errors
            System.out.println("IndexOutOfBoundsException: " + indexOutOfBoundsException.getMessage()); 

            indexOutOfBoundsException.printStackTrace();           
        }
        catch (SQLException sqlException)
        {
            // handle any errors
            System.out.println("SQLException: " + sqlException.getMessage());
            System.out.println("SQLState: " + sqlException.getSQLState());
            System.out.println("VendorError: " + sqlException.getErrorCode());

            sqlException.printStackTrace();
        }
        catch(ClassNotFoundException classNotFoundException) 
        {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);

            classNotFoundException.printStackTrace();
        }
        catch (Exception exception)
        {
            System.err.println("Got an exception! ");
            System.err.println(exception.getMessage());

            exception.printStackTrace();
        }
    }

    public void updateRecordFromDBProductsTableByID(int rowIndex, String TablefieldName, String TablefieldValue)    
    {        
        try
        {                        
            // Connect to database
            Class.forName(getMyDriver());
            Connection conn = DriverManager.getConnection(getMyUrl(), getDBUserName(), "Scu96spg@2023");

            String TableIndexfieldName = getDBTableField1Name(); 
            boolean queryStatus = false;  
            String parsedRowIndex = String.valueOf(rowIndex);                                        

            // SQL SELECT query                                                
            String updatedRecordByRowQuery = "UPDATE " + getDBTableName()  +                                              
                                             " SET " + TablefieldName + " = ? " + 
                                             " WHERE " + TableIndexfieldName + " = ?";
                                             // " WHERE " + TableIndexfieldName + " = " + rowIndex;                        
                                             //" SET " + TablefieldName + " = " + TablefieldValue +

            // create the java statement
            // Statement st = conn.createStatement();
            PreparedStatement preparedStmt = conn.prepareStatement(updatedRecordByRowQuery);            
            preparedStmt.setString(1, TablefieldValue);            
            preparedStmt.setString(2, parsedRowIndex);            
            
            // execute the query, and get a java resultset            
            // queryStatus = st.execute(updatedRecordByRowQuery);                     // delete Product record row in the database                                

            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            
            // st.close();  
            preparedStmt.close();
            conn.close();
        }        
        catch (IndexOutOfBoundsException ex)
        {
            // handle any errors
            System.out.println("IndexOutOfBoundsException: " + ex.getMessage());            
        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        catch(ClassNotFoundException ex) 
        {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
