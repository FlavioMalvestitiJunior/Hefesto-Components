/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFBaloon;

/**
 * Copyright (c) 2011 Bernhard Pauler, Tim Molderez.
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the 3-Clause BSD License which accompanies this
 * distribution, and is available at
 * http://www.opensource.org/licenses/BSD-3-Clause
 */
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.BalloonTip.AttachLocation;
import net.java.balloontip.BalloonTip.Orientation;
import net.java.balloontip.CustomBalloonTip;
import net.java.balloontip.positioners.BalloonTipPositioner;
import net.java.balloontip.styles.BalloonTipStyle;

/**
 * Provides similar functionality as a CustomBalloonTip, but attaches itself to
 * a cell in a JTable
 *
 * @author Tim Molderez
 */
public class HFTablecellBalloonTip extends CustomBalloonTip {

    protected int row;
    protected int column;
    private AncestorListener attachedComponentParentListener = null;
    private final TableColumnModelListener columnListener = new TableColumnModelListener() {

        @Override
        public void columnAdded(TableColumnModelEvent e) {
            closeBalloon();
        }

        @Override
        public void columnMarginChanged(ChangeEvent e) {
            setCellPosition(row, column);
        }

        @Override
        public void columnMoved(TableColumnModelEvent e) {
            closeBalloon();
        }

        @Override
        public void columnRemoved(TableColumnModelEvent e) {
            closeBalloon();
        }

        @Override
        public void columnSelectionChanged(ListSelectionEvent e) {
        }
    };
    // If someone adds/removes rows, ...
    private final TableModelListener tableModelListener = new TableModelListener() {

        @Override
        public void tableChanged(TableModelEvent e) {
            if (e.getType() == TableModelEvent.INSERT || e.getType() == TableModelEvent.DELETE) {
                closeBalloon();
            }
        }
    };

    // This class is needed when the table hasn't been set up yet during the constructor of this balloon tip
    private class ConstructorHelper implements AncestorListener {

        @Override
        public void ancestorAdded(AncestorEvent event) {
            addListeners();
            // Don't forget to reposition yourself! During the constructor the table wasn't set up yet, so you couldn't determine the table cell's position...
            setCellPosition(row, column);
            // Remove yourself
            ((JTable) attachedComponent).removeAncestorListener(this);
        }

        @Override
        public void ancestorMoved(AncestorEvent event) {
        }

        @Override
        public void ancestorRemoved(AncestorEvent event) {
        }
    }

    /**
     * @see net.java.balloontip.BalloonTip#BalloonTip(JComponent, JComponent,
     * BalloonTipStyle, Orientation, AttachLocation, int, int, boolean)
     * @param table	The table to attach the balloon tip to (may not be null)
     * @param row	Which row is the balloon tip attached to
     * @param column	Which column is the balloon tip attached to
     */
    public HFTablecellBalloonTip(JTable table, JComponent component, int row, int column, BalloonTipStyle style, BalloonTip.Orientation alignment, BalloonTip.AttachLocation attachLocation, int horizontalOffset, int verticalOffset, boolean useCloseButton) {
        super(table, component, table.getCellRect(row, column, true), style, alignment, attachLocation, horizontalOffset, verticalOffset, useCloseButton);
        setup(table, row, column);
    }

    /**
     * @see net.java.balloontip.BalloonTip#BalloonTip(JComponent, JComponent,
     * BalloonTipStyle, BalloonTipPositioner, JButton)
     * @param table	The table to attach the balloon tip to (may not be null)
     * @param row	Which row is the balloon tip attached to
     * @param column	Which column is the balloon tip attached to
     */
    public HFTablecellBalloonTip(JTable table, JComponent component, int row, int column, BalloonTipStyle style, BalloonTipPositioner positioner, JButton closeButton) {
        super(table, component, table.getCellRect(row, column, true), style, positioner, closeButton);
        setup(table, row, column);
    }

    /**
     * Set the table cell the balloon tip should attach to
     *
     * @param row	row of the table cell
     * @param column	column of the table cell
     */
    public void setCellPosition(int row, int column) {
        JTable table = (JTable) attachedComponent;
        offset = table.getCellRect(row, column, false);
        refreshLocation();
    }

    @Override
    public void closeBalloon() {
        attachedComponent.removeAncestorListener(attachedComponentParentListener);
        removeListeners();
        super.closeBalloon();
    }

    /*
     * A helper method needed when constructing a TablecellBalloonTip instance
     * @param table	The table to which this balloon tip attaches itself to
     * @param row	The row of the cell to which this balloon tip attaches itself
     * to @param column	The column of the cell to which this balloon tip
     * attaches itself to
     */
    private void setup(JTable table, int row, int column) {
        this.row = row;
        this.column = column;

        // We can only add the columnListener if we're sure the table has already been properly set up (which is the case if our super-constructor was able to determine the top level container...)
        if (getTopLevelContainer() != null) {
            addListeners();
        } else {
            attachedComponentParentListener = new HFTablecellBalloonTip.ConstructorHelper();
            table.addAncestorListener(attachedComponentParentListener);
        }
    }

    /*
     * Adds the necessary listeners to the attached JTable, such that this
     * balloon tip will adjust itself to changes in the JTable
     */
    private void addListeners() {
        JTable attachedTable = ((JTable) attachedComponent);
        attachedTable.getColumnModel().addColumnModelListener(columnListener);
        attachedTable.getModel().addTableModelListener(tableModelListener);
    }

    /*
     * Removes all listeners from the attached JTable
     */
    private void removeListeners() {
        JTable attachedTable = ((JTable) attachedComponent);
        attachedTable.getColumnModel().removeColumnModelListener(columnListener);
        attachedTable.getModel().removeTableModelListener(tableModelListener);
    }
}
