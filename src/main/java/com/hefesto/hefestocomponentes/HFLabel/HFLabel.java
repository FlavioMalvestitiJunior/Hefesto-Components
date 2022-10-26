/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFLabel;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author flavio
 */
public class HFLabel extends javax.swing.JLabel {

    /**
     * Creates new form HFLabel
     */
    public HFLabel() {
        initComponents();
    }
    
    public void setMessage(String message, HFLabelEnum tipoMessage) throws Exception {
        this.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/imagens/" + tipoMessage.getCodigo() + ".png").getPath()).getImage().getScaledInstance(22, 22, Image.SCALE_SMOOTH)));
        this.setText(message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(6, 28));
        setPreferredSize(new java.awt.Dimension(28, 28));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public void limpar() {
        this.setIcon(null);
        this.setText("");
    }
}