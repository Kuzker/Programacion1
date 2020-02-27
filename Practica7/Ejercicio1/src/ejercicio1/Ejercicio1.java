package ejercicio1;

import Enumeraciones.*;
import Excepciones.*;
import Clases.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    private static ArrayList<Vehiculos> listaVehiculos;
    private static ArrayList<Persona> listaPersonas;
    public static void main(String[] args) {
        try
        {
            listaVehiculos = new ArrayList();
            listaPersonas = new ArrayList();
            altaPersonas();
            mostrar();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas " + e.getMessage());
        }
    }
    
    public static void altaPersonas() throws Exception{
        do
        {
            Persona persona = datosPersona();
            persona.setVehiculos(datosVehiculos(persona));
            listaPersonas.add(persona);
        }
        while (JOptionPane.showConfirmDialog(null, "¿Deseas continuar con más personas?")==0);
        
    }
    
    public static Persona datosPersona() throws Exception{
        return new Persona(obtenerDni(),obtenerNombre(),obtenerApellidos(),obtenerDireccion(),obtenerTelefono());
    }
    
    public static ArrayList<Vehiculos> datosVehiculos(Persona p) throws Exception{
        ArrayList<Vehiculos> vehiculos=new ArrayList();
        do
        {
           String tipoVehiculo = obtenerTipo();
           switch(tipoVehiculo){
               case "Moto":
                   vehiculos.add(new Motos(obtenerMarcaMoto(),obtenerMatricula(),p));
                   break;
               case "Coche":
                   vehiculos.add(new Coches(obtenerMarcaCoche(),obtenerMatricula(),p));
                   break;
               case "Camion":
                   vehiculos.add(new Camiones(obtenerMarcaCamion(),obtenerMatricula(),p));
                   break;
           }
           listaVehiculos.add(vehiculos.get(vehiculos.size() - 1));
        }
        while (JOptionPane.showConfirmDialog(null, "¿Deseas continuar con más vehiculos?")==0);
        return vehiculos;
    }
    
    public static String obtenerDni() throws Exception {
        String dni="";
        boolean error;
        do
        {
            try
            {
                error=false;
                dni = JOptionPane.showInputDialog("Teclea el dni de la persona: ");
                Pattern p = Pattern.compile("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
                Matcher m = p.matcher(dni);
                if (m.matches())
                {
                    char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
                    int resto = Integer.parseInt(dni.substring(0,8))%23;
                    if (caracteres[resto]!= dni.charAt(8))
                        throw new DniNoValido();
                }
                else
                    throw new DniNoValido();
                final String dni2 = dni;
                if (listaPersonas.stream().anyMatch(pe ->pe.getDni().equals(dni2)))
                    throw new DniNoValido();
            }
            catch(DniNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Dni no válido, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return dni;
    }
    
    public static String obtenerNombre() throws Exception {
        String nombre="";
        boolean error;
        do
        {
            try
            {
                error=false;
                nombre = JOptionPane.showInputDialog("Teclea el nombre de la persona: ");
                Pattern p = Pattern.compile("^[A-Z][a-z]+$");
                Matcher m = p.matcher(nombre);
                if (!m.matches())
                    throw new NombreNoValido();
            }
            catch(NombreNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Nombre no valido, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return nombre;
    }
    
    public static String obtenerApellidos() throws Exception {
        String apellidos="";
        boolean error;
        do
        {
            try
            {
                error=false;
                apellidos = JOptionPane.showInputDialog("Teclea los apellidos de la persona: ");
                Pattern p = Pattern.compile("^[A-Z][a-z]+( [A-Z][a-z]+)+$");
                Matcher m = p.matcher(apellidos);
                if (!m.matches())
                    throw new ApellidoNoValido();
            }
            catch(ApellidoNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Apellidos no validos, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return apellidos;
    }
    
    public static String obtenerDireccion() throws Exception {
        String direccion="";
        boolean error;
        do
        {
            try
            {
                error=false;
                direccion = JOptionPane.showInputDialog("Teclea la dirección de la persona: ");
                Pattern p = Pattern.compile("^C/[A-Z][a-z]+( [A-Z][a-z]+)* [1-9][0-9]{0,2} [1-9][0-9]?[A-Z] [0-9]{5} [A-Z][a-z]+$");
                Matcher m = p.matcher(direccion);
                if (!m.matches())
                    throw new DireccionNoValida();
            }
            catch(DireccionNoValida e)
            {
                JOptionPane.showMessageDialog(null,"Dirección no valida, vuelve a intentarlo");
                error = true;
            } 
        }
        while(error);
        return direccion;
    }
    
    public static String obtenerTelefono() throws Exception {
       String telefono="";
        boolean error;
        do
        {
            try
            {
                error=false;
                telefono = JOptionPane.showInputDialog("Teclea el teléfono de la persona: ");
                Pattern p = Pattern.compile("^[6789][0-9]{8}$");
                Matcher m = p.matcher(telefono);
                if (!m.matches())
                    throw new TelefonoNoValido();
            }
            catch(TelefonoNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Teléfono no valido, vuelve a intentarlo");
                error = true;
            }
        }
        while(error);
        return telefono;
    }
    
    public static String obtenerTipo() throws Exception {
        String tipo="";
        boolean error;
        do
        {
            try
            {
                error=false;
                tipo = JOptionPane.showInputDialog("Teclea el tipo de vehículo (Moto, Coche o Camion ");
                Pattern p = Pattern.compile("^(Moto|Coche|Camion)$");
                Matcher m = p.matcher(tipo);
                if (!m.matches())
                    throw new TipoNoValido();
            }
            catch(TipoNoValido e)
            {
                JOptionPane.showMessageDialog(null,"Los tipos validos son Moto, Coche y Camion");
                error = true;
            }
            
        }
        while(error);
        return tipo;
    }
    
    public static String obtenerMatricula() throws Exception {
        String matricula="";
        boolean error;
        do
        {
            try
            {
                error=false;
                matricula = JOptionPane.showInputDialog("Teclea matricula del vehiculo: ");
                Pattern p = Pattern.compile("^(([A-Z]{1,2}\\d{4}[A-Z]{0,2})|([0-9]{4}[BCDFGHJKLMNÑPRSTVWXYZ]{3}))$");
                Matcher m = p.matcher(matricula);
                if (!m.matches())
                    throw new MatriculaNoValida();
                final String mat = matricula;
                if (listaVehiculos.stream().anyMatch(v ->v.getMatricula().equals(mat)))
                    throw new MatriculaNoValida();
            }
            catch(MatriculaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"Matricula no valida, vuelve a intentarlo");
                error = true;
            }
            
        }
        while(error);
        return matricula;
    }
    
    public static enuMoto obtenerMarcaMoto() throws Exception {
        String marcaMoto="";
        boolean error;
        do
        {
            try
            {
                error=false;
                marcaMoto = JOptionPane.showInputDialog("Teclea la marca de la moto ").toUpperCase();
                Pattern p = Pattern.compile("^(Kawasaki|Ducate|HarleyDavidson)$");
                Matcher m = p.matcher(marcaMoto);
                if (!m.matches())
                    throw new MarcaNoValida();
            }
            catch(MarcaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"La marca indicada no es valida. Los valores correctos son: "+ enuMoto.values());
                error = true;
            }
            
        }
        while(error);
        return enuMoto.valueOf(marcaMoto);
    }
    
    public static enuCoche obtenerMarcaCoche() throws Exception {
        String marcaCoche="";
        boolean error;
        do
        {
            try
            {
                error=false;
                marcaCoche = JOptionPane.showInputDialog("Teclea la marca del coche ").toUpperCase();
                Pattern p = Pattern.compile("^(Audi|BMW|Renault|Hyundai|Citroen)$");
                Matcher m = p.matcher(marcaCoche);
                if (!m.matches())
                    throw new MarcaNoValida();
            }
            catch(MarcaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"La marca indicada no es valida. Los valores correctos son: "+ enuCoche.values());
                error = true;
            }
            
        }
        while(error);
        return enuCoche.valueOf(marcaCoche);
        
    }
    
    public static enuCamion obtenerMarcaCamion() throws Exception {
        String marcaCamion="";
        boolean error;
        do
        {
            try
            {
                error=false;
                marcaCamion = JOptionPane.showInputDialog("Teclea la marca del camión ").toUpperCase();
                Pattern p = Pattern.compile("^(Scania|Man|Volvo|Mercedes)$");
                Matcher m = p.matcher(marcaCamion);
                if (!m.matches())
                    throw new MarcaNoValida();
            }
            catch(MarcaNoValida e)
            {
                JOptionPane.showMessageDialog(null,"La marca indicada no es valida. Los valores correctos son: "+ enuCamion.values());
                error = true;
            }
            
        }
        while(error);
        return enuCamion.valueOf(marcaCamion);
        
    }
    
    public static void mostrar() throws Exception{
        System.out.println("Nombres de personas con más de un vehiculo");
        List<Persona> listaDos = listaPersonas.stream().filter(p -> p.getVehiculos().size() > 1).collect(Collectors.toList());
        listaDos.stream().forEach(p->System.out.println(p.getNombre() + " " + p.getApellidos()));
       
        listaPersonas.stream().filter(p -> p.getVehiculos().size() > 1).forEach(p->System.out.println(p.getNombre() + " " + p.getApellidos()));
        
        for(int x = 0;x < listaPersonas.size();x++)
        {
            if (listaPersonas.get(x).getVehiculos().size() > 1)
                System.out.println(listaPersonas.get(x).getNombre() + " " + listaPersonas.get(x).getApellidos());
        }

         System.out.println("Nombre de la persona que más vehiculos tiene");
        
        Optional<Persona> pMax = listaPersonas.stream().max(Comparator.comparingInt(p->p.getVehiculos().size()));
        if (pMax.isPresent())
            System.out.println(pMax.get().getNombre() + " " + pMax.get().getApellidos());
        
        int max = 0;
        Persona pMax2=null;
        for(Persona p: listaPersonas)
            if (p.getVehiculos().size() > max)
            {
                max = p.getVehiculos().size();
                pMax2 = p;
            }
         System.out.println(pMax2.getNombre() + " " + pMax2.getApellidos());
        
        System.out.println("Nombre de la persona que más motos tiene");
        
        Optional<Persona> pMaxMotos = listaPersonas.stream().max(Comparator.comparingInt(p->p.getNumeroMotos()));
        if (pMaxMotos.isPresent())
            System.out.println(pMaxMotos.get().getNombre() + " " + pMaxMotos.get().getApellidos());
        
        int maxMotos = 0;
        Persona pMaxMotos2=null;
        for(Persona p: listaPersonas)
        {
            int numeroMotos = 0;
            numeroMotos = p.getVehiculos().stream().filter((v) -> (v instanceof Motos)).map((_item) -> 1).reduce(numeroMotos, Integer::sum);
        
            if (numeroMotos > maxMotos)
            {
                maxMotos = numeroMotos;
                pMaxMotos2 = p;
            }
        }
         System.out.println(pMaxMotos2.getNombre() + " " + pMaxMotos2.getApellidos());
        
        long contador = listaPersonas.stream().filter(p->p.getMotoDucate()).count();
        System.out.println("Hay " + contador + " personas que tienen una moto Ducate");
        
        listaPersonas.stream().sorted(Comparator.comparing(p->p.getNombre() + " " + p.getApellidos())).forEach(p->System.out.println(p.getNombre() + " " + p.getApellidos() + " " + p.getVehiculos().size()));
    }
    
}

