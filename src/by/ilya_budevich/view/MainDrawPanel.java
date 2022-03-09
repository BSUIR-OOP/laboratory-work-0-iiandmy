package by.ilya_budevich.view;

import by.ilya_budevich.model.Ellipse;
import by.ilya_budevich.model.Line;
import by.ilya_budevich.model.Rectangle;

import javax.swing.*;
import java.awt.*;

public class MainDrawPanel extends JPanel {

    public MainDrawPanel() {}

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Line(1, 1, 50,50));
        g2.draw(new Ellipse(50,1,50,50));
        g2.draw(new Rectangle(102, 1, 50, 50));
    }
}
