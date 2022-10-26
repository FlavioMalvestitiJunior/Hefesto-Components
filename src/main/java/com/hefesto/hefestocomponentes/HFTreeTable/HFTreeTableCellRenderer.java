package com.hefesto.hefestocomponentes.HFTreeTable;

import com.hefesto.hefestocomponentes.HFImagenLoader.HFImageLoader;
import com.hefesto.hefestocomponentes.HFUtils.HFImageComponents;
import java.awt.Component;
import java.awt.Image;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class HFTreeTableCellRenderer extends DefaultTreeCellRenderer {

    /**
     *
     */
    private static final long serialVersionUID = 5593629042737938947L;

    public HFTreeTableCellRenderer() throws Exception {

        HFImageLoader im = new HFImageLoader(this.getClass());
        setClosedIcon(im.getResizedImage(HFImageComponents.ADD, 15, 15, Image.SCALE_SMOOTH));
        setOpenIcon(im.getResizedImage(HFImageComponents.CANCEL, 15, 15, Image.SCALE_SMOOTH));
    }

    @Override
    public Component getTreeCellRendererComponent(
            JTree tree,
            Object value,
            boolean sel,
            boolean expanded,
            boolean leaf,
            int row,
            boolean hasFocus) {

        super.getTreeCellRendererComponent(
                tree, value, sel,
                expanded, leaf, row,
                hasFocus);
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;

        if (node != null && node.getUserObject() != null && (node.getUserObject() instanceof HFRowData)) {
            HFRowData item = (HFRowData) (node.getUserObject());
            setText(item.getData(0).toString());
            HFImageLoader im = new HFImageLoader(this.getClass());
            if (item.isCanAdd()) {
                try {
                    setClosedIcon(im.getResizedImage(HFImageComponents.ADD, 15, 15, Image.SCALE_SMOOTH));
                    setOpenIcon(im.getResizedImage(HFImageComponents.CANCEL, 15, 15, Image.SCALE_SMOOTH));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            } else {
                setIcon(null);
            }
        } else {
            setIcon(null);
        }

        return this;

    }

}
