package by.ilya_budevich.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public final int WINDOW_WIDTH = 600;
    public final int WINDOW_HEIGHT = 400;

    private JPanel drawPanel;
    private JPanel menuPanel;

    public DrawPanel getDrawPanel() {
        return (DrawPanel) drawPanel;
    };

    public MainFrame(String frameTitle) {
        super(frameTitle);

        // Frame setup
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Add draw panel
        drawPanel = new DrawPanel();
        this.add(drawPanel, BorderLayout.CENTER);

        // Add menu panel
        menuPanel = new MenuPanel();
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.add(menuPanel, BorderLayout.NORTH);

        this.setVisible(true);
    }
}
