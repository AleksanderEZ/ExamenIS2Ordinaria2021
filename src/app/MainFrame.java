package app;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

    public MainFrame() {
        setTitle("FilmApp");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(filmDisplay());
        setVisible(true);
    }

    private JPanel filmDisplay() {
        
    }
    
    
}
