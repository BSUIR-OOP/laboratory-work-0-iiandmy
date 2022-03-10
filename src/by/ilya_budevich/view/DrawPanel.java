package by.ilya_budevich.view;

import by.ilya_budevich.model.*;
import by.ilya_budevich.model.Rectangle;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public DrawPanel() {
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Line(1, 1, 50,50));
//        g2.draw(new Ellipse(52,1,50,100));
//        g2.draw(new Rectangle(104, 1, 50, 100));
//        g2.draw(new Circle(156, 1, 50));
//        g2.draw(new Square(208, 1, 50));
    }
}
