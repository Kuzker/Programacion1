package Modelo;

import java.sql.*;
import ejercicio1.Ejercicio1;
import java.util.ArrayList;

public class TablaPersonas {
    //Atributo
    private Connection con;
    
    //Constructor
    public TablaPersonas(Connection con){
        this.con = con;
    }
    
    //Comenzamos con el Insert y Consultas
    public void insertar(Personas p) throws Exception {
        String plantilla = "INSERT INTO personas VALUES(?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setInt(2, p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4, p.getTelefono());
        
        int n = ps.executeUpdate();
        
        if(n!=1)
            throw new Exception("Error al insertar los datos.");
    }
    
    public Personas consultar(String nombre) throws Exception {
        Personas persona = null;
        
        String query = "SELECT * FROM personas WHERE nombre=?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,nombre);
        ResultSet resultado = ps.executeQuery();
        
        if (!resultado.next()) {
            throw new Exception("No se ha encontrado a la persona.");
        } else {
             persona = crearObjeto(resultado);
        }
        return persona;
    }
    
    public Personas crearObjeto(ResultSet resultado) throws Exception{
        Personas persona = new Personas();
        persona.setNombre(resultado.getString("nombre"));
        persona.setEdad(resultado.getInt("edad"));
        persona.setProfesion(resultado.getString("profesion"));
        persona.setTelefono(resultado.getString("telefono"));
        return persona;
    }
    
    public ArrayList<Personas> listaPersonas() throws Exception {
        ArrayList<Personas> lista = new ArrayList();
        String plantilla = "SELECT * FROM personas;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();
        while (resultado.next()) {
            lista.add(crearObjeto(resultado));
        }
        return lista;
    }
}
