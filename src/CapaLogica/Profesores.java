/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;
import Conexion.conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author alons
 */
public class Profesores {
    private String ID_Prof;
    private String Nombre;
    private String Grado;
    private double Sueldo;
    
    //Constructor de profesores 
    public Profesores(String ID_Prof, String Nombre, String Grado, double Sueldo) {
        this.ID_Prof = ID_Prof;
        this.Nombre = Nombre;
        this.Grado = Grado;
        this.Sueldo = Sueldo;
    }

    public String getID_Prof() {
        return ID_Prof;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getGrado() {
        return Grado;
    }

    public double getSueldo() {
        return Sueldo;
    }
    
    
    
    public void InsertaProfesores (Profesores P){
        conexion cc = new conexion();
        Connection con = cc.getConnection();
        try {
       String sql = "INSERT INTO Profesores VALUES ('"+P.getID_Prof()+"','"+P.getNombre()+"','"+P.getGrado()+"',"+P.getSueldo()+")";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            int reg = pst.executeUpdate(sql);
            if (reg>0){
                JOptionPane.showMessageDialog (null,"REGISTRO INSERTADO");
                cc.desconectar();
            }else{
                JOptionPane.showMessageDialog (null,"ERROR AL INSERTAR REGISTRO");
            }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog (null,"REGISTRO INVALIDO");
                cc.desconectar();
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog (null,"NO CUENTAS CON CONEXION");
            cc.desconectar();
        }
    }
    
    public void EliminaProfesores (Profesores P){
        
    }
    
    public void ConsultaGeneral(){
        
    }
    
}

