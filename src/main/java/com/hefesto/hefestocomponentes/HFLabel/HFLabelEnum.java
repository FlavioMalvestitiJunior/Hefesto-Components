/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hefesto.hefestocomponentes.HFLabel;

/**
 *
 * @author flavio
 */
public enum HFLabelEnum {
     ALERT_MESSAGE("alert"), ERROR_MESSAGE("cross"), SUCESS_MESSAGE("checkmark"), INFO_MESSAGE("info"), HELP_MESSAGE("help");

    private HFLabelEnum(String codigo) {
        this.codigo = codigo;
    }
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo + "";
    }
}
