package by.ilya_budevich.view;

import by.ilya_budevich.model.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class MainFrame extends JFrame {
    public final int WINDOW_WIDTH = 600;
    public final int WINDOW_HEIGHT = 400;

    private JPanel drawPanel;
    private JPanel menuPanel;

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
        drawPanel.setBackground(Color.BLUE);
        this.add(drawPanel, BorderLayout.CENTER);

        // Add menu panel
        menuPanel = new MenuPanel();
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        menuPanel.setBackground(Color.ORANGE);
        this.add(menuPanel, BorderLayout.NORTH);

        this.setVisible(true);
    }
}
