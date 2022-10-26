/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFTable.renders;

import com.hefesto.hefestocomponentes.HFUtils.HFCollors;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.LineBorder;

/**
 *
 * @author jr
 */
public class HFCellRenderProgressBar extends HFCellRender {

    JProgressBar bar;

    public HFCellRenderProgressBar() {
        super();
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Color select = new Color(0, 127, 182);
        if (value instanceof JProgressBar) {
            bar = (JProgressBar) value;
            bar.setToolTipText(bar.getString() + " " + bar.getValue() + "%");
            bar.setOpaque(true);
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
        bar.setBackground(HFCollors.RedCalendar);
        bar.setForeground(Color.darkGray);

        bar.setBorderPainted(hasFocus);
        if (hasFocus) {
            bar.setBorder(new LineBorder(select, 2));
        }
        return bar;
    }
}
