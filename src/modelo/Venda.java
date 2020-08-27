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
public class Venda {
    private Integer codigo;
    private Produto produto;
    private Integer quantidade;
    private StatusVenda status;

    private Venda() {
        
    }
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public StatusVenda getStatus() {
        return status;
    }

    public void setStatus(StatusVenda status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Venda{" + "codigo=" + codigo + ", produto=" + produto + ", quantidade=" + quantidade + ", status=" + status + '}';
    }

  
    
    public static VendaBuilder builder(){
        return new VendaBuilder();
    }
    
    public static class VendaBuilder{
        private Venda venda = new Venda();
        
        public VendaBuilder codigo(String codigo){
            this.venda.setCodigo(Integer.parseInt(codigo));
            return this;
        }
        
        public VendaBuilder produto(String codigoProduto){
            this.venda.setProduto(Produto.of(codigoProduto));
            return this;
        }
        
        public VendaBuilder quantidade(String quantidade){
            this.venda.setQuantidade(Integer.parseInt(quantidade));
            return this;
        }
        
        public VendaBuilder status (String status){
            this.venda.setStatus(StatusVenda.valueOf(status));
            return this;
        }
        
        public Venda build(){
            return this.venda;
        }
    }
    
    
    
 
    
}
