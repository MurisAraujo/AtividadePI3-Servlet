package com.duplafm.produtoweb.produto;

import java.math.BigDecimal;

/**
 *
 * @author fernando.tsuda
 */
public class Produto {
    
    private Long id;
    
    private String nome;
    
    private String descricao;
    
    private BigDecimal precoCompra;
    
    private BigDecimal precoVenda;
    
    private int quantidade;
    
    private int disponivel;
    
    private String categorias;

    public Produto() {
    }

    public Produto(String nome, String descricao, BigDecimal precoCompra, BigDecimal precoVenda, int quantidade, int disponivel, String categorias) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidade = quantidade;
        this.disponivel = disponivel;
        this.categorias = categorias;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(int disponivel) {
        this.disponivel = disponivel;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public int getPreco() {
        return precoVenda.intValue();
    }

    public void setPreco(int preco) {
        
    }
    
}
