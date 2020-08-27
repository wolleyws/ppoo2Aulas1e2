/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import exceptions.StatusVendaInvalidaException;
import java.util.List;
import modelo.Venda;

/**
 *
 * @author wolley
 */
public class ProcessadorDeVendas {
    
    public void processar(List<Venda> vendas) throws StatusVendaInvalidaException {
        
        for (Venda venda : vendas) {
            ProcessaVenda processaVenda = ProcessaVendaFactory.create(venda);
            processaVenda.processar(venda);
        }
    }
    
}
