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
        // note that the type for runtime has been changed to 'int'. KISS! 
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

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @return
     */
    public String getDirector() {
        return director;
    }

    /**
     *
     * @return
     */
    public int getRuntime(){
//  public Duration getDuration() { // Atempt to simplify the type, the runtime has been changed to 'int'
        return runtime;
    }

    /**
     *
     * @return
     */
    public String getParental() {
        return parental;
    }

    /**
     *
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @return
     */
    public int getEndorsements() {
        return endorsements;
    }
    
    
    
    

}