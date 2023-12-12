package User;

import Enums.EnumContainer;
import static User.userValidation.myKeyboard;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 * Student Name: Franklin Arruda Cirino 
 * Student No.: 2021368
 */
public class userHandler implements userHandlerInterface {

    private HashMap<String, User> userMap; // hash map to store the user Credentials

    // Constructor
    public userHandler() {
        this.userMap = new HashMap<>(); // initializing the hash map
    }

    @Override
    public String userGreetings() {

        // getting current time to greeting the user
        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);

        // if hour is less than 12 , display good morning
        if (hour < EnumContainer.Hour.TWELVE.getHour()) {
            return EnumContainer.Greetings.MORNING.toString();
        } // if hour is equal to 12 , display noon, midday(lunch time :-)
        else if (hour == EnumContainer.Hour.TWELVE.getHour()) {
            return EnumContainer.Greetings.NOON.toString();
        } // if hour is less than 12 and not greater than 17, display good afternoon
        else if (hour < EnumContainer.Hour.SEVENTEEN.getHour() && !(hour == EnumContainer.Hour.TWELVE.getHour())) {
            return EnumContainer.Greetings.AFTERNOON.toString();
        } // if hour is greater than 17, display evening
        else {
            return EnumContainer.Greetings.EVENING.toString();
        }
    }

    @Override
    public void userSignUp() {

        //Imports user validation class
        userValidation validate = new userValidation();

        // User getters and setters Instance
        User userCredentials = new User();

        // get userName
        String userName = validate.validateUserName("Enter your name: ").trim();

        // get userEmail
        String userEmail = validate.validateEmail("Enter your Email: ", "Confirm Email: ").trim();

        // get passwrod
        String userPassword = validate.validatePassword("Enter your Password: ", "Confirm Password: ").trim();

        if (userMap.containsKey(userEmail)) {
            System.out.println(userName + " Username is already taken! Please choose another name.");
        } else {
            userCredentials.setUserName(userName);
            userCredentials.setUserEmail(userEmail);
            userCredentials.setPassWord(userPassword);
            userMap.put(userEmail, userCredentials);
            System.out.println("User registered Successfully! \n");
        }

    }

    @Override
    public User userLogin(String userEmail, String userPass) {
        /*
            The following if statement Create an object from User class
            and assigns the retrievedUser object to my map userMap.get
            that checks the email.
         */
        User retrievedUser = userMap.get(userEmail);
        if (retrievedUser != null && retrievedUser.getPassWord() != null && retrievedUser.getPassWord().equals(userPass)) {
            System.out.println("Welcome, " + retrievedUser.getUserName());
            return retrievedUser;

        } else {
            System.out.println("Login failed. User not found or incorrect password.\n");
            return null;
        }
    }

    @Override
    public User handleLogin() {
        User loggedInUser = null;
        try {
            // Prompt user for email and password or obtain them from some source
            System.out.print("Enter your email: ");
            String userEmail = myKeyboard.readLine();

            System.out.print("Enter your password: ");
            String userPass = myKeyboard.readLine();

            // will use the return type object USER here
            // using this method you can call user using getter method since the user is stored in the hash map
            loggedInUser = userLogin(userEmail, userPass);

            if (loggedInUser != null) {

                // getting the user
                System.out.println("Logged in user: " + loggedInUser.getUserName());

                // here guys you use this method
            } else {
                System.out.println("UserName or password wrong!");
            }

        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
        return loggedInUser;
    }

}
