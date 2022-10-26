/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFTable.utils;

import com.hefesto.hefestocomponentes.HFTable.HFTable;
import com.hefesto.hefestocomponentes.HFTable.editors.HFCellRenderTextEditor;
import com.hefesto.hefestocomponentes.HFTable.renders.HFCellRenderProgressBar;
import com.hefesto.hefestocomponentes.HFTable.renders.HFCellRenderCheckBox;
import com.hefesto.hefestocomponentes.HFTable.renders.HFCellRender;
import com.hefesto.hefestocomponentes.HFTextField.HFTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JProgressBar;

/**
 *
 * @author jr
 */
public class HFTableUtil {

    HFTable tabela;
    List<Integer> colunas;

    public HFTableUtil(HFTable tabela) {
        this.colunas = new ArrayList<>();
        this.tabela = tabela;
        for (int i = 0; i < colunas.size(); i++) {
            colunas.add(i);
        }

    }

    public HFTableUtil hideColumn(int column) {
        tabela.getColumnModel().getColumn(column).setMinWidth(-1);
        tabela.getColumnModel().getColumn(column).setMaxWidth(-1);
        tabela.getColumnModel().getColumn(column).setPreferredWidth(-1);
        tabela.getTableHeader().getColumnModel().getColumn(column).setPreferredWidth(-1);
        tabela.getTableHeader().getColumnModel().getColumn(column).setMinWidth(-1);
        tabela.getTableHeader().getColumnModel().getColumn(column).setMaxWidth(-1);
        return this;
    }

    public HFTableUtil colorize() {
        HFCellRender render = new HFCellRender();
        tabela.setDefaultRenderer(Object.class, render);
        tabela.setDefaultRenderer(int.class, render);
        tabela.setDefaultRenderer(Integer.class, render);
        tabela.setDefaultRenderer(String.class, render);
        tabela.setDefaultRenderer(Float.class, render);
        tabela.setDefaultRenderer(float.class, render);
        tabela.setDefaultRenderer(double.class, render);
        tabela.setDefaultRenderer(Double.class, render);
        tabela.setDefaultRenderer(BigInteger.class, render);
        tabela.setDefaultRenderer(BigDecimal.class, render);
        tabela.setDefaultRenderer(long.class, render);
        tabela.setDefaultRenderer(Long.class, render);
        return this;
    }

    public HFTableUtil setarCheckBox() {
        HFCellRenderCheckBox render = new HFCellRenderCheckBox();
        tabela.setDefaultRenderer(Boolean.class, render);
        tabela.setDefaultRenderer(boolean.class, render);
        return this;
    }

    public HFTableUtil setarProgressBar() {
        HFCellRenderProgressBar render = new HFCellRenderProgressBar();
        tabela.setDefaultRenderer(JProgressBar.class, render);
        return this;
    }

    public HFTableUtil withTamanho(int column, int width) {
        tabela.getColumnModel().getColumn(column).setMinWidth(width);
        tabela.getColumnModel().getColumn(column).setMaxWidth(width);
        tabela.getColumnModel().getColumn(column).setPreferredWidth(width);
        tabela.getTableHeader().getColumnModel().getColumn(column).setPreferredWidth(width);
        tabela.getTableHeader().getColumnModel().getColumn(column).setMinWidth(width);
        tabela.getTableHeader().getColumnModel().getColumn(column).setMaxWidth(width);
        return this;
    }

    public HFTableUtil setarCheckBoxSelectable(final int column) {

        MouseListener mouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (tabela.getSelectedColumn() == column) {
                    Boolean b = (Boolean) tabela.getModel().getValueAt(tabela.getSelectedRow(), column);
                    if (b) {
                        tabela.setValueAt(false, tabela.getSelectedRow(), column);
                    } else {
                        tabela.setValueAt(true, tabela.getSelectedRow(), column);
                    }
                }
                tabela.revalidate();
                tabela.repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        tabela.addMouseListener(mouse);

        return this;
    }

    public HFTable apply() {
        return tabela;
    }

    public HFTableUtil setEditable(int i) {
        tabela.setEditable(i, true);
        return this;
    }
}
