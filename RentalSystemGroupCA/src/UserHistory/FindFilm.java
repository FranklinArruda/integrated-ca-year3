/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserHistory;

import Film.Film;
import java.util.List;

/**
 *
 * FindFilm class is responsible for searching a film by name in a list of films.
 * 
 * @author Enio Kelsio
 * @student n. 2021221
 * 
 */
public class FindFilm {

    private int filmIndex;
    
    
     // Finds a film by name in the provided list of films.
     //filmName The name of the film to search for.
     
    public Film findFilm(String filmName, List<Film>films){
        
        for (Film film :films) {
            if (film.getTitle().equals(filmName)) {
                return film;
            
            }
        }
        return null;
        
    }
    
    public int getFilmIndex(){
        return 0;
        
    }
    
    public void setFilmIndex(int filmIndex){
        this.filmIndex = filmIndex;
        
    }
}
