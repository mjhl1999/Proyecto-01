public class Administrador{

    private Escuela escuela;
    private int serie;

    public Administrador(Escuela escuela, int serie){
        this.escuela = escuela;
        this.serie = serie;
    }

    public int getSerie(){
        return this.serie;
    }

    public void listaDeAlumnos(){
        this.escuela.muestraInscritos();
    }

    public void listaDeAlumnosArea(int area){
        this.escuela.muestraInscritosArea(area);
    }

    public void listaDeAlumnosOTC(String otc){
        escuela.muestraInscritosOTC(otc);
    }

    public void listaDeProfesores(){
        escuela.muestraProfesores();
    }

    public void graduarAlumno(Estudiante estudiante){
        System.out.println("el alumno " + estudiante.getNombre() + "se graduo con un promedio de: " +
                            escuela.getAlumnos().get(estudiante.getCuenta()).getPromedio());
        escuela.eliminaAlumno(estudiante);
    }

    public void eliminaAlumno(Estudiante estudiante){
          escuela.eliminaAlumno(estudiante);
    }

    public void inscribirAlumno(Estudiante estudiante){
        escuela.getAlumnos().put(estudiante.getCuenta(), estudiante);
    }

    public void contratarProfesor(Profesor profesor){
        escuela.contrataProfesor(profesor);
    }


}
