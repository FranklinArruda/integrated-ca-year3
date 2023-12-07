/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Film;

import java.time.Duration;

/**
 *
 * @author: Diego Ydalgo Jensen Francisco
 * @student no.: 2021336
 */
public class Film {
    private final int id;
    private final String title;
    private final int year;
    private final String director;
    private final Duration duration; // specific type to be used for decribe a length of time
    private final String parental;
    private final String genre;

    // IDE generated Constructors
    public Film(int id, String title, int year, String director, Duration duration, String parental, String genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.duration = duration;
        this.parental = parental;
        this.genre = genre;
    }

    // IDE generated Getters
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getParental() {
        return parental;
    }

    public String getGenre() {
        return genre;
    }
    
    

}