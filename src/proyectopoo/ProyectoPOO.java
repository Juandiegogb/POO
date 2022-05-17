/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.splash;

/**
 *
 * @author juand
 */
public class ProyectoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        splash Splash = new splash();
        Splash.setVisible(true);

        /* String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/usuarios";
        Connection con;
        Statement stmt = null;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProyectoPOO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(url,usuario,clave);
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO `usuarios` (`Nombre`, `DI`, `password`, `pedidos`) VALUES ('juan', '1111111111', '123456', '0')");
        } catch (SQLException ex) {
            Logger.getLogger(ProyectoPOO.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

}
