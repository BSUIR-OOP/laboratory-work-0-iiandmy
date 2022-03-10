package by.ilya_budevich.view;

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
        this.add(new ShapePanel(), BorderLayout.CENTER);
    }

    private static class ShapeChoosePanel extends JPanel {
        public ShapeChoosePanel() {
            this.setLayout(new GridLayout(2, 1));
            initPanel();
        }

        private void initPanel() {
            String[] comboBoxItems = {
                    "Circle",
                    "Square",
                    "Rectangle",
                    "Ellipse",
                    "Line"
            };
            this.add(new JLabel("  Shape:"));
            this.add(new JComboBox(comboBoxItems));
        }
    }

    private static class ShapePanel extends JPanel {
        public ShapePanel() {
            this.setLayout(new GridLayout(2, 3));
            initPanel();
        }

        private void initPanel() {

        }
    }
}
