package net.salesianos;

import javax.swing.JOptionPane;

public class Menu {

  public static void main(String[] args) {

    boolean seguir = true;
  
    String option = "";
    while (seguir) {
        String menu = """
                Menú de publicaciones:
                1. Añadir restaurante
                2. Editar restaurante
                3. Mostrar restaurantes
                4. Eliminar restaurante
                Q. Salir del programa
                """;
        option = JOptionPane.showInputDialog(menu);
        switch (option) {
            case "1":
                Gestor.introducirRestaurante();
                break;
            case "2":
                Gestor.modificarRestaurante();
                break;
            case "3":
                Gestor.mostrarRestaurante();
                break;
            case "4":
                String nombreEliminar = JOptionPane
                        .showInputDialog("Introduzca el nombre del restaurante que desee modificar: ");
                Gestor.eliminarRestaurante(nombreEliminar);
                break;
            case "Q":
                seguir = false;
                break;
  
            default:
                break;
        }
    }
  }
}
