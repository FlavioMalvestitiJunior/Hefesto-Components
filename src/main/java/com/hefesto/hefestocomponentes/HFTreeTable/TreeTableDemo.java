/*
 *TreeTableDemo.java   Feb 23, 2008
 * Developer: sandarenu
 * Copyright (c) 2006-2008 Minimuthu Software Developers.
 * Sri Lanka.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of 
 * Minimuthu Software Developers. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Minimuthu.
 */
package com.hefesto.hefestocomponentes.HFTreeTable;

/**
 * @author sandarenu
 *
 */
import com.hefesto.hefestocomponentes.HFCalendar.HFCalendar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;
import javax.swing.tree.DefaultMutableTreeNode;
import org.jdesktop.swingx.JXTable;
import org.jdesktop.swingx.JXTreeTable;
import org.jdesktop.swingx.decorator.Highlighter;
import org.jdesktop.swingx.decorator.HighlighterFactory;
import org.jdesktop.swingx.renderer.DefaultTableRenderer;
import org.jdesktop.swingx.renderer.StringValue;

public class TreeTableDemo {

    /**
     * Creates a JTree from an InfiniteBinaryTree model and displays it.
     */
    public TreeTableDemo() throws Exception {
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"CF", "", "", ""}), true));

        DefaultMutableTreeNode incomeNode = new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Income", null, null, new HFCalendar()}), true));
        incomeNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{null, "250001", "50001", "3000001"}), true)));
        incomeNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary2", "250002", "50002", "3000002"}), true)));
        incomeNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary3", "250003", "50003", "3000003"}), true)));
        incomeNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary4", "250004", "50004", "3000004"}), true)));
        incomeNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary5", "250005", "50005", "3000005"}), true)));

        DefaultMutableTreeNode expenseNode = new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Expenses", "25000", "5000", "300000"}), true));
        expenseNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary21", "250001", "50001", "3000001"}), false)));
        expenseNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary22", "250002", "50002", "3000002"}), false)));
        expenseNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary23", "250003", "50003", "3000003"}), false)));
        expenseNode.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary24", "250004", "50004", "3000004"}), false)));

        DefaultMutableTreeNode noder = new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary25", "250005", "50005", "3000005"}), true));
        noder.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary21", "250001", "50001", "3000001"}), false)));
        noder.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary22", "250002", "50002", "3000002"}), false)));
        noder.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary23", "250003", "50003", "3000003"}), false)));
        noder.add(new DefaultMutableTreeNode(new HFRowData(Arrays.asList(new Object[]{"Salary24", "250004", "50004", "3000004"}), false)));

        expenseNode.add(noder);
        incomeNode.add(expenseNode);
        rootNode.add(incomeNode);

        JXTreeTable binTree = new JXTreeTable(new HFTreeModel(rootNode, new String[]{"CF Source", "Client", "Spouse", "Family"}));
        binTree.expandAll();
        binTree.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                JXTreeTable bin = (JXTreeTable) e.getComponent();
                if (bin.getSelectedColumn() == 0) {
                    if (bin.isCollapsed(bin.getSelectedRow())) {
                        bin.expandRow(bin.getSelectedRow());
                    } else {
                        bin.collapseRow(bin.getSelectedRow());
                    }
                }
                if (bin.getModel().getValueAt(bin.getSelectedRow(), 3) instanceof HFCalendar) {
                    System.out.println(((HFCalendar) bin.getModel().getValueAt(bin.getSelectedRow(), 3)).getDiaSelecionado());

                };
            }
        });

        binTree.setSelectionBackground(Color.MAGENTA);
        Highlighter highligher = HighlighterFactory.createSimpleStriping(HighlighterFactory.QUICKSILVER);
        binTree.getColumn(3).setMaxWidth(-1);
        binTree.getColumn(3).setMinWidth(-1);
        binTree.getColumn(3).setPreferredWidth(-1);
        binTree.setHighlighters(highligher);

        binTree.setShowGrid(false);
        binTree.setShowsRootHandles(false);
        configureCommonTableProperties(binTree);
        binTree.setTreeCellRenderer(new HFTreeTableCellRenderer());
        JFrame frame = new JFrame("Tree Table Demo");
        frame.getContentPane().add(new JScrollPane(binTree));
        frame.setSize(new java.awt.Dimension(400, 400));
        frame.setLocation(280, 50);
        frame.setVisible(true);
    }

    private void configureCommonTableProperties(JXTable table) {
        table.setColumnControlVisible(true);
        StringValue toString = new StringValue() {

            public String getString(Object value) {
                if (value instanceof Point) {
                    Point p = (Point) value;
                    return createString(p.x, p.y);
                } else if (value instanceof Dimension) {
                    Dimension dim = (Dimension) value;
                    return createString(dim.width, dim.height);
                }
                return "";
            }

            private String createString(int width, int height) {
                return "(" + width + ", " + height + ")";
            }

        };
        TableCellRenderer renderer = new DefaultTableRenderer(toString);
        table.setDefaultRenderer(Point.class, renderer);
        table.setDefaultRenderer(Dimension.class, renderer);
    }

}
