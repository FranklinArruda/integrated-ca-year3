/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management;

import User.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diego
 */
public class UserDataManager {

    private static final String USER_DATA_FILE = "users.txt";

    // Method to save a new user
    public void saveUser(User user) throws IOException {
        try (FileWriter fw = new FileWriter(USER_DATA_FILE, true); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(user.getUserName() + "," + user.getUserEmail() + "," + user.getPassWord() + "\n");
        }
    }

    // Method to load all users
    public Map<String, User> loadUsers() throws IOException {
        File file = new File(USER_DATA_FILE);
        if (!file.exists()) {
            file.createNewFile(); // To create a new file
        }
        // To read the file created appending when needed it
        Map<String, User> users = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(USER_DATA_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userDetails = line.split(",");
                if (userDetails.length == 3) {
                    User user = new User();
                    user.setUserName(userDetails[0]);
                    user.setUserEmail(userDetails[1]);
                    user.setPassWord(userDetails[2]);
                    users.put(user.getUserEmail(), user);
                }
            }
        }
        return users;
    }
}
