package by.ilya_budevich;

import by.ilya_budevich.view.MainFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        setupApplication();
    }

    public static void setupApplication() {
        JFrame mainFrame = new MainFrame("Paint");
    }
}
