/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Flavio
 */
public class HFFormatter {

    public static final String TELEFONE_MASK = "#(##)####-####";
    public static final String TELEFONE_MASK_SP = "#(##)#####-####";
    public static final String CPF_MASK = "###.###.###-##";
    public static final String CNPJ_MASK = "##.###.###/####-##";
    public static final String CEP_MASK = "##.###-###";
    public static final String DECIMAL_OITO_CASAS = "#,##0.00000000";
    public static final String DECIMAL_DUAS_CASAS = "#,##0.00";

    /**
     * Converte String em Data.
     *
     * @param valor
     * @param data
     * @return
     * @throws ParseException
     */
    public static Date formataStringData(String valor, String data) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(data);
        return sdf.parse(valor);
    }

    /**
     * Converte data em String
     *
     * @param valor
     * @param data
     * @return
     * @throws ParseException
     */
    public static String formataDataString(Date valor, String data) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(data);
        return sdf.format(valor);
    }

    /**
     * Adiciona uma Mascara no campo.
     *
     * @param field
     * @param mask
     */
    public static void setMaskFormatedFieldNumber(JFormattedTextField field, String mask) throws ParseException {
        field.setFormatterFactory(null);
        javax.swing.text.MaskFormatter format = new javax.swing.text.MaskFormatter(mask);
        field.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(format));
        field.setValue(null);
        format = null;

    }

    /**
     * Remove a Mascara de cpf de uma string
     *
     * @param cpf
     * @return
     * @throws ParseException
     */
    public static Long RemoveCPFMask(String cpf) throws ParseException {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        return Long.parseLong(cpf);
    }

    /**
     * Adiciona a Mascara a uma string
     *
     * @param valor valor a ser mascarado.
     * @return
     * @throws ParseException
     */
    public static String setMaskString(String valor, String maskara) throws ParseException {
        javax.swing.text.MaskFormatter mask = new MaskFormatter(maskara);
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(LPAD(" ", valor, valor.length() - maskara.length()));
    }

    /**
     * Adiciona a Mascara a uma string
     *
     * @param valor valor a ser mascarado.
     * @return
     * @throws ParseException
     */
    public static String setMask(String valor, String maskara) throws ParseException {
        javax.swing.text.MaskFormatter mask = new MaskFormatter(maskara);
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(valor);
    }

    /**
     * Adiciona a Mascara a uma string
     *
     * @param valor valor a ser mascarado.
     * @return
     * @throws ParseException
     */
    public static String setMaskNumber(BigDecimal valor, String maskara) throws ParseException {
        javax.swing.text.NumberFormatter mask = new NumberFormatter(new DecimalFormat(maskara));
        return mask.valueToString(valor);
    }

    /**
     * Adiciona a Mascara a uma string
     *
     * @param valor valor a ser mascarado.
     * @return
     * @throws ParseException
     */
    public static String setMaskNumber(BigInteger valor, String maskara) throws ParseException {
        javax.swing.text.NumberFormatter mask = new NumberFormatter(new DecimalFormat(maskara));
        return mask.valueToString(valor);
    }

    /**
     * insere os caracteres a esquerda conforme o numero de casas
     *
     * @param caracter o caracter que sera inserido
     * @param palavra a palavra a ser formatada
     * @param casas o numero de casas total da string
     * @return
     */
    public static String LPAD(String caracter, String palavra, Integer casas) {
        if (casas == null) {
            return palavra;
        }
        int nuZeros = palavra == null ? casas : casas - (palavra + "").length();
        String lpad = "";

        for (int i = 0; i < nuZeros; i++) {
            lpad += caracter;
        }
        return lpad + palavra;
    }

    /**
     * insere os caracteres a Direita conforme o numero de casas
     *
     * @param caracter o caracter que sera inserido
     * @param palavra a palavra a ser formatada
     * @param casas o numero de casas total da string
     * @return
     */
    public static String RPAD(String caracter, String palavra, Integer casas) {
        if (casas == null) {
            return palavra;
        }
        int nuZeros = palavra == null ? casas : casas - (palavra).length();
        String rpad = "";
        for (int i = 0; i < nuZeros; i++) {
            rpad += caracter;
        }
        return palavra + rpad;
    }
}
