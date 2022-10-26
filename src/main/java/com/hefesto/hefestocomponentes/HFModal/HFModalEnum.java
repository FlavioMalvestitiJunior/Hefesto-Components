/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFModal;

/**
 *
 * @author flavio
 */
public enum HFModalEnum {

    ALERT_MODAL("alert"), CANCEL_MODAL("cancel"), QUESTION_MODAL("help"), INFO_MODAL("info");

    private HFModalEnum(String codigo) {
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
