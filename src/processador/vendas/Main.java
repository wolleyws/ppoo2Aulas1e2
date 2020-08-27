/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processador.vendas;

import exceptions.StatusVendaInvalidaException;
import java.io.FileNotFoundException;
import java.util.List;
import modelo.StatusVenda;
import modelo.Venda;
import servico.ProcessadorDeArquivos;
import servico.ProcessadorDeVendas;

/**
 *
 * @author wolley
 *
 * Programa para processamento de vendas diarias De acordo com os status abaixo:
 * CONFIRMADO -> retirar produtos do estoque 
 * PENDENTE -> valida pagamento nas
 * operadoras de cartão 
 * CANCELADA -> repor produto no estoque
 *
 *
 */
public class Main {

    /**
     * Este arquivo esta em uma pasta chamada files deste projeto
     */
    private static final String PATH = "files/vendas.csv";

    /**
     * @param args the command line arguments
     * @throws java.lang.IllegalArgumentException
     */
    public static void main(String[] args) throws IllegalArgumentException, Exception {
        try {
            ProcessadorDeArquivos processador = new ProcessadorDeArquivos();
            List<Venda> vendas = processador.processar(PATH);
            
            ProcessadorDeVendas processadorVendas = new ProcessadorDeVendas();
            processadorVendas.processar(vendas);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

}
