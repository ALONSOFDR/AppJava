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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author alons
 */
public class Profesores {
    private String ID_Prof;
    private String Nombre;
    private String Grado;
    private String Sueldo;
    
    //Constructor de profesores 
    public Profesores(String ID_Prof, String Nombre, String Grado, String Sueldo) {
        this.ID_Prof = ID_Prof;
        this.Nombre = Nombre;
        this.Grado = Grado;
        this.Sueldo = Sueldo;
    }
    
    public Profesores(String ID_Prof) {
        this.ID_Prof = ID_Prof;
    }

    //Constructor vacio
    public Profesores() {
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

    public String getSueldo() {
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
        String sql="DELETE FROM Profesores WHERE ID_Prof ='"+P.ID_Prof+"'";     
        try{
           conexion cc = new conexion();
            Connection con = cc.getConnection();
            Statement st = con.createStatement();
            int rs = st.executeUpdate(sql);
            if(rs>0){
                JOptionPane.showMessageDialog (null,"REGISTRO ELIMINADO"); 
            }else{
            JOptionPane.showMessageDialog (null,"ERROR AL ELIMINAR REGISTRO"); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog (null,"ERROR EN LA CONEXION"); 
        }
    }
    
    public Profesores BuscarProfesores(Profesores P){
        Profesores P2 = new Profesores("","","","");
        conexion cc = new conexion();
        Connection con = cc.getConnection();
        try {
            String sql = "SELECT * FROM Profesores WHERE ID_Prof='"+P.getID_Prof()+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next() == true){
                rs = st.executeQuery(sql);
                if(rs.first()){
                    String ID = rs.getString("ID_Prof");
                    String Nom = rs.getString("Nombre");
                    String Gra = rs.getString("Grado");
                    String Suel = rs.getString("Sueldo");
                    P2= new Profesores(ID,Nom,Gra,Suel); 
                }
            con.close();
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog (null,"Error en la conexion"); 
        
        }
        
        return P2;
    }
    
 
    public JTable ConsultaGeneral(JTable datos){
        DefaultTableModel model;
        String temp;
        String [] titulos={"ID PROFESORE","NOMBRE","GRADO","SUELDO"};
        String [] registros = new String[4];
        String sql = "SELECT * FROM Profesores";
        
        model = new DefaultTableModel(null,titulos);
        try {
            conexion cc = new conexion();
            Connection con = cc.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next() == true){
                rs = st.executeQuery(sql);
            while(rs.next()){
                registros[0] = rs.getString("ID_Prof");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Grado");
                registros[3] = rs.getString("Sueldo");
                model.addRow(registros);
            }
            datos.setModel(model);
            con.close();
            }else{
                JOptionPane.showMessageDialog (null,"La tabla no contiene ningun registro");
            }
        }catch(HeadlessException | SQLException e){
        }
        return datos;
    }
    
    
    public JTable ConsultaMaterias(JTable datos){
        DefaultTableModel model;
        String temp;
        String [] titulos={"NOMBRE","MATERIAS IMPARTIDAS"};
        String [] registros = new String[2];
        String sql = "SELECT Profesores.Nombre, Count(Materias.ID_prof ) 'Materias' FROM Profesores \n" +
        "   INNER JOIN Materias ON Profesores.ID_Prof= Materias.ID_Prof \n" +
        "   GROUP BY Profesores.Nombre HAVING count(Materias.ID_prof) > 1";
        
        model = new DefaultTableModel(null,titulos);
        try {
            conexion cc = new conexion();
            Connection con = cc.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next() == true){
                rs = st.executeQuery(sql);
            while(rs.next()){
                registros[0] = rs.getString("Nombre");
                registros[1] = rs.getString("Materias");
                model.addRow(registros);
            }
            datos.setModel(model);
            con.close();
            }else{
                JOptionPane.showMessageDialog (null,"La tabla no contiene ningun registro");
            }
        }catch(HeadlessException | SQLException e){
        }
        return datos;
    }
    
    
    public JTable ConsultaInfo(JTable datos){
        DefaultTableModel model;
        String temp;
        String [] titulos={"NOMBRE","GRADO","MATERIA IMPARTIDA","CREDITOS"};
        String [] registros = new String[4];
        String sql = "SELECT Profesores.Nombre, Profesores.Grado, Materias.Nombre, Materias.Creditos FROM Profesores\n" +
        "    INNER JOIN Materias ON Profesores.ID_Prof = Materias.ID_Prof GROUP BY Materias.ID_Mat";
        
        model = new DefaultTableModel(null,titulos);
        try {
            conexion cc = new conexion();
            Connection con = cc.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next() == true){
                rs = st.executeQuery(sql);
            while(rs.next()){
                registros[0] = rs.getString("Profesores.Nombre");
                registros[1] = rs.getString("Profesores.Grado");
                registros[2] = rs.getString("Materias.Nombre");
                registros[3] = rs.getString("Materias.Creditos");
                model.addRow(registros);
            }
            datos.setModel(model);
            con.close();
            }else{
                JOptionPane.showMessageDialog (null,"La tabla no contiene ningun registro");
            }
        }catch(HeadlessException | SQLException e){
        }
        return datos;
    }
}

