package by.ilya_budevich.view.factory;

import by.ilya_budevich.utils.JTextFieldHint;
import by.ilya_budevich.utils.SizeConstants;

import javax.swing.*;
import java.awt.*;

public class InputPanelBuilder {
    private static InputPanelBuilder instance;

    public ShapePanel buildSymmetricPanel() {
        ShapePanel symmetric = new ShapePanel();
        return symmetric;
    }

    public ShapePanel buildRegularPanel() {
        ShapePanel regular = new ShapePanel();
        return regular;
    }

    public ShapePanel buildTwoPointsPanel() {
        ShapePanel twoPoints = new ShapePanel();
        return twoPoints;
    }

    private InputPanelBuilder() {
    }

    public static InputPanelBuilder getInstance() {
        if (instance == null) {
            instance = new InputPanelBuilder();
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
