/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFTable.utils;

import com.hefesto.hefestocomponentes.HFTable.HFTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jr
 */
public class HFFindInTable {
    List<Object> model;
    public List<Object> find(HFTableModel t,String p){
   Boolean addline = false;     
    model = new ArrayList<>();
        for (int i = 0; i < t.getRowCount(); i++) {
            addline = false;     
            for (int j = 0; j < t.getColumnCount(); j++) {
                if(t.getRow(j).toString().contains(p)){
                addline = true;     
                    System.out.println(t.getRow(j).toString());
                }
            }
            if(addline){
            model.add(t.getRow(i));
            }
        }
        return model;
     }
}
