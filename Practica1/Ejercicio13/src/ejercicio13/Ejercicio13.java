
package ejercicio13;
import javax.swing.JOptionPane;
public class Ejercicio13 {
    public static void main(String[] args) {
      double peso, estatura;
      int edad, ninosAptos, ninasAptas;
      String nombre;
      String sexo;
      ninosAptos = 0;
      ninasAptas = 0;
      
        for(int cont=0;cont<30;cont++)
        {
            nombre = JOptionPane.showInputDialog("Introduzca el nombre.");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad."));
            sexo = JOptionPane.showInputDialog("Introduzca el sexo <mujer> / <hombre>");
            estatura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la estatura."));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el peso."));
            
            if (sexo.equals("hombre") && (estatura>1.7) && (peso>70)) {
                ninosAptos++;
            }else if (sexo.equals("mujer") && (estatura>1.6) && (peso>60)) {
                ninasAptas++;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de niños aptos es: "+ninosAptos);
        JOptionPane.showMessageDialog(null, "La cantidad de niñas aptas es: "+ninasAptas);

    }
    
}
