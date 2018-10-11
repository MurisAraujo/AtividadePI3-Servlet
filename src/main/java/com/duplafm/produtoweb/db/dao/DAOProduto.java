/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duplafm.produtoweb.db.dao;

import com.duplafm.produtoweb.produto.Produto;
import br.com.acaitech.db.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author murilo.aaraujo
 */
public class DAOProduto {
    public static void inserir(Produto produto)
            throws SQLException, Exception{
        String sql = "INSERT INTO Produto (nome, descricao, genero, quantEst, "
                + "precoVenda, precoCompra) VALUES (?,?,?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setArray(3, produto.getCategorias());
            preparedStatement.setInt(4, produto.getQuantidade());
            preparedStatement.setBigDecimal(5, produto.getPrecoVenda());
            preparedStatement.setBigDecimal(6, produto.getPrecoCompra());
            
            preparedStatement.execute();
        }finally{
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}
