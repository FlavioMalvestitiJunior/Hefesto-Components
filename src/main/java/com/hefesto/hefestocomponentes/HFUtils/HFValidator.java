/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFUtils;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;

/**
 *
 * @author Flavio
 */
public class HFValidator {

    /**
     * Valida CPF
     *
     * @param component
     */
    public static Boolean validaCPF(String valor) {
        return new CPFValidator().invalidMessagesFor(valor).isEmpty();
    }

    /**
     * Valida CNPJ
     *
     * @param valor
     * @return
     */
    public static Boolean validaCNPJ(String valor) {
        return new CNPJValidator().invalidMessagesFor(valor).isEmpty();
    }
}
