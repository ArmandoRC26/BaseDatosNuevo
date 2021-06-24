/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedate1.pkg0;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {

    static PreparedStatement PreparedStatement(String insert_Into_R_Empleados_FolioNombre_Apell) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     Connection conectar=null;
     Statement st;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/benny", "root", "");
            
        }catch (Exception e){
            System.out.print("Error: "+e);
        }
        return conectar;
    }
    
    
}
   

