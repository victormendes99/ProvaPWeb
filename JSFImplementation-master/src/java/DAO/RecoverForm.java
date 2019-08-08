/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Negocio.Formulario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class RecoverForm {
    
    public ArrayList<Formulario> formularios = new ArrayList<Formulario>();
    
    public ArrayList<Formulario> recover(){
        try {
             Connection conn = SQLLiteConnection.getInstancia().getConexao();
             Statement stmt = conn.createStatement();
             ResultSet rs;
             rs = stmt.executeQuery("SELECT* FROM formulario");
             while(rs.next()){
                 String receptor = rs.getString("receptor");
                 String emissor = rs.getString("emissor");
                 String telefax = rs.getString("telefax");
                 String telefaxEmissor = rs.getString("telefaxEmissor");
                 String email = rs.getString("email");
                 String emailEmissor = rs.getString("emailEmissor");
                 String dataEnvio = rs.getString("dataEnvio");
                 Formulario formulario = new Formulario(receptor,emissor,telefax,telefaxEmissor,email,emailEmissor,dataEnvio);
                 formularios.add(formulario);
             }
             
             
         } catch (Exception ex) {
             Logger.getLogger(SaveForm.class.getName()).log(Level.SEVERE, null, ex);
         } 
        return formularios;
    }
    
    public void deleteForm(Formulario formulario){
        try{
            Connection conn = SQLLiteConnection.getInstancia().getConexao();
             PreparedStatement pst = conn.prepareStatement("delete from formulario where emissor = ?");
             pst.setString(1, formulario.getEmissor());
             pst.execute();
        }
        catch (Exception ex) {
             Logger.getLogger(SaveForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
