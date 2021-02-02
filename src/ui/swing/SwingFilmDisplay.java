package ui.swing;

import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import model.Film;
import ui.FilmDisplay;

public class SwingFilmDisplay extends JPanel implements FilmDisplay {

    private final List<Film> films;

    public SwingFilmDisplay(List<Film> films) {
        this.films = films;
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(filmData());
        add(filmImage());
    }

    private JPanel filmData() {
        
    }

    private JPanel filmImage() {

    }
    
}
