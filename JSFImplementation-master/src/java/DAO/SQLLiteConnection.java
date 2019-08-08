/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author victor
 */
public class SQLLiteConnection {
    
    private static SQLLiteConnection conn;
    
    private SQLLiteConnection(){
        
    }
    
    public static SQLLiteConnection getInstancia(){
    
            if(conn == null){
                conn = new SQLLiteConnection();
            }
         return conn;   
    }
    
    public Connection getConexao() throws Exception{
    
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:/home/victor/Projetos/ProvaPWeb/banco.db";
        return DriverManager.getConnection(url,"vmendes","prova");   
    }
}
