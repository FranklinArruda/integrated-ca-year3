/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;

import Film.Film;
import User.User;
import User.userHandler;
import java.util.Scanner;

/**
 *
 * @author Diego Ydalgo Jensen Francisco
 * @student id.: 2021336
 *
 * To coordinate the interactions in the movie rental system as authentication,
 * film selection and cart management
 *
 */
public class RentalSystem {

    private userHandler userHandler;
    private Catalog catalog;
    private User currentUser;
    private Cart currentCart;

    /**
     * The user handler used for authorizing the users to access the Films.
     *
     * @param userHandler
     */
    public RentalSystem(userHandler userHandler, Catalog catalog) {
        this.userHandler = userHandler;
        this.catalog = catalog;
        this.currentCart = new Cart();
    }

    public void start(User user) {
        this.currentUser = user;
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

    public void showCatalog() {
        System.out.println("Avaiable Movies: ");

        for (Film film : catalog.getFilms()) {
            System.out.println("- " + film.getTitle() + " (" + film.getYear() + "), Genre: " + film.getGenre()
                    + ", Price: " + film.getPrice() + ", ID: " + film.getId());
        }
    }

    public void selectFilm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID of the Fikm you want to rent: ");
        int filmId = scanner.nextInt();

        //
        Film selectedFilm = catalog.getFilmById(filmId);
        if (selectedFilm != null) {
            currentCart.addFilm(selectedFilm);
            System.out.println(selectedFilm.getTitle() + " added.");
        } else {
            System.out.println("Film not found.");
        }
    }

    public void addToCart(Film film) {
        currentCart.addFilm(film);
        System.out.println(film.getTitle());
    }

    public void checkout() {
        if (currentCart.getSelectedFilms().isEmpty()) {
            System.out.println("Empty cart;");
            return;
        }

        Checkout checkoutProcess = new Checkout();
        checkoutProcess.processCheckout(currentCart);
        System.out.println("Checkout complete.");

        currentCart.clearCart();
    }

}
