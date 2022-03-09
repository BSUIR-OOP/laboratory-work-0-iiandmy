package by.ilya_budevich.view;

import by.ilya_budevich.model.Line;

import javax.swing.*;
import java.awt.*;

public class MainDrawPanel extends JPanel {
     private Line line;

     public MainDrawPanel() {
         line = new Line(25, 150, 78, 2);
     }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(line);
    }
}
