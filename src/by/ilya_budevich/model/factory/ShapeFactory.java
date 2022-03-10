package by.ilya_budevich.model.factory;

import by.ilya_budevich.model.*;
import by.ilya_budevich.model.Rectangle;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory {
    private final Map<String, Supplier<Shape>> shapes = new HashMap<>();
    private static ShapeFactory instance;

    public Shape getShape(String shapeName) {
        return shapes.get(shapeName).get();
    }

    public String[] getShapeNames() {
        return shapes.keySet().toArray(new String[0]);
    }

    private ShapeFactory() {
        shapes.put("Circle", () -> new Circle(0, 0, 0));
        shapes.put("Ellipse", () -> new Ellipse(0, 0, 0, 0));
        shapes.put("Line", () -> new Line(0, 0, 0, 0));
        shapes.put("Rectangle", () -> new Rectangle(0,0,0,0));
        shapes.put("Square", () -> new Square(0,0,0));
    }

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }
}