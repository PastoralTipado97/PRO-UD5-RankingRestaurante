package net.salesianos;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Gestor {
  public static ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();

  public static void introducirRestaurante() {
    String nombre = JOptionPane.showInputDialog("Introduce el nombre del restaurante: ");
    String localizacion = JOptionPane.showInputDialog("Introduce la ubicación del restaurante: ");
    String horario = JOptionPane.showInputDialog("Introduce el horario de apertura del restaurante: ");
    int puntuacion;

    while (true) {
      String puntuacionMensaje = JOptionPane.showInputDialog("Introduce la puntuación que tiene el restaurante: ");
      if (Validaciones.ComprobarPuntuacion(puntuacionMensaje)) {
        puntuacion = Integer.parseInt(puntuacionMensaje);
        break;
      } else {
        JOptionPane.showInputDialog("La puntuación debe representarse en números enteros.");
      }
    }

    Restaurante restaurante = new Restaurante(nombre, localizacion, horario, puntuacion);
    listaRestaurantes.add(restaurante);
    JOptionPane.showInputDialog("Restaurante añadido a la lista.");
  }
}
