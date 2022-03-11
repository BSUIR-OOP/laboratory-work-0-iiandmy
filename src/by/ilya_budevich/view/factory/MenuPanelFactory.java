package by.ilya_budevich.view.factory;

import by.ilya_budevich.utils.JTextFieldHint;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MenuPanelFactory {
    private final List<JPanel> panels = new ArrayList<>();
    private static MenuPanelFactory instance;

    public static final int REGULAR_PANEL = 0;
    public static final int SYMMETRIC_PANEL = 1;
    public static final int TWO_POINTS_PANEL = 2;

    public JPanel getPanel(int panelType) {
        JPanel resultPanel = new JPanel();
        try {
           resultPanel = panels.get(panelType);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Try another argument");
        }
        return resultPanel;
    }

    private MenuPanelFactory() {
        panels.add(new ShapePanel());
    }

    public static MenuPanelFactory getInstance() {
        if (instance == null) {
            instance = new MenuPanelFactory();
        }
        return instance;
    }

    private static class ShapePanel extends JPanel {
        private JTextField widthTF;
        private JTextField heightTF;
        private JTextField pointX;
        private JTextField pointY;
        private JPanel pointPanel;

        public ShapePanel() {
            this.setLayout(new GridLayout(1, 3));
            initComponents();
            initPanel();
        }

        private void initComponents() {
            widthTF = new JTextFieldHint("Width");
            heightTF = new JTextFieldHint("Height");

            pointX = new JTextFieldHint("X");
            pointY = new JTextFieldHint("Y");

            pointPanel = new JPanel();
            pointPanel.setLayout(new GridLayout());
            pointPanel.add(pointX);
            pointPanel.add(pointY);
        }

        private void initPanel() {
            this.add(pointPanel);
            this.add(widthTF);
            this.add(heightTF);
        }
    }
}
