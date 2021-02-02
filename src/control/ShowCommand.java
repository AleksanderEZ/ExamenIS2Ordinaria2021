package control;

import java.util.List;
import model.Film;
import ui.swing.SwingFilmDialog;
import ui.swing.SwingFilmDisplay;

/**
 * @author Aleksander Borysov Ravelo
 **/
public class ShowCommand implements Command {

    SwingFilmDisplay display;
    SwingFilmDialog dialog;
    private final List<Film> list;
    
    public ShowCommand(SwingFilmDisplay display, SwingFilmDialog dialog, List<Film> list) {
        this.display = display;
        this.dialog = dialog;
        this.list = list;
    }
    
    @Override
    public String name() {
        return "Show";
    }

    @Override
    public void execute() {
        
        display.add(display);
    }
    
}
