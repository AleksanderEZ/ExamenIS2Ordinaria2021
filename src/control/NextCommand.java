package control;

import ui.swing.SwingFilmDisplay;

public class NextCommand implements Command {

    SwingFilmDisplay display;
    
    public NextCommand(SwingFilmDisplay display) {
        this.display = display;
    }
    
    @Override
    public String name() {
        return "Next";
    }

    @Override
    public void execute() {
        display.next();
    }

}
