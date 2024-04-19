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
      if (Validaciones.comprobarPuntuacion(puntuacionMensaje)) {
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

  public static void modificarRestaurante() {
    String nombre = JOptionPane.showInputDialog("Introduce el nombre del restaurante que quieres modificar: ");
    for (Restaurante restaurante : listaRestaurantes) {
      if (restaurante.getNombre().equalsIgnoreCase(nombre)) {
        String nuevaLocalizacion = JOptionPane.showInputDialog("Introduce la nueva ubicación del restaurante: ");
        String nuevoHorario = JOptionPane.showInputDialog("Introduce el nuevo horario de apertura del restaurante: ");
        int nuevaPuntuacion;
        while (true) {
          String puntuacionMensaje = JOptionPane
              .showInputDialog("Introduce la nueva puntuación que tiene el restaurante: ");
          if (Validaciones.comprobarPuntuacion(puntuacionMensaje)) {
            nuevaPuntuacion = Integer.parseInt(puntuacionMensaje);
            break;
          } else {
            JOptionPane.showInputDialog("La puntuación debe representarse en números enteros.");
          }
        }
        restaurante.setLocalizacion(nuevaLocalizacion);
        restaurante.setHorario(nuevoHorario);
        restaurante.setPuntuacion(nuevaPuntuacion);
        JOptionPane.showInputDialog("Restaurante modificado con éxito.");
        return;
      }
    }
    JOptionPane.showInputDialog("El restaurante no se encuentra en la lista.");
  }

  public static void mostrarRestaurante() {
    Collections.sort(listaRestaurantes,
        (restaurante, otroRestaurante) -> Double.compare(otroRestaurante.getPuntuacion(), restaurante.getPuntuacion()));
    for (Restaurante restaurante : listaRestaurantes) {
      JOptionPane.showMessageDialog(null, restaurante);
    }
  }

  public static void eliminarRestaurante(String nombre) {
    for (Restaurante restaurante : listaRestaurantes) {
      if (restaurante.getNombre().equalsIgnoreCase(nombre)) {
        listaRestaurantes.remove(restaurante);
      }
    }
  }

  public static void salirDelPrograma() {
    System.exit(0);
  }
}
