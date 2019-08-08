/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controle.ValidationView;
import Negocio.Formulario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author victor
 */
public class SaveForm {
        
     public boolean save(Formulario formulario){
         try {
             Connection conn = SQLLiteConnection.getInstancia().getConexao();
             PreparedStatement pst = conn.prepareStatement("INSERT INTO formulario (receptor, emissor, telefax, telefaxEmissor, email, emailEmissor, dataEnvio) VALUES (?,?,?,?,?,?,?)");
             
             
             pst.setString(1, formulario.getReceptor());
             pst.setString(2, formulario.getEmissor());
             pst.setString(3, formulario.getTelefax());
             pst.setString(4, formulario.getTelefaxEmissor());
             pst.setString(5, formulario.getEmail());
             pst.setString(6, formulario.getEmailEmissor());
             pst.setString(7, formulario.getDate());
             pst.execute();
             
             
         } catch (Exception ex) {
             Logger.getLogger(SaveForm.class.getName()).log(Level.SEVERE, null, ex);
         } 
         
         return true;
     }       
    
        

    
    
}
