
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ModelAgenda {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;

    private String nombre;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda_mvc", "root", "alex");
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM contactos;");
            rs.next();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 001: " + err.getMessage());
        }

    }
    
   
    public void moverPrimerRegistro(){
        try {
            rs.first();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(null,"Error 002"+err.getMessage()); 
        }
        
    }
    
    
    public void moverSiguienteRegistro(){
        try{
            rs.next();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Es el ultimo registro"+err.getMessage()); 
        }
        
    }
    
   
    public void moverAnteriorRegistro(){
        try{
            rs.previous();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Es el primer registro"+err.getMessage()); 
        }
    }
    
    
    public void moverUltimoRegistro(){
        try{
            rs.last();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Error 003"+err.getMessage()); 
        }
    }
}
