/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFPair;

import java.io.Serializable;

/**
 *
 * @author Flavio
 * @param <K>
 * @param <V>
 */
public class HFPair<K, V> implements Serializable {

    private K one;
    private V two;

    public HFPair(K one, V two) {
        this.one = one;
        this.two = two;
    }

    public HFPair() {
        this.one = null;
        this.two = null;
    }

    public K getOne() {
        return one;
    }

    public V getTwo() {
        return two;
    }

    public void setOne(K one) {
        this.one = one;
    }

    public void setTwo(V two) {
        this.two = two;
    }
}
