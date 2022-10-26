/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFNotification;

import java.util.List;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author flavio
 */
public class HFNotification extends Observable {

    private List<HFNotificaObjeto> lista = new CopyOnWriteArrayList<>();
    private static HFNotification HFNot;
    private boolean iterar = true;
    private boolean keepRunning = true;
    private static ExecutorService threadPool;

    public static HFNotification getInstance() {
        if (HFNot == null) {
            HFNot = new HFNotification();
            threadPool = Executors.newFixedThreadPool(1);
//  HFNot.running();
        }
        return HFNot;
    }

    public void notificarSO(int timeShow, String msgTitle, String msgBody, String imgPath) {
        notificar(timeShow, msgTitle, msgBody, imgPath);
    }

    public void notificarSO(int timeShow, String msgTitle, String msgBody) {
        notificar(timeShow, msgTitle, msgBody, "");
    }

    public void notificarSO(int timeShow, String msgTitle) {
        notificar(timeShow, msgTitle, "", "");
    }

    public void notificarSO(String msgTitle) {
        notificar(1000, msgTitle, "", "");
    }

    private void notificar(int timeShow, String msgTitle, String msgBody, String imgPath) {
        HFNotificaObjeto obj = new HFNotificaObjeto();

        obj.setImgPath(imgPath);
        obj.setMessage(msgBody + lista.size());
        obj.setTitulo(msgTitle);
        obj.setTimeShow(timeShow);
        threadPool.execute(obj);
        iterar = false;
        lista.add(obj);
        obj = null;
    }

    public void notificationClose(HFNotificaObjeto obj) {
        lista.remove(obj);
        iterar = true;
    }
}
