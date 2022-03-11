package by.ilya_budevich.view;

import by.ilya_budevich.model.factory.ShapeFactory;
import by.ilya_budevich.utils.JTextFieldHint;
import by.ilya_budevich.view.factory.MenuPanelFactory;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private LayoutManager layout;

    public MenuPanel() {
        initLayout();
        initPanel();
    }

    private void initLayout() {
        layout = new BorderLayout();
        this.setLayout(layout);
    }

    private void initPanel() {
        this.add(new ShapeChoosePanel(), BorderLayout.WEST);
        this.add(MenuPanelFactory.getInstance().getPanel(MenuPanelFactory.REGULAR_PANEL), BorderLayout.CENTER);
    }

    private static class ShapeChoosePanel extends JPanel {
        public ShapeChoosePanel() {
            this.setLayout(new GridLayout(1, 1));
            initPanel();
        }

        private void initPanel() {
            this.add(new JComboBox<>(ShapeFactory.getInstance().getShapeNames()));
        }
    }
}
