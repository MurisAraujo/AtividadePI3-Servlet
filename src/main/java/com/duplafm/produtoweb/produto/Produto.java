/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duplafm.produtoweb.produto;

/**
 *
 * @author murilo.aaraujo
 */
public class Produto {
    private String descricao;
    private String nome;
    private Double precoVenda;
    private Double precoCompra;
    private Integer codproduto;
    private String genero;
    private Integer quantEstoque;
    
    public Integer getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(Integer codproduto) {
        this.codproduto = codproduto;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public Integer getQuantidadeEstoque() {
        return quantEstoque;
    }

    public void setQuantidadeEstoque(Integer quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Double getPrecoVenda(){
        return precoVenda;
    }
    
    public void setPrecoVenda(Double precoVenda){
        this.precoVenda = precoVenda;
    }
    
    public Double getPrecoCompra(){
        return precoCompra;
    }
    
    public void setPrecoCompra(Double precoCompra){
        this.precoCompra = precoCompra;
    }
}
