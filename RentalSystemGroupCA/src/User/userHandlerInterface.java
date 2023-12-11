
package User;

/**
 * Student Name: Franklin Arruda Cirino
 * Student No.: 2021368
 */
public interface userHandlerInterface {
    
/**
  * Import Enum container
  * Call enum Hour of the day to be validaded inside the if statement
  * Call enum greetings toString method and print it out
 */
 public String userGreetings();
    
  
/**
  * Common Input Tasks
  * Import User Validation Class => KEYBOARD INPUT UTILITIES
  * 
  * Void method. Only to register as I kept the validation in other class
  * this way I can have a more organized and clean code!
  * 
  * Get user Input and assigns a return value to this method
  * It will only store the value once the user enters a valid name 
 */
 public void userSignUp();
   
 
/**
  * 
  * It gets the user credentials such as email and password
  * It looks up in the hash map wether or not the email is found
  * 
  * User instance is created to check then the password associated with the email entered
  * using getPassword() to look for the password entered.
  * 
  * If email exists and password associated with the email is true. Then, login is successful
  * 
 */
 public User userLogin(String userEmail, String userPass);  
 
/**
 * It handles the user login for the rest of the functionalities such as Rental system etc
 */
public void handleLogin();

}
