/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.RecoverForm;
import DAO.SaveForm;
import Negocio.Formulario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "validationView")
@SessionScoped
public class ValidationView {
     
    public Formulario formulario;
    

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }
    
    public ValidationView(){
        this.setFormulario(new Formulario());
    }
    
    public void buttonAction() {
        SaveForm save = new SaveForm();
        save.save(this.getFormulario());
        addMessage("Formulário salvo com sucesso!");
    }
 
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
    

