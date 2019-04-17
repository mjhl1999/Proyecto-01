import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Escuela extends Administra{

  /**
    private Hashtable<Integer, Estudiante> alumnos;
    private Area[] area;
    private Profesor[] profesores; //aqui estan todas las clases incluyendo OTC
    private Hashtable<Integer, Administrador> administradores;
    private int contadorProfesores;
    private int n_area;
  */

  // Constructor.
  public Escuela(Area area1, Area area2, Area area3, Area area4 ){
      this.alumnos = new Hashtable<>();
      area = new Area[4];
      this.area[0] = area1;
      this.area[1] = area2;
      this.area[2] = area3;
      this.area[3] = area4;
      this.profesores = new Profesor[20];
      administradores = new Hashtable<>();
      this.contadorProfesores = 0;
  }

  /** Método que añade un alumno a la escuela.
  * @param estudiante el estudiante a añadir.
  * Añadimos al estudiante al diccionario de alumnos, dejando como llave su número
  * de cuenta y en el valor a el estudiantecompleto.
  */
  public void addAlumno(Estudiante estudiante){
      this.alumnos.put(estudiante.getCuenta(), estudiante);
  }


    /*
    public void addAdministrador(Administrador administrador){
        this.administradores.put(administrador.getSerie(), administrador);
    }
    */


  /** Método que consulta la calificación.
  * @param estudiante el estudiante del cual obtener su calificación.
  * @param materia la materia sobre la que se quiere saber su calificaión.
  * Primero definimos el área como el área enla que estudia el alumno, después
  * buscamos la materia que queremos y si la materia obtenida es la que buscamos
  * entonces obtenemos el promedio que tiene en la materia lo cual resulta ser
  * su calificaión en dicha materia. De no encontrar la materia, entonces decimos
  * que no puso ser encontrada.
  */
  public double consultaCalificacion(Estudiante estudiante, String materia){
        Area areaAuxiliar = this.area[estudiante.getArea()];
        if(areaAuxiliar.getMateria(0).getClase().getMateria().equals(materia))
            return areaAuxiliar.getMateria(0).getClase().getInscritos().get(estudiante.getCuenta()).getPromedio();
        else if(areaAuxiliar.getMateria(1).getClase().getMateria().equals(materia))
            return areaAuxiliar.getMateria(1).getClase().getInscritos().get(estudiante.getCuenta()).getPromedio();
        else
            System.out.println("No se encontro la clase");
        return 0;
  }

    /*
    public Hashtable<Integer, Estudiante> getAlumnos(){
        return this.alumnos;
    }
    */

  /** Método que inscribie un alumno a una OTC.
  * @param estudiante el estuante a inscribir.
  * @param opcion la opción técnica a la cuál inscribirse.
  * Como sólo tenemos 4 opciones técnicas, etonces recorremos el arreglo de los
  * profesores que dan esa materia (O.T.) y si la opción es la que buscamos,
  * entonces inscribimos al estudiante a esa clase.
  */
  public void inscribirseOTC(Estudiante estudiante, String opcion){
      for(int i = 0; i <= 3; i ++){
          if(profesores[i].getMateria().equals(opcion))
             profesores[i].getClase().inscribirAlumno(estudiante);
      }
  }

    /*
    public void muestraInscritos(){
      Integer str;
      Set<Integer> keys = alumnos.keySet();
      Iterator<Integer> it3 = keys.iterator();
      while(it3.hasNext()) {
          str = it3.next();
          alumnos.get(str).estudianteToString();
      }
    }

    public void muestraInscritosArea(int area){
        Hashtable<Integer, Estudiante> auxiliar = this.area[area].getEstudiantes();
        Integer str;
        Set<Integer> keys = auxiliar.keySet();
        Iterator<Integer> it3 = keys.iterator();
        while(it3.hasNext()) {
            str = it3.next();
            auxiliar.get(str).estudianteToString();
        }
    }
    */

    /*
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
    */

    /*
    public void muestraProfesores(){
        for(int i = 0; i <= contadorProfesores; i ++){
            profesores[i].profesorToString();
        }
    }

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
    */

    /*
    public void contrataProfesor(Profesor profesor){
        this.profesores[contadorProfesores ++] = profesor ;
    }
    */

  /** Método que despide a un profesor.
  * @param profesor el profesor a despedir.
  * Recorremos el arreglo de profesores de inicio a fin y si el índice en el que
  * estamos parados es el profesor que buscamos entonces lo eliminamos del arreglo,
  * es decir lo hacemos null.
  */
  public void despideProfesor(Profesor profesor){
      for(int i = 0; i <= contadorProfesores; i++){
          if(profesores[i].equals(profesor) )
              profesores[i] = null;
      }
  }

  /** Método que regresa un profesor.
  * @param i el índice del profesor a obtener.
  * @return el profesor correspondiente al índice requerido.
  */
  public Profesor getProfesor(int i){
      return profesores[i];
  }

}
