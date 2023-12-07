
package Register;
import UserValidation.UserValidation;
import User_Getters_Setters.User;


/**
 * Student Name: Franklin Arruda Cirino
 * Student No.: 2021368
 */
public class Register {
    
    /**
     * Common Input Tasks
     * Import User Validation Class => KEYBOARD INPUT UTILITIES
     * 
     * Void method. Only to register as I kept the validation in other class
     * this way I can have a more organized and clean code!
     * 
     * Get user Input and assingn a return value to this method
     * It will only store the value once the user enters a valid name 
     */
    public void userSignUp(){
        
        //Imports user validation class
        UserValidation validate = new UserValidation();
                
        // get userName
        String userName = validate.validateUserName("Enter your name: ").trim();
        
        // get userEmail
        String userEmail = validate.validateEmail("Enter your Email: ", "Confirm Email: ").trim();
        
        // get passwrod
        String userPassword = validate.validatePassword("Enter your Password: ", "Confirm Password: ").trim();
            
        
        
        
        // testing output
        System.out.println("\n");
        System.out.println("Your user name is: " + userName);
        System.out.println("Your email is: " + userEmail);
        System.out.println("Your password is: " + userPassword);
        
        // call Setters from user class to set the credentials entered.
        
        // TESTING SETTERS & GETTERS
        
        User userCredentials = new User(); // setters instance

        
        userCredentials.setUserName(userName);
        userCredentials.setUserEmail(userEmail);
        userCredentials.setPassWord(userPassword);
        
        String name = userCredentials.getUserName();
        String email = userCredentials.getUserEmail();
        String pass = userCredentials.getPassWord();
        
        System.out.println("NAME: " + name + " EMAIL: " + email + " PASSWORD: " + pass);
        
        /*NOTE FOR MYSELF: I was instantiating two instances from User class,
          one (get) and the other (set). But it was returnig a null value when getting name.
        
          Use the same object instance to set and get name....
        
        */  
        
        
        
       /* HERE I WOULD CALL A METHOD TO STORE THE CREDENTIALS ONCE IT IS VALIDATED
          within a hash map and later would create a login class.
        
        Later I WILL create a login class that is going to search the key set for each credentials
        entered using get name method.
       
        */
    }
}
