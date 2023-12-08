/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UserHistoric;

import Film.Film;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*
* @author Enio Kelsio
* @student n. 2021221
*
**/

public class UserHistoric {
    private final List<RentedFimRecord> rentedFilms = null;
    private final ArrayList<Object> rentedFilma;
    
    Film movie = new Film();

    
    public UserHistoric() {
        this.movie = new Film();
        this.rentedFilma = new ArrayList <>();
    }
    

    public void addRentedFilm(Film film, int rentalDuration) {
        RentedFilmRecord record = new RentedFilmRecord(film, rentalDuration);
        rentedFilma.add(record);
    }

    public List<Film> getMostRentedFilms() {
        // Assuming that the system keeps track of rentals and their durations
        // and updates the rentedFilms list accordingly.
        // Implement the logic to filter films rented in the past 5 minutes and recommend the top 5.
        // For simplicity, let's assume a method getFilmsRentedInLastFiveMinutes() is available.

        List<RentedFilmRecord> filmsRentedInLastFiveMinutes = getFilmsRentedInLastFiveMinutes();
        Map<Film, Integer> filmRentCountMap = new HashMap<>();

        for (RentedFilmRecord record : filmsRentedInLastFiveMinutes) {
            Film seen = record.getFilm();
            Object film = null;
            filmRentCountMap.put((Film) film, filmRentCountMap.getOrDefault(film, 0) + 1);
        }

        filmRentCountMap.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .limit(5)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        return new ArrayList<>(filmRentCountMap.keySet());
    }

    private List<RentedFilmRecord> getFilmsRentedInLastFiveMinutes() {
        // Implement logic to retrieve films rented in the last five minutes.
        // For simplicity, return an empty list for now.
        return new ArrayList<>();
    }

    private static class RentedFilmRecord {
        private final Film film;
        private final int rentalDuration; // in minutes

        public RentedFilmRecord(Film film, int rentalDuration) {
            this.film = film;
            this.rentalDuration = rentalDuration;
        }

        private Film getFilm() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
    
}
    
