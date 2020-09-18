
package CapaLogica;

import Conexion.conexion;
import java.sql.Connection;

public class Materias {
    private String ID_Mat;
    private String Nombre;
    private int Creditos;
    private String ID_Prof;

    public Materias(String ID_Mat, String Nombre, int Creditos, String ID_Prof) {
        this.ID_Mat = ID_Mat;
        this.Nombre = Nombre;
        this.Creditos = Creditos;
        this.ID_Prof = ID_Prof;
    }

   
    
    public void InsertaMaterias (Materias M){
        conexion cc = new conexion();
        Connection con = cc.getConnection();
        String sql = "INSERT INTO Materias VALUES ()";
    }
    
    public void EliminaMaterias (Materias M){
        
    }
    
    public void ActualizaMaterias (Materias M){
        
    }
    
    public void ConsultaGeneral (){
        
    }
}
