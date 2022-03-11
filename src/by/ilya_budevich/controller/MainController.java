package by.ilya_budevich.controller;

import by.ilya_budevich.model.factory.ShapeFactory;
import by.ilya_budevich.view.MainFrame;

import java.awt.*;

public class MainController {
    private static MainController instance;
    private MainFrame view;

    private Shape currentShape;

    public String[] getShapeNames() {
        return ShapeFactory.getInstance().getShapeNames();
    }

    public void passParams(String shapeName, double ...params) {
        this.currentShape = ShapeFactory.getInstance().getShape(shapeName, params);
    }

    public void drawFigure() {
        if (currentShape == null) {
            return;
        }
        this.view.getDrawPanel().drawComponent(currentShape);
    }

    private MainController() {
        this.view = MainFrame.getInstance();
    }

    public static MainController getInstance() {
        if (instance == null) {
            instance = new MainController();
        }
        return instance;
    }
}
