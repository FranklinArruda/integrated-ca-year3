/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;

import Film.Film;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Diego Ydalgo Jensen Francisco
 * @student id.: 2021336
 *
 * This is intended to be used for checkout system commonly implemented in Web
 * rentals. Methods for calculate duration of the rental and others related
 * features will be stored here.
 *
 */
public class Checkout {

    /**
     * Cart containing the films selected and ready to be rent.
     *
     * @param cart
     */
    public void processCheckout(Cart cart) {
        // Calculate rental duration, apply rules, etc.

        // Generate receipt
        generateReceipt(cart);
    }

    private void generateReceipt(Cart cart) {
        try (FileWriter writer = new FileWriter("receipt_" + System.currentTimeMillis() + ".txt")) {
            LocalDateTime now = LocalDateTime.now();
            writer.write("Transaction Date: " + now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "\n");
            writer.write("Movies Rented: \n");
            for (Film film : cart.getSelectedFilms()) {
                writer.write(film.getTitle() + "\n");
                // Include other details as needed
            }
            // Include other receipt details
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
