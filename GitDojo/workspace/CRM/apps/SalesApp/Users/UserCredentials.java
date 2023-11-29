package apps.SalesApp.Users;





/**
 * Class Manifest:
 *      Global Variables:
 *          [primitives]
 *              private userID: String
                private userFirstName: String
                private userSurname: String
                private userLogin: String
                private userPassword: String
                private userRole: String

                private userCredentials: String[]
 *          [objects]
 *      Methods:
 *          Constructors:
 *              SalesApp()
 *                  [primitives]
 *                      isAppClosed: boolean
 *                      loginAttemptCounter: int
 *                      menuArgs: String[]
 *                      loginCredentials: String[]
 *  
 *                      systemCredentials: String[]
 *                      sostheneCredentials: String[]
 *                      juninhoCredential: String[]
 *                      ariellaCredentials: String[]
 *                      malyaCredentials: String[]
 *                  [objects]
 *                      ThisUserCredentials: UserCredentials
 *          Getters & Setters:
                String getUserID()
                void setUserID(String userID)

                String getUserFirstName()
                void setUserFirstName(String userFirstName)

                String getUserSurname()
                void setUserSurname(String userSurname)

                String getUserLogin()
                void setUserLogin(String userLogin)

                String getUserPassword()
                void setUserPassword(String userPassword)

                String getUserRole()
                void setUserRole(String userRole)

                String[] getUserCredentials(int credentialsArrayIndex)
                void setUserCredentials(String[] userCredentials)

                boolean getIsUserValid()
                void setIsUserValid(boolean isUserValid)
 *          Helpers:
 *              [primitives]
 *              [objects] 
 *          Utilities:
 *              void userCredentialsCheck()
 *                  [primitives]
 *                  [objects]
 */
public class UserCredentials 
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


    // GLOBAL CLASS VARIABLES
    private String userID = "";
    private String userFirstName = "";
    private String userSurname = "";
    private String userLogin = "";
    private String userPassword = "";
    private String userRole = "";    

    private String[] userCredentials = {
        getUserID(),
        getUserFirstName(),
        getUserSurname(),
        getUserLogin(),
        getUserPassword(),
        getUserRole()
    };

    private boolean isUserValid = false;

    



    // CONTROLLERS: GETTERS & SETTERS
    public String getUserID() 
    {
        return this.userID;
    }
    public void setUserID(String userID) 
    {
        this.userID = userID;
    }

    public String getUserFirstName() 
    {
        return this.userFirstName;
    }
    public void setUserFirstName(String userFirstName) 
    {
        this.userFirstName = userFirstName;
    }

    public String getUserSurname() 
    {
        return this.userSurname;
    }
    public void setUserSurname(String userSurname) 
    {
        this.userSurname = userSurname;
    }

    public String getUserLogin() 
    {
        return this.userLogin;
    }
    public void setUserLogin(String userLogin) 
    {
        this.userLogin = userLogin;
    }

    public String getUserPassword() 
    {
        return this.userPassword;
    }
    public void setUserPassword(String userPassword) 
    {
        this.userPassword = userPassword;
    }

    public String getUserRole() 
    {
        return this.userRole;
    }
    public void setUserRole(String userRole) 
    {
        this.userRole = userRole;
    }

    public String[] getUserCredentials(int credentialsArrayIndex) 
    {
        this.userCredentials[credentialsArrayIndex] = userCredentials[credentialsArrayIndex];

        return this.userCredentials;
    }
    public void setUserCredentials(String[] userCredentials) 
    {
        
        this.userCredentials = userCredentials;    
    }
    
    public boolean getIsUserValid() 
    {
        return this.isUserValid;
    }
    public void setIsUserValid(boolean isUserValid) 
    {
        this.isUserValid = isUserValid;
    }

    // Checking the userCredentials Array
    public void userCredentialsCheck()
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
                    System.out.println("\n\n==============================\n" + 
                           "\tuserCredentialsCheck:\n" + 
                           "\nID:                " + getUserID() + 
                           "\nFirst Name:        " + getUserFirstName() + 
                           "\nSurname:           " + getUserSurname() + 
                           "\nLogin:             " + getUserLogin() +
                           "\nPassword:          " + getUserPassword() +
                           "\nRole:              " + getUserRole() +
                           "\n==============================\n\n"
                           );
                // Cleanup
                // Returns         
    }
}
