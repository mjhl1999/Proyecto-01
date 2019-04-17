/**
 * Clase para representar carreras. Una carrera tiene nombre, lista
 * de profesores y lista de estudiantes.
*/

public class Carrera{

  /* Atributos de la carrera. */
  private String nombre;
  private String[] profesores;
  private String[] estudiantes;

  /* Constructor de la carrera. */
  public Carrera(String nombre, String[] profesores, String[] estudiantes){
    this.nombre = nombre;
    this.profesores = profesores;
    this.estudiantes = estudiantes;
  }

  /** Método que nos regresa el nombre de la carrera.
  * @return el nombre de la carrera.
  */
  public String getNombre() {
   return nombre;
 }

 /** Método que define el nombre de la carrera.
 * @param nombre el nombre de la carrera.
 */
  public void setName(String nombre) {
    this.nombre = nombre;
  }

  /** Método que regresa los profesores.
  * @return los prefesores de la carrera.
  */
  public String[] getProfesores() {
   return profesores;
  }

  /** Método que define a los profesores de la carrera.
  * @param profesores los profesores a definir.
  */
  public void setProfesores(String[] profesores) {
    this.profesores = profesores;
  }

  /** Método que obtiene a los estudiantes de la carrera.
  * @return los estuantes de la carrera.
  */
  public String[] getEstudiantes() {
   return estudiantes;
  }

  /** Método que define a los estudiantes de la carrera.
  * @param estudiantes los estuantes a definir.
  */
  public void setEstudiantes(String[] estudiantes) {
    this.estudiantes = estudiantes;
  }
  
}
