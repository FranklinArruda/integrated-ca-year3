/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Film;

import static Util.ConversionUtil.parseDuration;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author: Diego Ydalgo Jensen Francisco
 * @student no.: 2021336
 */
public class CSVReader {

    public List<Film> readFilmsFromCSV(){
        List<Film> films = new ArrayList<>();
        try (InputStream is = getClass().getResourceAsStream("/Film/ica_filmotech.csv");
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
           
           String line;
           reader.readLine(); // Skip the header line
           while ((line = reader.readLine()) != null) {
               String[] fields = line.split(",");
               // Parse fields and create a new Film object
               int id = Integer.parseInt(fields[0]);
               String title = fields[1];
               int year = Integer.parseInt(fields[2]);
               String director = fields[3];
               Duration duration = parseDuration(fields[4]);
               String parental = fields[5];
               String genre = fields[6];
               
               Film film = new Film(id, title, year, director, duration, parental, genre);
               films.add(film);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return films;
    }
}
