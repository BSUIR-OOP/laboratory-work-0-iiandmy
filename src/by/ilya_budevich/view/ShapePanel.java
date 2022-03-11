package by.ilya_budevich.view;

import by.ilya_budevich.utils.JTextFieldHint;
import by.ilya_budevich.utils.SizeConstants;

import javax.swing.*;
import java.awt.*;

public class ShapePanel extends JPanel {
    private JTextFieldHint widthTF;
    private JTextFieldHint heightTF;
    private JTextFieldHint pointX;
    private JTextFieldHint pointY;
    private JPanel pointPanel;

    public ShapePanel() {
        this.setLayout(new FlowLayout());
        this.initUI();
        this.initPanel();
    }

    public void makePanelRegular() {
        this.resetUI();
    }

    public void makePanelSymmetric() {
        this.resetUI();

        this.heightTF.changeHint("");
        this.heightTF.setEnabled(false);
    }

    public void makePanelTwoPoints() {
        this.resetUI();

        this.pointX.changeHint("X1");
        this.pointY.changeHint("Y1");

        this.widthTF.changeHint("X2");
        this.heightTF.changeHint("Y2");

        this.widthTF.setPreferredSize(SizeConstants.DEFAULT_TEXTFIELD_DIMENSION);
        this.heightTF.setPreferredSize(SizeConstants.DEFAULT_TEXTFIELD_DIMENSION);
    }

    private void resetUI() {
        this.initSizes();
        this.widthTF.changeHint("Width");
        this.heightTF.changeHint("Height");
        this.pointX.changeHint("X");
        this.pointY.changeHint("Y");

        this.widthTF.setEnabled(true);
        this.heightTF.setEnabled(true);
        this.pointX.setEnabled(true);
        this.pointY.setEnabled(true);
    }

    private void initUI() {
        this.widthTF = new JTextFieldHint("Width");
        this.heightTF = new JTextFieldHint("Height");

        this.pointX = new JTextFieldHint("X");
        this.pointY = new JTextFieldHint("Y");

        this.initSizes();

        this.setBackground(Color.LIGHT_GRAY);
    }

    private void initSizes() {
        this.pointX.setPreferredSize(SizeConstants.DEFAULT_TEXTFIELD_DIMENSION);
        this.pointY.setPreferredSize(SizeConstants.DEFAULT_TEXTFIELD_DIMENSION);

        this.widthTF.setPreferredSize(SizeConstants.DEFAULT_LARGE_TF_DIMENSION);
        this.heightTF.setPreferredSize(SizeConstants.DEFAULT_LARGE_TF_DIMENSION);
    }

    private void initPanel() {
        this.add(pointX);
        this.add(pointY);
        this.add(widthTF);
        this.add(heightTF);
    }
}