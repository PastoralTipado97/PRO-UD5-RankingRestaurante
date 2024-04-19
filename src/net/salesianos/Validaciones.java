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
