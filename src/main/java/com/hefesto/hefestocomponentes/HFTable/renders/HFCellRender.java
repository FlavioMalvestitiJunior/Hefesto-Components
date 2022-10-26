package com.hefesto.hefestocomponentes.HFTable.renders;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class HFCellRender extends DefaultTableCellRenderer {

    public HFCellRender() {
        super();
    }

    @Override
    public Component getTableCellRendererComponent(javax.swing.JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Color select = new Color(0, 127, 182);

        JComponent label = (JComponent) super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column);

        if (hasFocus) {
            label.setBackground(new Color(26, 189, 255));
            label.setForeground(Color.WHITE);
            label.setBorder(new LineBorder(select, 2));
        }
        if (isSelected) {
            setBackground(new Color(26, 189, 255));
            setForeground(Color.WHITE);
        } else {
            if ((row % 2) == 1) {
                setForeground(Color.black);
                setBackground(new Color(224, 237, 255));
            } else {
                setBackground(new Color(208, 231, 255));
                setForeground(Color.black);
            }
        }
        return label;

    }
}
