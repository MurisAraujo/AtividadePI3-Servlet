/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duplafm.produtoweb.web;

import com.duplafm.produtoweb.produto.Produto;
import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "InclusaoProdutoServlet", urlPatterns = {"/produto/inclusao"})
public class InclusaoProdutoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/produto/form.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        String precoCompraStr = request.getParameter("prcompra");
        String precoVendaStr = request.getParameter("prvenda");
        String qtdStr = request.getParameter("qtd");
        String dispStr = request.getParameter("disp");
        String[] categorias = request.getParameterValues("cat");

        BigDecimal precoCompra = new BigDecimal(precoCompraStr);
        BigDecimal precoVenda = new BigDecimal(precoVendaStr);
        int qtd = Integer.parseInt(qtdStr);
        int disp = Integer.parseInt(dispStr);

        Produto p = new Produto(nome, descricao, precoCompra, 
                precoVenda, qtd, disp, categorias);
        
        request.setAttribute("prod", p);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher(
                        "/WEB-INF/jsp/produto/resultado.jsp");
        dispatcher.forward(request, response);
        
    }

}
