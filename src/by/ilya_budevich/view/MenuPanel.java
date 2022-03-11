package by.ilya_budevich.view;

import by.ilya_budevich.controller.MainController;
import by.ilya_budevich.model.factory.ShapeFactory;
import by.ilya_budevich.utils.SizeConstants;
import by.ilya_budevich.view.factory.InputPanelBuilder;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private LayoutManager layout;
    private MainController controller;

    private JComboBox shapeChooseCB;
    private JButton paintBN;

    public MenuPanel() {
        this.controller = MainController.getInstance();
        initLayout();
        initPanel();
    }

    private void initLayout() {
        this.layout = new FlowLayout();
        this.setLayout(layout);
    }

    private void initPanel() {
        initUI();
        initSizes();
        this.add(shapeChooseCB);
        this.add(InputPanelBuilder.getInstance().buildRegularPanel());
        this.add(paintBN);
    }

    private void initUI() {
        this.shapeChooseCB = new JComboBox<>(ShapeFactory.getInstance().getShapeNames());
        this.paintBN = new JButton("Paint!");
        this.setBackground(Color.LIGHT_GRAY);
    }

    private void initSizes() {
        this.shapeChooseCB.setPreferredSize(SizeConstants.DEFAULT_COMBOBOX_DIMENSION);
        this.paintBN.setPreferredSize(SizeConstants.DEFAULT_BTN_DIMENSION);
    }
}
