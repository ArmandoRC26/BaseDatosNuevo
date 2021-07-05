
package basedate1.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

public class conectar {
    Connection conectar=null;
 public Connection conexion(){   
  try{
    Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
    conectar=DriverManager.getConnection("jdbc:mysql://localhost/benny","root","");
   
    
  }catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
                                   }catch(ClassNotFoundException ex) {                                                                }
  return conectar;
}
}
