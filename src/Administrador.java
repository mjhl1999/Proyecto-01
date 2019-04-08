import java.util.Hashtable;

public class Administrador extends Administra{

    private int serie;

    public Administrador(int serie){
        this.serie = serie;
    }

    public int getSerie(){
        return this.serie;
    }

    public void graduarAlumno(Estudiante estudiante){
        System.out.println("el alumno " + estudiante.getNombre() + "se graduo con un promedio de: " +
                            getAlumnos().get(estudiante.getCuenta()).getPromedio());
        eliminaAlumno(estudiante);
    }



}
