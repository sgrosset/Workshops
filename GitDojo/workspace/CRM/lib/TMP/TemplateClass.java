/**
 * Declaration of Package namespace
 */
package lib.TMP;

/**
 * Utility Class: static class that can be easily accessed and imported everywhere. In order to
 * prevent instantiation of a Utility class a common practice is to make the class final and
 * create a private constructor.
 * 
 * A utility class is a special case of helper class where all methods are static.
 * Only containts static class that perform small and repetitive operations 
 * on a kind of instance.
 * 
 * it doesn't have any dependencies into your project and can be ported from project to project
 * without breaking or becoming useless.
 * 
 * utils - Static class, that can be freely moved and imported anywhere.
 * Doing general tasks that could be useful in different modules
 */




// ***** =======================================================================    *****/





// ***** =======================================================================    *****/
/**
 * Importing Library dependencies
 */
//  import app.lib.*;





// ***** =======================================================================    *****/
/**
* Summary: My Utility Class
*
* @author  (Sosthene Grosset-Janin)
* @version (1.0)
* @since   February 2023
*/
public class TemplateClass
{
    // ***** =======================================================================    *****/
    // Constants
        // Static Constants
        // Non-Static Constants
    // Variables    :: Recommended - Keep Private OR Use Getters & Setters (only if needed)
        // Declarations
            // Static Constants
            // Non-Static Constants
        // Intialisations    




    // ***** =======================================================================    *****/
    /* Static initialization Block
        (executes code before the object initialization)
        (executed only ONCE and automatically called as soon as class is loaded in memory)
        (Code for parent class execute before child class)
        (It is used to initialize static variables of the class)
        (It is mostly used for changing default value of static variables)
        NOTE: cannot return a value
              cannot throw exceptions
              cannot use the "this" or "super" keywords
    */
    static {
        // Constants
        // Static Constants
        // Non-Static Constants
    // Variables    :: Recommended - Keep Private OR Use Getters & Setters (only if needed)
        // Declarations
            // Static Constants
            // Non-Static Constants
        // Intialisations  

    // Same implementation as other types of classes (see below)
    }





    // ***** =======================================================================    *****/
    /* instance initialization block 
        (the purpose is to initialize the instance data members)
        (It can run many times whenever there is a call to the constructor)    
        (executed at the time of instance creation)
    */
    {
        // Constants
            // Static Constants
            // Non-Static Constants
        // Variables    :: Recommended - Keep Private OR Use Getters & Setters (only if needed)
            // Declarations
                // Static Constants
                // Non-Static Constants
        // Intialisations  

        // Same implementation as other types of classes (see below)
    }





    // ***** =======================================================================    *****/
    // Objects
        // Enums (Constant Non-Primitives)
        // Non-Primitives

        // Wrapper Classes (and Constructors)
            /*
             * Wrapper Class a class whose object wraps or contains primitive data types. When
             * we create an object to a wrapper class, it contains a field and in this field,
             * we can store primitive data types. In other words, we can wrap a primitive value
             * into a wrapper class object.
             * 
             * We can use two ways to construct the instance of the Wrapper Classes
             * Using the constructor of the wrapper class
             * Using the valueOf() method provided by the Wrapper classes
             * Using concept of AutoBoxing
             * 
             * ClassName object = value;   
             * Integer I1 = new Integer(30);     
             * //Constructor which takes int value as an argument                           
             * 
             * The automatic conversion of wrapper type into its corresponding primitive type
             * is known as unboxing.
             */

        // Instances
            // Declarations
            // Intialisations
        
