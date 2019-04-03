/**
 * Clase para representar profesores. Un profesor tiene nombre y grupo.
*/

public class Profesor{

  /* Atributos del estudiante. */
  private String nombre;
  private String[] grupo;

  /* Constructor del profesor. */
  public Estudiante(String nombre,  String[] grupo) {
    this.nombre = nombre;
    this. grupo = grupo;
  }

  /* Getters y Setters para los atributos del profesor. */
  public String getNombre() {
   return name;
  }

  public void setName(String nombre) {
    this.nombre = nombre;
  }

  public String[] getGrupo() {
   return name;
  }

  public void setGrupo(String[] nombre) {
    this.grupo = grupo;
  }

  /* Metodos del profesor. */
  public String dameInfoDeGrupo(String grupo){
    return "FALTA IMPLEMENTAR";
  }

  public void asignaCalifEstudiante(double calificacion){
      return "FALTA IMPLEMENTAR";
  }
}
