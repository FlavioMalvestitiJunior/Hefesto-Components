/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFNumberField;

import com.hefesto.hefestocomponentes.HFUtils.HFFormatter;
import com.hefesto.hefestocomponentes.HFUtils.Messages;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.awt.BorderLayout;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

/**
 *
 * @author Flavio
 */
public class HFNumberField extends JFormattedTextField {

    /**
     * Creates new form HFNumbreField
     */
    Boolean moeda = false;
    private String mascara = "";
    Border borda;
    int numeroCasa = 0;
    private java.text.NumberFormat moedas = java.text.NumberFormat.getCurrencyInstance();

    public HFNumberField() {
        initComponents();
        borda = this.getBorder();
        this.setFocusLostBehavior(JFormattedTextField.PERSIST);
    }

    /**
     * Pega o valor do campo em Double
     *
     * @return
     */
    public BigDecimal getValor() {
        String val = this.getText();
        if (val.isEmpty()) {
            return null;
        }
        val = val.replaceAll("\\.", "");
        val = val.replaceAll(",", ".");
        return new BigDecimal(val);
    }

    /**
     * pega o Valor do campo em Integer
     */
    public Integer getIntValor() {
        return this.getValor() != null ? this.getValor().intValue() : null;
    }

    /**
     * Pega o valor do Campo em BigDecimal
     *
     * @return
     */
    public BigDecimal getBigValor() {
        return this.getValor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        setPreferredSize(new java.awt.Dimension(10, 28));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        this.setBorder(borda);
    }//GEN-LAST:event_formFocusGained

    public Boolean isMoeda() {
        return moeda;
    }

