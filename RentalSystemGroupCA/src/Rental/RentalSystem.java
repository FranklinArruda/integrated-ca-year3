/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;

import User.User;
import User.userHandler;

/**
 *
 * @author Diego Ydalgo Jensen Francisco
 * @student id.: 2021336
 * 
 * To coordinate the interactions in the movie rental system 
 * as authentication, film selection and cart management
 * 
 */
public class RentalSystem {
    private userHandler userHandler;
    private User currentUser;
    private Cart currentCart;

    /**
     * The user handler used for authorizing the users to access the Films.
     * @param userHandler
     */
    public RentalSystem(userHandler userHandler) {
        this.userHandler = userHandler;
        this.currentCart = new Cart();
    }

    public void loginUser(String email, String password) {
        // Assume userHandler has a method to authenticate users
        User user = userHandler.userLogin(email, password);
        if (user != null) {
            this.currentUser = user;
            System.out.println("Login successful. Welcome " + user.getUserName());
            // Proceed to show movie catalog
        } else {
            System.out.println("Login failed. Please try again.");
        }
    }

    // Other methods like showCatalog, addToCart, checkout, etc.
}