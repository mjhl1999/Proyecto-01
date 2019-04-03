/**
 * Clase para representar estudiantes. Un estudiante tiene nombre, lista de
 * materias, lista de profesores, promedio y opcion tecnica.
*/

public class Estudiante{

  /* Atributos del estudiante. */
  private String nombre;
//private String id;
  private String[] materias;
  private String[] profesores;
  private double promedio;
  private String opcionTecnica;

  /* Constructor del estudiante. */
  public Estudiante(String nombre,  String[] materias, String[] profesores,
                    double promedio, String opcionTecnica) {
    this.nombre = nombre;
    this.materias = materias;
    this.profesores = profesores;
    this.promedio = promedio;
    this.opcionTecnica = opcionTecnica;
  }


  /* Getters y Setters para los atributos del estudiante. */
  public String getNombre() {
   return nombre;
 }

 public void setName(String nombre) {
    this.nombre = nombre;
  }

 public String[] getMaterias() {
   return materias;
 }

 public void setMaterias(String[] materias) {
    this.materias = materias;
  }

  public String[] getProfesores() {
    return profesores;
  }

  public void setProfesores(String[] profesores) {
     this.profesores = profesores;
  }

  public double getPromedio() {
    return promedio;
  }

  public void setPromedio(double promedio) {
     this.promedio = promedio;
  }

  public String getOpcionTecnica() {
    return opcionTecnica;
  }

  public void setOpcionTecnica(String opcionTecnica) {
     this.opcionTecnica = opcionTecnica;
  }

  /* Metodos del estudiante. */
  public double dameCalifMateria(String materia){
    //FALTA IMPLEMENTAR
    return 0.0;
  }

  public double damePromedio(){
    //FALTA IMPLEMENTAR
    return 0.0;
  }

  public void inscribirOpcTecnica(String opcionTecnica){
    //FALTA IMPLEMENTAR
  }
}
