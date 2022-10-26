/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFTable.editors;

import com.hefesto.hefestocomponentes.HFTable.HFTable;
import com.hefesto.hefestocomponentes.HFTextField.HFTextField;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author jr
 */
public class HFCellRenderTextEditor extends DefaultCellEditor {

    HFTable tabela;
    HFTextField datas;
    private int column;
    private int row;

    public HFCellRenderTextEditor(JTextField textField) {
        super(textField);
        datas = (HFTextField) textField;
        datas.getCaret().setVisible(true);
        setClickCountToStart(2);

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        super.getTableCellEditorComponent(table, value, isSelected, row, column);
        if (table instanceof HFTable) {
            tabela = (HFTable) table;
            this.column = column;
            this.row = row;
        }
        if (isSelected) {
            datas.grabFocus();
        }
        return datas;
    }

    @Override
    public boolean stopCellEditing() {
        boolean bol = datas.Valida();
        if (bol) {
            super.stopCellEditing();
        }
        return bol;
    }

}
