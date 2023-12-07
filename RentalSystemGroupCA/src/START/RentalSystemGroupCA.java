
package START;
import Greetings.GreetUser;
import Register.Register;
import java.io.IOException;
import UserValidation.UserValidation;

public class RentalSystemGroupCA {
    
    UserHistory userHistory = new UserHistory(); // ENIO? this line should't be here. 
    
    public static void main(String[] args) throws IOException {
        
        // Call greet Method with Enums | DONE BY FRANKLIN: 2021368
        GreetUser greet = new GreetUser();
        greet.greetUser(); 
        
        // call Register method with STRONG validations | DONE BY FRANKLIN: 2021368
        Register userRegister = new Register();
        userRegister.userSignUp();
         
        
    }
}
