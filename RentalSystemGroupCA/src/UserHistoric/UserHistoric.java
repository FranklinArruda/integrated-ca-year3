/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UserHistoric;

import Film.Film;
import Rental.Cart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*
* @author Enio Kelsio
* @student n. 2021221
*
* UserHistoric class represents the rental history of a user.
**/

public class UserHistoric {
    //List to store rented films.
    private final List<RentedFimRecord> rentedFilms = null;
    
    //List to store selected films to be rented or not
    private final ArrayList<Object> selectedFilms;
    
   Cart movie = new Cart();
    private final Film film;

    
    public UserHistoric() {
        this.film = new Film();
        this.selectedFilms = new ArrayList <>();
    }
    

    //Metod to add a rented film to the history
    public void addRentedFilm(Film film, int rentalDuration) {
        RentedFilmRecord record = new RentedFilmRecord(film, rentalDuration);
        //Add the rented film to the selectesFilmas list
        selectedFilms.add(record);
    }

    //Method to get the most rented films in the last fiveminutes
    public List<Film> getMostRentedFilms() {
        // Assuming that the system keeps track of rentals and their durations
        // and updates the rentedFilms list accordingly.
        // Implement the logic to filter films rented in the past 5 minutes and recommend the top 5.
        // For simplicity, let's assume a method getFilmsRentedInLastFiveMinutes() is available.

        List<RentedFilmRecord> filmsRentedInLastFiveMinutes = getFilmsRentedInLastFiveMinutes();
        Map<Film, Integer> filmRentCountMap = new HashMap<>();

        for (RentedFilmRecord record : filmsRentedInLastFiveMinutes) {
            Film seen = record.getFilm();
            Film films = record.getFilm();
            filmRentCountMap.put((Film) films, filmRentCountMap.getOrDefault(films, 0) + 1);
        }

        filmRentCountMap.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .limit(5)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        return new ArrayList<>(filmRentCountMap.keySet());
    }

     //Method get rented films in the last five min
    private List<RentedFilmRecord> getFilmsRentedInLastFiveMinutes() {
    
        // For simplicity, return an empty list for now.
        return new ArrayList<>();
    }

    //Inner class to represent a record of retend film
    private static class RentedFilmRecord {
        private final Film film;
        private final int rentalDuration; // in minutes

        public RentedFilmRecord(Film film, int rentalDuration) {
            this.film = film;
            this.rentalDuration = rentalDuration;
        }

        //Getter method for the film
        private Film getFilm() {
           return film;
        }
    }
    
}
    
