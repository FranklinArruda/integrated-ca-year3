/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Film;

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
    private final int runtime; // in minutes
//  private final Duration runtime; // specific type to be used for decribe a length of time
    private final String parental;
    private final String genre;
    private final double price;
    private final int endorsements;

    // IDE generated Constructors
    public Film(int id, String title, int year, String director, int runtime, String parental, String genre, double price, int endorsements) {
        // note that the type for runtime has been changed to 'int' keep it simple 
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.runtime = runtime;
//      this.runtime = runtime;
        this.parental = parental;
        this.genre = genre;
        this.price = price;
        this.endorsements = endorsements;
    }

    public Film() {
        throw new UnsupportedOperationException("Not supported yet.");
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

    public int getRuntime(){
//  public Duration getDuration() { // Atempt to simplify the type, the runtime has been changed to 'int'
        return runtime;
    }

    public String getParental() {
        return parental;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public int getEndorsements() {
        return endorsements;
    }
    
    
    
    

}