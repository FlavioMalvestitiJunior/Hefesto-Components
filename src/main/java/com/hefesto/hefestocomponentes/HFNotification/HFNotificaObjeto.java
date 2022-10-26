/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFNotification;

import java.io.Serializable;
import java.util.Observable;

/**
 *
 * @author Flavio
 */
public class HFNotificaObjeto extends Observable implements Serializable, Runnable {

    private String titulo;
    private String message;
    private String imgPath;
    private Integer timeShow;

    public HFNotificaObjeto() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getTimeShow() {
        return timeShow;
    }

    public void setTimeShow(Integer timeShow) {
        this.timeShow = timeShow;
    }

    @Override
    public void run() {
        HFNotficationPanel not = new HFNotficationPanel();
        try {
                       
            addObserver(not);
            setChanged();
            notifyObservers(this);
            deleteObservers();
            Thread.sleep(this.getTimeShow());
            HFNotification.getInstance().notificationClose(this);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        not.dispose();
    }

}
