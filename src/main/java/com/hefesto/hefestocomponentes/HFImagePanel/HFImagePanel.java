/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFImagePanel;

import com.google.common.collect.Lists;
import com.hefesto.hefestocomponentes.HFBaloon.HFBallonUtil;
import com.hefesto.hefestocomponentes.HFImagenLoader.HFImageLoader;
import com.hefesto.hefestocomponentes.HFUtils.HFImageComponents;
import com.hefesto.hefestocomponentes.HFUtils.Messages;
import com.hefesto.hefestocomponentes.HFUtils.ZipUtil;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author flavio
 */
public class HFImagePanel extends org.jdesktop.swingx.JXImageView {

    /**
     * Creates new form HFImagePanel
     */
    private List<ImageIcon> imagens;
    Integer idx = -1;

    public HFImagePanel() {
        initComponents();
        imagens = Lists.newArrayList();
        zoomButtom.setSelected(false);
        zoomBar.setVisible(zoomButtom.isSelected());
        adicionarMenu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        fastRewind = new javax.swing.JButton();
        rewind = new javax.swing.JButton();
        next = new javax.swing.JButton();
        fastFoward = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        zoomButtom = new javax.swing.JToggleButton();
        zoomBar = new javax.swing.JSlider();

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setOpaque(false);

        fastRewind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fastrewind.png"))); // NOI18N
        fastRewind.setToolTipText("Fast Back");
        fastRewind.setEnabled(false);
        fastRewind.setOpaque(false);
        fastRewind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastRewindActionPerformed(evt);
            }
        });
        jToolBar1.add(fastRewind);

        rewind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rewind.png"))); // NOI18N
        rewind.setToolTipText("Back");
        rewind.setEnabled(false);
        rewind.setOpaque(false);
        rewind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewindActionPerformed(evt);
            }
        });
        jToolBar1.add(rewind);

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/foward.png"))); // NOI18N
        next.setToolTipText("Next");
        next.setEnabled(false);
        next.setOpaque(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jToolBar1.add(next);

        fastFoward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fastfoward.png"))); // NOI18N
        fastFoward.setToolTipText("Fast Foward");
        fastFoward.setEnabled(false);
        fastFoward.setOpaque(false);
        fastFoward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastFowardActionPerformed(evt);
            }
        });
        jToolBar1.add(fastFoward);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addMini.png"))); // NOI18N
        jButton5.setToolTipText("Adicionar");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setOpaque(false);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close.png"))); // NOI18N
        remove.setToolTipText("Remover");
        remove.setEnabled(false);
        remove.setFocusable(false);
        remove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        remove.setOpaque(false);
        remove.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jToolBar1.add(remove);

        zoomButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoomMini.png"))); // NOI18N
        zoomButtom.setToolTipText("Zoom");
        zoomButtom.setFocusPainted(false);
        zoomButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomButtomActionPerformed(evt);
            }
        });
        jToolBar1.add(zoomButtom);

        zoomBar.setMaximum(2000);
        zoomBar.setMinimum(1);
        zoomBar.setOrientation(javax.swing.JSlider.VERTICAL);
        zoomBar.setToolTipText("Zoom");
        zoomBar.setOpaque(false);
        zoomBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                zoomBarStateChanged(evt);
            }
        });
        zoomBar.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                zoomBarMouseWheelMoved(evt);
            }
        });
        zoomBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zoomBarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                zoomBarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zoomBar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomBar, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser jc = new JFileChooser();
        if (jc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File f = jc.getSelectedFile();
            if (f != null) {
                ImageIcon icon = new ImageIcon(f.getAbsolutePath());
                this.setImage(icon.getImage());
                imagens.add(icon);

                if (!imagens.isEmpty() && imagens.size() > 1) {
                    fastFoward.setEnabled(false);
                    next.setEnabled(false);
                    rewind.setEnabled(true);
                    fastRewind.setEnabled(true);
                }
                remove.setEnabled(true);
                idx++;
                zoomBar.setValue(100);
            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void zoomBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_zoomBarStateChanged
        this.setScale(Double.parseDouble(zoomBar.getValue() + "") / 100);
    }//GEN-LAST:event_zoomBarStateChanged

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        if (!imagens.isEmpty()) {
            imagens.remove(imagens.get(idx));
            idx--;
            if (idx > -1) {
                this.setImage(imagens.get(idx).getImage());
            } else if (!imagens.isEmpty()) {
                idx = 0;
                this.setImage(imagens.get(idx).getImage());
            } else {
                try {
                    this.setImage(new File(""));
                } catch (Exception ex) {
                }
            }
            if (idx == imagens.size() - 1) {
                fastFoward.setEnabled(false);
                next.setEnabled(false);
            }
            if (idx == 0) {
                rewind.setEnabled(false);
                fastRewind.setEnabled(false);
            }
            if (imagens.isEmpty()) {
                remove.setEnabled(false);
            }
        }
        zoomBar.setValue(100);
    }//GEN-LAST:event_removeActionPerformed

    private void fastRewindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastRewindActionPerformed
        if (idx > 0) {
            idx = 0;
            this.setImage(imagens.get(idx).getImage());
            rewind.setEnabled(false);
            fastRewind.setEnabled(false);
        }
        if (imagens.size() > 1) {
            fastFoward.setEnabled(true);
            next.setEnabled(true);
        }
        zoomBar.setValue(100);
    }//GEN-LAST:event_fastRewindActionPerformed

    private void rewindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewindActionPerformed
        if (idx - 1 > -1) {
            idx--;
            this.setImage(imagens.get(idx).getImage());
            if (idx - 1 == -1) {
                rewind.setEnabled(false);
                fastRewind.setEnabled(false);
            }
            if (imagens.size() > 1) {
                fastFoward.setEnabled(true);
                next.setEnabled(true);
            }
        }
        zoomBar.setValue(100);
    }//GEN-LAST:event_rewindActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (idx + 1 < imagens.size()) {
            idx++;
            this.setImage(imagens.get(idx).getImage());
            if (idx + 1 == imagens.size()) {
                fastFoward.setEnabled(false);
                next.setEnabled(false);
            }
            if (imagens.size() > 1) {
                rewind.setEnabled(true);
                fastRewind.setEnabled(true);
            }
        }
        zoomBar.setValue(100);
    }//GEN-LAST:event_nextActionPerformed

    private void fastFowardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastFowardActionPerformed
        if (imagens.size() > 1) {
            idx = imagens.size() - 1;
            this.setImage(imagens.get(idx).getImage());
            fastFoward.setEnabled(false);
            next.setEnabled(false);

            if (idx > 0) {
                rewind.setEnabled(true);
                fastRewind.setEnabled(true);
            }
        }
        zoomBar.setValue(100);
    }//GEN-LAST:event_fastFowardActionPerformed

    private void zoomBarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zoomBarMouseEntered

    }//GEN-LAST:event_zoomBarMouseEntered

    private void zoomBarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zoomBarMouseExited

    }//GEN-LAST:event_zoomBarMouseExited

    private void zoomBarMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_zoomBarMouseWheelMoved
        Integer wheel = evt.getWheelRotation();
        if (wheel > 0) {
            if (zoomBar.getValue() + 25 <= zoomBar.getMaximum()) {
                zoomBar.setValue(zoomBar.getValue() + 25);
            } else {
                zoomBar.setValue(zoomBar.getMaximum());
            }
        } else {
            if (zoomBar.getValue() - 25 >= zoomBar.getMinimum()) {
                zoomBar.setValue(zoomBar.getValue() - 25);
            } else {
                zoomBar.setValue(zoomBar.getMinimum());
            }
        }

    }//GEN-LAST:event_zoomBarMouseWheelMoved

    private void zoomButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomButtomActionPerformed
        zoomBar.setVisible(zoomButtom.isSelected());
    }//GEN-LAST:event_zoomButtomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fastFoward;
    private javax.swing.JButton fastRewind;
    private javax.swing.JButton jButton5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton next;
    private javax.swing.JButton remove;
    private javax.swing.JButton rewind;
    private javax.swing.JSlider zoomBar;
    private javax.swing.JToggleButton zoomButtom;
    // End of variables declaration//GEN-END:variables
