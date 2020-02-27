package Excepciones;

public class NombreNoValido extends Exception{
    @Override
    public String getMessage(){
        return "El nombre tecleado no es valido";
    }
}
