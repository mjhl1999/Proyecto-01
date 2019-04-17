public class Administrador extends Administra{

    // private Escuela escuela;
    private int serie;

    public Administrador(int serie){
        this.serie = serie;
    }

    /** El número del administrador.
    * @return la serie.
    */
    public int getSerie(){
        return this.serie;
    }

    /** Método que gradua a un alumno.
    * @param estudiante el estudiante a graduar.
    * Obtenemos el nombre del alumno y después de la lusta de alumnos se obtiene el
    * promedio con el que "terminó". Posteriormente se tiene que eliminar de la "lista".
    */
    public void graduarAlumno(Estudiante estudiante){
        System.out.println("El alumno " + estudiante.getNombre() + "se graduo con un promedio de: " +
                            getAlumnos().get(estudiante.getCuenta()).getPromedio());
        eliminaAlumno(estudiante);
    }

}
