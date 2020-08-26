/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author wolley
 */
public class Produto {

    public Produto(Integer codigo) {
        this.codigo = codigo;
    }

    public Produto() {
    }
  
    public static Produto of(String codigoProduto) {
       return new Produto(Integer.parseInt(codigoProduto));
    }

    public static Produto of(Integer codigo) {
       return new Produto(codigo);
    }
    
    private Integer codigo;
    private String descricao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
}
