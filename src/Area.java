import java.util.Arrays;
import java.util.Hashtable;

public class Area{

    private Profesor[] materias;
    private int area;
    private Hashtable<Integer, Estudiante> estudiantesArea;

    public Area(int area, Profesor profesor1, Profesor profesor2){
        this.area = area;
        this.materias = new Profesor[2];
        this.materias[0] = profesor1;
        this.materias[1] = profesor2;
        estudiantesArea = new Hashtable<>();
    }

    /** Método que agrega un estudiante al área a la que entra.
    * @param estudiante el estudiante a agregar.
    * Simplemente agregamos al estudiante al diccionario del área, lo hacemos
    * estableciendo como llave el número de cuenta y en el valor a todo el estudiante.
    */
    public void agregaEstudiante(Estudiante estudiante){
        estudiantesArea.put(estudiante.getCuenta(), estudiante);
    }

    /** Método que regresa la materia.
    * @param materia la materia a regresar.
    * @return la materia.
    * (Recordemos que solo hay 2 materias por área)
    * Si queremos obtener la primer materia respectiva al área donde estamos entonces
    * regresamos el elemento del primer índice del arreglo de materias del profesor
    * correspondiente y si queremos la segunda, entonces regresamos el segundo.
    */
    public Profesor getMateria(int materia){
        if(materia == 1)
            return this.materias[0];
        else if(materia == 2)
            return this.materias[0];
        else
            return null;
     }

     /** Método que regresa los estudiantes.
     * @return los estudiantes de dicha área.
     * Regresamos el diccionario que contiene a los estudiantes inscritos en dicha
     * área.
     */
     public Hashtable<Integer, Estudiante> getEstudiantes(){
         return this.estudiantesArea;
     }

     /** Método que nos regresa un profesor.
     * @param i el índice del profesor a obtener.
     * @return el profesor.
     * Regresamos al profesor que se encuentre en el índice recibido.
     */
     public Profesor getProfesor(int i){
          return materias[i];
     }

}
