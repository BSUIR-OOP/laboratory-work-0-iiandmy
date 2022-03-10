package by.ilya_budevich;

import by.ilya_budevich.model.Line;
import by.ilya_budevich.model.Rectangle;
import by.ilya_budevich.view.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        setupApplication();
        new Figures(new Line(1, 1, 1, 5), new Rectangle(5, 5, 10, 10))
                .drawFigures();
    }

    public static void setupApplication() {
        JFrame mainFrame = new MainFrame("Paint");
    }

    public static class Figures {
        private java.util.List<Shape> array;

        public Figures(Shape ...figures) {
            array = Arrays.asList(figures);
        }

        public boolean addFigure(Shape figure) {
            return array.add(figure);
        }

        public List<Shape> getFigures() { return array; }

        public void drawFigures() {
            array.forEach(System.out::println);
        }
    }
}
