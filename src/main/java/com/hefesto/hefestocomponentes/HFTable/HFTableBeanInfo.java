/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hefesto.hefestocomponentes.HFTable;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author flavio
 */
public class HFTableBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( com.hefesto.hefestocomponentes.HFTable.HFTable.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
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
    private static final int PROPERTY_background = 9;
    private static final int PROPERTY_backgroundSet = 10;
    private static final int PROPERTY_baselineResizeBehavior = 11;
    private static final int PROPERTY_border = 12;
    private static final int PROPERTY_bounds = 13;
    private static final int PROPERTY_cellEditor = 14;
    private static final int PROPERTY_cellSelectionEnabled = 15;
    private static final int PROPERTY_colorModel = 16;
    private static final int PROPERTY_columnClass = 17;
    private static final int PROPERTY_columnCount = 18;
    private static final int PROPERTY_columnModel = 19;
    private static final int PROPERTY_columnName = 20;
    private static final int PROPERTY_columnSelected = 21;
    private static final int PROPERTY_columnSelectionAllowed = 22;
    private static final int PROPERTY_columnSelectionInterval = 23;
    private static final int PROPERTY_colunas = 24;
    private static final int PROPERTY_component = 25;
    private static final int PROPERTY_componentCount = 26;
    private static final int PROPERTY_componentListeners = 27;
    private static final int PROPERTY_componentOrientation = 28;
    private static final int PROPERTY_componentPopupMenu = 29;
    private static final int PROPERTY_components = 30;
    private static final int PROPERTY_containerListeners = 31;
    private static final int PROPERTY_cursor = 32;
    private static final int PROPERTY_cursorSet = 33;
    private static final int PROPERTY_debugGraphicsOptions = 34;
    private static final int PROPERTY_displayable = 35;
    private static final int PROPERTY_doubleBuffered = 36;
    private static final int PROPERTY_dragEnabled = 37;
    private static final int PROPERTY_dropLocation = 38;
    private static final int PROPERTY_dropMode = 39;
    private static final int PROPERTY_dropTarget = 40;
    private static final int PROPERTY_editing = 41;
    private static final int PROPERTY_editingColumn = 42;
    private static final int PROPERTY_editingRow = 43;
    private static final int PROPERTY_editorComponent = 44;
    private static final int PROPERTY_empty = 45;
    private static final int PROPERTY_enabled = 46;
    private static final int PROPERTY_fillsViewportHeight = 47;
    private static final int PROPERTY_focusable = 48;
    private static final int PROPERTY_focusCycleRoot = 49;
    private static final int PROPERTY_focusCycleRootAncestor = 50;
    private static final int PROPERTY_focusListeners = 51;
    private static final int PROPERTY_focusOwner = 52;
    private static final int PROPERTY_focusTraversable = 53;
    private static final int PROPERTY_focusTraversalKeys = 54;
    private static final int PROPERTY_focusTraversalKeysEnabled = 55;
    private static final int PROPERTY_focusTraversalPolicy = 56;
    private static final int PROPERTY_focusTraversalPolicyProvider = 57;
    private static final int PROPERTY_focusTraversalPolicySet = 58;
    private static final int PROPERTY_font = 59;
    private static final int PROPERTY_fontSet = 60;
    private static final int PROPERTY_foreground = 61;
    private static final int PROPERTY_foregroundSet = 62;
    private static final int PROPERTY_graphics = 63;
    private static final int PROPERTY_graphicsConfiguration = 64;
    private static final int PROPERTY_gridColor = 65;
    private static final int PROPERTY_height = 66;
    private static final int PROPERTY_hierarchyBoundsListeners = 67;
    private static final int PROPERTY_hierarchyListeners = 68;
    private static final int PROPERTY_ignoreRepaint = 69;
    private static final int PROPERTY_inheritsPopupMenu = 70;
    private static final int PROPERTY_inputContext = 71;
    private static final int PROPERTY_inputMap = 72;
    private static final int PROPERTY_inputMethodListeners = 73;
    private static final int PROPERTY_inputMethodRequests = 74;
    private static final int PROPERTY_inputVerifier = 75;
    private static final int PROPERTY_insets = 76;
    private static final int PROPERTY_intercellSpacing = 77;
    private static final int PROPERTY_keyListeners = 78;
    private static final int PROPERTY_layout = 79;
    private static final int PROPERTY_lightweight = 80;
    private static final int PROPERTY_locale = 81;
    private static final int PROPERTY_location = 82;
    private static final int PROPERTY_locationOnScreen = 83;
    private static final int PROPERTY_managingFocus = 84;
    private static final int PROPERTY_matrix = 85;
    private static final int PROPERTY_maximumSize = 86;
    private static final int PROPERTY_maximumSizeSet = 87;
    private static final int PROPERTY_minimumSize = 88;
    private static final int PROPERTY_minimumSizeSet = 89;
    private static final int PROPERTY_model = 90;
    private static final int PROPERTY_modelColumnCount = 91;
    private static final int PROPERTY_modelRoWCount = 92;
    private static final int PROPERTY_mouseListeners = 93;
    private static final int PROPERTY_mouseMotionListeners = 94;
    private static final int PROPERTY_mousePosition = 95;
    private static final int PROPERTY_mouseWheelListeners = 96;
    private static final int PROPERTY_name = 97;
    private static final int PROPERTY_nextFocusableComponent = 98;
    private static final int PROPERTY_opaque = 99;
    private static final int PROPERTY_optimizedDrawingEnabled = 100;
    private static final int PROPERTY_paintingForPrint = 101;
    private static final int PROPERTY_paintingTile = 102;
    private static final int PROPERTY_parent = 103;
    private static final int PROPERTY_peer = 104;
    private static final int PROPERTY_preferredScrollableViewportSize = 105;
    private static final int PROPERTY_preferredSize = 106;
    private static final int PROPERTY_preferredSizeSet = 107;
    private static final int PROPERTY_propertyChangeListeners = 108;
    private static final int PROPERTY_registeredKeyStrokes = 109;
    private static final int PROPERTY_requestFocusEnabled = 110;
    private static final int PROPERTY_rootPane = 111;
    private static final int PROPERTY_rowCount = 112;
    private static final int PROPERTY_rowHeight = 113;
    private static final int PROPERTY_rowMargin = 114;
    private static final int PROPERTY_rowSelected = 115;
    private static final int PROPERTY_rowSelectionAllowed = 116;
    private static final int PROPERTY_rowSelectionInterval = 117;
    private static final int PROPERTY_rowSorter = 118;
    private static final int PROPERTY_scrollableTracksViewportHeight = 119;
    private static final int PROPERTY_scrollableTracksViewportWidth = 120;
    private static final int PROPERTY_selectedColumn = 121;
    private static final int PROPERTY_selectedColumnCount = 122;
    private static final int PROPERTY_selectedColumns = 123;
    private static final int PROPERTY_selectedRow = 124;
    private static final int PROPERTY_selectedRowCount = 125;
    private static final int PROPERTY_selectedRows = 126;
    private static final int PROPERTY_selectionBackground = 127;
    private static final int PROPERTY_selectionForeground = 128;
    private static final int PROPERTY_selectionMode = 129;
    private static final int PROPERTY_selectionModel = 130;
    private static final int PROPERTY_showGrid = 131;
    private static final int PROPERTY_showHorizontalLines = 132;
    private static final int PROPERTY_showing = 133;
    private static final int PROPERTY_showVerticalLines = 134;
    private static final int PROPERTY_size = 135;
    private static final int PROPERTY_surrendersFocusOnKeystroke = 136;
    private static final int PROPERTY_tableHeader = 137;
    private static final int PROPERTY_title = 138;
    private static final int PROPERTY_toolkit = 139;
    private static final int PROPERTY_toolTipText = 140;
    private static final int PROPERTY_topLevelAncestor = 141;
    private static final int PROPERTY_transferHandler = 142;
    private static final int PROPERTY_treeLock = 143;
    private static final int PROPERTY_UI = 144;
    private static final int PROPERTY_UIClassID = 145;
    private static final int PROPERTY_updateSelectionOnSort = 146;
    private static final int PROPERTY_valid = 147;
    private static final int PROPERTY_validateRoot = 148;
    private static final int PROPERTY_valorColunaDaLinhaSelecionada = 149;
    private static final int PROPERTY_valorSelecionado = 150;
    private static final int PROPERTY_values = 151;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 152;
    private static final int PROPERTY_vetoableChangeListeners = 153;
    private static final int PROPERTY_visible = 154;
    private static final int PROPERTY_visibleRect = 155;
    private static final int PROPERTY_width = 156;
    private static final int PROPERTY_x = 157;
    private static final int PROPERTY_y = 158;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[159];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoCreateColumnsFromModel] = new PropertyDescriptor ( "autoCreateColumnsFromModel", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getAutoCreateColumnsFromModel", "setAutoCreateColumnsFromModel" ); // NOI18N
            properties[PROPERTY_autoCreateRowSorter] = new PropertyDescriptor ( "autoCreateRowSorter", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getAutoCreateRowSorter", "setAutoCreateRowSorter" ); // NOI18N
            properties[PROPERTY_autoResizeMode] = new PropertyDescriptor ( "autoResizeMode", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getAutoResizeMode", "setAutoResizeMode" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_cellEditor] = new PropertyDescriptor ( "cellEditor", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getCellEditor", "setCellEditor" ); // NOI18N
            properties[PROPERTY_cellSelectionEnabled] = new PropertyDescriptor ( "cellSelectionEnabled", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getCellSelectionEnabled", "setCellSelectionEnabled" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_columnClass] = new IndexedPropertyDescriptor ( "columnClass", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, "getColumnClass", null ); // NOI18N
            properties[PROPERTY_columnCount] = new PropertyDescriptor ( "columnCount", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getColumnCount", null ); // NOI18N
            properties[PROPERTY_columnModel] = new PropertyDescriptor ( "columnModel", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getColumnModel", "setColumnModel" ); // NOI18N
            properties[PROPERTY_columnName] = new IndexedPropertyDescriptor ( "columnName", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, "getColumnName", null ); // NOI18N
            properties[PROPERTY_columnSelected] = new IndexedPropertyDescriptor ( "columnSelected", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, "isColumnSelected", null ); // NOI18N
            properties[PROPERTY_columnSelectionAllowed] = new PropertyDescriptor ( "columnSelectionAllowed", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getColumnSelectionAllowed", "setColumnSelectionAllowed" ); // NOI18N
            properties[PROPERTY_columnSelectionInterval] = new IndexedPropertyDescriptor ( "columnSelectionInterval", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, null, "setColumnSelectionInterval" ); // NOI18N
            properties[PROPERTY_colunas] = new PropertyDescriptor ( "colunas", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getColunas", "setColunas" ); // NOI18N
            properties[PROPERTY_colunas].setPreferred ( true );
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editing] = new PropertyDescriptor ( "editing", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isEditing", null ); // NOI18N
            properties[PROPERTY_editingColumn] = new PropertyDescriptor ( "editingColumn", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getEditingColumn", "setEditingColumn" ); // NOI18N
            properties[PROPERTY_editingRow] = new PropertyDescriptor ( "editingRow", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getEditingRow", "setEditingRow" ); // NOI18N
            properties[PROPERTY_editorComponent] = new PropertyDescriptor ( "editorComponent", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getEditorComponent", null ); // NOI18N
            properties[PROPERTY_empty] = new PropertyDescriptor ( "empty", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isEmpty", null ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_fillsViewportHeight] = new PropertyDescriptor ( "fillsViewportHeight", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getFillsViewportHeight", "setFillsViewportHeight" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_gridColor] = new PropertyDescriptor ( "gridColor", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getGridColor", "setGridColor" ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_intercellSpacing] = new PropertyDescriptor ( "intercellSpacing", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getIntercellSpacing", "setIntercellSpacing" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_matrix] = new PropertyDescriptor ( "matrix", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getMatrix", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_modelColumnCount] = new PropertyDescriptor ( "modelColumnCount", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getModelColumnCount", null ); // NOI18N
            properties[PROPERTY_modelRoWCount] = new PropertyDescriptor ( "modelRoWCount", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getModelRoWCount", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getPreferredScrollableViewportSize", "setPreferredScrollableViewportSize" ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_rowCount] = new PropertyDescriptor ( "rowCount", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getRowCount", null ); // NOI18N
            properties[PROPERTY_rowHeight] = new PropertyDescriptor ( "rowHeight", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getRowHeight", "setRowHeight" ); // NOI18N
            properties[PROPERTY_rowMargin] = new PropertyDescriptor ( "rowMargin", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getRowMargin", "setRowMargin" ); // NOI18N
            properties[PROPERTY_rowSelected] = new IndexedPropertyDescriptor ( "rowSelected", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, "isRowSelected", null ); // NOI18N
            properties[PROPERTY_rowSelectionAllowed] = new PropertyDescriptor ( "rowSelectionAllowed", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getRowSelectionAllowed", "setRowSelectionAllowed" ); // NOI18N
            properties[PROPERTY_rowSelectionInterval] = new IndexedPropertyDescriptor ( "rowSelectionInterval", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, null, "setRowSelectionInterval" ); // NOI18N
            properties[PROPERTY_rowSorter] = new PropertyDescriptor ( "rowSorter", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getRowSorter", "setRowSorter" ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_selectedColumn] = new PropertyDescriptor ( "selectedColumn", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectedColumn", null ); // NOI18N
            properties[PROPERTY_selectedColumnCount] = new PropertyDescriptor ( "selectedColumnCount", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectedColumnCount", null ); // NOI18N
            properties[PROPERTY_selectedColumns] = new PropertyDescriptor ( "selectedColumns", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectedColumns", null ); // NOI18N
            properties[PROPERTY_selectedRow] = new PropertyDescriptor ( "selectedRow", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectedRow", null ); // NOI18N
            properties[PROPERTY_selectedRowCount] = new PropertyDescriptor ( "selectedRowCount", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectedRowCount", null ); // NOI18N
            properties[PROPERTY_selectedRows] = new PropertyDescriptor ( "selectedRows", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectedRows", null ); // NOI18N
            properties[PROPERTY_selectionBackground] = new PropertyDescriptor ( "selectionBackground", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectionBackground", "setSelectionBackground" ); // NOI18N
            properties[PROPERTY_selectionForeground] = new PropertyDescriptor ( "selectionForeground", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectionForeground", "setSelectionForeground" ); // NOI18N
            properties[PROPERTY_selectionMode] = new PropertyDescriptor ( "selectionMode", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, "setSelectionMode" ); // NOI18N
            properties[PROPERTY_selectionModel] = new PropertyDescriptor ( "selectionModel", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSelectionModel", "setSelectionModel" ); // NOI18N
            properties[PROPERTY_showGrid] = new PropertyDescriptor ( "showGrid", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, "setShowGrid" ); // NOI18N
            properties[PROPERTY_showHorizontalLines] = new PropertyDescriptor ( "showHorizontalLines", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getShowHorizontalLines", "setShowHorizontalLines" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_showVerticalLines] = new PropertyDescriptor ( "showVerticalLines", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getShowVerticalLines", "setShowVerticalLines" ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_surrendersFocusOnKeystroke] = new PropertyDescriptor ( "surrendersFocusOnKeystroke", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getSurrendersFocusOnKeystroke", "setSurrendersFocusOnKeystroke" ); // NOI18N
            properties[PROPERTY_tableHeader] = new PropertyDescriptor ( "tableHeader", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getTableHeader", "setTableHeader" ); // NOI18N
            properties[PROPERTY_title] = new PropertyDescriptor ( "title", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getTitle", "setTitle" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_updateSelectionOnSort] = new PropertyDescriptor ( "updateSelectionOnSort", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getUpdateSelectionOnSort", "setUpdateSelectionOnSort" ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_valorColunaDaLinhaSelecionada] = new IndexedPropertyDescriptor ( "valorColunaDaLinhaSelecionada", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, "getValorColunaDaLinhaSelecionada", null ); // NOI18N
            properties[PROPERTY_valorSelecionado] = new PropertyDescriptor ( "valorSelecionado", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getValorSelecionado", null ); // NOI18N
            properties[PROPERTY_values] = new IndexedPropertyDescriptor ( "values", com.hefesto.hefestocomponentes.HFTable.HFTable.class, null, null, "getValues", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", com.hefesto.hefestocomponentes.HFTable.HFTable.class, "getY", null ); // NOI18N
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
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFTable.HFTable.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_addListRows9 = 9;
    private static final int METHOD_addNewTableListRows10 = 10;
    private static final int METHOD_addNotify11 = 11;
    private static final int METHOD_addPropertyChangeListener12 = 12;
    private static final int METHOD_addRow13 = 13;
    private static final int METHOD_addRowSelectionInterval14 = 14;
    private static final int METHOD_applyComponentOrientation15 = 15;
    private static final int METHOD_areFocusTraversalKeysSet16 = 16;
    private static final int METHOD_bounds17 = 17;
    private static final int METHOD_changeSelection18 = 18;
    private static final int METHOD_checkImage19 = 19;
    private static final int METHOD_checkImage20 = 20;
    private static final int METHOD_clearSelection21 = 21;
    private static final int METHOD_columnAdded22 = 22;
    private static final int METHOD_columnAtPoint23 = 23;
    private static final int METHOD_columnMarginChanged24 = 24;
    private static final int METHOD_columnMoved25 = 25;
    private static final int METHOD_columnRemoved26 = 26;
    private static final int METHOD_columnSelectionChanged27 = 27;
    private static final int METHOD_computeVisibleRect28 = 28;
    private static final int METHOD_contains29 = 29;
    private static final int METHOD_contains30 = 30;
    private static final int METHOD_convertColumnIndexToModel31 = 31;
    private static final int METHOD_convertColumnIndexToView32 = 32;
    private static final int METHOD_convertRowIndexToModel33 = 33;
    private static final int METHOD_convertRowIndexToView34 = 34;
    private static final int METHOD_countComponents35 = 35;
    private static final int METHOD_createDefaultColumnsFromModel36 = 36;
    private static final int METHOD_createImage37 = 37;
    private static final int METHOD_createImage38 = 38;
    private static final int METHOD_createScrollPaneForTable39 = 39;
    private static final int METHOD_createToolTip40 = 40;
    private static final int METHOD_createVolatileImage41 = 41;
    private static final int METHOD_createVolatileImage42 = 42;
    private static final int METHOD_deliverEvent43 = 43;
    private static final int METHOD_disable44 = 44;
    private static final int METHOD_dispatchEvent45 = 45;
    private static final int METHOD_doLayout46 = 46;
    private static final int METHOD_editCellAt47 = 47;
    private static final int METHOD_editCellAt48 = 48;
    private static final int METHOD_editingCanceled49 = 49;
    private static final int METHOD_editingStopped50 = 50;
    private static final int METHOD_enable51 = 51;
    private static final int METHOD_enable52 = 52;
    private static final int METHOD_enableInputMethods53 = 53;
    private static final int METHOD_findComponentAt54 = 54;
    private static final int METHOD_findComponentAt55 = 55;
    private static final int METHOD_firePropertyChange56 = 56;
    private static final int METHOD_firePropertyChange57 = 57;
    private static final int METHOD_firePropertyChange58 = 58;
    private static final int METHOD_firePropertyChange59 = 59;
    private static final int METHOD_firePropertyChange60 = 60;
    private static final int METHOD_firePropertyChange61 = 61;
    private static final int METHOD_firePropertyChange62 = 62;
    private static final int METHOD_firePropertyChange63 = 63;
    private static final int METHOD_getActionForKeyStroke64 = 64;
    private static final int METHOD_getBaseline65 = 65;
    private static final int METHOD_getBounds66 = 66;
    private static final int METHOD_getCellEditor67 = 67;
    private static final int METHOD_getCellRect68 = 68;
    private static final int METHOD_getCellRenderer69 = 69;
    private static final int METHOD_getClientProperty70 = 70;
    private static final int METHOD_getColumn71 = 71;
    private static final int METHOD_getComponentAt72 = 72;
    private static final int METHOD_getComponentAt73 = 73;
    private static final int METHOD_getComponentZOrder74 = 74;
    private static final int METHOD_getConditionForKeyStroke75 = 75;
    private static final int METHOD_getDefaultEditor76 = 76;
    private static final int METHOD_getDefaultLocale77 = 77;
    private static final int METHOD_getDefaultRenderer78 = 78;
    private static final int METHOD_getFocusTraversalKeys79 = 79;
    private static final int METHOD_getFontMetrics80 = 80;
    private static final int METHOD_getInsets81 = 81;
    private static final int METHOD_getListeners82 = 82;
    private static final int METHOD_getLocation83 = 83;
    private static final int METHOD_getMousePosition84 = 84;
    private static final int METHOD_getPopupLocation85 = 85;
    private static final int METHOD_getPrintable86 = 86;
    private static final int METHOD_getPropertyChangeListeners87 = 87;
    private static final int METHOD_getScrollableBlockIncrement88 = 88;
    private static final int METHOD_getScrollableUnitIncrement89 = 89;
    private static final int METHOD_getSize90 = 90;
    private static final int METHOD_getToolTipLocation91 = 91;
    private static final int METHOD_getToolTipText92 = 92;
    private static final int METHOD_getValueAt93 = 93;
    private static final int METHOD_getValueAT94 = 94;
    private static final int METHOD_gotFocus95 = 95;
    private static final int METHOD_grabFocus96 = 96;
    private static final int METHOD_handleEvent97 = 97;
    private static final int METHOD_hasFocus98 = 98;
    private static final int METHOD_hide99 = 99;
    private static final int METHOD_imageUpdate100 = 100;
    private static final int METHOD_insets101 = 101;
    private static final int METHOD_inside102 = 102;
    private static final int METHOD_invalidate103 = 103;
    private static final int METHOD_isAncestorOf104 = 104;
    private static final int METHOD_isCellEditable105 = 105;
    private static final int METHOD_isCellSelected106 = 106;
    private static final int METHOD_isFocusCycleRoot107 = 107;
    private static final int METHOD_isLightweightComponent108 = 108;
    private static final int METHOD_keyDown109 = 109;
    private static final int METHOD_keyUp110 = 110;
    private static final int METHOD_layout111 = 111;
    private static final int METHOD_list112 = 112;
    private static final int METHOD_list113 = 113;
    private static final int METHOD_list114 = 114;
    private static final int METHOD_list115 = 115;
    private static final int METHOD_list116 = 116;
    private static final int METHOD_locate117 = 117;
    private static final int METHOD_location118 = 118;
    private static final int METHOD_lostFocus119 = 119;
    private static final int METHOD_minimumSize120 = 120;
    private static final int METHOD_mouseDown121 = 121;
    private static final int METHOD_mouseDrag122 = 122;
    private static final int METHOD_mouseEnter123 = 123;
    private static final int METHOD_mouseExit124 = 124;
    private static final int METHOD_mouseMove125 = 125;
    private static final int METHOD_mouseUp126 = 126;
    private static final int METHOD_move127 = 127;
    private static final int METHOD_moveColumn128 = 128;
    private static final int METHOD_nextFocus129 = 129;
    private static final int METHOD_paint130 = 130;
    private static final int METHOD_paintAll131 = 131;
    private static final int METHOD_paintComponents132 = 132;
    private static final int METHOD_paintImmediately133 = 133;
    private static final int METHOD_paintImmediately134 = 134;
    private static final int METHOD_postEvent135 = 135;
    private static final int METHOD_preferredSize136 = 136;
    private static final int METHOD_prepareEditor137 = 137;
    private static final int METHOD_prepareImage138 = 138;
    private static final int METHOD_prepareImage139 = 139;
    private static final int METHOD_prepareRenderer140 = 140;
    private static final int METHOD_print141 = 141;
    private static final int METHOD_print142 = 142;
    private static final int METHOD_print143 = 143;
    private static final int METHOD_print144 = 144;
    private static final int METHOD_print145 = 145;
    private static final int METHOD_print146 = 146;
    private static final int METHOD_printAll147 = 147;
    private static final int METHOD_printComponents148 = 148;
    private static final int METHOD_putClientProperty149 = 149;
    private static final int METHOD_registerKeyboardAction150 = 150;
    private static final int METHOD_registerKeyboardAction151 = 151;
    private static final int METHOD_remove152 = 152;
    private static final int METHOD_remove153 = 153;
    private static final int METHOD_remove154 = 154;
    private static final int METHOD_removeAll155 = 155;
    private static final int METHOD_removeAllValues156 = 156;
    private static final int METHOD_removeColumn157 = 157;
    private static final int METHOD_removeColumnSelectionInterval158 = 158;
    private static final int METHOD_removeEditor159 = 159;
    private static final int METHOD_removeNotify160 = 160;
    private static final int METHOD_removePropertyChangeListener161 = 161;
    private static final int METHOD_removeRow162 = 162;
    private static final int METHOD_removeRowSelectionInterval163 = 163;
    private static final int METHOD_removeTable164 = 164;
    private static final int METHOD_repaint165 = 165;
    private static final int METHOD_repaint166 = 166;
    private static final int METHOD_repaint167 = 167;
    private static final int METHOD_repaint168 = 168;
    private static final int METHOD_repaint169 = 169;
    private static final int METHOD_requestDefaultFocus170 = 170;
    private static final int METHOD_requestFocus171 = 171;
    private static final int METHOD_requestFocus172 = 172;
    private static final int METHOD_requestFocusInWindow173 = 173;
    private static final int METHOD_resetKeyboardActions174 = 174;
    private static final int METHOD_reshape175 = 175;
    private static final int METHOD_resize176 = 176;
    private static final int METHOD_resize177 = 177;
    private static final int METHOD_revalidate178 = 178;
    private static final int METHOD_rowAtPoint179 = 179;
    private static final int METHOD_scrollRectToVisible180 = 180;
    private static final int METHOD_selectAll181 = 181;
    private static final int METHOD_setBounds182 = 182;
    private static final int METHOD_setColumnClass183 = 183;
    private static final int METHOD_setComponentZOrder184 = 184;
    private static final int METHOD_setDefaultEditor185 = 185;
    private static final int METHOD_setDefaultLocale186 = 186;
    private static final int METHOD_setDefaultRenderer187 = 187;
    private static final int METHOD_setModel188 = 188;
    private static final int METHOD_setRowHeight189 = 189;
    private static final int METHOD_setValueAt190 = 190;
    private static final int METHOD_setValueAT191 = 191;
    private static final int METHOD_show192 = 192;
    private static final int METHOD_show193 = 193;
    private static final int METHOD_size194 = 194;
    private static final int METHOD_sizeColumnsToFit195 = 195;
    private static final int METHOD_sizeColumnsToFit196 = 196;
    private static final int METHOD_sorterChanged197 = 197;
    private static final int METHOD_tableChanged198 = 198;
    private static final int METHOD_toString199 = 199;
    private static final int METHOD_transferFocus200 = 200;
    private static final int METHOD_transferFocusBackward201 = 201;
    private static final int METHOD_transferFocusDownCycle202 = 202;
    private static final int METHOD_transferFocusUpCycle203 = 203;
    private static final int METHOD_unregisterKeyboardAction204 = 204;
    private static final int METHOD_update205 = 205;
    private static final int METHOD_updateUI206 = 206;
    private static final int METHOD_validate207 = 207;
    private static final int METHOD_valueChanged208 = 208;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[209];
    
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
            methods[METHOD_addListRows9] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("addListRows", new Class[] {java.util.List.class})); // NOI18N
            methods[METHOD_addListRows9].setDisplayName ( "" );
            methods[METHOD_addNewTableListRows10] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("addNewTableListRows", new Class[] {java.util.List.class})); // NOI18N
            methods[METHOD_addNewTableListRows10].setDisplayName ( "" );
            methods[METHOD_addNotify11] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify11].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener12] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener12].setDisplayName ( "" );
            methods[METHOD_addRow13] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("addRow", new Class[] {java.util.List.class})); // NOI18N
            methods[METHOD_addRow13].setDisplayName ( "" );
            methods[METHOD_addRowSelectionInterval14] = new MethodDescriptor(javax.swing.JTable.class.getMethod("addRowSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_addRowSelectionInterval14].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation15] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation15].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet16] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet16].setDisplayName ( "" );
            methods[METHOD_bounds17] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds17].setDisplayName ( "" );
            methods[METHOD_changeSelection18] = new MethodDescriptor(javax.swing.JTable.class.getMethod("changeSelection", new Class[] {int.class, int.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_changeSelection18].setDisplayName ( "" );
            methods[METHOD_checkImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage19].setDisplayName ( "" );
            methods[METHOD_checkImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage20].setDisplayName ( "" );
            methods[METHOD_clearSelection21] = new MethodDescriptor(javax.swing.JTable.class.getMethod("clearSelection", new Class[] {})); // NOI18N
            methods[METHOD_clearSelection21].setDisplayName ( "" );
            methods[METHOD_columnAdded22] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnAdded", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnAdded22].setDisplayName ( "" );
            methods[METHOD_columnAtPoint23] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnAtPoint", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_columnAtPoint23].setDisplayName ( "" );
            methods[METHOD_columnMarginChanged24] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnMarginChanged", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_columnMarginChanged24].setDisplayName ( "" );
            methods[METHOD_columnMoved25] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnMoved", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnMoved25].setDisplayName ( "" );
            methods[METHOD_columnRemoved26] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnRemoved", new Class[] {javax.swing.event.TableColumnModelEvent.class})); // NOI18N
            methods[METHOD_columnRemoved26].setDisplayName ( "" );
            methods[METHOD_columnSelectionChanged27] = new MethodDescriptor(javax.swing.JTable.class.getMethod("columnSelectionChanged", new Class[] {javax.swing.event.ListSelectionEvent.class})); // NOI18N
            methods[METHOD_columnSelectionChanged27].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect28] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect28].setDisplayName ( "" );
            methods[METHOD_contains29] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains29].setDisplayName ( "" );
            methods[METHOD_contains30] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains30].setDisplayName ( "" );
            methods[METHOD_convertColumnIndexToModel31] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertColumnIndexToModel", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertColumnIndexToModel31].setDisplayName ( "" );
            methods[METHOD_convertColumnIndexToView32] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertColumnIndexToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertColumnIndexToView32].setDisplayName ( "" );
            methods[METHOD_convertRowIndexToModel33] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertRowIndexToModel", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertRowIndexToModel33].setDisplayName ( "" );
            methods[METHOD_convertRowIndexToView34] = new MethodDescriptor(javax.swing.JTable.class.getMethod("convertRowIndexToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_convertRowIndexToView34].setDisplayName ( "" );
            methods[METHOD_countComponents35] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents35].setDisplayName ( "" );
            methods[METHOD_createDefaultColumnsFromModel36] = new MethodDescriptor(javax.swing.JTable.class.getMethod("createDefaultColumnsFromModel", new Class[] {})); // NOI18N
            methods[METHOD_createDefaultColumnsFromModel36].setDisplayName ( "" );
            methods[METHOD_createImage37] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage37].setDisplayName ( "" );
            methods[METHOD_createImage38] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage38].setDisplayName ( "" );
            methods[METHOD_createScrollPaneForTable39] = new MethodDescriptor(javax.swing.JTable.class.getMethod("createScrollPaneForTable", new Class[] {javax.swing.JTable.class})); // NOI18N
            methods[METHOD_createScrollPaneForTable39].setDisplayName ( "" );
            methods[METHOD_createToolTip40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip40].setDisplayName ( "" );
            methods[METHOD_createVolatileImage41] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage41].setDisplayName ( "" );
            methods[METHOD_createVolatileImage42] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage42].setDisplayName ( "" );
            methods[METHOD_deliverEvent43] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent43].setDisplayName ( "" );
            methods[METHOD_disable44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable44].setDisplayName ( "" );
            methods[METHOD_dispatchEvent45] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent45].setDisplayName ( "" );
            methods[METHOD_doLayout46] = new MethodDescriptor(javax.swing.JTable.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout46].setDisplayName ( "" );
            methods[METHOD_editCellAt47] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editCellAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_editCellAt47].setDisplayName ( "" );
            methods[METHOD_editCellAt48] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editCellAt", new Class[] {int.class, int.class, java.util.EventObject.class})); // NOI18N
            methods[METHOD_editCellAt48].setDisplayName ( "" );
            methods[METHOD_editingCanceled49] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editingCanceled", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_editingCanceled49].setDisplayName ( "" );
            methods[METHOD_editingStopped50] = new MethodDescriptor(javax.swing.JTable.class.getMethod("editingStopped", new Class[] {javax.swing.event.ChangeEvent.class})); // NOI18N
            methods[METHOD_editingStopped50].setDisplayName ( "" );
            methods[METHOD_enable51] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable51].setDisplayName ( "" );
            methods[METHOD_enable52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable52].setDisplayName ( "" );
            methods[METHOD_enableInputMethods53] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods53].setDisplayName ( "" );
            methods[METHOD_findComponentAt54] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt54].setDisplayName ( "" );
            methods[METHOD_findComponentAt55] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt55].setDisplayName ( "" );
            methods[METHOD_firePropertyChange56] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange56].setDisplayName ( "" );
            methods[METHOD_firePropertyChange57] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange57].setDisplayName ( "" );
            methods[METHOD_firePropertyChange58] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange58].setDisplayName ( "" );
            methods[METHOD_firePropertyChange59] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange59].setDisplayName ( "" );
            methods[METHOD_firePropertyChange60] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange60].setDisplayName ( "" );
            methods[METHOD_firePropertyChange61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange61].setDisplayName ( "" );
            methods[METHOD_firePropertyChange62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange62].setDisplayName ( "" );
            methods[METHOD_firePropertyChange63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange63].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke64].setDisplayName ( "" );
            methods[METHOD_getBaseline65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline65].setDisplayName ( "" );
            methods[METHOD_getBounds66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds66].setDisplayName ( "" );
            methods[METHOD_getCellEditor67] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getCellEditor", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getCellEditor67].setDisplayName ( "" );
            methods[METHOD_getCellRect68] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getCellRect", new Class[] {int.class, int.class, boolean.class})); // NOI18N
            methods[METHOD_getCellRect68].setDisplayName ( "" );
            methods[METHOD_getCellRenderer69] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getCellRenderer", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getCellRenderer69].setDisplayName ( "" );
            methods[METHOD_getClientProperty70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty70].setDisplayName ( "" );
            methods[METHOD_getColumn71] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getColumn", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getColumn71].setDisplayName ( "" );
            methods[METHOD_getComponentAt72] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt72].setDisplayName ( "" );
            methods[METHOD_getComponentAt73] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt73].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder74] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder74].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke75] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke75].setDisplayName ( "" );
            methods[METHOD_getDefaultEditor76] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getDefaultEditor", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getDefaultEditor76].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale77] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale77].setDisplayName ( "" );
            methods[METHOD_getDefaultRenderer78] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getDefaultRenderer", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getDefaultRenderer78].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys79] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys79].setDisplayName ( "" );
            methods[METHOD_getFontMetrics80] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics80].setDisplayName ( "" );
            methods[METHOD_getInsets81] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets81].setDisplayName ( "" );
            methods[METHOD_getListeners82] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners82].setDisplayName ( "" );
            methods[METHOD_getLocation83] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation83].setDisplayName ( "" );
            methods[METHOD_getMousePosition84] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition84].setDisplayName ( "" );
            methods[METHOD_getPopupLocation85] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation85].setDisplayName ( "" );
            methods[METHOD_getPrintable86] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getPrintable", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_getPrintable86].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners87] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners87].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement88] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement88].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement89] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement89].setDisplayName ( "" );
            methods[METHOD_getSize90] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize90].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation91] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation91].setDisplayName ( "" );
            methods[METHOD_getToolTipText92] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText92].setDisplayName ( "" );
            methods[METHOD_getValueAt93] = new MethodDescriptor(javax.swing.JTable.class.getMethod("getValueAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getValueAt93].setDisplayName ( "" );
            methods[METHOD_getValueAT94] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("getValueAT", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getValueAT94].setDisplayName ( "" );
            methods[METHOD_gotFocus95] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus95].setDisplayName ( "" );
            methods[METHOD_grabFocus96] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus96].setDisplayName ( "" );
            methods[METHOD_handleEvent97] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent97].setDisplayName ( "" );
            methods[METHOD_hasFocus98] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus98].setDisplayName ( "" );
            methods[METHOD_hide99] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide99].setDisplayName ( "" );
            methods[METHOD_imageUpdate100] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate100].setDisplayName ( "" );
            methods[METHOD_insets101] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets101].setDisplayName ( "" );
            methods[METHOD_inside102] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside102].setDisplayName ( "" );
            methods[METHOD_invalidate103] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate103].setDisplayName ( "" );
            methods[METHOD_isAncestorOf104] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf104].setDisplayName ( "" );
            methods[METHOD_isCellEditable105] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("isCellEditable", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_isCellEditable105].setDisplayName ( "" );
            methods[METHOD_isCellSelected106] = new MethodDescriptor(javax.swing.JTable.class.getMethod("isCellSelected", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_isCellSelected106].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot107] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot107].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent108].setDisplayName ( "" );
            methods[METHOD_keyDown109] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown109].setDisplayName ( "" );
            methods[METHOD_keyUp110] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp110].setDisplayName ( "" );
            methods[METHOD_layout111] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout111].setDisplayName ( "" );
            methods[METHOD_list112] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list112].setDisplayName ( "" );
            methods[METHOD_list113] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list113].setDisplayName ( "" );
            methods[METHOD_list114] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list114].setDisplayName ( "" );
            methods[METHOD_list115] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list115].setDisplayName ( "" );
            methods[METHOD_list116] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list116].setDisplayName ( "" );
            methods[METHOD_locate117] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate117].setDisplayName ( "" );
            methods[METHOD_location118] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location118].setDisplayName ( "" );
            methods[METHOD_lostFocus119] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus119].setDisplayName ( "" );
            methods[METHOD_minimumSize120] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize120].setDisplayName ( "" );
            methods[METHOD_mouseDown121] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown121].setDisplayName ( "" );
            methods[METHOD_mouseDrag122] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag122].setDisplayName ( "" );
            methods[METHOD_mouseEnter123] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter123].setDisplayName ( "" );
            methods[METHOD_mouseExit124] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit124].setDisplayName ( "" );
            methods[METHOD_mouseMove125] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove125].setDisplayName ( "" );
            methods[METHOD_mouseUp126] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp126].setDisplayName ( "" );
            methods[METHOD_move127] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move127].setDisplayName ( "" );
            methods[METHOD_moveColumn128] = new MethodDescriptor(javax.swing.JTable.class.getMethod("moveColumn", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_moveColumn128].setDisplayName ( "" );
            methods[METHOD_nextFocus129] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus129].setDisplayName ( "" );
            methods[METHOD_paint130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint130].setDisplayName ( "" );
            methods[METHOD_paintAll131] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll131].setDisplayName ( "" );
            methods[METHOD_paintComponents132] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents132].setDisplayName ( "" );
            methods[METHOD_paintImmediately133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately133].setDisplayName ( "" );
            methods[METHOD_paintImmediately134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately134].setDisplayName ( "" );
            methods[METHOD_postEvent135] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent135].setDisplayName ( "" );
            methods[METHOD_preferredSize136] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize136].setDisplayName ( "" );
            methods[METHOD_prepareEditor137] = new MethodDescriptor(javax.swing.JTable.class.getMethod("prepareEditor", new Class[] {javax.swing.table.TableCellEditor.class, int.class, int.class})); // NOI18N
            methods[METHOD_prepareEditor137].setDisplayName ( "" );
            methods[METHOD_prepareImage138] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage138].setDisplayName ( "" );
            methods[METHOD_prepareImage139] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage139].setDisplayName ( "" );
            methods[METHOD_prepareRenderer140] = new MethodDescriptor(javax.swing.JTable.class.getMethod("prepareRenderer", new Class[] {javax.swing.table.TableCellRenderer.class, int.class, int.class})); // NOI18N
            methods[METHOD_prepareRenderer140].setDisplayName ( "" );
            methods[METHOD_print141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print141].setDisplayName ( "" );
            methods[METHOD_print142] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {})); // NOI18N
            methods[METHOD_print142].setDisplayName ( "" );
            methods[METHOD_print143] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class})); // NOI18N
            methods[METHOD_print143].setDisplayName ( "" );
            methods[METHOD_print144] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_print144].setDisplayName ( "" );
            methods[METHOD_print145] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_print145].setDisplayName ( "" );
            methods[METHOD_print146] = new MethodDescriptor(javax.swing.JTable.class.getMethod("print", new Class[] {javax.swing.JTable.PrintMode.class, java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class, javax.print.PrintService.class})); // NOI18N
            methods[METHOD_print146].setDisplayName ( "" );
            methods[METHOD_printAll147] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll147].setDisplayName ( "" );
            methods[METHOD_printComponents148] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents148].setDisplayName ( "" );
            methods[METHOD_putClientProperty149] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty149].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction150] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction150].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction151] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction151].setDisplayName ( "" );
            methods[METHOD_remove152] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove152].setDisplayName ( "" );
            methods[METHOD_remove153] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove153].setDisplayName ( "" );
            methods[METHOD_remove154] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove154].setDisplayName ( "" );
            methods[METHOD_removeAll155] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll155].setDisplayName ( "" );
            methods[METHOD_removeAllValues156] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("removeAllValues", new Class[] {})); // NOI18N
            methods[METHOD_removeAllValues156].setDisplayName ( "" );
            methods[METHOD_removeColumn157] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeColumn", new Class[] {javax.swing.table.TableColumn.class})); // NOI18N
            methods[METHOD_removeColumn157].setDisplayName ( "" );
            methods[METHOD_removeColumnSelectionInterval158] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeColumnSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_removeColumnSelectionInterval158].setDisplayName ( "" );
            methods[METHOD_removeEditor159] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeEditor", new Class[] {})); // NOI18N
            methods[METHOD_removeEditor159].setDisplayName ( "" );
            methods[METHOD_removeNotify160] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify160].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener161] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener161].setDisplayName ( "" );
            methods[METHOD_removeRow162] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("removeRow", new Class[] {int.class})); // NOI18N
            methods[METHOD_removeRow162].setDisplayName ( "" );
            methods[METHOD_removeRowSelectionInterval163] = new MethodDescriptor(javax.swing.JTable.class.getMethod("removeRowSelectionInterval", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_removeRowSelectionInterval163].setDisplayName ( "" );
            methods[METHOD_removeTable164] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("removeTable", new Class[] {})); // NOI18N
            methods[METHOD_removeTable164].setDisplayName ( "" );
            methods[METHOD_repaint165] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint165].setDisplayName ( "" );
            methods[METHOD_repaint166] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint166].setDisplayName ( "" );
            methods[METHOD_repaint167] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint167].setDisplayName ( "" );
            methods[METHOD_repaint168] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint168].setDisplayName ( "" );
            methods[METHOD_repaint169] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint169].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus170] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus170].setDisplayName ( "" );
            methods[METHOD_requestFocus171] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus171].setDisplayName ( "" );
            methods[METHOD_requestFocus172] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus172].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow173] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow173].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions174] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions174].setDisplayName ( "" );
            methods[METHOD_reshape175] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape175].setDisplayName ( "" );
            methods[METHOD_resize176] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize176].setDisplayName ( "" );
            methods[METHOD_resize177] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize177].setDisplayName ( "" );
            methods[METHOD_revalidate178] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate178].setDisplayName ( "" );
            methods[METHOD_rowAtPoint179] = new MethodDescriptor(javax.swing.JTable.class.getMethod("rowAtPoint", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_rowAtPoint179].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible180] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible180].setDisplayName ( "" );
            methods[METHOD_selectAll181] = new MethodDescriptor(javax.swing.JTable.class.getMethod("selectAll", new Class[] {})); // NOI18N
            methods[METHOD_selectAll181].setDisplayName ( "" );
            methods[METHOD_setBounds182] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds182].setDisplayName ( "" );
            methods[METHOD_setColumnClass183] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("setColumnClass", new Class[] {java.lang.Class.class, int.class})); // NOI18N
            methods[METHOD_setColumnClass183].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder184] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder184].setDisplayName ( "" );
            methods[METHOD_setDefaultEditor185] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setDefaultEditor", new Class[] {java.lang.Class.class, javax.swing.table.TableCellEditor.class})); // NOI18N
            methods[METHOD_setDefaultEditor185].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale186] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale186].setDisplayName ( "" );
            methods[METHOD_setDefaultRenderer187] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setDefaultRenderer", new Class[] {java.lang.Class.class, javax.swing.table.TableCellRenderer.class})); // NOI18N
            methods[METHOD_setDefaultRenderer187].setDisplayName ( "" );
            methods[METHOD_setModel188] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("setModel", new Class[] {})); // NOI18N
            methods[METHOD_setModel188].setDisplayName ( "" );
            methods[METHOD_setRowHeight189] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setRowHeight", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_setRowHeight189].setDisplayName ( "" );
            methods[METHOD_setValueAt190] = new MethodDescriptor(javax.swing.JTable.class.getMethod("setValueAt", new Class[] {java.lang.Object.class, int.class, int.class})); // NOI18N
            methods[METHOD_setValueAt190].setDisplayName ( "" );
            methods[METHOD_setValueAT191] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFTable.HFTable.class.getMethod("setValueAT", new Class[] {java.lang.Object.class, int.class, int.class})); // NOI18N
            methods[METHOD_setValueAT191].setDisplayName ( "" );
            methods[METHOD_show192] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show192].setDisplayName ( "" );
            methods[METHOD_show193] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show193].setDisplayName ( "" );
            methods[METHOD_size194] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size194].setDisplayName ( "" );
            methods[METHOD_sizeColumnsToFit195] = new MethodDescriptor(javax.swing.JTable.class.getMethod("sizeColumnsToFit", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_sizeColumnsToFit195].setDisplayName ( "" );
            methods[METHOD_sizeColumnsToFit196] = new MethodDescriptor(javax.swing.JTable.class.getMethod("sizeColumnsToFit", new Class[] {int.class})); // NOI18N
            methods[METHOD_sizeColumnsToFit196].setDisplayName ( "" );
            methods[METHOD_sorterChanged197] = new MethodDescriptor(javax.swing.JTable.class.getMethod("sorterChanged", new Class[] {javax.swing.event.RowSorterEvent.class})); // NOI18N
            methods[METHOD_sorterChanged197].setDisplayName ( "" );
            methods[METHOD_tableChanged198] = new MethodDescriptor(javax.swing.JTable.class.getMethod("tableChanged", new Class[] {javax.swing.event.TableModelEvent.class})); // NOI18N
            methods[METHOD_tableChanged198].setDisplayName ( "" );
            methods[METHOD_toString199] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString199].setDisplayName ( "" );
            methods[METHOD_transferFocus200] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus200].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward201] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward201].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle202] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle202].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle203] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle203].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction204] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction204].setDisplayName ( "" );
            methods[METHOD_update205] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update205].setDisplayName ( "" );
            methods[METHOD_updateUI206] = new MethodDescriptor(javax.swing.JTable.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI206].setDisplayName ( "" );
            methods[METHOD_validate207] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate207].setDisplayName ( "" );
            methods[METHOD_valueChanged208] = new MethodDescriptor(javax.swing.JTable.class.getMethod("valueChanged", new Class[] {javax.swing.event.ListSelectionEvent.class})); // NOI18N
            methods[METHOD_valueChanged208].setDisplayName ( "" );
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
