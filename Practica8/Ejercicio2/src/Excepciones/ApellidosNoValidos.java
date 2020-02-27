package Excepciones;

public class ApellidosNoValidos extends Exception{
    @Override
     public String getMessage(){
        return "El apellido tecleado no es valido";
    }
}
