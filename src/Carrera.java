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

  /* Getters y Setters para los atributos de la carrera. */
  public String getNombre() {
   return nombre;
 }

 public void setName(String nombre) {
    this.nombre = nombre;
  }

  /* Getters y Setters para los atributos del estudiante. */
  public String[] getProfesores() {
   return profesores;
 }

 public void setProfesores(String[] profesores) {
    this.profesores = profesores;
  }

  /* Getters y Setters para los atributos del estudiante. */
  public String[] getEstudiantes() {
   return estudiantes;
 }

 public void setEstudiantes(String[] estudiantes) {
    this.estudiantes = estudiantes;
  }
}
