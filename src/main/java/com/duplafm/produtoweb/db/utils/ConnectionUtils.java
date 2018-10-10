/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acaitech.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author murilo.aaraujo
 */
public class ConnectionUtils {
    public static Connection getConnection() throws SQLException {
        //ConexÃ£o para abertura e fechamento
        Connection connection = null;
        //SÃ³ tenta abrir uma conexÃ£o se nÃ£o existir ou estiver fechada            
        //EndereÃ§o de conexÃ£o com o banco de dados
        String dbURL = "jdbc:mysql://localhost:3306/LojaEletronicos";
        //Propriedades para armazenamento de usuÃ¡rio e senha
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "");
        properties.put("serverTimezone", "UTC");
        //Realiza a conexÃ£o com o banco
        connection = DriverManager.getConnection(dbURL, properties);

        //Retorna a conexÃ£o
        return connection;
    }
}