        // Static Nested / Inner Classes (and Constructors)
        // Non-static Nested / Inner Classes (and Constructors)
        // Anonymous Classes (and Constructors)
            /**
             * the anonymous inner class is a class without names and only one object is created
             * Anonymous class is useful when we have to create an instance of the object with
             * overloading methods of a class or interface without creating a subclass of class.
             *      Anonymous can be created in two ways:
             *          Class(can also be Abstract)
             *          Interface
             *      In the anonymous class we can declare the following:
             *          Fields
             *          Extra methods
             *          Instance Initializers
             *          Local classes
             *      It can implement an interface or extend a class
             *  NOTE: The syntax of an anonymous class is just like constructor except that
             *        there is a class definition in the block
             *  NOTE: An anonymous class cannot access local variables in its enclosing scope
             *        that are not declared as final or effectively final.
             *  NOTE: We cannot declare static initializers or member interfaces in an
             *       anonymous class.
             *  NOTE: An anonymous class can have static members provided that they are
             *        constant variables.
             *  NOTE: During construction, there might exist exactly one instance of an
             *        anonymous class. Therefore, they can never be abstract. Since they have 
             *        no name, we can't extend them. For the same reason, anonymous classes    
             *        cannot have explicitly declared constructors.
             *  TIP: Anonymous inner classes are useful in writing implementation classes for
             *       listener interfaces in graphics programming. 
             *  TIP: We usually use anonymous classes when we have to modify on the fly the
             *       implementation of methods of some classes. In this case, we can avoid
             *       adding new *.java files to the project in order to define top-level
             *       classes. This is especially true if that top-level class would be used
             *       just one time.
             *  SYNTAX:
             *      AnonymousClass = interface,abstract/concrete class.
             *          AnonymousClass t = new AnonymousClass()
             *          {
             *              public void someMethod()
             *              {
             *              }
             *          }
             */
        // Interface Classes
                /*
                 * You can have only public, static, final variables and, public, abstract,
                 * methods as of Java7.
                 * From Java8 onwards interfaces allow default methods and static methods.
                 * From Java9 onwards interfaces allow private and private static methods.
                 */
        // Abstract Classes (and Constructors)
                /*
                 * We cannot create an instance of an abstract class but it can be a subclass
                 * When we declare a subclass as abstract then it is necessary to provide the
                 * implementation of abstract methods. Therefore, the subclass must also be
                 * declared abstract
                 */
        // Static Class
        // Final Class
                /*
                 * The purpose of the final class is to make the class immutable like the
                 * String class. 
                 * It is only a way to make the class immutable. 
                 * Remember that the final class cannot be extended. 
                 * It also prevents the class from being sub-classed.
                 */
        // Concrete Class
                /*
                 * These are the regular Java classes
                 */
        // Singleton Class
                /*
                 * A class that has only an object at a time is known as a singleton class.
                 * Still, if we are trying to create an instance a second time, that newly
                 * created instance points to the first instance. 
                 * NOTE: It is usually used to control access while dealing with the database
                 * connection and socket programming.
                 * HOWTO:
                 *      Create a PRIVATE constructor.
                 *      Create a static method (by using the lazy initialization) that returns
                 *      the object of the singleton class.
                 * SYNTAX:
                 *  public class Singleton  
                 *  {  
                 *      private String objectState;  
                 *      private static Singleton instance = null;  
                 *      
                 *      private Singleton() throws Exception  
                 *      {  
                 *          this.objectState = "Javatpoint";  
                 *      }  
                 *      
                 *      public static Singleton getInstance()  
                 *      {  
                 *          if(instance==null)  
                 *          {  
                 *              try  
                 *              {  
                 *                  instance=new Singleton();  
                 *              }  
                 *              catch(Exception e)  
                 *              {  
                 *                  e.printStackTrace();  
                 *              }  
                 *          }  
                 *          return instance;  
                 *      }  
                 * 
                 *      public String getObjectState()  
                 *      {
                 *          return objectState;  
                 *      }  
                 * 
                 *      public void setObjectState(String objectState)  
                 *      {  
                 *          this.objectState = objectState;  
                 *      }  
                 *  } // END OF SINGLETON CLASS
                 */
        // POLO Class
                    /*
                     * In Java, POJO stands for Plain Old Java Object.
                     * A Java class that contains only private variables, setter and getter is
                     * known as POJO class.
                     * It is used to define Java objects that increase the reusability and
                     * readability of a Java program. 
                     * This provides encapsulation.
                     */





