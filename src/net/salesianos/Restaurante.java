package net.salesianos;

public class Restaurante {
  String nombre;
  String localizacion;
  String horario;
  int puntuacion;

  public Restaurante(String nombre, String localizacion, String horario, int puntuacion) {
    this.nombre = nombre;
    this.localizacion = localizacion;
    this.horario = horario;
    this.puntuacion = puntuacion;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getLocalizacion() {
    return this.localizacion;
  }

  public void setLocalizacion(String localizacion) {
    this.localizacion = localizacion;
  }

  public String getHorario() {
    return this.horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public int getPuntuacion() {
    return this.puntuacion;
  }

  public void setPuntuacion(int puntuacion) {
    this.puntuacion = puntuacion;
  }

  @Override
  public String toString() {
    return "\nRestaurante: \n" +
        "Nombre = " + nombre + "\n" +
        "Localización = " + localizacion +
        "Horario = " + horario +
        "Puntuación = " + puntuacion;
  }

}