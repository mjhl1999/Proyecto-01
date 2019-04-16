import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public abstract class Administra{

  public Hashtable<Integer, Estudiante> alumnos;
  public Area[] area;
  public Profesor[] profesores; //aqui estan todas las clases incluyendo OTC
  public Hashtable<Integer, Administrador> administradores;
  public int contadorProfesores;
  public int n_area;


  /** Método que añade un administrador.
  */
  public void addAdministrador(Administrador administrador){
      this.administradores.put(administrador.getSerie(), administrador);
  }

  /** Método que nos regresa la lista completa de alumnos en la escuela.
  */
  public Hashtable<Integer, Estudiante> getAlumnos(){
      return this.alumnos;
  }

  /** Método que nos regresa la lista de profesores de la escuela.
  */
  public Profesor[] getProfesores(){
    return this.profesores;
  }

  /** Método que nos muestra los alumnos inscritos.
  *  Definimos la llave de cada alumno como su número de cuenta y después recorremos
  *  el diccionario y por cada llave obtenemos el nombre de cada alumno.
  */
  public void muestraInscritos(){
    Integer str;
    Set<Integer> keys = alumnos.keySet();
    Iterator<Integer> it3 = keys.iterator();
    while(it3.hasNext()) {
        str = it3.next();
        alumnos.get(str).estudianteToString();
    }
  }

  /** Método que nos muestra los inscritos en las opciones técnicas.
  * Si la materia inscrita es igual al nombre que tiene la opción técnica entonces obtenemos
  * la clase asignada a cada profesor y una vez en ahí la recorremos y obtenemos el nombre
  * de cada alumno con base en la llave (su número de cuenta).
  */
  public void muestraInscritosOTC(String opcion){
      for(int i = 0; i <= 3; i ++){
          if(profesores[i].getMateria().equals(opcion)){
              Hashtable<Integer, Estudiante> auxiliar = profesores[i].getClase().getInscritos();
              Integer str;
              Set<Integer> keys = auxiliar.keySet();
              Iterator<Integer> it3 = keys.iterator();
              while(it3.hasNext()) {
                  str = it3.next();
                  auxiliar.get(str).estudianteToString();
              }
          }
      }
  }


  /** Método que nos muestra los profesores.
  * Cada vez que añadimos un profesor al arreglo incrementamos el contador de profesores
  * entonces aquí recorremos el arreglo de los profesores y mientras no lleguemos al número
  * máximo obtenemos el p¿nombre de cada profesor.
  */
  public void muestraProfesores(){
      for(int i = 0; i <= contadorProfesores; i ++){
        profesores[i].getNombre();
      }
  }

  /** Método que elimina un alumno.
  * @param estudiante el estudiante a eliminar.
  *
  */
  public void eliminaAlumno(Estudiante estudiante){
      for(int i = 0; i <= 3; i++){
          if(area[i].getProfesor(0).getClase().getInscritos().get(estudiante.getCuenta()) != null)
              area[i].getProfesor(0).getClase().getInscritos().remove(estudiante.getCuenta());
          if(area[i].getProfesor(1).getClase().getInscritos().get(estudiante.getCuenta()) != null)
               area[i].getProfesor(1).getClase().getInscritos().remove(estudiante.getCuenta());
      }
      
      for(int i = 0; i <= contadorProfesores; i++){
          if(profesores[i].getClase().getInscritos().get(estudiante.getCuenta()) != null)
              profesores[i].getClase().getInscritos().remove(estudiante.getCuenta());

      }
  }

  // Se obtuvo de escuela
  public void contrataProfesor(Profesor profesor){
      this.profesores[contadorProfesores] = profesor;
      contadorProfesores++;
  }





}
