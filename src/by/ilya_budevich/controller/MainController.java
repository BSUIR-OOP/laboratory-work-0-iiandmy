package by.ilya_budevich.controller;

import by.ilya_budevich.model.factory.ShapeFactory;

public class MainController {
    private static MainController instance;

    public String[] getShapeNames() {
        return ShapeFactory.getInstance().getShapeNames();
    }

    private MainController() {

    }

    public static MainController getInstance() {
        if (instance == null) {
            instance = new MainController();
        }
        return instance;
    }
}
