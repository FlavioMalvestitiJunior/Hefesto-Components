/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFComboBox;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import org.jdesktop.swingx.HorizontalLayout;

/**
 * Render da lista do Jcombobox, se tiver algum - no cara ele divido em 2
 * setando o primeiro como negrito.
 *
 * @author Jean
 */
public class HFComboRender extends JPanel implements ListCellRenderer {
    
    static final long serialVersionUID = -6618469841127325812L;
    ImageIcon[] imagem;
    JLabel negrito = new JLabel();
    JLabel nome = new JLabel();
    private HFComboBox combo;
    
    public HFComboRender() {
    }
    
    public HFComboRender(ImageIcon[] image) {
        this.imagem = image;
    }
    
    public HFComboRender(ImageIcon[] imagem, HFComboBox combo) {
        this.imagem = imagem;
        this.combo = combo;
    }
    
    @Override
    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {
        if (value != null) {
            // se tiver um  - divide em 2
            String[] str = value.toString().split("-", 1);
            
            if (str.length > 1) {
                negrito.setText(str[1]);
                nome.setText(str[0]);
            } else {
                nome.setText(value.toString());
            }
            if (isSelected) {
                //setOpaque(true);
                setBackground(new Color(26, 189, 255));
                setForeground(Color.WHITE);
                      // setBorder(new LineBorder(Color.BLACK, 1));
            } else {
                setBorder(null);
                //setOpaque(false);
                if ((index % 2) == 0) {
                    //setBackground(new Color(c.getRed()-20, c.getGreen()-20, c.getBlue()-0));
                    setBackground(new Color(255, 255, 255));
                    //
                    //setForeground(new Color(255,0,0));
                } else {
                    //setBackground(c);
                    setBackground(new Color(205, 224, 255));
                    //setForeground(new Color(255,255,0));
                }
            }
            if (index >= 0) {
                if (imagem != null && imagem[index] != null) {
                    nome.setIcon(imagem[index]);
                }
            }
            setPreferredSize(new Dimension(getWidth(), getHeight() + 18));
        }
        this.setLayout(new HorizontalLayout());
        this.add(negrito);
        this.add(nome);
        
        return this;
    }
}
