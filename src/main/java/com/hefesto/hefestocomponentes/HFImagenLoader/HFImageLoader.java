/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFImagenLoader;

import javax.swing.ImageIcon;

/**
 *
 * @author flavio
 */
public class HFImageLoader {

    Class folder;

    public HFImageLoader(Class folder) {
        this.folder = folder;
    }

    /**
     * Faz o carregamento da imagen.
     *
     * @param imagen
     * @return
     * @throws Exception
     */
    public ImageIcon getImagen(String imagen) throws Exception {
        return new ImageIcon(folder.getResource(imagen).getPath());
    }

    public ImageIcon getResizedImage(String imagen, int w, int h, int scaleType) throws Exception {
        return new ImageIcon(getImagen(imagen).getImage().getScaledInstance(w, h, scaleType));
    }

    public String getAbsolutPath(String imagen) {
        return folder.getResource(imagen).getPath();
    }
}
