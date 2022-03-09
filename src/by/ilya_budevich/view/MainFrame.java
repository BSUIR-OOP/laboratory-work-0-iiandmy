package by.ilya_budevich.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public final int WINDOW_WIDTH = 600;
    public final int WINDOW_HEIGHT = 400;

    private JPanel drawPanel;

    public MainFrame(String frameTitle) {
        super(frameTitle);

        // Frame setup
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Add draw panel
        drawPanel = new MainDrawPanel();
        this.add(drawPanel,
                new GridBagConstraints(0, 0, 1, 1, 1, 1,
                        GridBagConstraints.NORTH, GridBagConstraints.BOTH,
                        new Insets(2, 2, 2, 2), 0, 0)
        );

        this.setVisible(true);
    }
}
