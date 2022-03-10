package by.ilya_budevich.view;

import by.ilya_budevich.model.ShapeFactory;
import by.ilya_budevich.utils.JTextFieldHint;

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
            this.add(new JLabel("  Shape:"));
            this.add(new JComboBox<>(ShapeFactory.getInstance().getShapeNames()));
        }
    }

    private static class ShapePanel extends JPanel {
        private JTextField widthTF;
        private JTextField heightTF;
        private JTextField pointX;
        private JTextField pointY;
        private JPanel pointPanel;

        public ShapePanel() {
            this.setLayout(new GridLayout(2, 3));
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
            this.add(new JLabel("  Point"));
            this.add(new JLabel("  Width"));
            this.add(new JLabel("  Height"));
            this.add(pointPanel);
            this.add(widthTF);
            this.add(heightTF);
        }
    }
}