    // ***** =======================================================================    *****/
    // Private static Methods & Functions
    //      Recommended - Limit overriding
    //      Either make the class final, make every method final, 
    //      or hide the constructors and expose only static factory methods.
    // Methods & Functions    
    //      Recommended - Limit overriding
    //      Either make the class final, make every method final, 
    //      or hide the constructors and expose only static factory methods.
    /**
     * SPECIAL Method / Function (Constructor) for objects of this class
     * NOTE: constructors are run EACH time a new instance of a class is created
     *       Can be overloaded
     * //@param  y  a sample parameter for a method
     * // @return    the sum of x and y
     */
    public TemplateClass()
    {        
        // Constants
            // Static Constants
            // Non-Static Constants
        // Variables    :: Recommended - Keep Private OR Use Getters & Setters (only if needed)
            // Declarations
                // Static Constants
                // Non-Static Constants
        // Intialisations

        // Objects
            // Enums (Constant Non-Primitives)
            // Non-Primitives
            // Instances
                // Declarations
                // Intialisations            
            // Local Classes
        
            // Code
                // Inputs
                // Processing
                // Validations
                // Exceptions            
                // Outputs            
                // Returns: none       
    }





/**
   * Helper Functions
   * 
   * These Functions aim to:
   * "help" the implementation of the main() function of this application.
   * "main" and other functions of this class.
   * 
   * This is the xxxx function
   * Goal: This function aims to....
   * Dependencies: The dependencies of this function are ...
   * @param inputArgs These are the input arguments for this function
   * @return int helperContext_status Returns the value of the "status" of the current function
   */
    public int helperContext(String[] inputArgs)
    {        
        // Constants
            // Static Constants
            // Non-Static Constants
        // Variables    :: Recommended - Keep Private OR Use Getters & Setters (only if needed)
            // Declarations
                // Static Constants
                // Non-Static Constants
                int helperContext_status;
                String[] inputArgsLocal;
        // Intialisations
        helperContext_status = 0;
        inputArgsLocal = inputArgs;

        // Objects
            // Enums (Constant Non-Primitives)
            // Non-Primitives
            // Instances
                // Declarations
                // Intialisations            
            // Local Classes
        
            // Code
                // Inputs
                // Processing
                // Validations
                // Exceptions            
                // Outputs            
                // Returns: int helperContext_status
                return helperContext_status;
    }    




    /**
   * Helper Methods
   * 
   * These Methods aim to:
   * "help" the implementation of the main() function of this application.
   * "main" and other method of this class.
   * 
   * This is the xxxx method
   * Goal: This method aims to....
   * Dependencies: The dependencies of this method are ...
   * @param inputArgs These are the input arguments for this method
   * //@return otherHelperContext_status Returns the value of the "status" of the current method
   */
  public void otherHelperContext(String[] inputArgs)
  {        
      // Constants
          // Static Constants
          // Non-Static Constants
      // Variables    :: Recommended - Keep Private OR Use Getters & Setters (only if needed)
          // Declarations
              // Static Constants
              // Non-Static Constants
              int otherHelperContext_status;
              String[] inputArgsLocal;
      // Intialisations
      otherHelperContext_status = 0;
      inputArgsLocal = inputArgs;

      // Objects
          // Enums (Constant Non-Primitives)
          // Non-Primitives
          // Instances
              // Declarations
              // Intialisations            
          // Local Classes
      
          // Code
              // Inputs
              // Processing
              // Validations
              // Exceptions            
              // Outputs            
              // Returns: none
  }    



    // ***** =======================================================================    *****/
    //                  END OF CODE
    // ***** =======================================================================    *****/
}