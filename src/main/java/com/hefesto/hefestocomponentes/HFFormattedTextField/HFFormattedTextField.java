/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFFormattedTextField;

import com.hefesto.hefestocomponentes.HFImagenLoader.HFImageLoader;
import com.hefesto.hefestocomponentes.HFUtils.HFFormatter;
import com.hefesto.hefestocomponentes.HFUtils.HFImageComponents;
import com.hefesto.hefestocomponentes.HFUtils.Messages;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.math.BigInteger;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.BOTTOM;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.LEFT;
import static javax.swing.SwingConstants.RIGHT;
import static javax.swing.SwingConstants.TOP;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

/**
 *
 * @author Flavio
 */
public class HFFormattedTextField extends JFormattedTextField {

    /**
     * Creates new form HFFormattedTextField
     */
    private String mascara = "";
    JLabel error;
    HFImageLoader im;
    RoundedBalloonStyle balloonStyle;
    Border borda;
    Object valor;

    public HFFormattedTextField() {
        initComponents();
        error = new JLabel();
        error.setSize(27, 27);
        error.setVisible(false);
        error.setHorizontalAlignment(CENTER);
        error.setVerticalAlignment(CENTER);
        balloonStyle = new RoundedBalloonStyle(0, 0, Color.LIGHT_GRAY, Color.DARK_GRAY);
        im = new HFImageLoader(this.getClass());
        borda = this.getBorder();
        this.setLayout(new BorderLayout());
        this.add(error, BorderLayout.EAST);
        this.setFocusLostBehavior(JFormattedTextField.PERSIST);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMinimumSize(new java.awt.Dimension(10, 28));
        setPreferredSize(new java.awt.Dimension(10, 28));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        try {
            this.mascara = mascara;
            this.setFormatterFactory(null);
            javax.swing.text.MaskFormatter format = new javax.swing.text.MaskFormatter(mascara);
            this.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(format));
            this.setValue(null);
            format = null;
        } catch (Exception ex) {
        }
    }

    public void setValor(Object valor) {
        try {
            this.setValue(HFFormatter.setMask(valor.toString(), mascara));
            this.valor = valor;
        } catch (Exception ex) {
        }
    }

    public void setValorComZerosRPAD(Object valor, int tamanho) {
        try {
            this.setValue(HFFormatter.setMask(HFFormatter.RPAD("0", valor.toString(), tamanho), mascara));
            this.valor = valor;
        } catch (Exception ex) {
        }
    }

    public void setValorComZerosLPAD(Object valor, int tamanho) {
        try {
            this.setValue(HFFormatter.setMask(HFFormatter.LPAD("0", valor.toString(), tamanho), mascara));
            this.valor = valor;
        } catch (Exception ex) {
        }
    }

    public void setValorPreenchidoRPAD(Object valor, int tamanho, String preenchimento) {
        try {
            this.setValue(HFFormatter.setMask(HFFormatter.RPAD(preenchimento, valor.toString(), tamanho), mascara));
            this.valor = valor;
        } catch (Exception ex) {
        }
    }

    public void setValorPreenchidoLPAD(Object valor, int tamanho, String preenchimento) {
        try {
            this.setValue(HFFormatter.setMask(HFFormatter.LPAD(preenchimento, valor.toString(), tamanho), mascara));
            this.valor = valor;
        } catch (Exception ex) {
        }
    }

    /**
     * Valida Simples sem Chkmark
     *
     * @return
     */
    public Boolean Valida() {
        return Valida(false);
    }

    /**
     * Valida se o campo não esta em branco.
     *
     * @param chkmark
     * @return
     */
    public Boolean Valida(Boolean chkmark) {
        try {
            if (chkmark) {
                error.setIcon(im.getResizedImage(HFImageComponents.CHECKMARK, 21, 21, Image.SCALE_SMOOTH));
                error.setVisible(true);
            }
            if (this.getValorString().isEmpty()) {
                BalloonTip ballon = new BalloonTip(HFFormattedTextField.this,
                        Messages.getMessage("hfformattedTextField.valida.branco"),
                        balloonStyle, false);
                TimingUtils.showTimedBalloon(ballon, 3000);
                error.setIcon(im.getResizedImage(HFImageComponents.CROSS, 21, 21, Image.SCALE_SMOOTH));
                error.setVisible(true);
                Insets i = this.getMargin();
                this.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.RED),
                        BorderFactory.createEmptyBorder(TOP + 2, LEFT + 2,
                                BOTTOM + 2, RIGHT + 2)));
                this.setMargin(i);
                return false;
            }

            this.setBorder(borda);
            return true;
        } catch (Exception ex) {
            this.setBorder(new LineBorder(Color.RED));
            return false;
        }
    }

    /**
     * Mostra a Mensagem personalizada para validação.
     *
     * @param chkmark
     * @param valida
     * @param msg
     * @return
     * @throws Exception
     */
    public Boolean ValidaMSG(Boolean chkmark, Boolean valida, String msg) throws Exception {
        if (!valida) {
            BalloonTip ballon = new BalloonTip(this, Messages.getMessage(msg), balloonStyle, false);
            TimingUtils.showTimedBalloon(ballon, 3000);
            this.setBorder(new LineBorder(Color.RED));
            error.setIcon(im.getResizedImage(HFImageComponents.CROSS, 21, 21, Image.SCALE_SMOOTH));
            error.setVisible(true);
            return false;
        }
        if (chkmark) {
            error.setIcon(im.getResizedImage(HFImageComponents.CHECKMARK, 21, 21, Image.SCALE_SMOOTH));
            error.setVisible(true);
        }
        this.setBorder(borda);
        return true;
    }

    public String getValorString() {
        try {
            String texto = this.getText();
            for (char chara : mascara.toCharArray()) {
                if (chara != '0') {
                    texto = texto.replace(chara + "", "");
                }
            }

            return texto;
        } catch (Exception ex) {
            ex.printStackTrace();
            return this.getText();
        }
    }

    public Object getValor() {
        if (valor != null) {
            return valor;
        } else {
            return getValorString();
        }
    }

    public BigInteger getValorBigint() {
        try {
            BigInteger num = new BigInteger(getValorString());
            return num;
        } catch (Exception e) {
            return BigInteger.ZERO;
        }
    }

    public void limpar() {
        this.setText("");
        this.setValue(null);
        this.setBorder(borda);
        this.error.setVisible(false);
    }
}