public List<ImageIcon> getImagens() {
        return imagens;
    }

    public byte[] getImagensAsByte() throws Exception {
        return ZipUtil.Compactar(imagens);
    }

    public void setImagens(List<ImageIcon> imagens) {
        this.imagens = imagens;
        if (!this.imagens.isEmpty()) {
            this.setImage(this.imagens.get(0).getImage());
            idx = 0;
            fastRewind.setEnabled(false);
            rewind.setEnabled(false);
            remove.setEnabled(true);
            if (this.imagens.size() > 1) {
                fastFoward.setEnabled(true);
                next.setEnabled(true);

            }
        }
    }

    public void Limpar() {
        imagens = Lists.newArrayList();
        fastFoward.setEnabled(false);
        next.setEnabled(false);
        rewind.setEnabled(false);
        fastRewind.setEnabled(false);
        remove.setEnabled(false);
        try {
            this.setImage(new File(""));
        } catch (Exception ex) {
        }
        zoomBar.setValue(100);
    }

    private void adicionarMenu() {
        JPopupMenu menu = new JPopupMenu();
        try {
            JMenuItem it = new JMenuItem("Salvar Imagen", new HFImageLoader(this.getClass()).getImagen(HFImageComponents.EXPORTAR_IMAGE));
            it.addActionListener(salvarImagen());
            menu.add(it);
            this.setComponentPopupMenu(menu);
        } catch (Exception ex) {

        }
    }

    private ActionListener salvarImagen() {
        ActionListener list = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!imagens.isEmpty()) {
                    JFileChooser jc = new JFileChooser();
                    if (jc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                        File f = jc.getSelectedFile();
                        if (f != null) {
                            try {
                                Image in = imagens.get(idx).getImage();
                                int w = in.getWidth(null);
                                int h = in.getHeight(null);
                                int type = BufferedImage.TYPE_INT_ARGB_PRE;
                                BufferedImage out = new BufferedImage(w, h, type);
                                Graphics2D g2 = out.createGraphics();
                                g2.drawImage(in, 0, 0, null);
                                g2.dispose();
                                ImageIO.write(out, "PNG", f);
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        } else {
                            System.out.println("null");
                        }

                    }
                }
            }
        };
        return list;
    }

    public boolean valida() {
        if (imagens.isEmpty()) {
            HFBallonUtil.showTimedBallon(this, Messages.getMessage("hfimagepanel.valida"), null);
            return false;
        }
        return true;
    }
}
