/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hefesto.hefestocomponentes.HFDoInBackGround;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Flavio
 */
public class BackGroundPool {
     private ExecutorService executorService;
    private static BackGroundPool instance;
    /**
     * Construtor privato, essa classe e um Singleton
     * @see ExecutorService
     * @see Executors#newCachedThreadPool()
     */
    private BackGroundPool(){
        executorService = Executors.newCachedThreadPool();
    }
    /**
     * Inicia o Pool de threads de forma lenta, ou seja so inicia se ele nao estiver iniciado
     * @return BackgroundPool
     */
    public static BackGroundPool getInstance(){
        if(instance == null){
            instance = new BackGroundPool();
        }
        return instance;
    }
    /**
     * Recupera o ExecutorService
     * @return ExecutorService
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

}
