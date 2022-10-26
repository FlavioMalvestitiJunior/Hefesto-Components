/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFTable.renders;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.LineBorder;

/**
 *
 * @author jr
 */
public class HFCellRenderCheckBox extends HFCellRender {

    public HFCellRenderCheckBox() {
        super();
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Color select = new Color(0, 127, 182);

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
        if (value instanceof Boolean) {
            JCheckBox box = new JCheckBox("", (Boolean) value);
            box.setOpaque(true);
            if (hasFocus) {
                box.setBorder(new LineBorder(select, 2));
            }
            box.setBackground(getBackground());
            box.setForeground(getForeground());
            box.setHorizontalAlignment(CENTER);
            box.setToolTipText("" + value);
            box.setBorderPainted(hasFocus);

            return box;
        } else {

            JLabel label = new JLabel("");
            label.setBackground(getBackground());
            label.setForeground(getForeground());
            label.setHorizontalAlignment(CENTER);
            label.setOpaque(true);

            if (hasFocus) {
                label.setBorder(new LineBorder(select, 2));
            }
            return label;
        }

    }
}
