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
 * @author diego
 */
public class Catalog {

    private List<Film> films;

    public Catalog() {
        this.films = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public List<Film> getFilms() {
        return films;
    }

    Film getFilmById(int filmId) {
        for (Film film : films) {
            if (film.getId() == filmId) {
                return film;
            }
        }
        return null;

    }
}
