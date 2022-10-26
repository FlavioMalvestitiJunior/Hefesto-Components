/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hefesto.hefestocomponentes.HFTreeTable;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author Flavio
 */
public class HFTreeTableBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_autoCreateColumnsFromModel = 5;
    private static final int PROPERTY_autoCreateRowSorter = 6;
    private static final int PROPERTY_autoResizeMode = 7;
    private static final int PROPERTY_autoscrolls = 8;
    private static final int PROPERTY_autoStartEditOnKeyStroke = 9;
    private static final int PROPERTY_background = 10;
    private static final int PROPERTY_backgroundSet = 11;
    private static final int PROPERTY_baselineResizeBehavior = 12;
    private static final int PROPERTY_border = 13;
    private static final int PROPERTY_bounds = 14;
    private static final int PROPERTY_cellEditor = 15;
    private static final int PROPERTY_cellSelectionEnabled = 16;
    private static final int PROPERTY_closedIcon = 17;
    private static final int PROPERTY_collapsed = 18;
    private static final int PROPERTY_collapsedIcon = 19;
    private static final int PROPERTY_colorModel = 20;
    private static final int PROPERTY_column = 21;
    private static final int PROPERTY_columnClass = 22;
    private static final int PROPERTY_columnControl = 23;
    private static final int PROPERTY_columnControlVisible = 24;
    private static final int PROPERTY_columnCount = 25;
    private static final int PROPERTY_columnExt = 26;
    private static final int PROPERTY_columnFactory = 27;
    private static final int PROPERTY_columnMargin = 28;
    private static final int PROPERTY_columnModel = 29;
    private static final int PROPERTY_columnName = 30;
    private static final int PROPERTY_columns = 31;
    private static final int PROPERTY_columnSelected = 32;
    private static final int PROPERTY_columnSelectionAllowed = 33;
    private static final int PROPERTY_columnSelectionInterval = 34;
    private static final int PROPERTY_columnSequence = 35;
    private static final int PROPERTY_colunas = 36;
    private static final int PROPERTY_component = 37;
    private static final int PROPERTY_componentCount = 38;
    private static final int PROPERTY_componentListeners = 39;
    private static final int PROPERTY_componentOrientation = 40;
    private static final int PROPERTY_componentPopupMenu = 41;
    private static final int PROPERTY_components = 42;
    private static final int PROPERTY_containerListeners = 43;
    private static final int PROPERTY_cursor = 44;
    private static final int PROPERTY_cursorSet = 45;
    private static final int PROPERTY_debugGraphicsOptions = 46;
    private static final int PROPERTY_displayable = 47;
    private static final int PROPERTY_doubleBuffered = 48;
    private static final int PROPERTY_dragEnabled = 49;
    private static final int PROPERTY_dropLocation = 50;
    private static final int PROPERTY_dropMode = 51;
    private static final int PROPERTY_dropTarget = 52;
    private static final int PROPERTY_editable = 53;
    private static final int PROPERTY_editing = 54;
    private static final int PROPERTY_editingColumn = 55;
    private static final int PROPERTY_editingRow = 56;
    private static final int PROPERTY_editorComponent = 57;
    private static final int PROPERTY_enabled = 58;
    private static final int PROPERTY_expanded = 59;
    private static final int PROPERTY_expandedIcon = 60;
    private static final int PROPERTY_expandsSelectedPaths = 61;
    private static final int PROPERTY_fillsViewportHeight = 62;
    private static final int PROPERTY_focusable = 63;
    private static final int PROPERTY_focusCycleRoot = 64;
    private static final int PROPERTY_focusCycleRootAncestor = 65;
    private static final int PROPERTY_focusListeners = 66;
    private static final int PROPERTY_focusOwner = 67;
    private static final int PROPERTY_focusTraversable = 68;
    private static final int PROPERTY_focusTraversalKeys = 69;
    private static final int PROPERTY_focusTraversalKeysEnabled = 70;
    private static final int PROPERTY_focusTraversalPolicy = 71;
    private static final int PROPERTY_focusTraversalPolicyProvider = 72;
    private static final int PROPERTY_focusTraversalPolicySet = 73;
    private static final int PROPERTY_font = 74;
    private static final int PROPERTY_fontSet = 75;
    private static final int PROPERTY_foreground = 76;
    private static final int PROPERTY_foregroundSet = 77;
    private static final int PROPERTY_graphics = 78;
    private static final int PROPERTY_graphicsConfiguration = 79;
    private static final int PROPERTY_gridColor = 80;
    private static final int PROPERTY_height = 81;
    private static final int PROPERTY_hierarchical = 82;
    private static final int PROPERTY_hierarchicalColumn = 83;
    private static final int PROPERTY_hierarchyBoundsListeners = 84;
    private static final int PROPERTY_hierarchyListeners = 85;
    private static final int PROPERTY_highlighters = 86;
    private static final int PROPERTY_horizontalScrollEnabled = 87;
    private static final int PROPERTY_ignoreRepaint = 88;
    private static final int PROPERTY_inheritsPopupMenu = 89;
    private static final int PROPERTY_inputContext = 90;
    private static final int PROPERTY_inputMap = 91;
    private static final int PROPERTY_inputMethodListeners = 92;
    private static final int PROPERTY_inputMethodRequests = 93;
    private static final int PROPERTY_inputVerifier = 94;
    private static final int PROPERTY_insets = 95;
    private static final int PROPERTY_intercellSpacing = 96;
    private static final int PROPERTY_keyListeners = 97;
    private static final int PROPERTY_largeModel = 98;
    private static final int PROPERTY_layout = 99;
    private static final int PROPERTY_leafIcon = 100;
    private static final int PROPERTY_lightweight = 101;
    private static final int PROPERTY_locale = 102;
    private static final int PROPERTY_location = 103;
    private static final int PROPERTY_locationOnScreen = 104;
    private static final int PROPERTY_managingFocus = 105;
    private static final int PROPERTY_maximumSize = 106;
    private static final int PROPERTY_maximumSizeSet = 107;
    private static final int PROPERTY_minimumSize = 108;
    private static final int PROPERTY_minimumSizeSet = 109;
    private static final int PROPERTY_model = 110;
    private static final int PROPERTY_mouseListeners = 111;
    private static final int PROPERTY_mouseMotionListeners = 112;
    private static final int PROPERTY_mousePosition = 113;
    private static final int PROPERTY_mouseWheelListeners = 114;
    private static final int PROPERTY_name = 115;
    private static final int PROPERTY_nextFocusableComponent = 116;
    private static final int PROPERTY_opaque = 117;
    private static final int PROPERTY_openIcon = 118;
    private static final int PROPERTY_optimizedDrawingEnabled = 119;
    private static final int PROPERTY_overwriteRendererIcons = 120;
    private static final int PROPERTY_paintingForPrint = 121;
    private static final int PROPERTY_paintingTile = 122;
    private static final int PROPERTY_parent = 123;
    private static final int PROPERTY_pathForRow = 124;
    private static final int PROPERTY_peer = 125;
    private static final int PROPERTY_preferredScrollableViewportSize = 126;
    private static final int PROPERTY_preferredSize = 127;
    private static final int PROPERTY_preferredSizeSet = 128;
    private static final int PROPERTY_propertyChangeListeners = 129;
    private static final int PROPERTY_registeredKeyStrokes = 130;
    private static final int PROPERTY_requestFocusEnabled = 131;
    private static final int PROPERTY_rolloverEnabled = 132;
    private static final int PROPERTY_rootPane = 133;
    private static final int PROPERTY_rootVisible = 134;
    private static final int PROPERTY_rowCount = 135;
    private static final int PROPERTY_rowFilter = 136;
    private static final int PROPERTY_rowHeight = 137;
    private static final int PROPERTY_rowMargin = 138;
    private static final int PROPERTY_rowSelected = 139;
    private static final int PROPERTY_rowSelectionAllowed = 140;
    private static final int PROPERTY_rowSelectionInterval = 141;
    private static final int PROPERTY_rowSorter = 142;
    private static final int PROPERTY_scrollableTracksViewportHeight = 143;
    private static final int PROPERTY_scrollableTracksViewportWidth = 144;
    private static final int PROPERTY_scrollsOnExpand = 145;
    private static final int PROPERTY_searchable = 146;
    private static final int PROPERTY_selectedColumn = 147;
    private static final int PROPERTY_selectedColumnCount = 148;
    private static final int PROPERTY_selectedColumns = 149;
    private static final int PROPERTY_selectedRow = 150;
    private static final int PROPERTY_selectedRowCount = 151;
    private static final int PROPERTY_selectedRows = 152;
    private static final int PROPERTY_selectionBackground = 153;
    private static final int PROPERTY_selectionForeground = 154;
    private static final int PROPERTY_selectionMode = 155;
    private static final int PROPERTY_selectionModel = 156;
    private static final int PROPERTY_showGrid = 157;
    private static final int PROPERTY_showHorizontalLines = 158;
    private static final int PROPERTY_showing = 159;
    private static final int PROPERTY_showsRootHandles = 160;
    private static final int PROPERTY_showVerticalLines = 161;
    private static final int PROPERTY_size = 162;
    private static final int PROPERTY_sortable = 163;
    private static final int PROPERTY_sortedColumn = 164;
    private static final int PROPERTY_sortedColumnIndex = 165;
    private static final int PROPERTY_sortOrder = 166;
    private static final int PROPERTY_sortOrderCycle = 167;
    private static final int PROPERTY_sortsOnUpdates = 168;
    private static final int PROPERTY_surrendersFocusOnKeystroke = 169;
    private static final int PROPERTY_tableHeader = 170;
    private static final int PROPERTY_terminateEditOnFocusLost = 171;
    private static final int PROPERTY_toggleClickCount = 172;
    private static final int PROPERTY_toolkit = 173;
    private static final int PROPERTY_toolTipText = 174;
    private static final int PROPERTY_topLevelAncestor = 175;
    private static final int PROPERTY_transferHandler = 176;
    private static final int PROPERTY_treeCellRenderer = 177;
    private static final int PROPERTY_treeLock = 178;
    private static final int PROPERTY_treeSelectionModel = 179;
    private static final int PROPERTY_treeTableModel = 180;
    private static final int PROPERTY_UI = 181;
    private static final int PROPERTY_UIClassID = 182;
    private static final int PROPERTY_updateSelectionOnSort = 183;
    private static final int PROPERTY_valid = 184;
    private static final int PROPERTY_validateRoot = 185;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 186;
    private static final int PROPERTY_vetoableChangeListeners = 187;
    private static final int PROPERTY_visible = 188;
    private static final int PROPERTY_visibleColumnCount = 189;
    private static final int PROPERTY_visibleRect = 190;
    private static final int PROPERTY_visibleRowCount = 191;
    private static final int PROPERTY_width = 192;
    private static final int PROPERTY_x = 193;
    private static final int PROPERTY_y = 194;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[195];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoCreateColumnsFromModel] = new PropertyDescriptor ( "autoCreateColumnsFromModel", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getAutoCreateColumnsFromModel", "setAutoCreateColumnsFromModel" ); // NOI18N
            properties[PROPERTY_autoCreateRowSorter] = new PropertyDescriptor ( "autoCreateRowSorter", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getAutoCreateRowSorter", "setAutoCreateRowSorter" ); // NOI18N
            properties[PROPERTY_autoResizeMode] = new PropertyDescriptor ( "autoResizeMode", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getAutoResizeMode", "setAutoResizeMode" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_autoStartEditOnKeyStroke] = new PropertyDescriptor ( "autoStartEditOnKeyStroke", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isAutoStartEditOnKeyStroke", "setAutoStartEditOnKeyStroke" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_cellEditor] = new PropertyDescriptor ( "cellEditor", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getCellEditor", "setCellEditor" ); // NOI18N
            properties[PROPERTY_cellSelectionEnabled] = new PropertyDescriptor ( "cellSelectionEnabled", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getCellSelectionEnabled", "setCellSelectionEnabled" ); // NOI18N
            properties[PROPERTY_closedIcon] = new PropertyDescriptor ( "closedIcon", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, "setClosedIcon" ); // NOI18N
            properties[PROPERTY_collapsed] = new IndexedPropertyDescriptor ( "collapsed", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "isCollapsed", null ); // NOI18N
            properties[PROPERTY_collapsedIcon] = new PropertyDescriptor ( "collapsedIcon", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, "setCollapsedIcon" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_column] = new IndexedPropertyDescriptor ( "column", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "getColumn", null ); // NOI18N
            properties[PROPERTY_columnClass] = new IndexedPropertyDescriptor ( "columnClass", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "getColumnClass", null ); // NOI18N
            properties[PROPERTY_columnControl] = new PropertyDescriptor ( "columnControl", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getColumnControl", "setColumnControl" ); // NOI18N
            properties[PROPERTY_columnControlVisible] = new PropertyDescriptor ( "columnControlVisible", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isColumnControlVisible", "setColumnControlVisible" ); // NOI18N
            properties[PROPERTY_columnCount] = new PropertyDescriptor ( "columnCount", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getColumnCount", null ); // NOI18N
            properties[PROPERTY_columnExt] = new IndexedPropertyDescriptor ( "columnExt", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "getColumnExt", null ); // NOI18N
            properties[PROPERTY_columnFactory] = new PropertyDescriptor ( "columnFactory", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getColumnFactory", "setColumnFactory" ); // NOI18N
            properties[PROPERTY_columnMargin] = new PropertyDescriptor ( "columnMargin", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getColumnMargin", "setColumnMargin" ); // NOI18N
            properties[PROPERTY_columnModel] = new PropertyDescriptor ( "columnModel", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getColumnModel", "setColumnModel" ); // NOI18N
            properties[PROPERTY_columnName] = new IndexedPropertyDescriptor ( "columnName", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "getColumnName", null ); // NOI18N
            properties[PROPERTY_columns] = new PropertyDescriptor ( "columns", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getColumns", null ); // NOI18N
            properties[PROPERTY_columnSelected] = new IndexedPropertyDescriptor ( "columnSelected", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "isColumnSelected", null ); // NOI18N
            properties[PROPERTY_columnSelectionAllowed] = new PropertyDescriptor ( "columnSelectionAllowed", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getColumnSelectionAllowed", "setColumnSelectionAllowed" ); // NOI18N
            properties[PROPERTY_columnSelectionInterval] = new IndexedPropertyDescriptor ( "columnSelectionInterval", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, null, "setColumnSelectionInterval" ); // NOI18N
            properties[PROPERTY_columnSequence] = new PropertyDescriptor ( "columnSequence", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, "setColumnSequence" ); // NOI18N
            properties[PROPERTY_colunas] = new PropertyDescriptor ( "colunas", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, "setColunas" ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editable] = new PropertyDescriptor ( "editable", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isEditable", "setEditable" ); // NOI18N
            properties[PROPERTY_editing] = new PropertyDescriptor ( "editing", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isEditing", null ); // NOI18N
            properties[PROPERTY_editingColumn] = new PropertyDescriptor ( "editingColumn", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getEditingColumn", "setEditingColumn" ); // NOI18N
            properties[PROPERTY_editingRow] = new PropertyDescriptor ( "editingRow", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getEditingRow", "setEditingRow" ); // NOI18N
            properties[PROPERTY_editorComponent] = new PropertyDescriptor ( "editorComponent", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getEditorComponent", null ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_expanded] = new IndexedPropertyDescriptor ( "expanded", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "isExpanded", null ); // NOI18N
            properties[PROPERTY_expandedIcon] = new PropertyDescriptor ( "expandedIcon", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, "setExpandedIcon" ); // NOI18N
            properties[PROPERTY_expandsSelectedPaths] = new PropertyDescriptor ( "expandsSelectedPaths", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getExpandsSelectedPaths", "setExpandsSelectedPaths" ); // NOI18N
            properties[PROPERTY_fillsViewportHeight] = new PropertyDescriptor ( "fillsViewportHeight", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getFillsViewportHeight", "setFillsViewportHeight" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_gridColor] = new PropertyDescriptor ( "gridColor", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getGridColor", "setGridColor" ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchical] = new IndexedPropertyDescriptor ( "hierarchical", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "isHierarchical", null ); // NOI18N
            properties[PROPERTY_hierarchicalColumn] = new PropertyDescriptor ( "hierarchicalColumn", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getHierarchicalColumn", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_highlighters] = new PropertyDescriptor ( "highlighters", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getHighlighters", "setHighlighters" ); // NOI18N
            properties[PROPERTY_horizontalScrollEnabled] = new PropertyDescriptor ( "horizontalScrollEnabled", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isHorizontalScrollEnabled", "setHorizontalScrollEnabled" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_intercellSpacing] = new PropertyDescriptor ( "intercellSpacing", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getIntercellSpacing", "setIntercellSpacing" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_largeModel] = new PropertyDescriptor ( "largeModel", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isLargeModel", "setLargeModel" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_leafIcon] = new PropertyDescriptor ( "leafIcon", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, "setLeafIcon" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_openIcon] = new PropertyDescriptor ( "openIcon", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, "setOpenIcon" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_overwriteRendererIcons] = new PropertyDescriptor ( "overwriteRendererIcons", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isOverwriteRendererIcons", "setOverwriteRendererIcons" ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getParent", null ); // NOI18N
            properties[PROPERTY_pathForRow] = new IndexedPropertyDescriptor ( "pathForRow", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "getPathForRow", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getPreferredScrollableViewportSize", "setPreferredScrollableViewportSize" ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rolloverEnabled] = new PropertyDescriptor ( "rolloverEnabled", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isRolloverEnabled", "setRolloverEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_rootVisible] = new PropertyDescriptor ( "rootVisible", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isRootVisible", "setRootVisible" ); // NOI18N
            properties[PROPERTY_rowCount] = new PropertyDescriptor ( "rowCount", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getRowCount", null ); // NOI18N
            properties[PROPERTY_rowFilter] = new PropertyDescriptor ( "rowFilter", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getRowFilter", null ); // NOI18N
            properties[PROPERTY_rowHeight] = new PropertyDescriptor ( "rowHeight", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getRowHeight", "setRowHeight" ); // NOI18N
            properties[PROPERTY_rowMargin] = new PropertyDescriptor ( "rowMargin", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getRowMargin", "setRowMargin" ); // NOI18N
            properties[PROPERTY_rowSelected] = new IndexedPropertyDescriptor ( "rowSelected", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "isRowSelected", null ); // NOI18N
            properties[PROPERTY_rowSelectionAllowed] = new PropertyDescriptor ( "rowSelectionAllowed", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getRowSelectionAllowed", "setRowSelectionAllowed" ); // NOI18N
            properties[PROPERTY_rowSelectionInterval] = new IndexedPropertyDescriptor ( "rowSelectionInterval", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, null, "setRowSelectionInterval" ); // NOI18N
            properties[PROPERTY_rowSorter] = new PropertyDescriptor ( "rowSorter", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getRowSorter", "setRowSorter" ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_scrollsOnExpand] = new PropertyDescriptor ( "scrollsOnExpand", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getScrollsOnExpand", "setScrollsOnExpand" ); // NOI18N
            properties[PROPERTY_searchable] = new PropertyDescriptor ( "searchable", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSearchable", "setSearchable" ); // NOI18N
            properties[PROPERTY_selectedColumn] = new PropertyDescriptor ( "selectedColumn", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectedColumn", null ); // NOI18N
            properties[PROPERTY_selectedColumnCount] = new PropertyDescriptor ( "selectedColumnCount", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectedColumnCount", null ); // NOI18N
            properties[PROPERTY_selectedColumns] = new PropertyDescriptor ( "selectedColumns", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectedColumns", null ); // NOI18N
            properties[PROPERTY_selectedRow] = new PropertyDescriptor ( "selectedRow", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectedRow", null ); // NOI18N
            properties[PROPERTY_selectedRowCount] = new PropertyDescriptor ( "selectedRowCount", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectedRowCount", null ); // NOI18N
            properties[PROPERTY_selectedRows] = new PropertyDescriptor ( "selectedRows", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectedRows", null ); // NOI18N
            properties[PROPERTY_selectionBackground] = new PropertyDescriptor ( "selectionBackground", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectionBackground", "setSelectionBackground" ); // NOI18N
            properties[PROPERTY_selectionForeground] = new PropertyDescriptor ( "selectionForeground", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectionForeground", "setSelectionForeground" ); // NOI18N
            properties[PROPERTY_selectionMode] = new PropertyDescriptor ( "selectionMode", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectionMode", "setSelectionMode" ); // NOI18N
            properties[PROPERTY_selectionModel] = new PropertyDescriptor ( "selectionModel", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSelectionModel", "setSelectionModel" ); // NOI18N
            properties[PROPERTY_showGrid] = new PropertyDescriptor ( "showGrid", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, "setShowGrid" ); // NOI18N
            properties[PROPERTY_showHorizontalLines] = new PropertyDescriptor ( "showHorizontalLines", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getShowHorizontalLines", "setShowHorizontalLines" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_showsRootHandles] = new PropertyDescriptor ( "showsRootHandles", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getShowsRootHandles", "setShowsRootHandles" ); // NOI18N
            properties[PROPERTY_showVerticalLines] = new PropertyDescriptor ( "showVerticalLines", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getShowVerticalLines", "setShowVerticalLines" ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_sortable] = new PropertyDescriptor ( "sortable", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isSortable", "setSortable" ); // NOI18N
            properties[PROPERTY_sortedColumn] = new PropertyDescriptor ( "sortedColumn", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSortedColumn", null ); // NOI18N
            properties[PROPERTY_sortedColumnIndex] = new PropertyDescriptor ( "sortedColumnIndex", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSortedColumnIndex", null ); // NOI18N
            properties[PROPERTY_sortOrder] = new IndexedPropertyDescriptor ( "sortOrder", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, null, null, "getSortOrder", "setSortOrder" ); // NOI18N
            properties[PROPERTY_sortOrderCycle] = new PropertyDescriptor ( "sortOrderCycle", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSortOrderCycle", "setSortOrderCycle" ); // NOI18N
            properties[PROPERTY_sortsOnUpdates] = new PropertyDescriptor ( "sortsOnUpdates", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSortsOnUpdates", "setSortsOnUpdates" ); // NOI18N
            properties[PROPERTY_surrendersFocusOnKeystroke] = new PropertyDescriptor ( "surrendersFocusOnKeystroke", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getSurrendersFocusOnKeystroke", "setSurrendersFocusOnKeystroke" ); // NOI18N
            properties[PROPERTY_tableHeader] = new PropertyDescriptor ( "tableHeader", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getTableHeader", "setTableHeader" ); // NOI18N
            properties[PROPERTY_terminateEditOnFocusLost] = new PropertyDescriptor ( "terminateEditOnFocusLost", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isTerminateEditOnFocusLost", "setTerminateEditOnFocusLost" ); // NOI18N
            properties[PROPERTY_toggleClickCount] = new PropertyDescriptor ( "toggleClickCount", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getToggleClickCount", "setToggleClickCount" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeCellRenderer] = new PropertyDescriptor ( "treeCellRenderer", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getTreeCellRenderer", "setTreeCellRenderer" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_treeSelectionModel] = new PropertyDescriptor ( "treeSelectionModel", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getTreeSelectionModel", null ); // NOI18N
            properties[PROPERTY_treeTableModel] = new PropertyDescriptor ( "treeTableModel", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getTreeTableModel", "setTreeTableModel" ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_updateSelectionOnSort] = new PropertyDescriptor ( "updateSelectionOnSort", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getUpdateSelectionOnSort", "setUpdateSelectionOnSort" ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleColumnCount] = new PropertyDescriptor ( "visibleColumnCount", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getVisibleColumnCount", "setVisibleColumnCount" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_visibleRowCount] = new PropertyDescriptor ( "visibleRowCount", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getVisibleRowCount", "setVisibleRowCount" ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_treeExpansionListener = 12;
    private static final int EVENT_treeSelectionListener = 13;
    private static final int EVENT_treeWillExpandListener = 14;
    private static final int EVENT_vetoableChangeListener = 15;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[16];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_treeExpansionListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "treeExpansionListener", javax.swing.event.TreeExpansionListener.class, new String[] {"treeExpanded", "treeCollapsed"}, "addTreeExpansionListener", "removeTreeExpansionListener" ); // NOI18N
            eventSets[EVENT_treeSelectionListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "treeSelectionListener", javax.swing.event.TreeSelectionListener.class, new String[] {"valueChanged"}, "addTreeSelectionListener", "removeTreeSelectionListener" ); // NOI18N
            eventSets[EVENT_treeWillExpandListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "treeWillExpandListener", javax.swing.event.TreeWillExpandListener.class, new String[] {"treeWillExpand", "treeWillCollapse"}, "addTreeWillExpandListener", "removeTreeWillExpandListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTreeTable.HFTreeTable.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addColumn7 = 7;
    private static final int METHOD_addColumnSelectionInterval8 = 8;
    private static final int METHOD_addHighlighter9 = 9;
    private static final int METHOD_addNotify10 = 10;
    private static final int METHOD_addPropertyChangeListener11 = 11;
    private static final int METHOD_addRowSelectionInterval12 = 12;
    private static final int METHOD_applyComponentOrientation13 = 13;
    private static final int METHOD_areFocusTraversalKeysSet14 = 14;
    private static final int METHOD_bounds15 = 15;
    private static final int METHOD_changeSelection16 = 16;
    private static final int METHOD_checkImage17 = 17;
    private static final int METHOD_checkImage18 = 18;
    private static final int METHOD_clearSelection19 = 19;
    private static final int METHOD_collapseAll20 = 20;
    private static final int METHOD_collapsePath21 = 21;
    private static final int METHOD_collapseRow22 = 22;
    private static final int METHOD_columnAdded23 = 23;
    private static final int METHOD_columnAtPoint24 = 24;
    private static final int METHOD_columnMarginChanged25 = 25;
    private static final int METHOD_columnMoved26 = 26;
    private static final int METHOD_columnPropertyChange27 = 27;
    private static final int METHOD_columnRemoved28 = 28;
    private static final int METHOD_columnSelectionChanged29 = 29;
    private static final int METHOD_computeVisibleRect30 = 30;
    private static final int METHOD_contains31 = 31;
    private static final int METHOD_contains32 = 32;
    private static final int METHOD_convertColumnIndexToModel33 = 33;
    private static final int METHOD_convertColumnIndexToView34 = 34;
    private static final int METHOD_convertRowIndexToModel35 = 35;
    private static final int METHOD_convertRowIndexToView36 = 36;
    private static final int METHOD_countComponents37 = 37;
    private static final int METHOD_createDefaultColumnsFromModel38 = 38;
    private static final int METHOD_createImage39 = 39;
    private static final int METHOD_createImage40 = 40;
    private static final int METHOD_createScrollPaneForTable41 = 41;
    private static final int METHOD_createToolTip42 = 42;
    private static final int METHOD_createVolatileImage43 = 43;
    private static final int METHOD_createVolatileImage44 = 44;
    private static final int METHOD_deliverEvent45 = 45;
    private static final int METHOD_disable46 = 46;
    private static final int METHOD_dispatchEvent47 = 47;
    private static final int METHOD_doLayout48 = 48;
    private static final int METHOD_editCellAt49 = 49;
    private static final int METHOD_editCellAt50 = 50;
    private static final int METHOD_editingCanceled51 = 51;
    private static final int METHOD_editingStopped52 = 52;
    private static final int METHOD_enable53 = 53;
    private static final int METHOD_enable54 = 54;
    private static final int METHOD_enableInputMethods55 = 55;
    private static final int METHOD_expandAll56 = 56;
    private static final int METHOD_expandPath57 = 57;
    private static final int METHOD_expandRow58 = 58;
    private static final int METHOD_findComponentAt59 = 59;
    private static final int METHOD_findComponentAt60 = 60;
    private static final int METHOD_firePropertyChange61 = 61;
    private static final int METHOD_firePropertyChange62 = 62;
    private static final int METHOD_firePropertyChange63 = 63;
    private static final int METHOD_firePropertyChange64 = 64;
    private static final int METHOD_firePropertyChange65 = 65;
    private static final int METHOD_firePropertyChange66 = 66;
    private static final int METHOD_firePropertyChange67 = 67;
    private static final int METHOD_firePropertyChange68 = 68;
    private static final int METHOD_getActionForKeyStroke69 = 69;
    private static final int METHOD_getBaseline70 = 70;
    private static final int METHOD_getBounds71 = 71;
    private static final int METHOD_getCellEditor72 = 72;
    private static final int METHOD_getCellRect73 = 73;
    private static final int METHOD_getCellRenderer74 = 74;
    private static final int METHOD_getClientProperty75 = 75;
    private static final int METHOD_getColumn76 = 76;
    private static final int METHOD_getColumnCount77 = 77;
    private static final int METHOD_getColumnExt78 = 78;
    private static final int METHOD_getColumns79 = 79;
    private static final int METHOD_getComponentAt80 = 80;
    private static final int METHOD_getComponentAt81 = 81;
    private static final int METHOD_getComponentZOrder82 = 82;
    private static final int METHOD_getConditionForKeyStroke83 = 83;
    private static final int METHOD_getDefaultEditor84 = 84;
    private static final int METHOD_getDefaultLocale85 = 85;
    private static final int METHOD_getDefaultRenderer86 = 86;
    private static final int METHOD_getExpandedDescendants87 = 87;
    private static final int METHOD_getFocusTraversalKeys88 = 88;
    private static final int METHOD_getFontMetrics89 = 89;
    private static final int METHOD_getInsets90 = 90;
    private static final int METHOD_getListeners91 = 91;
    private static final int METHOD_getLocation92 = 92;
    private static final int METHOD_getMousePosition93 = 93;
    private static final int METHOD_getPathForLocation94 = 94;
    private static final int METHOD_getPopupLocation95 = 95;
    private static final int METHOD_getPrintable96 = 96;
    private static final int METHOD_getPropertyChangeListeners97 = 97;
    private static final int METHOD_getRowForPath98 = 98;
    private static final int METHOD_getRowHeight99 = 99;
    private static final int METHOD_getScrollableBlockIncrement100 = 100;
    private static final int METHOD_getScrollableUnitIncrement101 = 101;
    private static final int METHOD_getSize102 = 102;
    private static final int METHOD_getSortOrder103 = 103;
    private static final int METHOD_getStringAt104 = 104;
    private static final int METHOD_getToolTipLocation105 = 105;
    private static final int METHOD_getToolTipText106 = 106;
    private static final int METHOD_getValueAt107 = 107;
    private static final int METHOD_gotFocus108 = 108;
    private static final int METHOD_grabFocus109 = 109;
    private static final int METHOD_handleEvent110 = 110;
    private static final int METHOD_hasFocus111 = 111;
    private static final int METHOD_hide112 = 112;
    private static final int METHOD_imageUpdate113 = 113;
    private static final int METHOD_insets114 = 114;
    private static final int METHOD_inside115 = 115;
    private static final int METHOD_invalidate116 = 116;
    private static final int METHOD_isAncestorOf117 = 117;
    private static final int METHOD_isCellEditable118 = 118;
    private static final int METHOD_isCellSelected119 = 119;
    private static final int METHOD_isCollapsed120 = 120;
    private static final int METHOD_isExpanded121 = 121;
    private static final int METHOD_isFocusCycleRoot122 = 122;
    private static final int METHOD_isLightweightComponent123 = 123;
    private static final int METHOD_isVisible124 = 124;
    private static final int METHOD_keyDown125 = 125;
    private static final int METHOD_keyUp126 = 126;
    private static final int METHOD_layout127 = 127;
    private static final int METHOD_list128 = 128;
    private static final int METHOD_list129 = 129;
    private static final int METHOD_list130 = 130;
    private static final int METHOD_list131 = 131;
    private static final int METHOD_list132 = 132;
    private static final int METHOD_locate133 = 133;
    private static final int METHOD_location134 = 134;
    private static final int METHOD_lostFocus135 = 135;
    private static final int METHOD_minimumSize136 = 136;
    private static final int METHOD_mouseDown137 = 137;
    private static final int METHOD_mouseDrag138 = 138;
    private static final int METHOD_mouseEnter139 = 139;
    private static final int METHOD_mouseExit140 = 140;
    private static final int METHOD_mouseMove141 = 141;
    private static final int METHOD_mouseUp142 = 142;
    private static final int METHOD_move143 = 143;
    private static final int METHOD_moveColumn144 = 144;
    private static final int METHOD_nextFocus145 = 145;
    private static final int METHOD_packAll146 = 146;
    private static final int METHOD_packColumn147 = 147;
    private static final int METHOD_packColumn148 = 148;
    private static final int METHOD_packSelected149 = 149;
    private static final int METHOD_packTable150 = 150;
    private static final int METHOD_paint151 = 151;
    private static final int METHOD_paintAll152 = 152;
    private static final int METHOD_paintComponents153 = 153;
    private static final int METHOD_paintImmediately154 = 154;
    private static final int METHOD_paintImmediately155 = 155;
    private static final int METHOD_postEvent156 = 156;
    private static final int METHOD_preferredSize157 = 157;
    private static final int METHOD_prepareEditor158 = 158;
    private static final int METHOD_prepareImage159 = 159;
    private static final int METHOD_prepareImage160 = 160;
    private static final int METHOD_prepareRenderer161 = 161;
    private static final int METHOD_prepareRenderer162 = 162;
    private static final int METHOD_print163 = 163;
    private static final int METHOD_print164 = 164;
    private static final int METHOD_print165 = 165;
    private static final int METHOD_print166 = 166;
    private static final int METHOD_print167 = 167;
    private static final int METHOD_print168 = 168;
    private static final int METHOD_printAll169 = 169;
    private static final int METHOD_printComponents170 = 170;
    private static final int METHOD_putClientProperty171 = 171;
    private static final int METHOD_registerKeyboardAction172 = 172;
    private static final int METHOD_registerKeyboardAction173 = 173;
    private static final int METHOD_remove174 = 174;
    private static final int METHOD_remove175 = 175;
    private static final int METHOD_remove176 = 176;
    private static final int METHOD_removeAll177 = 177;
    private static final int METHOD_removeColumn178 = 178;
    private static final int METHOD_removeColumnSelectionInterval179 = 179;
    private static final int METHOD_removeEditor180 = 180;
    private static final int METHOD_removeHighlighter181 = 181;
    private static final int METHOD_removeNotify182 = 182;
    private static final int METHOD_removePropertyChangeListener183 = 183;
    private static final int METHOD_removeRowSelectionInterval184 = 184;
    private static final int METHOD_repaint185 = 185;
    private static final int METHOD_repaint186 = 186;
    private static final int METHOD_repaint187 = 187;
    private static final int METHOD_repaint188 = 188;
    private static final int METHOD_repaint189 = 189;
    private static final int METHOD_requestDefaultFocus190 = 190;
    private static final int METHOD_requestFocus191 = 191;
    private static final int METHOD_requestFocus192 = 192;
    private static final int METHOD_requestFocusInWindow193 = 193;
    private static final int METHOD_resetKeyboardActions194 = 194;
    private static final int METHOD_resetSortOrder195 = 195;
    private static final int METHOD_reshape196 = 196;
    private static final int METHOD_resize197 = 197;
    private static final int METHOD_resize198 = 198;
    private static final int METHOD_revalidate199 = 199;
    private static final int METHOD_rowAtPoint200 = 200;
    private static final int METHOD_scrollCellToVisible201 = 201;
    private static final int METHOD_scrollColumnToVisible202 = 202;
    private static final int METHOD_scrollPathToVisible203 = 203;
    private static final int METHOD_scrollRectToVisible204 = 204;
    private static final int METHOD_scrollRowToVisible205 = 205;
    private static final int METHOD_selectAll206 = 206;
    private static final int METHOD_setBounds207 = 207;
    private static final int METHOD_setComponentZOrder208 = 208;
    private static final int METHOD_setDefaultEditor209 = 209;
    private static final int METHOD_setDefaultLocale210 = 210;
    private static final int METHOD_setDefaultRenderer211 = 211;
    private static final int METHOD_setRowFilter212 = 212;
    private static final int METHOD_setShowGrid213 = 213;
    private static final int METHOD_setSortOrder214 = 214;
    private static final int METHOD_setValueAt215 = 215;
    private static final int METHOD_show216 = 216;
    private static final int METHOD_show217 = 217;
    private static final int METHOD_size218 = 218;
    private static final int METHOD_sizeColumnsToFit219 = 219;
    private static final int METHOD_sizeColumnsToFit220 = 220;
    private static final int METHOD_sorterChanged221 = 221;
    private static final int METHOD_tableChanged222 = 222;
    private static final int METHOD_toggleSortOrder223 = 223;
    private static final int METHOD_toggleSortOrder224 = 224;
    private static final int METHOD_toString225 = 225;
    private static final int METHOD_transferFocus226 = 226;
    private static final int METHOD_transferFocusBackward227 = 227;
    private static final int METHOD_transferFocusDownCycle228 = 228;
    private static final int METHOD_transferFocusUpCycle229 = 229;
    private static final int METHOD_unregisterKeyboardAction230 = 230;
    private static final int METHOD_update231 = 231;
    private static final int METHOD_updateUI232 = 232;
    private static final int METHOD_validate233 = 233;
    private static final int METHOD_valueChanged234 = 234;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[235];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addColumn7] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addColumn", new Class[] {javax.swing.table.TableColumn.class})); // NOI18N
            methods[METHOD_addColumn7].setDisplayName ( "" );
            methods[METHOD_addColumnSelectionInterval8] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addColumnSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_addColumnSelectionInterval8].setDisplayName ( "" );
            methods[METHOD_addHighlighter9] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("addHighlighter", new Class[] {org.jdesktop.swingx.decorator.Highlighter.class})); // NOI18N
            methods[METHOD_addHighlighter9].setDisplayName ( "" );
            methods[METHOD_addNotify10] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify10].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener11] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener11].setDisplayName ( "" );
            methods[METHOD_addRowSelectionInterval12] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addRowSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_addRowSelectionInterval12].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation13] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation13].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet14] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet14].setDisplayName ( "" );
            methods[METHOD_bounds15] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds15].setDisplayName ( "" );
            methods[METHOD_changeSelection16] = new MethodDescriptor(javax.swing.JTable.class.getMethod("changeSelection", new Class[] {int.class, int.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_changeSelection16].setDisplayName ( "" );
            methods[METHOD_checkImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage17].setDisplayName ( "" );
            methods[METHOD_checkImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage18].setDisplayName ( "" );
            methods[METHOD_clearSelection19] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("clearSelection", new Class[] {})); // NOI18N
            methods[METHOD_clearSelection19].setDisplayName ( "" );
            methods[METHOD_collapseAll20] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("collapseAll", new Class[] {})); // NOI18N
            methods[METHOD_collapseAll20].setDisplayName ( "" );
            methods[METHOD_collapsePath21] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("collapsePath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_collapsePath21].setDisplayName ( "" );
            methods[METHOD_collapseRow22] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("collapseRow", new Class[] {int.class})); // NOI18N
            methods[METHOD_collapseRow22].setDisplayName ( "" );
            methods[METHOD_columnAdded23] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("columnAdded", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnAdded23].setDisplayName ( "" );
            methods[METHOD_columnAtPoint24] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnAtPoint", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_columnAtPoint24].setDisplayName ( "" );
            methods[METHOD_columnMarginChanged25] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("columnMarginChanged", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_columnMarginChanged25].setDisplayName ( "" );
            methods[METHOD_columnMoved26] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnMoved", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnMoved26].setDisplayName ( "" );
            methods[METHOD_columnPropertyChange27] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("columnPropertyChange", new Class[] {java.beans.PropertyChangeEvent.class})); // NOI18N
            methods[METHOD_columnPropertyChange27].setDisplayName ( "" );
            methods[METHOD_columnRemoved28] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnRemoved", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnRemoved28].setDisplayName ( "" );
            methods[METHOD_columnSelectionChanged29] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("columnSelectionChanged", new Class[] {javax.swing.event.ListSelectionEvent.class})); // NOI18N
            methods[METHOD_columnSelectionChanged29].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect30] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect30].setDisplayName ( "" );
            methods[METHOD_contains31] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains31].setDisplayName ( "" );
            methods[METHOD_contains32] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains32].setDisplayName ( "" );
            methods[METHOD_convertColumnIndexToModel33] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertColumnIndexToModel", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertColumnIndexToModel33].setDisplayName ( "" );
            methods[METHOD_convertColumnIndexToView34] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertColumnIndexToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertColumnIndexToView34].setDisplayName ( "" );
            methods[METHOD_convertRowIndexToModel35] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertRowIndexToModel", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertRowIndexToModel35].setDisplayName ( "" );
            methods[METHOD_convertRowIndexToView36] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertRowIndexToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertRowIndexToView36].setDisplayName ( "" );
            methods[METHOD_countComponents37] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents37].setDisplayName ( "" );
            methods[METHOD_createDefaultColumnsFromModel38] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("createDefaultColumnsFromModel", new Class[] {})); // NOI18N
            methods[METHOD_createDefaultColumnsFromModel38].setDisplayName ( "" );
            methods[METHOD_createImage39] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage39].setDisplayName ( "" );
            methods[METHOD_createImage40] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage40].setDisplayName ( "" );
            methods[METHOD_createScrollPaneForTable41] = new MethodDescriptor(javax.swing.JTable.class.getMethod("createScrollPaneForTable", new Class[] {javax.swing.JTable.class})); // NOI18N
            methods[METHOD_createScrollPaneForTable41].setDisplayName ( "" );
            methods[METHOD_createToolTip42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip42].setDisplayName ( "" );
            methods[METHOD_createVolatileImage43] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage43].setDisplayName ( "" );
            methods[METHOD_createVolatileImage44] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage44].setDisplayName ( "" );
            methods[METHOD_deliverEvent45] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent45].setDisplayName ( "" );
            methods[METHOD_disable46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable46].setDisplayName ( "" );
            methods[METHOD_dispatchEvent47] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent47].setDisplayName ( "" );
            methods[METHOD_doLayout48] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout48].setDisplayName ( "" );
            methods[METHOD_editCellAt49] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editCellAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_editCellAt49].setDisplayName ( "" );
            methods[METHOD_editCellAt50] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("editCellAt", new Class[] {int.class, int.class, java.util.EventObject.class})); // NOI18N
            methods[METHOD_editCellAt50].setDisplayName ( "" );
            methods[METHOD_editingCanceled51] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editingCanceled", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_editingCanceled51].setDisplayName ( "" );
            methods[METHOD_editingStopped52] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editingStopped", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_editingStopped52].setDisplayName ( "" );
            methods[METHOD_enable53] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable53].setDisplayName ( "" );
            methods[METHOD_enable54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable54].setDisplayName ( "" );
            methods[METHOD_enableInputMethods55] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods55].setDisplayName ( "" );
            methods[METHOD_expandAll56] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("expandAll", new Class[] {})); // NOI18N
            methods[METHOD_expandAll56].setDisplayName ( "" );
            methods[METHOD_expandPath57] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("expandPath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_expandPath57].setDisplayName ( "" );
            methods[METHOD_expandRow58] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("expandRow", new Class[] {int.class})); // NOI18N
            methods[METHOD_expandRow58].setDisplayName ( "" );
            methods[METHOD_findComponentAt59] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt59].setDisplayName ( "" );
            methods[METHOD_findComponentAt60] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt60].setDisplayName ( "" );
            methods[METHOD_firePropertyChange61] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange61].setDisplayName ( "" );
            methods[METHOD_firePropertyChange62] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange62].setDisplayName ( "" );
            methods[METHOD_firePropertyChange63] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange63].setDisplayName ( "" );
            methods[METHOD_firePropertyChange64] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange64].setDisplayName ( "" );
            methods[METHOD_firePropertyChange65] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange65].setDisplayName ( "" );
            methods[METHOD_firePropertyChange66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange66].setDisplayName ( "" );
            methods[METHOD_firePropertyChange67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange67].setDisplayName ( "" );
            methods[METHOD_firePropertyChange68] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange68].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke69].setDisplayName ( "" );
            methods[METHOD_getBaseline70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline70].setDisplayName ( "" );
            methods[METHOD_getBounds71] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds71].setDisplayName ( "" );
            methods[METHOD_getCellEditor72] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("getCellEditor", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getCellEditor72].setDisplayName ( "" );
            methods[METHOD_getCellRect73] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getCellRect", new Class[] {int.class, int.class, boolean.class})); // NOI18N
            methods[METHOD_getCellRect73].setDisplayName ( "" );
            methods[METHOD_getCellRenderer74] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("getCellRenderer", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getCellRenderer74].setDisplayName ( "" );
            methods[METHOD_getClientProperty75] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty75].setDisplayName ( "" );
            methods[METHOD_getColumn76] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getColumn", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getColumn76].setDisplayName ( "" );
            methods[METHOD_getColumnCount77] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("getColumnCount", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getColumnCount77].setDisplayName ( "" );
            methods[METHOD_getColumnExt78] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("getColumnExt", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getColumnExt78].setDisplayName ( "" );
            methods[METHOD_getColumns79] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("getColumns", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getColumns79].setDisplayName ( "" );
            methods[METHOD_getComponentAt80] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt80].setDisplayName ( "" );
            methods[METHOD_getComponentAt81] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt81].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder82] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder82].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke83] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke83].setDisplayName ( "" );
            methods[METHOD_getDefaultEditor84] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getDefaultEditor", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getDefaultEditor84].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale85] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale85].setDisplayName ( "" );
            methods[METHOD_getDefaultRenderer86] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getDefaultRenderer", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getDefaultRenderer86].setDisplayName ( "" );
            methods[METHOD_getExpandedDescendants87] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("getExpandedDescendants", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_getExpandedDescendants87].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys88] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys88].setDisplayName ( "" );
            methods[METHOD_getFontMetrics89] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics89].setDisplayName ( "" );
            methods[METHOD_getInsets90] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets90].setDisplayName ( "" );
            methods[METHOD_getListeners91] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners91].setDisplayName ( "" );
            methods[METHOD_getLocation92] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation92].setDisplayName ( "" );
            methods[METHOD_getMousePosition93] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition93].setDisplayName ( "" );
            methods[METHOD_getPathForLocation94] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("getPathForLocation", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getPathForLocation94].setDisplayName ( "" );
            methods[METHOD_getPopupLocation95] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation95].setDisplayName ( "" );
            methods[METHOD_getPrintable96] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getPrintable", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_getPrintable96].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners97] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners97].setDisplayName ( "" );
            methods[METHOD_getRowForPath98] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("getRowForPath", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_getRowForPath98].setDisplayName ( "" );
            methods[METHOD_getRowHeight99] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getRowHeight", new Class[] {int.class})); // NOI18N
            methods[METHOD_getRowHeight99].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement100] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement100].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement101] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement101].setDisplayName ( "" );
            methods[METHOD_getSize102] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize102].setDisplayName ( "" );
            methods[METHOD_getSortOrder103] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("getSortOrder", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getSortOrder103].setDisplayName ( "" );
            methods[METHOD_getStringAt104] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("getStringAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getStringAt104].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation105] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation105].setDisplayName ( "" );
            methods[METHOD_getToolTipText106] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText106].setDisplayName ( "" );
            methods[METHOD_getValueAt107] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getValueAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getValueAt107].setDisplayName ( "" );
            methods[METHOD_gotFocus108] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus108].setDisplayName ( "" );
            methods[METHOD_grabFocus109] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus109].setDisplayName ( "" );
            methods[METHOD_handleEvent110] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent110].setDisplayName ( "" );
            methods[METHOD_hasFocus111] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus111].setDisplayName ( "" );
            methods[METHOD_hide112] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide112].setDisplayName ( "" );
            methods[METHOD_imageUpdate113] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate113].setDisplayName ( "" );
            methods[METHOD_insets114] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets114].setDisplayName ( "" );
            methods[METHOD_inside115] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside115].setDisplayName ( "" );
            methods[METHOD_invalidate116] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate116].setDisplayName ( "" );
            methods[METHOD_isAncestorOf117] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf117].setDisplayName ( "" );
            methods[METHOD_isCellEditable118] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("isCellEditable", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_isCellEditable118].setDisplayName ( "" );
            methods[METHOD_isCellSelected119] = new MethodDescriptor(javax.swing.JTable.class.getMethod("isCellSelected", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_isCellSelected119].setDisplayName ( "" );
            methods[METHOD_isCollapsed120] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("isCollapsed", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_isCollapsed120].setDisplayName ( "" );
            methods[METHOD_isExpanded121] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("isExpanded", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_isExpanded121].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot122] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot122].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent123].setDisplayName ( "" );
            methods[METHOD_isVisible124] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("isVisible", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_isVisible124].setDisplayName ( "" );
            methods[METHOD_keyDown125] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown125].setDisplayName ( "" );
            methods[METHOD_keyUp126] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp126].setDisplayName ( "" );
            methods[METHOD_layout127] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout127].setDisplayName ( "" );
            methods[METHOD_list128] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list128].setDisplayName ( "" );
            methods[METHOD_list129] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list129].setDisplayName ( "" );
            methods[METHOD_list130] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list130].setDisplayName ( "" );
            methods[METHOD_list131] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list131].setDisplayName ( "" );
            methods[METHOD_list132] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list132].setDisplayName ( "" );
            methods[METHOD_locate133] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate133].setDisplayName ( "" );
            methods[METHOD_location134] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location134].setDisplayName ( "" );
            methods[METHOD_lostFocus135] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus135].setDisplayName ( "" );
            methods[METHOD_minimumSize136] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize136].setDisplayName ( "" );
            methods[METHOD_mouseDown137] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown137].setDisplayName ( "" );
            methods[METHOD_mouseDrag138] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag138].setDisplayName ( "" );
            methods[METHOD_mouseEnter139] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter139].setDisplayName ( "" );
            methods[METHOD_mouseExit140] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit140].setDisplayName ( "" );
            methods[METHOD_mouseMove141] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove141].setDisplayName ( "" );
            methods[METHOD_mouseUp142] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp142].setDisplayName ( "" );
            methods[METHOD_move143] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move143].setDisplayName ( "" );
            methods[METHOD_moveColumn144] = new MethodDescriptor(javax.swing.JTable.class.getMethod("moveColumn", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_moveColumn144].setDisplayName ( "" );
            methods[METHOD_nextFocus145] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus145].setDisplayName ( "" );
            methods[METHOD_packAll146] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("packAll", new Class[] {})); // NOI18N
            methods[METHOD_packAll146].setDisplayName ( "" );
            methods[METHOD_packColumn147] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("packColumn", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_packColumn147].setDisplayName ( "" );
            methods[METHOD_packColumn148] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("packColumn", new Class[] {int.class, int.class, int.class})); // NOI18N
            methods[METHOD_packColumn148].setDisplayName ( "" );
            methods[METHOD_packSelected149] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("packSelected", new Class[] {})); // NOI18N
            methods[METHOD_packSelected149].setDisplayName ( "" );
            methods[METHOD_packTable150] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("packTable", new Class[] {int.class})); // NOI18N
            methods[METHOD_packTable150].setDisplayName ( "" );
            methods[METHOD_paint151] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint151].setDisplayName ( "" );
            methods[METHOD_paintAll152] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll152].setDisplayName ( "" );
            methods[METHOD_paintComponents153] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents153].setDisplayName ( "" );
            methods[METHOD_paintImmediately154] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately154].setDisplayName ( "" );
            methods[METHOD_paintImmediately155] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately155].setDisplayName ( "" );
            methods[METHOD_postEvent156] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent156].setDisplayName ( "" );
            methods[METHOD_preferredSize157] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize157].setDisplayName ( "" );
            methods[METHOD_prepareEditor158] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("prepareEditor", new Class[] {javax.swing.table.TableCellEditor.class, int.class, int.class})); // NOI18N
            methods[METHOD_prepareEditor158].setDisplayName ( "" );
            methods[METHOD_prepareImage159] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage159].setDisplayName ( "" );
            methods[METHOD_prepareImage160] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage160].setDisplayName ( "" );
            methods[METHOD_prepareRenderer161] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("prepareRenderer", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_prepareRenderer161].setDisplayName ( "" );
            methods[METHOD_prepareRenderer162] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("prepareRenderer", new Class[] {javax.swing.table.TableCellRenderer.class, int.class, int.class})); // NOI18N
            methods[METHOD_prepareRenderer162].setDisplayName ( "" );
            methods[METHOD_print163] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print163].setDisplayName ( "" );
            methods[METHOD_print164] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {})); // NOI18N
            methods[METHOD_print164].setDisplayName ( "" );
            methods[METHOD_print165] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class})); // NOI18N
            methods[METHOD_print165].setDisplayName ( "" );
            methods[METHOD_print166] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_print166].setDisplayName ( "" );
            methods[METHOD_print167] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_print167].setDisplayName ( "" );
            methods[METHOD_print168] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class, javax.print.PrintService.class})); // NOI18N
            methods[METHOD_print168].setDisplayName ( "" );
            methods[METHOD_printAll169] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll169].setDisplayName ( "" );
            methods[METHOD_printComponents170] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents170].setDisplayName ( "" );
            methods[METHOD_putClientProperty171] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty171].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction172] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction172].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction173] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction173].setDisplayName ( "" );
            methods[METHOD_remove174] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove174].setDisplayName ( "" );
            methods[METHOD_remove175] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove175].setDisplayName ( "" );
            methods[METHOD_remove176] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove176].setDisplayName ( "" );
            methods[METHOD_removeAll177] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll177].setDisplayName ( "" );
            methods[METHOD_removeColumn178] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeColumn", new Class[] {javax.swing.table.TableColumn.class})); // NOI18N
            methods[METHOD_removeColumn178].setDisplayName ( "" );
            methods[METHOD_removeColumnSelectionInterval179] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeColumnSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_removeColumnSelectionInterval179].setDisplayName ( "" );
            methods[METHOD_removeEditor180] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("removeEditor", new Class[] {})); // NOI18N
            methods[METHOD_removeEditor180].setDisplayName ( "" );
            methods[METHOD_removeHighlighter181] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("removeHighlighter", new Class[] {org.jdesktop.swingx.decorator.Highlighter.class})); // NOI18N
            methods[METHOD_removeHighlighter181].setDisplayName ( "" );
            methods[METHOD_removeNotify182] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify182].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener183] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener183].setDisplayName ( "" );
            methods[METHOD_removeRowSelectionInterval184] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeRowSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_removeRowSelectionInterval184].setDisplayName ( "" );
            methods[METHOD_repaint185] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint185].setDisplayName ( "" );
            methods[METHOD_repaint186] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint186].setDisplayName ( "" );
            methods[METHOD_repaint187] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint187].setDisplayName ( "" );
            methods[METHOD_repaint188] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint188].setDisplayName ( "" );
            methods[METHOD_repaint189] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint189].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus190] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus190].setDisplayName ( "" );
            methods[METHOD_requestFocus191] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus191].setDisplayName ( "" );
            methods[METHOD_requestFocus192] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus192].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow193] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow193].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions194] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions194].setDisplayName ( "" );
            methods[METHOD_resetSortOrder195] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("resetSortOrder", new Class[] {})); // NOI18N
            methods[METHOD_resetSortOrder195].setDisplayName ( "" );
            methods[METHOD_reshape196] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape196].setDisplayName ( "" );
            methods[METHOD_resize197] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize197].setDisplayName ( "" );
            methods[METHOD_resize198] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize198].setDisplayName ( "" );
            methods[METHOD_revalidate199] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate199].setDisplayName ( "" );
            methods[METHOD_rowAtPoint200] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("rowAtPoint", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_rowAtPoint200].setDisplayName ( "" );
            methods[METHOD_scrollCellToVisible201] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("scrollCellToVisible", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_scrollCellToVisible201].setDisplayName ( "" );
            methods[METHOD_scrollColumnToVisible202] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("scrollColumnToVisible", new Class[] {int.class})); // NOI18N
            methods[METHOD_scrollColumnToVisible202].setDisplayName ( "" );
            methods[METHOD_scrollPathToVisible203] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("scrollPathToVisible", new Class[] {javax.swing.tree.TreePath.class})); // NOI18N
            methods[METHOD_scrollPathToVisible203].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible204] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible204].setDisplayName ( "" );
            methods[METHOD_scrollRowToVisible205] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("scrollRowToVisible", new Class[] {int.class})); // NOI18N
            methods[METHOD_scrollRowToVisible205].setDisplayName ( "" );
            methods[METHOD_selectAll206] = new MethodDescriptor(javax.swing.JTable.class.getMethod("selectAll", new Class[] {})); // NOI18N
            methods[METHOD_selectAll206].setDisplayName ( "" );
            methods[METHOD_setBounds207] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds207].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder208] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder208].setDisplayName ( "" );
            methods[METHOD_setDefaultEditor209] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setDefaultEditor", new Class[] {java.lang.Class.class, javax.swing.table.TableCellEditor.class})); // NOI18N
            methods[METHOD_setDefaultEditor209].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale210] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale210].setDisplayName ( "" );
            methods[METHOD_setDefaultRenderer211] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("setDefaultRenderer", new Class[] {java.lang.Class.class, javax.swing.table.TableCellRenderer.class})); // NOI18N
            methods[METHOD_setDefaultRenderer211].setDisplayName ( "" );
            methods[METHOD_setRowFilter212] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("setRowFilter", new Class[] {javax.swing.RowFilter.class})); // NOI18N
            methods[METHOD_setRowFilter212].setDisplayName ( "" );
            methods[METHOD_setShowGrid213] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("setShowGrid", new Class[] {boolean.class, boolean.class})); // NOI18N
            methods[METHOD_setShowGrid213].setDisplayName ( "" );
            methods[METHOD_setSortOrder214] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("setSortOrder", new Class[] {java.lang.Object.class, javax.swing.SortOrder.class})); // NOI18N
            methods[METHOD_setSortOrder214].setDisplayName ( "" );
            methods[METHOD_setValueAt215] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("setValueAt", new Class[] {java.lang.Object.class, int.class, int.class})); // NOI18N
            methods[METHOD_setValueAt215].setDisplayName ( "" );
            methods[METHOD_show216] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show216].setDisplayName ( "" );
            methods[METHOD_show217] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show217].setDisplayName ( "" );
            methods[METHOD_size218] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size218].setDisplayName ( "" );
            methods[METHOD_sizeColumnsToFit219] = new MethodDescriptor(javax.swing.JTable.class.getMethod("sizeColumnsToFit", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_sizeColumnsToFit219].setDisplayName ( "" );
            methods[METHOD_sizeColumnsToFit220] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("sizeColumnsToFit", new Class[] {int.class})); // NOI18N
            methods[METHOD_sizeColumnsToFit220].setDisplayName ( "" );
            methods[METHOD_sorterChanged221] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("sorterChanged", new Class[] {javax.swing.event.RowSorterEvent.class})); // NOI18N
            methods[METHOD_sorterChanged221].setDisplayName ( "" );
            methods[METHOD_tableChanged222] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("tableChanged", new Class[] {javax.swing.event.TableModelEvent.class})); // NOI18N
            methods[METHOD_tableChanged222].setDisplayName ( "" );
            methods[METHOD_toggleSortOrder223] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("toggleSortOrder", new Class[] {int.class})); // NOI18N
            methods[METHOD_toggleSortOrder223].setDisplayName ( "" );
            methods[METHOD_toggleSortOrder224] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("toggleSortOrder", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_toggleSortOrder224].setDisplayName ( "" );
            methods[METHOD_toString225] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString225].setDisplayName ( "" );
            methods[METHOD_transferFocus226] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus226].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward227] = new MethodDescriptor(org.jdesktop.swingx.JXTable.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward227].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle228] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle228].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle229] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle229].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction230] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction230].setDisplayName ( "" );
            methods[METHOD_update231] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update231].setDisplayName ( "" );
            methods[METHOD_updateUI232] = new MethodDescriptor(org.jdesktop.swingx.JXTreeTable.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI232].setDisplayName ( "" );
            methods[METHOD_validate233] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate233].setDisplayName ( "" );
            methods[METHOD_valueChanged234] = new MethodDescriptor(javax.swing.JTable.class.getMethod("valueChanged", new Class[] {javax.swing.event.ListSelectionEvent.class})); // NOI18N
            methods[METHOD_valueChanged234].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
