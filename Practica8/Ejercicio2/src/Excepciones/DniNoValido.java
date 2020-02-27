package Excepciones;

public class DniNoValido extends Exception{
    @Override
     public String getMessage(){
        return "El dni tecleado no es valido o está repetido";
    }
}
