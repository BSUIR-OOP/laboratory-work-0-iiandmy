package by.ilya_budevich.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel {
    private List<Shape> shapesToDraw;

    public DrawPanel() {
        shapesToDraw = new ArrayList<>();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        shapesToDraw.forEach(g2::draw);
//        g2.draw(new Line(1, 1, 50,50));
//        g2.draw(new Ellipse(52,1,50,100));
//        g2.draw(new Rectangle(104, 1, 50, 100));
//        g2.draw(new Circle(156, 1, 50));
//        g2.draw(new Square(208, 1, 50));
    }

    public void drawComponent(Shape component) {
        shapesToDraw.add(component);
    }

    public boolean eraseComponent(Shape component) {
        return shapesToDraw.remove(component);
    }
}
