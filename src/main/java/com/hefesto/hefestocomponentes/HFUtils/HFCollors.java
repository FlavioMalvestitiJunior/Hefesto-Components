/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFUtils;

import java.awt.Color;

/**
 *
 * @author Flavio
 */
public class HFCollors {

    public static final Color RedCalendar = new Color(125, 0, 1);
    public static final Color BloodRed = new Color(254, 0, 0);
    public static final Color SelectedDayColor = new Color(198, 91, 93);
    public static final Color PreguicousDayColor = new Color(250, 191, 100);
    public static final Color RasterColor = new Color(151, 206, 227);
    public static final Color ClearWhite = new Color(255, 255, 255);
    public static final Color DarkBlack = new Color(0, 0, 0);
    public static final Color Blue = new Color(0, 0, 255);
    public static final Color MarineBlue = new Color(0, 88, 255);
    public static final Color SkyBlue = new Color(61, 173, 207);
    public static final Color SoftBlue = new Color(217, 255, 255);
    public static final Color RoyalBlue = new Color(65, 105, 255);
    public static final Color CelesteBlue = new Color(50, 153, 204);
    public static final Color GreenBlue = new Color(82, 211, 207);
    public static final Color GrassGreen = new Color(51, 153, 0);
    public static final Color DarkGray = new Color(64, 64, 64);
    public static final Color LigthGreen = new Color(171, 252, 95);
    public static final Color FinalGreen = new Color(45, 91, 1);
    public static final Color DonePurple = new Color(165, 0, 189);
    public static final Color CanceledRed = new Color(255, 0, 3);

    public static Color colorRealce(Color cor) {
        Integer cR = cor.getRed();
        Integer cG = cor.getGreen();
        Integer cB = cor.getBlue();

        Color cr = cor.darker();

        Integer crR = cr.getRed();
        Integer crG = cr.getGreen();
        Integer crB = cr.getBlue();

        crR = range(crR) > cR ? range(crR) : cR - range(crR);
        crG = range(crG) > cG ? range(crG) : cG - range(crG);
        crB = range(crB) > cG ? range(crB) : cB - range(crB);

        return new Color(crR, crG, crB);
    }

    private static Integer range(Integer number) {
        Double tmpr = (number * 1.20);

        if (tmpr >= 255) {
            return 0;
        }
        if (tmpr <= 0) {
            return 255;
        }
        return tmpr.intValue();
    }
}
