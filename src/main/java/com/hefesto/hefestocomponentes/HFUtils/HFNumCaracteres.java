/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFUtils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Flavio
 */
/**
 * faz algumas validações para os documentos dos textefield
 *
 * @author Flavio
 */
public class HFNumCaracteres extends PlainDocument {

    public HFNumCaracteres() {
        super();
    }

    private int iMaxLength;
    private boolean iUpper;
    private boolean iNumber;
    private boolean iPrimMaiuscula;

    public int getiMaxLength() {
        return iMaxLength;
    }

    public void setiMaxLength(int iMaxLength) {
        this.iMaxLength = iMaxLength;
    }

    public boolean isiUpper() {
        return iUpper;
    }

    public void setiUpper(boolean iUpper) {
        this.iUpper = iUpper;
    }

    public boolean isiNumber() {
        return iNumber;
    }

    public void setiNumber(boolean iNumber) {
        this.iNumber = iNumber;
    }

    public boolean isiPrimMaiuscula() {
        return iPrimMaiuscula;
    }

    public void setiPrimMaiuscula(boolean iPrimMaiuscula) {
        this.iPrimMaiuscula = iPrimMaiuscula;
    }

    /**
     * Aqui a magia Disney Acontece, faz o filtro pelos parametros necessarios.
     *
     * @param offs
     * @param str
     * @param a
     * @throws BadLocationException
     */
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (isiUpper()) {
            str = str.toUpperCase();
        } else if (isiPrimMaiuscula()) {
            if (getLength() == 0) {
                String strParte = str.substring(0, 1).toUpperCase();
                str = strParte + str.substring(1);
            }
        }
        if (isiNumber()) {
            try {
                Float val = Float.parseFloat(str);
            } catch (Exception e) {
                return;
            }
        }

        if ((iMaxLength <= 0)) // aceitara qualquer no. de caracteres
        {
            super.insertString(offs, str, a);
            return;
        }

        int ilen = (getLength() + str.length());
        if (ilen <= iMaxLength) // se o comprimento final for menor...
        {
            super.insertString(offs, str, a);   // ...aceita str
        }
    }
}
