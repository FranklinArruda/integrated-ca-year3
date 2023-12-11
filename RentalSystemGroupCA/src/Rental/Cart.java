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
 * Shopping cart for film rental containing common functions used in it.
 * 
 */
public class Cart {
    private List<Film> selectedFilms;

    public Cart() {
        this.selectedFilms = new ArrayList<>();
    }

    /**
     * Adds a film to the cart.
     * @param film 
     */
    public void addFilm(Film film) {
        selectedFilms.add(film);
    }
    
    /**
     * Removes a film from the cart.
     * @param film
     */
    public void removeFilm(Film film){
        selectedFilms.remove(film);
    }
    
    // Plenty of functions to be added
    
}
