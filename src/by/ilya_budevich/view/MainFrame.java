package by.ilya_budevich.view;

import javax.swing.*;

public class MainFrame extends JFrame {
    public final int WINDOW_WIDTH = 1280;
    public final int WINDOW_HEIGHT = 720;

    public MainFrame(String frameTitle) {
        super(frameTitle);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
