/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hefesto.hefestocomponentes.HFLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe que centraliza os logs para economizar código
 * @author Rafael Felix
 * @version 1.1
 */
public class LoggerUtil {
    private static Logger logger = null;
    /**
     * Faz log de uma informação
     * @param msg - mensagem a ser logada
     * @since 1.0
     */
    public static void info(String msg){
        getInstance().info(msg);
    }
    /**
     * Faz log de um warning
     * @param msg - mensagem a ser logada
     * @since 1.0
     */
    public static void warning(String msg){
        log(Level.WARNING, msg);
    }
    /**
     * Faz log de um erro
     * @param exception - Exceção que causou o crash
     * @since 1.0
     */
    public static void severe(Throwable exception){
        log(Level.SEVERE, exception.getMessage(), exception);
    }
    /**
     * Log generico
     * @param level
     * @param msg - mensagem a ser logada
     * @since 1.0
     */
    public static void log(Level level, String msg){
        getInstance().log(level, msg);
    }
    /**
     * Log de um exception.
     * @param level - level do log
     * @param msg - mensagem do log
     * @param exception - exceção lançada
     */
    public static void log(Level level, String msg, Throwable exception){
        getInstance().log(level, msg, exception);
    }
    /**
     * Recupera a instancia padrão do Log
     * @return Logger
     */
    public static Logger getInstance(){
        if(logger == null){
            logger = Logger.getLogger("com.hefesto.log");
        }
        return logger;
    }
}