    /**
     * Define se o Campo é do tipo monetário
     *
     * @param moeda
     */
    public void setMoeda(Boolean moeda) {
        if (moeda) {
            setLayout(new BorderLayout());
            JLabel jlabelrs = new JLabel(moedas.getCurrency().getSymbol());
            jlabelrs.setSize(this.getSize().height, this.getSize().height);
            this.add(jlabelrs, BorderLayout.WEST);
        }
        this.borda = this.getBorder();
        this.moeda = moeda;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * Define o numero de Casas Decimais da Mascara do Campo
     *
     * @param numeroCasa
     */
    public void setNumeroCasa(int numeroCasa) {
        System.out.println("|" + numeroCasa);
        try {
            String nuCasa = "#,##0";
            if (numeroCasa > 0) {
                nuCasa += ".";
                for (int i = 0; i < numeroCasa; i++) {
                    nuCasa += "0";
                }
            }
            System.out.println(nuCasa + "|" + numeroCasa);
            this.mascara = nuCasa;
            this.numeroCasa = numeroCasa;
            java.text.DecimalFormat decimal = new DecimalFormat(mascara);
            DecimalFormatSymbols dfs = new DecimalFormatSymbols();
            dfs.setDecimalSeparator(',');
            dfs.setGroupingSeparator('.');
            decimal.setDecimalFormatSymbols(dfs);
            decimal.setMaximumIntegerDigits(12);
            javax.swing.text.NumberFormatter numFormatter = new javax.swing.text.NumberFormatter(decimal);

            try {
                numFormatter.setFormat(decimal);
                numFormatter.setAllowsInvalid(false);
                numFormatter.setCommitsOnValidEdit(true);
                this.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(numFormatter));
                this.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            } finally {
                decimal = null;
                numFormatter = null;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Valida se o Campo não é Nulo
     *
     * @return
     */
    public Boolean Valida() {
        if (this.getText().isEmpty() || this.getValor() == null) {
            RoundedBalloonStyle ballonStyle = new RoundedBalloonStyle(WIDTH, HEIGHT, Color.LIGHT_GRAY, Color.DARK_GRAY);
            BalloonTip balloon = new BalloonTip(HFNumberField.this, Messages.getMessage("valor.nullo"), ballonStyle, false);
            TimingUtils.showTimedBalloon(balloon, 3000);
            this.setBorder(new LineBorder(Color.red));
            return false;
        }
        this.setBorder(borda);
        return true;
    }

    /**
     * Valida se o Campo não é Zerado
     *
     * @return
     */
    public Boolean ValidaDiferenteZero() {
        if (this.Valida()) {
            if (this.getValor().compareTo(BigDecimal.ZERO) == 0) {
                RoundedBalloonStyle ballonStyle = new RoundedBalloonStyle(WIDTH, HEIGHT, Color.LIGHT_GRAY, Color.DARK_GRAY);
                BalloonTip balloon = new BalloonTip(HFNumberField.this, Messages.getMessage("valor.zerado"), ballonStyle, false);
                TimingUtils.showTimedBalloon(balloon, 3000);
                this.setBorder(new LineBorder(Color.red));
                return false;
            }
            this.setBorder(borda);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Valida se o Valor é maior que Zero
     *
     * @return
     */
    public Boolean ValidaMaiorZero() {
        if (Valida()) {
            if (this.getValor().compareTo(BigDecimal.ZERO) < 0) {
                RoundedBalloonStyle ballonStyle = new RoundedBalloonStyle(WIDTH, HEIGHT, Color.LIGHT_GRAY, Color.DARK_GRAY);
                BalloonTip balloon = new BalloonTip(HFNumberField.this, Messages.getMessage("valor.maior.zero"), ballonStyle, false);
                TimingUtils.showTimedBalloon(balloon, 3000);
                this.setBorder(new LineBorder(Color.red));
                return false;
            }
            this.setBorder(borda);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Valida se o Valor é menor que Zero
     *
     * @return
     */
    public Boolean ValidaMenorZero() {
        if (Valida()) {
            if (this.getValor().compareTo(BigDecimal.ZERO) < 0) {
                RoundedBalloonStyle ballonStyle = new RoundedBalloonStyle(WIDTH, HEIGHT, Color.LIGHT_GRAY, Color.DARK_GRAY);
                BalloonTip balloon = new BalloonTip(HFNumberField.this, Messages.getMessage("valor.maior.zero"), ballonStyle, false);
                TimingUtils.showTimedBalloon(balloon, 3000);
                this.setBorder(new LineBorder(Color.red));
                return false;
            }
            this.setBorder(borda);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Valida se maior que valor passado
     *
     * @param valorPassado
     * @return
     */
    public Boolean ValidaMaiorValor(BigDecimal valorPassado) {
        if (Valida()) {
            if (getValor().compareTo(valorPassado) < 0) {
                RoundedBalloonStyle ballonStyle = new RoundedBalloonStyle(WIDTH, HEIGHT, Color.LIGHT_GRAY, Color.DARK_GRAY);
                BalloonTip balloon = new BalloonTip(HFNumberField.this, Messages.getMessage("valor.menor.passado", valorPassado + ""), ballonStyle, false);
                TimingUtils.showTimedBalloon(balloon, 3000);
                this.setBorder(new LineBorder(Color.red));
                return false;
            }
            this.setBorder(borda);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Valida se menor que valor passado
     *
     * @param valorPassado
     * @return
     */
    public Boolean ValidaMenorValor(BigDecimal valorPassado) {
        if (Valida()) {
            if (getValor().compareTo(valorPassado) > 0) {
                RoundedBalloonStyle ballonStyle = new RoundedBalloonStyle(WIDTH, HEIGHT, Color.LIGHT_GRAY, Color.DARK_GRAY);
                BalloonTip balloon = new BalloonTip(HFNumberField.this, Messages.getMessage("valor.maior.passado", valorPassado + ""), ballonStyle, false);
                TimingUtils.showTimedBalloon(balloon, 3000);
                this.setBorder(new LineBorder(Color.red));
                return false;
            }
            this.setBorder(borda);
            return true;
        } else {
            return false;
        }
    }

    public BigInteger getBigIntValor() {
        try {
            BigInteger valorInt = new BigInteger(this.getValor() + "");
            return valorInt;
        } catch (Exception ex) {
            return null;
        }
    }

    public void setBigIntValor(BigInteger valor) {
        try {
            if (mascara.isEmpty()) {
                this.setText(valor + "");
            } else {
                this.setText(HFFormatter.setMask(valor + "", mascara));
            }
        } catch (Exception ex) {
            printStackTrace();
            this.setText(valor + "");
        }
    }

    public void setBigDecimalValor(BigDecimal valor) {
        try {

            this.setValue(valor);
        } catch (Exception ex) {
            this.setText(valor + "");
        }
    }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


