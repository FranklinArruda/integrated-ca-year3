
package START;
import User.userHandler;
import java.io.IOException;
import Enums.EnumContainer.userMenu;
import static User.userValidation.myKeyboard;

 /**
  * Student Name: Franklin Arruda Cirino
  * Student No.: 2021368
  * 
  * if user has registered = display login: and then menus (your methods and classes in this part goes here).
  * if user chooses to login and the user is not found an option for the registration will appear, I call method sighUP.  
  * Once the user has successfully signed up, and login will be displayed again.
  * If user chooses exit, the credentials entered will be lost as I am only saving the data while the program is running because of hashmap.
  * 
  * Note: As this a prototype. You will be required to register every time you run the program. 
*/
public class RentalSystemGroupCA {
    
    public static void main(String[] args) throws IOException {

    // user authentication, sign up and login Instance
    userHandler UserSessionManager = new userHandler();
     
    // for loop to Inerate Enums (Status)assigning type to -1 to count the Enums
    // exemple taken from class lecture
    for (int type = 1; type <=userMenu.values().length; type++) {
         System.out.println( type + ": " + userMenu.values()[type-1]);
    }
    
    
   
   
    
    // get user input to choose the below options using Global BufferedReader myKeyboard object
    int userOption = Integer.parseInt(myKeyboard.readLine());
          
            // user option switch 
            switch(userOption){
                case 1:
                    UserSessionManager.userGreetings();
                    UserSessionManager.userSignUp();
                    System.out.println("Please Enter your Credentials to Login: \n");
                    UserSessionManager.handleLogin();
                    break;

                case 2:
                     UserSessionManager.handleLogin();
                     System.out.println("Please Resgiter Yourself: \n");
                      System.out.println("=========================");
                     UserSessionManager.userSignUp();
                     UserSessionManager.handleLogin();
                    break;
                    
                case 3:
                    System.out.println("Goodbye for now!");
                    break;
                default:// do nothing  
       }
    } 
}

