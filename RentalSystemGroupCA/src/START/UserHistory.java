package START;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
*
*@author Enio Kelsio
*
**/

public class UserHistory {
    private final Map<String, Integer> rentedFilms = new HashMap<>();
    private final Queue<Map<String, Integer>> pastRentedFilms = new LinkedList<>();

    public void addRentedFilm(String filmName) {
        
        if (rentedFilms.containsKey(filmName)) {
            rentedFilms.put(filmName, rentedFilms.get(filmName) + 1);
        } 
        
        else {
            rentedFilms.put(filmName, 1);
        }
    }

    public List<String> getMostRentedFilms() {
        boolean add;
        
        add = pastRentedFilms.add(new HashMap<>(rentedFilms));
        
        if (pastRentedFilms.size() > 5) {
            pastRentedFilms.poll();
        }
        
        Map<String, Integer> allRentedFilms = new HashMap<>();
        
        for (Map<String, Integer> rentedMovies : pastRentedFilms) {
            for (Map.Entry<String, Integer> entry : rentedMovies.entrySet()) {
                String filmName = entry.getKey();
                
                int count = entry.getValue();
                allRentedFilms.put(filmName, allRentedFilms.getOrDefault(filmName, 0) + count);
            }
        }
        
        List<Map.Entry<String, Integer>> sortedFilms = new ArrayList<>(allRentedFilms.entrySet());
        sortedFilms.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        List<String> mostRentedFilms = new ArrayList<>();
        
        for (int i = 0; i < Math.min(5, sortedFilms.size()); i++) {
            mostRentedFilms.add(sortedFilms.get(i).getKey());
            
        }
        
        return mostRentedFilms;
    }
}


