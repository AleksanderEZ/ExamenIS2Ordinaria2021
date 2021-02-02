
import java.util.List;
import model.Film;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class FilmSorter {

    List<Film> films;
    
    public FilmSorter(List<Film> films) {
        this.films = films;
    }
    
    public List<Film> sortBy(String by){
        switch(by.toLowerCase()){
            case "new":
                break;
            case "genre":
                break;
            case "viewed":
                break;
            case "valued":
                break;
        }
        return null;
    }
}
