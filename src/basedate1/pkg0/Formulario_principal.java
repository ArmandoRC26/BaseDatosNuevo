/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedate1.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c
 */
public class Formulario_principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        R_Empleados c = new R_Empleados();
        c.setVisible(true);
  
        
            String usuario="root";
            String Clave = "";
            String url = "jdbc:mysql://localhost:3306/benny";
             Connection con;
             Statement stmt;
             ResultSet rs;
             
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Formulario_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con =DriverManager.getConnection("jdbc:mysql://localhost/benny", "root", "");
            stmt =con.createStatement();
                    } catch (SQLException ex) {
            Logger.getLogger(Formulario_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
