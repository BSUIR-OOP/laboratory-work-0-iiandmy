package by.ilya_budevich.view;

import by.ilya_budevich.model.Rectangle;

import javax.swing.*;
import java.awt.*;

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
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Add menu panel
        menuPanel = new JPanel();
        menuPanel.add(new JLabel("Lorem ipsum dolor sit amet."));
        menuPanel.setBackground(Color.ORANGE);
        this.add(menuPanel);

        // Add draw panel
        drawPanel = new DrawPanel();
        drawPanel.add(new JLabel("Lorem ipsum dolor sit amet."));
        drawPanel.setBackground(Color.BLUE);
        this.add(drawPanel);

        this.setVisible(true);
    }
}
