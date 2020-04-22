package Modelo;

import java.sql.*;

public class BaseDatos {
    
    private Connection con;
    
    public BaseDatos() {
    }
    
    public void conectar() {
        try {
            //Identificar driver
                Class.forName("com.mysql.jdbc.Driver");
            //Conexion
                String bd = "Ejercicio1";
                String url = "jdbc:mysql://localhost:3307/"+bd;
                String login = "root";
                String password = "usbw";
                con = DriverManager.getConnection(url,login,password);
                
                if(con==null){
                    throw new Exception("Errores al abrir la conexión con la BD.");
                }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void desconectar() {
        try {
            con.close();
        } 
        catch (Exception e) {
            System.out.println("Errores al cerrar la conexión con la BD.");
        }
    }
    
    public Connection getCon(){
        return con;
    }
}
