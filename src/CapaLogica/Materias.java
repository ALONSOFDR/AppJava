
package CapaLogica;

import Conexion.conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Materias {
    private String ID_Mat;
    private String Nombre;
    private String Creditos;
    private String ID_Prof;

    public Materias(String ID_Mat, String Nombre, String Creditos, String ID_Prof) {
        this.ID_Mat = ID_Mat;
        this.Nombre = Nombre;
        this.Creditos = Creditos;
        this.ID_Prof = ID_Prof;
    }

    public Materias(String ID_Mat) {
        this.ID_Mat = ID_Mat;
    }

    public Materias() {
    }

    public String getID_Mat() {
        return ID_Mat;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCreditos() {
        return Creditos;
    }

    public String getID_Prof() {
        return ID_Prof;
    }

   
    
    public void InsertaMaterias (Materias M){
        conexion cc = new conexion();
        Connection con = cc.getConnection();
        try {
       String sql = "INSERT INTO Materias VALUES ('"+M.getID_Mat()+"','"+M.getNombre()+"',"+M.getCreditos()+",'"+M.ID_Prof+"')";
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
    
    public void EliminaMaterias (Materias M){
        String sql="DELETE FROM Materias WHERE ID_Mat ='"+M.getID_Mat()+"'";     
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
    
    public Materias BuscarMaterias(Materias M){
        Materias M2 = new Materias("","","","");
        conexion cc = new conexion();
        Connection con = cc.getConnection();
        try {
            String sql = "SELECT * FROM Materias WHERE ID_Mat='"+M.getID_Mat()+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next() == true){
                rs = st.executeQuery(sql);
                if(rs.first()){
                    String ID = rs.getString("ID_Mat");
                    String Nom = rs.getString("Nombre");
                    String Cre = rs.getString("Creditos");
                    String IDP = rs.getString("ID_Prof");
                    M2= new Materias(ID,Nom,Cre,IDP); 
                }
            con.close();
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog (null,"Error en la conexion"); 
        }
        return M2;
    }
    
    
    public String ActualizaMaterias (Materias M, String newclave){
            conexion cc = new conexion();
            Connection con = cc.getConnection();
      try {
        String sql = "UPDATE Materias SET ID_Mat='"+newclave+"', "
                + "Nombre ='"+M.getNombre()+"',"
                + "Creditos = "+M.getCreditos()+","
                 + "ID_Prof ='"+M.getID_Prof()+"'"
                + " WHERE ID_Mat='"+M.getID_Mat()+"'";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            int reg = pst.executeUpdate(sql);
            if (reg>0){
                JOptionPane.showMessageDialog (null,"REGISTRO ACTUALIZADO");
                cc.desconectar();
            }else{
                JOptionPane.showMessageDialog (null,"REGISTRO NO IDENTIFICADO");
            }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog (null,"REGISTRO INVALIDO");
                cc.desconectar();
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog (null,"NO CUENTAS CON CONEXION");
            cc.desconectar();
        }
      return newclave;
    }
    
    
    public JTable ConsultaGeneral(JTable datos){
        DefaultTableModel model;
        String temp;
        String [] titulos={"ID MATERIA","NOMBRE","CREDITOS","ID PROFESOR"};
        String [] registros = new String[4];
        String sql = "SELECT * FROM Materias";
        
        model = new DefaultTableModel(null,titulos);
        try {
            conexion cc = new conexion();
            Connection con = cc.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next() == true){
                rs = st.executeQuery(sql);
            while(rs.next()){
                registros[0] = rs.getString("ID_Mat");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Creditos");
                registros[3] = rs.getString("ID_Prof");
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
    
    public ArrayList llenar(){
        String sql = "SELECT * FROM Profesores";
        ArrayList<String> Lista = new ArrayList <String>();
        try {
            conexion cc = new conexion();
            Connection con = cc.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next() == true){
                rs = st.executeQuery(sql);
            while(rs.next()){
                Lista.add(rs.getString("ID_Prof"));
            }
            
            con.close();
            }else{
                JOptionPane.showMessageDialog (null,"La tabla no contiene ningun registro");
            }
        }catch(HeadlessException | SQLException e){
        }
        return Lista;
    }
}
