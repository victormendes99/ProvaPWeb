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
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "gridView")
@ViewScoped
public class GridView {
     
    
    private RecoverForm service;
    
    public ArrayList<Formulario> formularios = new ArrayList<Formulario>();
    public Formulario formulario;

    public GridView(){
        service = new RecoverForm();
    }
    
    @PostConstruct
    public void init() {
        this.formularios = (ArrayList) service.recover().clone();
    }
    
    public void setService(RecoverForm recoverForm) {
        this.service = recoverForm;
    }
 
    public ArrayList<Formulario> getFormularios() {
        return formularios;
    }
    
    public void setFormularios(ArrayList<Formulario> formularios) {
        this.formularios = (ArrayList)formularios.clone();
    }
    
    public void onRowEdit(RowEditEvent event) {
        formulario = (Formulario) event.getObject();
        
        
    }
     
    public void onRowDelete(RowEditEvent event) {
        formulario = (Formulario) event.getObject();
        service.deleteForm(formulario);
    }

}
    

