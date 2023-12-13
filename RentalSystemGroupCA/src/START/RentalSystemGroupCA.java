// ATTENTION!!! //
// THIS IS INTEDED TO BE KEPT LOCALLY SINCE CHANGES ON THE MAIN ARE BOUND TO BE MADE //
package START;

import User.userHandler;
import java.io.IOException;
import Enums.EnumContainer.userMenu;
import Film.CSVReader;
import Film.Film;
import Rental.Catalog;
import Rental.RentalSystem;
import User.User;
import static User.userValidation.myKeyboard;
import java.util.List;

/**
 * Student Name: Franklin Arruda Cirino 
 * Student No.: 2021368
 *
 * if user has registered = display login: and then menus (your methods and
 * classes in this part goes here). if user chooses to login and the user is not
 * found an option for the registration will appear, I call method sighUP. Once
 * the user has successfully signed up, and login will be displayed again. If
 * user chooses exit, the credentials entered will be lost as I am only saving
 * the data while the program is running because of hashmap.
 *
 * Note: As this a prototype. You will be required to register every time you
 * run the program.
 */
public class RentalSystemGroupCA {

    public static void main(String[] args) throws IOException {

        // user authentication, sign up and login Instance
        userHandler UserSessionManager = new userHandler();
        
        // To initialize and populate the catalog
        CSVReader csvReader = new CSVReader();
        List<Film> films = csvReader.readFilmsFromCSV();
        
        // Create and populate the catalog
        Catalog catalog = new Catalog();
        
        for(Film film : films){
            catalog.addFilm(film);
        }
        
        // More TODO

        // for loop to Inerate Enums (Status)assigning type to -1 to count the Enums
        // exemple taken from class lecture
        for (int type = 1; type <= userMenu.values().length; type++) {
            System.out.println(type + ": " + userMenu.values()[type - 1]);
        }

        // get user input to choose the below options using Global BufferedReader myKeyboard object
        int userOption = Integer.parseInt(myKeyboard.readLine());

        // user option switch
        switch (userOption) {
            case 1:
                // User chooses to sign up
                UserSessionManager.userSignUp();
            // Fall through to login after sign up

            case 2:
                // User chooses to log in
                User loggedInUser = UserSessionManager.handleLogin();
                if (loggedInUser != null) {
                    RentalSystem rentalSystem = new RentalSystem(UserSessionManager, catalog);
                    rentalSystem.showCatalog(); // Show the movie catalog
                    rentalSystem.selectFilm(); // Select film
                    rentalSystem.checkout(); // Aditional selection or checkout  
                    
                    // Assuming RentalSystem has a start method that takes User as a parameter
                    rentalSystem.start(loggedInUser);
                } else {
                    System.out.println("Login failed. Unable to access rental system.");
                }
                break;

            case 3:
                // User chooses to exit
                System.out.println("Goodbye for now!");
                break;

            default:
                // Invalid option handling
                break;
        }
    }
}
