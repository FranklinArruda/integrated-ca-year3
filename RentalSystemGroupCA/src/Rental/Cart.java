/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;

import Film.Film;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Ydalgo Jensen Francisco
 * @student id.: 2021336
 *
 * Shopping cart for film rental containing common functions used worldwide.
 *
 */
public class Cart {

    private List<Film> selectedFilms;

    public Cart() {
        this.selectedFilms = new ArrayList<>();
    }
    
    /**
     * Check if the Cart contains a film.
     *
     * @param film
     * @return
     */
    public boolean containsFilm(Film film){
        return selectedFilms.contains(film);
    }
    
     /**
     * Adds a film to the cart and check for duplicates.
     *
     * @param film
     * @return 
     */
    public boolean addFilm(Film film) {
        if(!containsFilm(film)){
        selectedFilms.add(film);
        return true;
        } else {
//            System.out.println(film.getTitle() + " is already in your cart.");
        }
        return false;
    }

    /**
     * Removes a film from the cart.
     *
     * @param film
     */
    public void removeFilm(Film film) {
        selectedFilms.remove(film);
    }

    /**
     * Gets the films chosen by the user.
     *
     * @return
     */
    public List<Film> getSelectedFilms() {
        return selectedFilms;
    }

    /**
     * To clear the cart. No parameters needed.
     *
     */
    public void clearCart() {
        selectedFilms.clear();
    }
    
}
