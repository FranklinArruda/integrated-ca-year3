package User;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Student Name: Franklin Arruda Cirino 
 * Student No.: 2021368
 */
public class userValidation implements userValidationInterface {

    // global BufferedReader to void having to call it many times.
    public static BufferedReader myKeyboard = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String validateUserName(String userPrompt) {

        boolean valid = false;
        String userInput = "";

        //prompt user until input is valid
        do {
            try {

                System.out.print(userPrompt);
                userInput = myKeyboard.readLine().trim();

                // space between letter 'Z' and square brackets ']' in case the user types two words
                if (!userInput.matches("[a-zA-Z ]+")) {
                    System.err.println("Only Letters Allowed. Please try again!");
                    valid = false;
                } else {
                    valid = true;
                }
            } catch (Exception e) {
                // this will be if the parseInt threw an error -- so the user did not enter a number
                System.err.println("Something went Wrong. Please try Again!");
            }
            // space between letter 'Z' and square brackets ']' in case the user types two words
        } while (!userInput.matches("[a-zA-Z ]+"));

        //userInput must be text now
        return (userInput);
    }

    ;


    @Override
    public String validateEmail(String email, String emailConfirm) {

        String userEmail = "";
        String confirmEmail = "";
        boolean emailCheck = true;

        do {
            try {

                // get email
                System.out.print(email);
                userEmail = myKeyboard.readLine();

                // confirm email
                System.out.print(emailConfirm);
                confirmEmail = myKeyboard.readLine();

                if (!userEmail.equals(confirmEmail)) {
                    emailCheck = false;

                    System.out.println("\n");
                    System.out.println("You must enter a VALID email, and both must macth. Please try again!");
                    System.out.println("> Exemple: franklin@student.cct.ie");
                    System.out.println("> Match: franklin@student.cct.ie" + "\n");
                }

            } catch (Exception e) {
                System.err.println("Sorry! Something went wrong");
            }

        } while (!userEmail.equals(confirmEmail));
        return confirmEmail;
    }

    ;


    @Override
    public String validatePassword(String passwordPrompt, String confirmPassPrompt) {

        String UserPassword = "";
        String confirmUserPass = "";
        boolean passCheck = true;

        do {
            try {

                // get password
                System.out.print(passwordPrompt);
                UserPassword = myKeyboard.readLine();

                // confirm password
                System.out.print(confirmPassPrompt);
                confirmUserPass = myKeyboard.readLine();

                if (!UserPassword.equals(confirmUserPass)) {
                    System.out.println("\n");
                    System.err.println("Password doesn't macth, please try again!");
                    passCheck = false;
                }

            } catch (Exception e) {
                System.err.println("Sorry! Something went wrong");
            }

            // keep going while pass is the same as the first one entered
        } while (!UserPassword.equals(confirmUserPass));

        // return userPASS
        return confirmUserPass;
    }

}
