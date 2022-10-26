/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFBaloon;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;

/**
 * 
 * @author Flavio
 */
public class HFBalloon extends BalloonTip {

    private String text = "";

    /**
     * Construtor padr�o
     *
     * @param comp
     * @param msg
     * @param style
     * @param orientation
     * @param location
     */
    public HFBalloon(JComponent comp, String msg, BalloonTipStyle style, Orientation orientation, AttachLocation location) {
        this(comp, msg, style, orientation, location, null);
    }

    public HFBalloon(JComponent comp, String msg, BalloonTipStyle style, Orientation orientation, AttachLocation location, Icon icon) {
        super(comp, new JLabel(msg, icon, JLabel.CENTER), style, orientation, location, 16, 20, false);
        text = msg;

        ((JLabel) this.getContents()).setIcon(icon);
        setVisible(false);
    }

    public HFBalloon(JComponent comp, JComponent mensagem, BalloonTipStyle style, Orientation orientation, AttachLocation location) {
        super(comp, mensagem, style, orientation, location, 16, 20, true);
    }

    //@Override
    public String getText() {
        return text;
    }

}
