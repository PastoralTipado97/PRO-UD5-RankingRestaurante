# La clase Validaciones proporciona un método estático llamado comprobarPuntuacion que se utiliza para verificar si una cadena dada representa un número entero válido. Este método toma una cadena como entrada y trata de convertirla a un entero utilizando Integer.parseInt. Si la conversión tiene éxito, el método devuelve true; de lo contrario, captura la excepción NumberFormatException y devuelve false.
****************************************************************************************************************************************
package net.salesianos;

public class Validaciones {
  public static boolean comprobarPuntuacion(String puntuacionMensaje) {
    try {
      Integer.parseInt(puntuacionMensaje);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}