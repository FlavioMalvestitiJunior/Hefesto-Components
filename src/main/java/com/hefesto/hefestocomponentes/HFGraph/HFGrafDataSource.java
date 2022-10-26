/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFGraph;

import java.io.Serializable;

/**
 *
 * @author Flavio
 */
public class HFGrafDataSource implements Serializable {

    private Object eixoX;
    private Object serie;
    private Double valor;
    private Object Objeto;

    public HFGrafDataSource() {
    }

    public String getEixoXStr() {
        if (eixoX == null) {
            eixoX = "";
        }
        return eixoX.toString();
    }

    public void setEixoX(Object eixoX) {
        this.eixoX = eixoX;
    }

    public String getSerieStr() {
        return serie.toString();
    }

    public void setSerie(Object Serie) {
        this.serie = Serie;
    }

    public Object getEixoX() {
        return eixoX;
    }

    public Object getSerie() {
        return serie;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Object getObjeto() {
        return Objeto;
    }

    public void setObjeto(Object Objeto) {
        this.Objeto = Objeto;
    }

}
