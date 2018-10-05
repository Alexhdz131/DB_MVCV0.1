
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelAgenda;
import views.ViewAgenda;


public class ControllerAgenda {

    ModelAgenda modelAgenda;
    ViewAgenda viewAgenda;

    
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewAgenda.jbtn_primero) {
                jbtn_primero_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_anterior) {
                jbtn_anterior_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_siguiente) {
                jbtn_siguiente_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_ultimo) {
                jbtn_ultimo_actionPerformed();
            }

        }

    };

    
    public ControllerAgenda(ModelAgenda modelAgenda, ViewAgenda viewAgenda) {
        this.modelAgenda = modelAgenda;
        this.viewAgenda = viewAgenda;
        initComponents();
        setActionListener();
        initDB();
    }

   
    public void initDB(){
        modelAgenda.conectarDB();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
    }
   
    public void initComponents() {
        viewAgenda.setLocationRelativeTo(null);
        viewAgenda.setTitle("Agenda MVC");
        viewAgenda.setVisible(true);
    }

   
    public void setActionListener() {
        viewAgenda.jbtn_primero.addActionListener(actionListener);
        viewAgenda.jbtn_anterior.addActionListener(actionListener);
        viewAgenda.jbtn_siguiente.addActionListener(actionListener);
        viewAgenda.jbtn_ultimo.addActionListener(actionListener);
    }

    private void obtener_Datos(){
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
    }
    
    private void jbtn_primero_actionPerformed() {
        modelAgenda.moverPrimerRegistro();
        obtener_Datos();
       
    }

   
    private void jbtn_anterior_actionPerformed() {
        modelAgenda.moverAnteriorRegistro();
        obtener_Datos();
       
    }

    
    private void jbtn_ultimo_actionPerformed() {
        modelAgenda.moverUltimoRegistro();
        obtener_Datos();
       
    }

   
    private void jbtn_siguiente_actionPerformed() {
        modelAgenda.moverSiguienteRegistro();
        obtener_Datos();
       
    }
}
