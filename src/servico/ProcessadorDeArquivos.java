/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Venda;

/**
 *
 * @author wolley
 */
public class ProcessadorDeArquivos {
    private static final String PONTO_E_VIRGULA = ";";

    public List<Venda> processar(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        List<Venda> vendas = new ArrayList<>();
        while (sc.hasNext()) {
            String linha = sc.nextLine();
            String[] campos = linha.split(PONTO_E_VIRGULA);
            /*
                    System.out.println("Codigo: " + campos[0]);
                    System.out.println("Codigo produto: " + campos[1]);
                    System.out.println("Quantidade: " + campos[2]);
                    System.out.println("Status: " + campos[3]);
             */

                /*
                    Venda venda = new Venda();
                    venda.setCodigo(Integer.parseInt(campos[0]));
                    Produto produto = new Produto();
                    produto.setCodigo(Integer.parseInt(campos[1]));
                    venda.setProduto(produto);
                    venda.setQuantidade(Integer.parseInt( campos[2]));
                    venda.setStatus(StatusVenda.valueOf(campos[3]));
             */
            Venda venda = Venda.builder()
                    .quantidade(campos[2])
                    .codigo(campos[0])
                    .produto(campos[1])
                    .status(campos[3])
                    .build();

            //add na lista
            vendas.add(venda);

        }
        sc.close();
        return vendas;
    }

}
