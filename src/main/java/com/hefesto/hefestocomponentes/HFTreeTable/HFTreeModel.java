package com.hefesto.hefestocomponentes.HFTreeTable;

import javax.swing.tree.DefaultMutableTreeNode;
import org.jdesktop.swingx.treetable.AbstractTreeTableModel;

public class HFTreeModel extends AbstractTreeTableModel {

    private String[] titles;

    public HFTreeModel(DefaultMutableTreeNode root, String[] titles) {
        super(root);
        this.titles = titles;

    }

    /**
     * Table Columns
     */
    public String getColumnName(int column) {
        if (column < titles.length) {
            return (String) titles[column];
        } else {
            return "";
        }
    }

    public int getColumnCount() {
        return titles.length;
    }

    public Class getColumnClass(int column) {
        return String.class;
    }

    public Object getValueAt(Object arg0, int arg1) {
        if (arg0 instanceof HFRowData) {
            HFRowData data = (HFRowData) arg0;
            if (data != null) {
                return data.getData(arg1);
            }

        }

        if (arg0 instanceof DefaultMutableTreeNode) {
            DefaultMutableTreeNode dataNode = (DefaultMutableTreeNode) arg0;
            HFRowData data = (HFRowData) dataNode.getUserObject();
            if (data != null) {
                return data.getData(arg1);
            }

        }
        return "";
    }

    public Object getChild(Object arg0, int arg1) {

        if (arg0 instanceof DefaultMutableTreeNode) {
            DefaultMutableTreeNode nodes = (DefaultMutableTreeNode) arg0;
            return nodes.getChildAt(arg1);
        }
        return null;
    }

    public int getChildCount(Object arg0) {

        if (arg0 instanceof DefaultMutableTreeNode) {
            DefaultMutableTreeNode nodes = (DefaultMutableTreeNode) arg0;
            return nodes.getChildCount();
        }
        return 0;
    }

    public int getIndexOfChild(Object arg0, Object arg1) {
        // TODO Auto-generated method stub
        return 0;
    }

    public boolean isLeaf(Object node) {
        return getChildCount(node) == 0;
    }

}
