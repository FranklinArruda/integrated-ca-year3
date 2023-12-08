
package User;

/**
 * Student Name: Franklin Arruda Cirino
 * Student No.: 2021368
 */
public interface userValidationInterface {
    
    /**
     * Get some text from the user (via keyboard)
     * @param prompt -- the message or request to the user
     * @return - the users input as a String
     * If user does not enter text, output an error and ask them again
     */
    public String validateUserName(String prompt);
    
    /**
     * It validates the first email input against the second
     * @param email gets the email entered
     * @param emailConfirm gets the confirmation email
     * @return the email Confirmed variable 
     */
    public String validateEmail(String email, String emailConfirm);
    
    /**
     * It validates the first email input against the second
     * @param password gets the email entered
     * @param confirmPass gets the confirmation email
     * @return the email Confirmed variable 
     */
     public String validatePassword(String password, String confirmPass);
     

     
    
}
