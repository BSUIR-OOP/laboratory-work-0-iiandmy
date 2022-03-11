package by.ilya_budevich.view.factory;

import by.ilya_budevich.utils.JTextFieldHint;
import by.ilya_budevich.utils.SizeConstants;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class InputPanelFactory {
    private final List<JPanel> panels = new ArrayList<>();
    private static InputPanelFactory instance;

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

    private InputPanelFactory() {
        panels.add(new ShapePanel());
    }

    public static InputPanelFactory getInstance() {
        if (instance == null) {
            instance = new InputPanelFactory();
        }
        return instance;
    }

    private static class ShapePanel extends JPanel {
        private JTextField widthTF;
        private JTextField heightTF;
        private JTextField pointX;
        private JTextField pointY;
        private JPanel pointPanel;

        private ShapePanel() {
            this.setLayout(new GridLayout());
            initUI();
            initPanel();
        }

        public ShapePanel getSymmetricPanel() {
            ShapePanel symmetric = new ShapePanel();
            return symmetric;
        }

        public ShapePanel getRegularPanel() {
            ShapePanel regular = new ShapePanel();
            return regular;
        }

        public ShapePanel getTwoPointsPanel() {
            ShapePanel twoPoints = new ShapePanel();
            return twoPoints;
        }

        private void initUI() {
            widthTF = new JTextFieldHint("Width");
            heightTF = new JTextFieldHint("Height");

            pointX = new JTextFieldHint("X");
            pointY = new JTextFieldHint("Y");

            initSizes();
//
//            pointPanel = new JPanel();
//            pointPanel.setLayout(new GridLayout());
//            pointPanel.add(pointX);
//            pointPanel.add(pointY);
        }

        private void initSizes() {
            pointX.setPreferredSize(SizeConstants.DEFAULT_TEXTFIELD_DIMENSION);
            pointY.setPreferredSize(SizeConstants.DEFAULT_TEXTFIELD_DIMENSION);

            widthTF.setPreferredSize(SizeConstants.DEFAULT_LARGE_TF_DIMENSION);
            heightTF.setPreferredSize(SizeConstants.DEFAULT_LARGE_TF_DIMENSION);
        }

        private void initPanel() {
            this.add(pointPanel);
            this.add(widthTF);
            this.add(heightTF);
        }
    }
}
