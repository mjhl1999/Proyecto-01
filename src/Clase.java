import java.util.Hashtable;

public class Clase {

    private int grupo;
    private String materia;
    private Hashtable<Integer, Estudiante> inscritos;

    // Constructor.
    public Clase(int grupo, String materia){
        this.grupo = grupo;
        this.materia = materia;
        this.inscritos = new Hashtable<>();
    }

    /** Método que nos regresa el grupo de esa clase.
    * @return el grupo.
    */
    public int getGrupo(){
        return this.grupo;
    }

    /** Método que nos regresa la materia de esa clase.
    * @return la materia.
    */
    public String getMateria(){
        return this.materia;
    }

    /** Método que nos regresa los alumnos inscritos a esa clase.
    * @return los alumnos inscritos.
    */
    public Hashtable<Integer, Estudiante> getInscritos(){
        return this.inscritos;
    }

    /** Método que inscribe a un alumno.
    * @param alumno el alumno a inscribir.
    */
    public void inscribirAlumno(Estudiante alumno){
       inscritos.put(alumno.getCuenta(), alumno);
    }

    /** Método que regresa el estudiante de esa clase.
    * @param cuenta la cuenta del estuante a obtener.
    * @return el número de cuenta del estudiante inscrito.
    */
    public Estudiante getEstudiante(int cuenta){
        return this.inscritos.get(cuenta);
    }

}
