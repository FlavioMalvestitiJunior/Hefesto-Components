/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hefesto.hefestocomponentes.HFBaloon;

import javax.swing.JComponent;
import javax.swing.JLabel;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.utils.TimingUtils;

/**
 * 
 * @author Flavio
 */
public class HFBalloonTipUtil {
    /**
     * N�o pode ser instanciado
     */
    private HFBalloonTipUtil(){}

    /**
     * Gerencia valida��es e mostra o componente na tela
     * @param balloonMessage <code>String</code> a ser adicionada no componente, pode ser null
     * @param balloon <code>BalloonTip</code> bal�o a ser mostrado
     * @param component <code>JComponent</code> que contem o bal�o
     * @param time <code>Integer</code> tempo que o bal�o ficar� visivel, pode ser null
     */
    public static void showBalloon(String balloonMessage, BalloonTip balloon, JComponent component, Integer time){
        if(balloonMessage != null && !balloonMessage.equals("")){
            balloon.setContents(new JLabel(balloonMessage));
            /*if(!balloonMessage.equals(balloon.getText())){
                balloon.setText(balloonMessage);
            }*/
            if(time != null && time != 0){
                TimingUtils.showTimedBalloon(balloon, time);
            }else{
                balloon.setVisible(true);
            }
        }
    }

    /**
     * Esconde o bal�o da tela
     * @param balloon <code>BalloonTip</code> bal�o a ser escondido
     */
    public static void hideBalloon(BalloonTip balloon){
        if(balloon != null && balloon.isVisible()){
            balloon.setVisible(false);
        }
    }

}
