/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Aluno
 */
public class Formulario {
    
    private String receptor;
    private String emissor;
    private String telefax;
    private String telefaxEmissor;
    private String email;
    private String emailEmissor;
    private String date;
    
    public Formulario(){}
    
    public Formulario(String receptor, String emissor,  String telefax, String telefaxEmissor, String email, String emailEmissor, String date){
        this.receptor = receptor;
        this.emissor = emissor;
        this.telefax = telefax;
        this.telefaxEmissor = telefaxEmissor;
        this.email = email;
        this.emailEmissor = emailEmissor;
        this.date = date;
    }
 
    public String getReceptor() {
        return receptor;
    }
    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }
 
    public String getEmailEmissor() {
        return emailEmissor;
    }
    public void setEmailEmissor(String emailEmissor) {
        this.emailEmissor = emailEmissor;
    }
 
    public String getTelefax() {
        return telefax;
    }
    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }
 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getEmissor() {
        return emissor;
    }
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }
 
    public String getTelefaxEmissor() {
        return telefaxEmissor;
    }
    public void setTelefaxEmissor(String telefaxEmissor) {
        this.telefaxEmissor = telefaxEmissor;
    }
 
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    } 
}
