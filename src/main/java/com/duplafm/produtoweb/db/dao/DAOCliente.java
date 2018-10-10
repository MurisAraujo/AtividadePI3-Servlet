/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duplafm.produtoweb.db.dao;

import br.com.acaitech.cliente.Cliente;
import br.com.acaitech.db.utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author murilo.aaraujo
 */
public class DAOCliente {
    public static void inserir(Cliente cliente) 
            throws SQLException, Exception {
        
        String sql = "INSERT INTO cliente(nome, cpf, endereco, cep, datanasc, "
                + "telefone, celular, email) VALUES (?,?,?,?,?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getEndereco());
            preparedStatement.setString(4, cliente.getCep());
            Timestamp t = new Timestamp(cliente.getDataNascimento().getTime());
            preparedStatement.setTimestamp(5, t);
            preparedStatement.setString(6, cliente.getTelefone());
            preparedStatement.setString(7, cliente.getCelular());
            preparedStatement.setString(8, cliente.getEmail());
            preparedStatement.execute();
        }finally{
            if(preparedStatement != null && !preparedStatement.isClosed()){
                preparedStatement.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }
}
