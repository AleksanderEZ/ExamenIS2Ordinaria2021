package app;

import control.NextCommand;
import control.Command;
import control.PrevCommand;
import control.ShowCommand;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import ui.swing.SwingFilmDialog;
import ui.swing.SwingFilmDisplay;

public class MainFrame extends JFrame{

    private SwingFilmDisplay filmDisplay;
    private SwingFilmDialog filmDialog;
    private Map<String, Command> commands;

    public MainFrame() {
        commands = new HashMap<>();
        setTitle("FilmApp");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        getContentPane().setLayout(new BorderLayout());
        add(filmDisplay(), BorderLayout.CENTER);
        add(filmDialog(), BorderLayout.NORTH);
        add(toolBar(), BorderLayout.SOUTH);
        
        addCommand(new NextCommand());
        addCommand(new ShowCommand());
        addCommand(new PrevCommand());
        setVisible(true);
    }

    private JPanel filmDisplay() {
        SwingFilmDisplay display = new SwingFilmDisplay();
        this.filmDisplay = display;
        return display;
    }

    private JPanel filmDialog() {
        SwingFilmDialog dialog = new SwingFilmDialog();
        this.filmDialog = dialog;
        return dialog;
    }
    
    private JPanel toolBar() {
        JPanel toolbar = new JPanel();
        toolbar.setLayout(new FlowLayout());
        toolbar.add(button("Prev"));
        toolbar.add(button("Show"));
        toolbar.add(button("Next"));
        return toolbar;
    }

    private JButton button(String prev) {
        JButton button = new JButton(prev);
        button.addActionListener((ActionEvent e) -> {
            commands.get(prev).execute();
        });
        return button;
    }

    private void addCommand(Command command) {
        commands.put(command.name(), command);
    }
}
