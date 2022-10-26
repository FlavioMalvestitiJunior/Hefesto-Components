/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFBaloon;

import com.hefesto.hefestocomponentes.HFUtils.ImageIconUtil;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;
import net.java.balloontip.utils.TimingUtils;

/**
 * Classe utilitaria, cria um bal�o com as op��es padr�es para mostrar na tela
 *
 * @author Rafael Felix
 * @author Fabricio Bizotto. Ajustado para quando criar um balloon com
 * componente fechar o anterior.
 * @version 1.0
 */
public class HFBallonUtil {

    private static HFBalloon hfBalloon;
    private static HFBalloon hfBalloon2;
    private static HFBalloon hfBalloon3;
    private static RoundedBalloonStyle balloonStyle;

    /**
     * Cria um ballontip usando o padr�o
     *
     * @param comp (JComponent) que vai mostrar a mensagem
     * @param mensage a ser mostrada
     * @param image icone do bal�o (pode ser null)
     * @return HFBalloon
     * @since 1.0
     */
    public static HFBalloon createBallon(JComponent comp, String mensage, Icon image) {
        balloonStyle = new RoundedBalloonStyle(0, 0, Color.LIGHT_GRAY, Color.DARK_GRAY);
        if (hfBalloon2 != null) {
            hfBalloon2.closeBalloon();
        }
        hfBalloon2 = new HFBalloon(comp, mensage, balloonStyle, BalloonTip.Orientation.LEFT_ABOVE, BalloonTip.AttachLocation.ALIGNED, image);
        hfBalloon2.setVisible(true);
        hfBalloon2.updateUI();
        return hfBalloon2;
    }

    /**
     * Cria um ballontip usando o padr�o. Permite fechar o botao
     *
     * @param comp (JComponent) que vai mostrar a mensagem
     * @param mensage a ser mostrada
     * @param image icone do bal�o (pode ser null)
     * @return HFBalloon
     * @since 1.0
     */
    public static HFBalloon createBallonClosable(JComponent comp, String mensage, Icon image) {
        balloonStyle = new RoundedBalloonStyle(0, 0, Color.LIGHT_GRAY, Color.DARK_GRAY);
        if (hfBalloon3 != null) {
            hfBalloon3.closeBalloon();
        }
        hfBalloon3 = new HFBalloon(comp, mensage, balloonStyle, BalloonTip.Orientation.LEFT_ABOVE, BalloonTip.AttachLocation.ALIGNED, image);
        JButton closeButton = new JButton();
        closeButton.setIcon(ImageIconUtil.loadImage("cross.png"));
        closeButton.setBorderPainted(false);
        hfBalloon3.setCloseButton(closeButton);
        hfBalloon3.setVisible(true);
        return hfBalloon3;
    }

    public static HFBalloon createBallonComponente(JComponent comp, JComponent mensage) {
        balloonStyle = new RoundedBalloonStyle(0, 0, Color.LIGHT_GRAY, Color.DARK_GRAY);
        if (hfBalloon != null) {
            hfBalloon.closeBalloon();
        }
        hfBalloon = new HFBalloon(comp, mensage, balloonStyle, BalloonTip.Orientation.LEFT_ABOVE, BalloonTip.AttachLocation.ALIGNED);
        return hfBalloon;
    }

    /**
     * Mostra um ball�o pode determinado periodo de tempo
     *
     * @param comp (JComponent) que vai mostrar a mensagem
     * @param mensage a ser mostrada
     * @param image icone do bal�o (pode ser null)
     * @param time a mostrar o bal�o
     * @since 1.0
     */
    public static void showTimedBallon(JComponent comp, String mensage, Icon image, Integer time) {
        TimingUtils.showTimedBalloon(createBallon(comp, mensage, image), time);
    }

    /**
     * Mostra um ball�o por 5s
     *
     * @param comp (JComponent) que vai mostrar a mensagem
     * @param mensage a ser mostrada
     * @param image icone do bal�o (pode ser null)
     * @since 1.0
     */
    public static void showTimedBallon(JComponent comp, String mensage, Icon image) {
        showTimedBallon(comp, mensage, image, 5000);

    }
}
