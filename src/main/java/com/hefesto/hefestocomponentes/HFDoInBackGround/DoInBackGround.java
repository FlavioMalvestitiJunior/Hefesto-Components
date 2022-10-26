/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hefesto.hefestocomponentes.HFDoInBackGround;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *
 * @author Flavio
 */
public abstract class DoInBackGround<K> {
    FutureTask<K> task;
      private BackgroundTaskState state;
    /**
     * Construtor padrao, Cria uma nova tarefa.
     * @see Callable#call()
     */
    public DoInBackGround() {
        state = BackgroundTaskState.WAITING;
        task = new FutureTask<K>(new Callable<K>() {

            @Override
            public K call() throws Exception {
                if(state.equals(BackgroundTaskState.WAITING)){
                    state = BackgroundTaskState.RUNNING;
                    return doInBackground();
                }
                return null;
            }
        });
    }
    /**
     * Implementacao que sera executada em background pela FutureTask
     * @return V
     * @see Callable#call()
     * @see FutureTask#run() 
     */
    public abstract K doInBackground();
    /**
     * Retorna se a tarefa esta terminada
     * @return Boolean
     */
    public Boolean isDone(){
        return task.isDone();
    }
    /**
     * Retorna se a tarefa esta cancelada
     * @return Boolean
     */
    public Boolean isCancelled(){
        return task.isCancelled();
    }
    /**
     * Recupera o valor de retorno da task.</p>
     * Se a task ainda esta rodando ele vai parar o sistema</p>
     * Caso ocorra um erro da thread nao parar ou na execucao retorna null
     * @return V
     */
    public K get(){
        try {
            return task.get();
        } catch (InterruptedException ex) {
            return null;
        } catch (ExecutionException ex) {
            return null;
        }
    }
    /**
     * Executa a task definida no Pool de threads
     * @see BackgroundPool
     * @see ExecutorService#execute(java.lang.Runnable) 
     */
    public void execute(){
        BackGroundPool.getInstance().
                getExecutorService().execute(task);
    }
    /**
     * Tenta cancelar a work rodando em background
     * @param cancelIfRunning
     * @return true or false
     * @see FutureTask#cancel(boolean) 
     */
    public boolean cancel(boolean cancelIfRunning){
        return task.cancel(cancelIfRunning);
    }

    /**
     * Enum que contem o status atual da thread
     */
    private static enum BackgroundTaskState{
        WAITING, RUNNING;
    }
}
