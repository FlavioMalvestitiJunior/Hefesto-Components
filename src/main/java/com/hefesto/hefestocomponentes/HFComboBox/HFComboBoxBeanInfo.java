/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hefesto.hefestocomponentes.HFComboBox;

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
public class HFComboBoxBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_action = 1;
    private static final int PROPERTY_actionCommand = 2;
    private static final int PROPERTY_actionListeners = 3;
    private static final int PROPERTY_actionMap = 4;
    private static final int PROPERTY_alignmentX = 5;
    private static final int PROPERTY_alignmentY = 6;
    private static final int PROPERTY_ancestorListeners = 7;
    private static final int PROPERTY_autoComplete = 8;
    private static final int PROPERTY_autoscrolls = 9;
    private static final int PROPERTY_background = 10;
    private static final int PROPERTY_backgroundSet = 11;
    private static final int PROPERTY_baselineResizeBehavior = 12;
    private static final int PROPERTY_border = 13;
    private static final int PROPERTY_bounds = 14;
    private static final int PROPERTY_colorModel = 15;
    private static final int PROPERTY_component = 16;
    private static final int PROPERTY_componentCount = 17;
    private static final int PROPERTY_componentListeners = 18;
    private static final int PROPERTY_componentOrientation = 19;
    private static final int PROPERTY_componentPopupMenu = 20;
    private static final int PROPERTY_components = 21;
    private static final int PROPERTY_containerListeners = 22;
    private static final int PROPERTY_cursor = 23;
    private static final int PROPERTY_cursorSet = 24;
    private static final int PROPERTY_debugGraphicsOptions = 25;
    private static final int PROPERTY_displayable = 26;
    private static final int PROPERTY_doubleBuffered = 27;
    private static final int PROPERTY_dropTarget = 28;
    private static final int PROPERTY_editable = 29;
    private static final int PROPERTY_editor = 30;
    private static final int PROPERTY_enabled = 31;
    private static final int PROPERTY_focusable = 32;
    private static final int PROPERTY_focusCycleRoot = 33;
    private static final int PROPERTY_focusCycleRootAncestor = 34;
    private static final int PROPERTY_focusListeners = 35;
    private static final int PROPERTY_focusOwner = 36;
    private static final int PROPERTY_focusTraversable = 37;
    private static final int PROPERTY_focusTraversalKeys = 38;
    private static final int PROPERTY_focusTraversalKeysEnabled = 39;
    private static final int PROPERTY_focusTraversalPolicy = 40;
    private static final int PROPERTY_focusTraversalPolicyProvider = 41;
    private static final int PROPERTY_focusTraversalPolicySet = 42;
    private static final int PROPERTY_font = 43;
    private static final int PROPERTY_fontSet = 44;
    private static final int PROPERTY_foreground = 45;
    private static final int PROPERTY_foregroundSet = 46;
    private static final int PROPERTY_graphics = 47;
    private static final int PROPERTY_graphicsConfiguration = 48;
    private static final int PROPERTY_height = 49;
    private static final int PROPERTY_hierarchyBoundsListeners = 50;
    private static final int PROPERTY_hierarchyListeners = 51;
    private static final int PROPERTY_ignoreRepaint = 52;
    private static final int PROPERTY_inheritsPopupMenu = 53;
    private static final int PROPERTY_inputContext = 54;
    private static final int PROPERTY_inputMap = 55;
    private static final int PROPERTY_inputMethodListeners = 56;
    private static final int PROPERTY_inputMethodRequests = 57;
    private static final int PROPERTY_inputVerifier = 58;
    private static final int PROPERTY_insets = 59;
    private static final int PROPERTY_itemAt = 60;
    private static final int PROPERTY_itemCount = 61;
    private static final int PROPERTY_itemListeners = 62;
    private static final int PROPERTY_keyListeners = 63;
    private static final int PROPERTY_keySelectionManager = 64;
    private static final int PROPERTY_layout = 65;
    private static final int PROPERTY_lightweight = 66;
    private static final int PROPERTY_lightWeightPopupEnabled = 67;
    private static final int PROPERTY_locale = 68;
    private static final int PROPERTY_location = 69;
    private static final int PROPERTY_locationOnScreen = 70;
    private static final int PROPERTY_managingFocus = 71;
    private static final int PROPERTY_maximumRowCount = 72;
    private static final int PROPERTY_maximumSize = 73;
    private static final int PROPERTY_maximumSizeSet = 74;
    private static final int PROPERTY_minimumSize = 75;
    private static final int PROPERTY_minimumSizeSet = 76;
    private static final int PROPERTY_model = 77;
    private static final int PROPERTY_mouseListeners = 78;
    private static final int PROPERTY_mouseMotionListeners = 79;
    private static final int PROPERTY_mousePosition = 80;
    private static final int PROPERTY_mouseWheelListeners = 81;
    private static final int PROPERTY_name = 82;
    private static final int PROPERTY_nextFocusableComponent = 83;
    private static final int PROPERTY_opaque = 84;
    private static final int PROPERTY_optimizedDrawingEnabled = 85;
    private static final int PROPERTY_paintingForPrint = 86;
    private static final int PROPERTY_paintingTile = 87;
    private static final int PROPERTY_parent = 88;
    private static final int PROPERTY_peer = 89;
    private static final int PROPERTY_pesquisavel = 90;
    private static final int PROPERTY_popupMenuListeners = 91;
    private static final int PROPERTY_popupVisible = 92;
    private static final int PROPERTY_preferredSize = 93;
    private static final int PROPERTY_preferredSizeSet = 94;
    private static final int PROPERTY_propertyChangeListeners = 95;
    private static final int PROPERTY_prototypeDisplayValue = 96;
    private static final int PROPERTY_registeredKeyStrokes = 97;
    private static final int PROPERTY_renderer = 98;
    private static final int PROPERTY_requestFocusEnabled = 99;
    private static final int PROPERTY_rootPane = 100;
    private static final int PROPERTY_selectedIndex = 101;
    private static final int PROPERTY_selectedItem = 102;
    private static final int PROPERTY_selectedObjects = 103;
    private static final int PROPERTY_showing = 104;
    private static final int PROPERTY_size = 105;
    private static final int PROPERTY_toolkit = 106;
    private static final int PROPERTY_toolTipText = 107;
    private static final int PROPERTY_topLevelAncestor = 108;
    private static final int PROPERTY_transferHandler = 109;
    private static final int PROPERTY_treeLock = 110;
    private static final int PROPERTY_UI = 111;
    private static final int PROPERTY_UIClassID = 112;
    private static final int PROPERTY_valid = 113;
    private static final int PROPERTY_validateRoot = 114;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 115;
    private static final int PROPERTY_vetoableChangeListeners = 116;
    private static final int PROPERTY_visible = 117;
    private static final int PROPERTY_visibleRect = 118;
    private static final int PROPERTY_width = 119;
    private static final int PROPERTY_x = 120;
    private static final int PROPERTY_y = 121;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[122];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getActionCommand", "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoComplete] = new PropertyDescriptor ( "autoComplete", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, null, "setAutoComplete" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editable] = new PropertyDescriptor ( "editable", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isEditable", "setEditable" ); // NOI18N
            properties[PROPERTY_editor] = new PropertyDescriptor ( "editor", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getEditor", "setEditor" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_itemAt] = new IndexedPropertyDescriptor ( "itemAt", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, null, null, "getItemAt", null ); // NOI18N
            properties[PROPERTY_itemCount] = new PropertyDescriptor ( "itemCount", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getItemCount", null ); // NOI18N
            properties[PROPERTY_itemListeners] = new PropertyDescriptor ( "itemListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getItemListeners", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_keySelectionManager] = new PropertyDescriptor ( "keySelectionManager", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getKeySelectionManager", "setKeySelectionManager" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_lightWeightPopupEnabled] = new PropertyDescriptor ( "lightWeightPopupEnabled", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isLightWeightPopupEnabled", "setLightWeightPopupEnabled" ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumRowCount] = new PropertyDescriptor ( "maximumRowCount", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getMaximumRowCount", "setMaximumRowCount" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_pesquisavel] = new PropertyDescriptor ( "pesquisavel", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, null, "setPesquisavel" ); // NOI18N
            properties[PROPERTY_popupMenuListeners] = new PropertyDescriptor ( "popupMenuListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getPopupMenuListeners", null ); // NOI18N
            properties[PROPERTY_popupVisible] = new PropertyDescriptor ( "popupVisible", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isPopupVisible", "setPopupVisible" ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_prototypeDisplayValue] = new PropertyDescriptor ( "prototypeDisplayValue", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getPrototypeDisplayValue", "setPrototypeDisplayValue" ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_renderer] = new PropertyDescriptor ( "renderer", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getRenderer", "setRenderer" ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_selectedIndex] = new PropertyDescriptor ( "selectedIndex", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getSelectedIndex", "setSelectedIndex" ); // NOI18N
            properties[PROPERTY_selectedItem] = new PropertyDescriptor ( "selectedItem", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getSelectedItem", "setSelectedItem" ); // NOI18N
            properties[PROPERTY_selectedObjects] = new PropertyDescriptor ( "selectedObjects", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getSelectedObjects", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_componentListener = 2;
    private static final int EVENT_containerListener = 3;
    private static final int EVENT_focusListener = 4;
    private static final int EVENT_hierarchyBoundsListener = 5;
    private static final int EVENT_hierarchyListener = 6;
    private static final int EVENT_inputMethodListener = 7;
    private static final int EVENT_itemListener = 8;
    private static final int EVENT_keyListener = 9;
    private static final int EVENT_mouseListener = 10;
    private static final int EVENT_mouseMotionListener = 11;
    private static final int EVENT_mouseWheelListener = 12;
    private static final int EVENT_popupMenuListener = 13;
    private static final int EVENT_propertyChangeListener = 14;
    private static final int EVENT_vetoableChangeListener = 15;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[16];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_itemListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "itemListener", java.awt.event.ItemListener.class, new String[] {"itemStateChanged"}, "addItemListener", "removeItemListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_popupMenuListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "popupMenuListener", javax.swing.event.PopupMenuListener.class, new String[] {"popupMenuWillBecomeVisible", "popupMenuWillBecomeInvisible", "popupMenuCanceled"}, "addPopupMenuListener", "removePopupMenuListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_actionPerformed1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_add7 = 7;
    private static final int METHOD_addItem8 = 8;
    private static final int METHOD_addNotify9 = 9;
    private static final int METHOD_addPropertyChangeListener10 = 10;
    private static final int METHOD_adicionarItens11 = 11;
    private static final int METHOD_applyComponentOrientation12 = 12;
    private static final int METHOD_areFocusTraversalKeysSet13 = 13;
    private static final int METHOD_bounds14 = 14;
    private static final int METHOD_checkImage15 = 15;
    private static final int METHOD_checkImage16 = 16;
    private static final int METHOD_computeVisibleRect17 = 17;
    private static final int METHOD_configureEditor18 = 18;
    private static final int METHOD_contains19 = 19;
    private static final int METHOD_contains20 = 20;
    private static final int METHOD_contentsChanged21 = 21;
    private static final int METHOD_countComponents22 = 22;
    private static final int METHOD_createImage23 = 23;
    private static final int METHOD_createImage24 = 24;
    private static final int METHOD_createToolTip25 = 25;
    private static final int METHOD_createVolatileImage26 = 26;
    private static final int METHOD_createVolatileImage27 = 27;
    private static final int METHOD_deliverEvent28 = 28;
    private static final int METHOD_disable29 = 29;
    private static final int METHOD_dispatchEvent30 = 30;
    private static final int METHOD_doLayout31 = 31;
    private static final int METHOD_enable32 = 32;
    private static final int METHOD_enable33 = 33;
    private static final int METHOD_enableInputMethods34 = 34;
    private static final int METHOD_findComponentAt35 = 35;
    private static final int METHOD_findComponentAt36 = 36;
    private static final int METHOD_firePopupMenuCanceled37 = 37;
    private static final int METHOD_firePopupMenuWillBecomeInvisible38 = 38;
    private static final int METHOD_firePopupMenuWillBecomeVisible39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_firePropertyChange44 = 44;
    private static final int METHOD_firePropertyChange45 = 45;
    private static final int METHOD_firePropertyChange46 = 46;
    private static final int METHOD_firePropertyChange47 = 47;
    private static final int METHOD_getActionForKeyStroke48 = 48;
    private static final int METHOD_getBaseline49 = 49;
    private static final int METHOD_getBounds50 = 50;
    private static final int METHOD_getClientProperty51 = 51;
    private static final int METHOD_getComponentAt52 = 52;
    private static final int METHOD_getComponentAt53 = 53;
    private static final int METHOD_getComponentZOrder54 = 54;
    private static final int METHOD_getConditionForKeyStroke55 = 55;
    private static final int METHOD_getDefaultLocale56 = 56;
    private static final int METHOD_getFocusTraversalKeys57 = 57;
    private static final int METHOD_getFontMetrics58 = 58;
    private static final int METHOD_getInsets59 = 59;
    private static final int METHOD_getListeners60 = 60;
    private static final int METHOD_getLocation61 = 61;
    private static final int METHOD_getMousePosition62 = 62;
    private static final int METHOD_getPopupLocation63 = 63;
    private static final int METHOD_getPropertyChangeListeners64 = 64;
    private static final int METHOD_getSize65 = 65;
    private static final int METHOD_getToolTipLocation66 = 66;
    private static final int METHOD_getToolTipText67 = 67;
    private static final int METHOD_gotFocus68 = 68;
    private static final int METHOD_grabFocus69 = 69;
    private static final int METHOD_handleEvent70 = 70;
    private static final int METHOD_hasFocus71 = 71;
    private static final int METHOD_hide72 = 72;
    private static final int METHOD_hidePopup73 = 73;
    private static final int METHOD_imageUpdate74 = 74;
    private static final int METHOD_insertItemAt75 = 75;
    private static final int METHOD_insets76 = 76;
    private static final int METHOD_inside77 = 77;
    private static final int METHOD_intervalAdded78 = 78;
    private static final int METHOD_intervalRemoved79 = 79;
    private static final int METHOD_invalidate80 = 80;
    private static final int METHOD_isAncestorOf81 = 81;
    private static final int METHOD_isAutoComplete82 = 82;
    private static final int METHOD_isFocusCycleRoot83 = 83;
    private static final int METHOD_isLightweightComponent84 = 84;
    private static final int METHOD_keyDown85 = 85;
    private static final int METHOD_keyUp86 = 86;
    private static final int METHOD_layout87 = 87;
    private static final int METHOD_list88 = 88;
    private static final int METHOD_list89 = 89;
    private static final int METHOD_list90 = 90;
    private static final int METHOD_list91 = 91;
    private static final int METHOD_list92 = 92;
    private static final int METHOD_locate93 = 93;
    private static final int METHOD_location94 = 94;
    private static final int METHOD_lostFocus95 = 95;
    private static final int METHOD_minimumSize96 = 96;
    private static final int METHOD_mouseDown97 = 97;
    private static final int METHOD_mouseDrag98 = 98;
    private static final int METHOD_mouseEnter99 = 99;
    private static final int METHOD_mouseExit100 = 100;
    private static final int METHOD_mouseMove101 = 101;
    private static final int METHOD_mouseUp102 = 102;
    private static final int METHOD_move103 = 103;
    private static final int METHOD_nextFocus104 = 104;
    private static final int METHOD_paint105 = 105;
    private static final int METHOD_paintAll106 = 106;
    private static final int METHOD_paintComponents107 = 107;
    private static final int METHOD_paintImmediately108 = 108;
    private static final int METHOD_paintImmediately109 = 109;
    private static final int METHOD_postEvent110 = 110;
    private static final int METHOD_preferredSize111 = 111;
    private static final int METHOD_prepareImage112 = 112;
    private static final int METHOD_prepareImage113 = 113;
    private static final int METHOD_print114 = 114;
    private static final int METHOD_printAll115 = 115;
    private static final int METHOD_printComponents116 = 116;
    private static final int METHOD_processKeyEvent117 = 117;
    private static final int METHOD_putClientProperty118 = 118;
    private static final int METHOD_registerKeyboardAction119 = 119;
    private static final int METHOD_registerKeyboardAction120 = 120;
    private static final int METHOD_remove121 = 121;
    private static final int METHOD_remove122 = 122;
    private static final int METHOD_remove123 = 123;
    private static final int METHOD_removeAll124 = 124;
    private static final int METHOD_removeAllItems125 = 125;
    private static final int METHOD_removeItem126 = 126;
    private static final int METHOD_removeItemAt127 = 127;
    private static final int METHOD_removeNotify128 = 128;
    private static final int METHOD_removePropertyChangeListener129 = 129;
    private static final int METHOD_repaint130 = 130;
    private static final int METHOD_repaint131 = 131;
    private static final int METHOD_repaint132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_repaint134 = 134;
    private static final int METHOD_requestDefaultFocus135 = 135;
    private static final int METHOD_requestFocus136 = 136;
    private static final int METHOD_requestFocus137 = 137;
    private static final int METHOD_requestFocusInWindow138 = 138;
    private static final int METHOD_resetKeyboardActions139 = 139;
    private static final int METHOD_reshape140 = 140;
    private static final int METHOD_resize141 = 141;
    private static final int METHOD_resize142 = 142;
    private static final int METHOD_revalidate143 = 143;
    private static final int METHOD_scrollRectToVisible144 = 144;
    private static final int METHOD_selectWithKeyChar145 = 145;
    private static final int METHOD_setBounds146 = 146;
    private static final int METHOD_setComponentZOrder147 = 147;
    private static final int METHOD_setDefaultLocale148 = 148;
    private static final int METHOD_show149 = 149;
    private static final int METHOD_show150 = 150;
    private static final int METHOD_showPopup151 = 151;
    private static final int METHOD_size152 = 152;
    private static final int METHOD_toString153 = 153;
    private static final int METHOD_transferFocus154 = 154;
    private static final int METHOD_transferFocusBackward155 = 155;
    private static final int METHOD_transferFocusDownCycle156 = 156;
    private static final int METHOD_transferFocusUpCycle157 = 157;
    private static final int METHOD_unregisterKeyboardAction158 = 158;
    private static final int METHOD_update159 = 159;
    private static final int METHOD_updateUI160 = 160;
    private static final int METHOD_validate161 = 161;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[162];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_actionPerformed1] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("actionPerformed", new Class[] {java.awt.event.ActionEvent.class})); // NOI18N
            methods[METHOD_actionPerformed1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_addItem8] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("addItem", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_addItem8].setDisplayName ( "" );
            methods[METHOD_addNotify9] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify9].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener10] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener10].setDisplayName ( "" );
            methods[METHOD_adicionarItens11] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class.getMethod("adicionarItens", new Class[] {java.util.List.class})); // NOI18N
            methods[METHOD_adicionarItens11].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation12] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation12].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet13] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet13].setDisplayName ( "" );
            methods[METHOD_bounds14] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds14].setDisplayName ( "" );
            methods[METHOD_checkImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage15].setDisplayName ( "" );
            methods[METHOD_checkImage16] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage16].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect17].setDisplayName ( "" );
            methods[METHOD_configureEditor18] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("configureEditor", new Class[] {javax.swing.ComboBoxEditor.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_configureEditor18].setDisplayName ( "" );
            methods[METHOD_contains19] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains19].setDisplayName ( "" );
            methods[METHOD_contains20] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains20].setDisplayName ( "" );
            methods[METHOD_contentsChanged21] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("contentsChanged", new Class[] {javax.swing.event.ListDataEvent.class})); // NOI18N
            methods[METHOD_contentsChanged21].setDisplayName ( "" );
            methods[METHOD_countComponents22] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents22].setDisplayName ( "" );
            methods[METHOD_createImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage23].setDisplayName ( "" );
            methods[METHOD_createImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage24].setDisplayName ( "" );
            methods[METHOD_createToolTip25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip25].setDisplayName ( "" );
            methods[METHOD_createVolatileImage26] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage26].setDisplayName ( "" );
            methods[METHOD_createVolatileImage27] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage27].setDisplayName ( "" );
            methods[METHOD_deliverEvent28] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent28].setDisplayName ( "" );
            methods[METHOD_disable29] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable29].setDisplayName ( "" );
            methods[METHOD_dispatchEvent30] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent30].setDisplayName ( "" );
            methods[METHOD_doLayout31] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout31].setDisplayName ( "" );
            methods[METHOD_enable32] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable32].setDisplayName ( "" );
            methods[METHOD_enable33] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable33].setDisplayName ( "" );
            methods[METHOD_enableInputMethods34] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods34].setDisplayName ( "" );
            methods[METHOD_findComponentAt35] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt35].setDisplayName ( "" );
            methods[METHOD_findComponentAt36] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt36].setDisplayName ( "" );
            methods[METHOD_firePopupMenuCanceled37] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("firePopupMenuCanceled", new Class[] {})); // NOI18N
            methods[METHOD_firePopupMenuCanceled37].setDisplayName ( "" );
            methods[METHOD_firePopupMenuWillBecomeInvisible38] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("firePopupMenuWillBecomeInvisible", new Class[] {})); // NOI18N
            methods[METHOD_firePopupMenuWillBecomeInvisible38].setDisplayName ( "" );
            methods[METHOD_firePopupMenuWillBecomeVisible39] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("firePopupMenuWillBecomeVisible", new Class[] {})); // NOI18N
            methods[METHOD_firePopupMenuWillBecomeVisible39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_firePropertyChange44] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange44].setDisplayName ( "" );
            methods[METHOD_firePropertyChange45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange45].setDisplayName ( "" );
            methods[METHOD_firePropertyChange46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange46].setDisplayName ( "" );
            methods[METHOD_firePropertyChange47] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange47].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke48].setDisplayName ( "" );
            methods[METHOD_getBaseline49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline49].setDisplayName ( "" );
            methods[METHOD_getBounds50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds50].setDisplayName ( "" );
            methods[METHOD_getClientProperty51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty51].setDisplayName ( "" );
            methods[METHOD_getComponentAt52] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt52].setDisplayName ( "" );
            methods[METHOD_getComponentAt53] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt53].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder54] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder54].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke55].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale56].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys57] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys57].setDisplayName ( "" );
            methods[METHOD_getFontMetrics58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics58].setDisplayName ( "" );
            methods[METHOD_getInsets59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets59].setDisplayName ( "" );
            methods[METHOD_getListeners60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners60].setDisplayName ( "" );
            methods[METHOD_getLocation61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation61].setDisplayName ( "" );
            methods[METHOD_getMousePosition62] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition62].setDisplayName ( "" );
            methods[METHOD_getPopupLocation63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation63].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners64] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners64].setDisplayName ( "" );
            methods[METHOD_getSize65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize65].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation66].setDisplayName ( "" );
            methods[METHOD_getToolTipText67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText67].setDisplayName ( "" );
            methods[METHOD_gotFocus68] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus68].setDisplayName ( "" );
            methods[METHOD_grabFocus69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus69].setDisplayName ( "" );
            methods[METHOD_handleEvent70] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent70].setDisplayName ( "" );
            methods[METHOD_hasFocus71] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus71].setDisplayName ( "" );
            methods[METHOD_hide72] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide72].setDisplayName ( "" );
            methods[METHOD_hidePopup73] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("hidePopup", new Class[] {})); // NOI18N
            methods[METHOD_hidePopup73].setDisplayName ( "" );
            methods[METHOD_imageUpdate74] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate74].setDisplayName ( "" );
            methods[METHOD_insertItemAt75] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("insertItemAt", new Class[] {java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_insertItemAt75].setDisplayName ( "" );
            methods[METHOD_insets76] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets76].setDisplayName ( "" );
            methods[METHOD_inside77] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside77].setDisplayName ( "" );
            methods[METHOD_intervalAdded78] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("intervalAdded", new Class[] {javax.swing.event.ListDataEvent.class})); // NOI18N
            methods[METHOD_intervalAdded78].setDisplayName ( "" );
            methods[METHOD_intervalRemoved79] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("intervalRemoved", new Class[] {javax.swing.event.ListDataEvent.class})); // NOI18N
            methods[METHOD_intervalRemoved79].setDisplayName ( "" );
            methods[METHOD_invalidate80] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate80].setDisplayName ( "" );
            methods[METHOD_isAncestorOf81] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf81].setDisplayName ( "" );
            methods[METHOD_isAutoComplete82] = new MethodDescriptor(com.hefesto.hefestocomponentes.HFComboBox.HFComboBox.class.getMethod("isAutoComplete", new Class[] {})); // NOI18N
            methods[METHOD_isAutoComplete82].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot83] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot83].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent84] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent84].setDisplayName ( "" );
            methods[METHOD_keyDown85] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown85].setDisplayName ( "" );
            methods[METHOD_keyUp86] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp86].setDisplayName ( "" );
            methods[METHOD_layout87] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout87].setDisplayName ( "" );
            methods[METHOD_list88] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list88].setDisplayName ( "" );
            methods[METHOD_list89] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list89].setDisplayName ( "" );
            methods[METHOD_list90] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list90].setDisplayName ( "" );
            methods[METHOD_list91] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list91].setDisplayName ( "" );
            methods[METHOD_list92] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list92].setDisplayName ( "" );
            methods[METHOD_locate93] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate93].setDisplayName ( "" );
            methods[METHOD_location94] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location94].setDisplayName ( "" );
            methods[METHOD_lostFocus95] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus95].setDisplayName ( "" );
            methods[METHOD_minimumSize96] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize96].setDisplayName ( "" );
            methods[METHOD_mouseDown97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown97].setDisplayName ( "" );
            methods[METHOD_mouseDrag98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag98].setDisplayName ( "" );
            methods[METHOD_mouseEnter99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter99].setDisplayName ( "" );
            methods[METHOD_mouseExit100] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit100].setDisplayName ( "" );
            methods[METHOD_mouseMove101] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove101].setDisplayName ( "" );
            methods[METHOD_mouseUp102] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp102].setDisplayName ( "" );
            methods[METHOD_move103] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move103].setDisplayName ( "" );
            methods[METHOD_nextFocus104] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus104].setDisplayName ( "" );
            methods[METHOD_paint105] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint105].setDisplayName ( "" );
            methods[METHOD_paintAll106] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll106].setDisplayName ( "" );
            methods[METHOD_paintComponents107] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents107].setDisplayName ( "" );
            methods[METHOD_paintImmediately108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately108].setDisplayName ( "" );
            methods[METHOD_paintImmediately109] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately109].setDisplayName ( "" );
            methods[METHOD_postEvent110] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent110].setDisplayName ( "" );
            methods[METHOD_preferredSize111] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize111].setDisplayName ( "" );
            methods[METHOD_prepareImage112] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage112].setDisplayName ( "" );
            methods[METHOD_prepareImage113] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage113].setDisplayName ( "" );
            methods[METHOD_print114] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print114].setDisplayName ( "" );
            methods[METHOD_printAll115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll115].setDisplayName ( "" );
            methods[METHOD_printComponents116] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents116].setDisplayName ( "" );
            methods[METHOD_processKeyEvent117] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("processKeyEvent", new Class[] {java.awt.event.KeyEvent.class})); // NOI18N
            methods[METHOD_processKeyEvent117].setDisplayName ( "" );
            methods[METHOD_putClientProperty118] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty118].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction119].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction120] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction120].setDisplayName ( "" );
            methods[METHOD_remove121] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove121].setDisplayName ( "" );
            methods[METHOD_remove122] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove122].setDisplayName ( "" );
            methods[METHOD_remove123] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove123].setDisplayName ( "" );
            methods[METHOD_removeAll124] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll124].setDisplayName ( "" );
            methods[METHOD_removeAllItems125] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("removeAllItems", new Class[] {})); // NOI18N
            methods[METHOD_removeAllItems125].setDisplayName ( "" );
            methods[METHOD_removeItem126] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("removeItem", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_removeItem126].setDisplayName ( "" );
            methods[METHOD_removeItemAt127] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("removeItemAt", new Class[] {int.class})); // NOI18N
            methods[METHOD_removeItemAt127].setDisplayName ( "" );
            methods[METHOD_removeNotify128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify128].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener129] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener129].setDisplayName ( "" );
            methods[METHOD_repaint130] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint130].setDisplayName ( "" );
            methods[METHOD_repaint131] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint131].setDisplayName ( "" );
            methods[METHOD_repaint132] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_repaint134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint134].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus135].setDisplayName ( "" );
            methods[METHOD_requestFocus136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus136].setDisplayName ( "" );
            methods[METHOD_requestFocus137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus137].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow138].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions139].setDisplayName ( "" );
            methods[METHOD_reshape140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape140].setDisplayName ( "" );
            methods[METHOD_resize141] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize141].setDisplayName ( "" );
            methods[METHOD_resize142] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize142].setDisplayName ( "" );
            methods[METHOD_revalidate143] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate143].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible144] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible144].setDisplayName ( "" );
            methods[METHOD_selectWithKeyChar145] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("selectWithKeyChar", new Class[] {char.class})); // NOI18N
            methods[METHOD_selectWithKeyChar145].setDisplayName ( "" );
            methods[METHOD_setBounds146] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds146].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder147] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder147].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale148] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale148].setDisplayName ( "" );
            methods[METHOD_show149] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show149].setDisplayName ( "" );
            methods[METHOD_show150] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show150].setDisplayName ( "" );
            methods[METHOD_showPopup151] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("showPopup", new Class[] {})); // NOI18N
            methods[METHOD_showPopup151].setDisplayName ( "" );
            methods[METHOD_size152] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size152].setDisplayName ( "" );
            methods[METHOD_toString153] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString153].setDisplayName ( "" );
            methods[METHOD_transferFocus154] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus154].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward155] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward155].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle156] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle156].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle157] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle157].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction158] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction158].setDisplayName ( "" );
            methods[METHOD_update159] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update159].setDisplayName ( "" );
            methods[METHOD_updateUI160] = new MethodDescriptor(javax.swing.JComboBox.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI160].setDisplayName ( "" );
            methods[METHOD_validate161] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate161].setDisplayName ( "" );
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
