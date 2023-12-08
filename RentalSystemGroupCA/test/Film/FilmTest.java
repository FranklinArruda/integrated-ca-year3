package Film;

import java.time.Duration;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;




/**
 *
 * @author: Diego Ydalgo Jensen Francisco
 * @student no.: 2021336
 */
public class FilmTest {
    
    @Test
    public void testFilmCreation(){
        Film film = new Film(1, "The Test", 2023, "Francis For Testolla", 2, "PG", "Testing", 0, 0);
        assertNotNull(film);
        assertEquals(1, film.getId());
        assertEquals("The Test", film.getTitle());
    }
    
}
