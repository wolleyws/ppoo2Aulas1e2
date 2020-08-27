/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import exceptions.StatusVendaInvalidaException;
import modelo.Venda;

/**
 *
 * @author wolley
 */
public class ProcessaVendaFactory {

    public static ProcessaVenda create(Venda venda) throws StatusVendaInvalidaException {
        switch (venda.getStatus()) {
            case CONFIRMADO : return new ProcessaVendaConfirmada();
            case CANCELADA: return new ProcessaVendaCancelada();
            case PENDENTE: return new ProcessaVendaPendente();
            default: throw new StatusVendaInvalidaException("Status da venda invalido"); 
        }
    }

    
}
